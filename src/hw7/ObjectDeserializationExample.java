package hw7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectDeserializationExample {
	public static void main(String[] args) {
		String filePath = "C:\\data\\Object.ser";
		File file = new File(filePath);
		if (!file.exists()) {
			System.out.println("序列化檔案不存在: " + filePath);
			return;
		}
		try (FileInputStream fileIn = new FileInputStream(filePath);
				ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
			for (int i = 0; i < 4; i++) {
				Object obj = objectIn.readObject();
				if (obj instanceof Animal) {
					Animal animal = (Animal) obj;
					animal.speak();
				} else {
					System.out.println("未知類型的物件: " + obj.getClass().getName());
				}
			}
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("反序列化過程中發生錯誤: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
