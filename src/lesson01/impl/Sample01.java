/*
 * ～ラムダ式の基本構文～
 * 関数型インタフェースの型　変数名　= (引数) -> {処理};
 *　・引数が1つの時は小かっこの省略が可能
 *　・引数のデータ型も省略可能（引数の数は問わない）
 *　・実行したい処理が1つの時は{}の省略が可能
 *　・戻り値があり、処理が１つしかない時に{}を省略した場合はreturnキーワードを省略しなければいけない
 *　実装が必要なメソッドを1つだけ持つインタフェース型変数に、実行したいコードの代入が可能
 *　→実装が必要な抽象メソッドを1つだけ持つインタフェースを「関数型インタフェース」という
 *　
 */

package lesson01.impl;

import lesson01.InterfaceTest01;
import lesson01.InterfaceTest02;
import lesson01.InterfaceTest03;

public class Sample01 {
	public static void main(String[] args) {
		//引数なし
		InterfaceTest01 it1 = () -> System.out.println("Hello World!");
		it1.method();

		//引数あり
		//省略しないVer.
		InterfaceTest02 it2 = (String a) -> {
			System.out.println(a.length());
		};
		//省略Ver.
		//InterfaceTest02 it2 = a -> System.out.println(a.length());

		it2.method("引数ありのラムダ式");

		//戻り値あり
		//省略しないVer.
		InterfaceTest03 it3 = () -> {
			return 1;
		};
		//省略Ver.
		//InterfaceTest03 it3 = () -> 1;
		System.out.println(it3.method());
	}
}
