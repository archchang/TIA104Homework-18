package hw7;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class RandomNumberAppender {
    public static void main(String[] args) {
        Random random = new Random();
        try {
            // 'true' 表示以追加模式寫入檔案
            FileWriter fw = new FileWriter("./src/hw7/Data.txt", true);
            PrintWriter pw = new PrintWriter(fw);

            for (int i = 0; i < 10; i++) {
                int number = random.nextInt(1000) + 1; // 產生 1 到 1000 的隨機整數
                pw.println(number);
            }
            pw.close(); // 關閉 PrintWriter
            System.out.println("隨機數已成功追加寫入 Data.txt。");
        } catch (IOException e) {
            System.out.println("發生錯誤：" + e.getMessage());
        }
    }
}
