/*
 * 頻繁に使用される関数型インタフェースはjava.util.functionパッケージに定義されている
 * ～Predicate<T>～
 * 単一の引数を受けてboolean型を返す 「断定」
 * boolean test(T t)
 *
 * ～Consumer<T>～
 * 単一の引数を受け、戻り値を返さない 「消費者」
 * void accept(T t)
 *
 * ～Supplier<T>～
 * 引数なし、戻り値あり 「提供者」
 * T get()
 *
 * ～Function<T,R>～
 * 単一の引数を受け、戻り値を返す
 * R apply(T t)
 */

package lesson01.impl;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Function;

public class Sample04 {
	public static void main(String[] args) {
		//Predicate
		Predicate<String> p = str1 -> {
			return "".equals(str1);
		};
		System.out.println(p.test(""));

		//Consumer
		Consumer<String> c = str2 -> {
			System.out.println("Consumer :" + str2);
		};
		c.accept("lesson");

		//Supplier
		Supplier<String> s = () -> {
			return "practice";
		};
		System.out.println("Supplier : " + s.get());

		//Function
		Function<String,Integer> f = str3 -> {
			return Integer.parseInt(str3);
		};
		System.out.println("Function : " + f.apply("12345"));
	}
}
