/*
 * ～中間操作～
 * ・filter
 * フィルタリングするための中間操作
 * 引数にT -> booleanとなるラムダ式を渡す
 * 式がtrueの要素だけを集める
 *
 *　・map
 *　引数にはT -> Uとなるラムダ式を渡す
 *　要素を変換する中間操作
 *
 *　・sorted
 *　引数に(T,T) -> intになるラムダ式を渡す
 *　要素を並び替える中間操作
 *　要素を2つずつ取り、ラムダ式に渡していく。戻り値が生なら降順、負なら昇順
 *
 *　～終端操作～
 *　・forEach
 *　引数に(T) -> voidとなるラムダ式を渡す
 *　要素を1つずつ取り出し、何らかの処理をする終端操作
 *
 */

package lesson02;

import java.util.Arrays;
import java.util.List;

public class Sample03 {
	public static void main(String[] args) {
		//filter
		List<Integer> integerList1 = Arrays.asList(1,2,3,4,5);
			integerList1.stream()				//streamの取得
				.filter(i -> i % 2 == 0)		//中間操作
				.forEach(i -> System.out.println(i));		//終端操作

		//map
		List<Integer> integerList2 = Arrays.asList(1,2,3,4,5);
		integerList2.stream()
			.map(i -> i * 2)		//要素を2倍にする
			.forEach(i -> System.out.println(i));

		List<Integer> integerList3 = Arrays.asList(1,2,3,4,5);
		integerList3.stream()
			.map(i -> "要素は" + i + "です")
			.forEach(i -> System.out.println(i));

		//sorted
		List<Integer> integerList4 = Arrays.asList(1,2,3,4,5);
		integerList4.stream()
			.sorted((a,b) -> Integer.compare(a, b))
			.forEach(i -> System.out.println(i));
	}

}
