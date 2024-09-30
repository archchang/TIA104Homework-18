package hw1;

public class Homework1 {
	public static void main(String[] args) {
		System.out.println("請設計一隻Java程式，計算12，6這兩個數值的和與積");
		int num1 = 12;
		int num2 = 6;
		int sum = num1 + num2;
		int mul = num1 * num2;
		System.out.println("12，6這兩個數值的和與積為:" + sum + "\t" + mul);
		
		System.out.println("=============這不是分隔線=========================");
		System.out.println("請設計一隻Java程式，計算200顆蛋共是幾打幾顆？(一打為12顆)");
		int totalEggs = 200;
		int eggsPerdozen = 12;
		int dozens = totalEggs / eggsPerdozen;
		int remainingEggs = totalEggs % eggsPerdozen;
		System.out.println("總共有 " + dozens + " 打 " + remainingEggs + " 顆蛋。" );
		
		System.out.println("=============這不是分隔線=========================");
		System.out.println("請由程式算出256559秒為多少天、多少小時、多少分與多少秒");
		int totalSeconds = 256559;
		int secondsInaDay = 24 * 60 * 60;
		int secondsInanHour = 60 * 60;
		int secondsInaMinute = 60;
		int days = totalSeconds / secondsInaDay;
		int remainingSecondsafterDays = totalSeconds % secondsInaDay;
		int hours = remainingSecondsafterDays / secondsInanHour;
		int remainingSecondsafterHours = remainingSecondsafterDays % secondsInanHour;
		int minutes = remainingSecondsafterHours / secondsInaMinute;
		int seconds = remainingSecondsafterHours % secondsInaMinute;
		System.out.println("總共是 " + days + " 天 " + hours + " 小時 "+ minutes + " 分鐘 " + seconds + "秒");

		System.out.println("=============這不是分隔線=========================");
		System.out.println("請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長");
		final double PI = 3.1415;
		double radius = 5.0;
		double circumference = 2 * PI * radius;
		double area = PI * radius *radius;
		System.out.println("半徑為 " + radius + " 的圓: ");
		System.out.println("周長為：" + circumference);
		System.out.println("面積為：" + area);
		
		System.out.println("=============這不是分隔線=========================");
		System.out.println("某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本\r\n"
				+ "金加利息共有多少錢 (用複利計算，公式請自行google)");
		double principal = 1500000;
		double annualRate = 0.02;
		int years = 10;
		double amount = principal * Math.pow(1 + annualRate, years);
		System.out.printf("10年後的本利和為: %.2f  元\n" , amount);
		
		System.out.println("=============這不是分隔線=========================");
		System.out.println("請寫一隻程式，利用System.out.println()印出以下三個運算式結果： 5 + 5，5 + ‘5’，5 + “5”，並請用註解各別說明答案的產生原因");
		System.out.println(5 + 5);//輸出：10，因兩個操作數都是整數，執行正常的算術加法。
		System.out.println(5 + '5');//輸出：58，因'5' 是一個字元常數，字元 '5' 的 Unicode 值是 53，故運算式實際上是 5 + 53。
		System.out.println(5 + "5");//輸出：55，因"5" 是一個字串常數，當整數與字串相加時，整數會被轉換為字串，然後進行字串串接，故運算式實際上是 "5" + "5"。
	}
}
