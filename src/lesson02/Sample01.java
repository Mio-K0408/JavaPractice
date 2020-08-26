/*
 * ～メソッド参照～
 * 既に定義済みのメソッドを、引数なしで呼び出せる
 *
 * ・クラスメソッド　：　クラス名::メソッド名
 * String::toString (String.toString(引数))
 *　
 * ・インスタンスメソッド　：　オブジェクト名::メソッド名
 * System.out::println(System.out.println(引数))
 *
 * ・コンストラクタ　：　クラス名::new
 *  ArrayList::new(new ArrayList())
 *  ※コンストラクタ参照　：　コンストラクタを参照する仕組みのこと
 */

package lesson02;

import java.util.ArrayList;

public class Sample01 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0;i < 10; i++) {
			list.add(i);
		}
		//ラムダ式
		list.forEach(i -> System.out.print(i));
		//結果：0123456789
		System.out.println();
		//メソッド参照
		list.forEach(System.out::print);
	}

}
