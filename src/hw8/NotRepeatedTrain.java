package hw8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class NotRepeatedTrain {
	public static void main(String[] args) {
		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);
		
		ArrayList<Train> trainList = new ArrayList<>();
		trainList.add(t1);
		trainList.add(t2);
		trainList.add(t3);
		trainList.add(t4);
		trainList.add(t5);
		trainList.add(t6);
		trainList.add(t7);
		Set<Train> trainSet = new HashSet<>(trainList);
		
		System.out.println("使用迭代器:");
		Iterator<Train> iterator = trainSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\n使用for迴圈:");
		Train[] trainArray = trainSet.toArray(new Train[0]);
		for (int i = 0; i < trainArray.length; i++) {
			System.out.println(trainArray[i]);
		}
		
		System.out.println("\n使用foreach迴圈:");
		for (Train train : trainSet) {
			System.out.println(train);
		}
	}
}
