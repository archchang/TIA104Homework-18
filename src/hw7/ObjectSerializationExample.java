package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectSerializationExample {
	public static void main(String[] args) {
		String directoryPath = "C:\\data";
		String filePath = directoryPath + "\\Object.ser";
		File directory = new File(directoryPath);
		if (!directory.exists()) {
			boolean dirCreated = directory.mkdir();
			if (dirCreated) {
				System.out.println("資料夾已成功建立: " + directoryPath);
			} else {
				System.out.println("資料夾建立失敗!");
				return;
			}
		}
		Dog dog1 = new Dog("Buddy");
		Dog dog2 = new Dog("Charlie");
		Cat cat1 = new Cat("Whiskers");
		Cat cat2 = new Cat("Mittens");
		try (FileOutputStream fileOut = new FileOutputStream(filePath);
				ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
			objectOut.writeObject(dog1);
			objectOut.writeObject(dog2);
			objectOut.writeObject(cat1);
			objectOut.writeObject(cat2);
			System.out.println("物件已成功寫入檔案: " + filePath);
		} catch (IOException e) {
			System.out.println("物件寫入失敗: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
