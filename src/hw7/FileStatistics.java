package hw7;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileStatistics {
    public static void main(String[] args) {
        String filename = "./src/hw7/Sample.txt";
        try {
        	File file = new File(filename);
            long bytes = file.length();
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            int characters = 0;
            int lines = 0;
            int c;
            while ((c = fr.read()) != -1) {
                characters++;
            }
            fr.close();
            br = new BufferedReader(new FileReader(file));
            while (br.readLine() != null) {
                lines++;
            }
            br.close();
            System.out.println(filename + "檔案共有" + bytes + "個位元組，" + characters + "個字元，" + lines + "列資料");
        } catch (IOException e) {
            System.out.println("檔案讀取錯誤: " + e.getMessage());
        }
        System.out.println("當前工作目錄：" + System.getProperty("user.dir"));
    }
}

