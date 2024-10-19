package hw7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyProgram {
	public static void copyFile(String sourceFile, String destFile) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(sourceFile);
			fos = new FileOutputStream(destFile);
			byte[] buffer = new byte[1024];
			int length;
			while ((length = fis.read(buffer)) > 0) {
				fos.write(buffer, 0, length);
			}
			System.out.println("文件複制成功!");
		} finally {
			if (fis != null) {
				fis.close();
			}
			if (fos != null) {
				fos.close();
			}
		}
	}
	public static void main(String[] args) {
		try {
			copyFile("./src/hw7/source.txt", "./src/hw7/destination.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
