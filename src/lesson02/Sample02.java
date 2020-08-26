/*
 * ～ストリームＡＰＩ～
 * データ処理のためのＡＰＩ
 * 1.コレクションからstreamを取得
 * 2.streamに対して「中間操作」を実行。中身を操作。
 * 3.「終端操作」で変換したコレクションの中身に対して処理を適用
 *
 */

package lesson02;

import java.util.Arrays;
import java.util.List;

public class Sample02 {
	public static void main(String[] args) {
	//StreamAPIを使わない場合
	List<Integer> integerList1 = Arrays.asList(1,2,3,4,5);
	for(Integer i :integerList1) {
		if(i%2==0) {
			System.out.println(i);
		}
	}
	System.out.println();

	//StreamAPIを使う場合
	List<Integer> integerList2 = Arrays.asList(1,2,3,4,5);
	integerList2.stream()						//streamの取得
		.filter(i -> i % 2 == 0)				//中間操作(条件に合うものを集めて)
		.forEach(i -> System.out.println(i));	//終端操作（画面にそれを出力）

//		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
//		Stream<Integer> stream = integerList.stream(); // streamの取得
//		Stream<Integer> stream2 = stream.filter(i -> i % 2 == 0); // 中間操作
//		stream2.forEach(i -> System.out.println(i)); // 終端操作

	}
}
