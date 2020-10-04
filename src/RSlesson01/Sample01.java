package RSlesson01;

import java.util.Arrays;
import java.util.List;

public class Sample01 {
	public static void fci(List<String> fruits) {
		boolean found = false;
//		for(String fruit : fruits) {
//			if(fruit.equals("Banana")) {
//				found = true;
//				break;
//			}
//		}
//		System.out.println(found);
		System.out.println(fruits.contains("Banana"));
		//9-15を16に書き換えられる！
		//boolean contains(Object o)
		//指定の要素がリストに含まれている場合にTrueを返す
	}

	public static void fcd(List<String> fruits) {
		System.out.println(fruits.contains("Banana"));
	}

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple","Banana","Orange");
		fci(fruits);	//true
		fcd(fruits);	//true
	}
}
