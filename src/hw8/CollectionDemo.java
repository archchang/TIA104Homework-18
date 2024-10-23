package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {
	public static void main(String[] args) {
		Collection<Object> collection = new ArrayList<>();
		collection.add(Integer.valueOf(100));
		collection.add(Double.valueOf(3.14));
		collection.add(Long.valueOf(21L));
		collection.add(Short.valueOf("100"));
		collection.add(Double.valueOf(5.1));
		collection.add("Kitty");
		collection.add(Integer.valueOf(100));
		collection.add(new Object());
		collection.add("Snoopy");
		collection.add(new BigInteger("1000"));
		System.out.println("使用Iterator遍歷:");
		Iterator<Object> iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		
		System.out.println("\n使用傳統 for 迴圈:");
		Object[] array = collection.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		System.out.println("\n使用foreach:");
		for (Object obj : collection) {
			System.out.print(obj + " ");
		}
		System.out.println();
		
		collection.removeIf(obj -> !(obj instanceof Number));
		
		System.out.println("\n移除非 number 相關物件後的集合內容:");
		for (Object obj : collection) {
			System.out.print(obj + " ");
		}
	}
}
