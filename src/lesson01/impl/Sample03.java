/*
 * ラムダ式を使用して並行処理を実装
 * Functionクラスみたいに新しくクラスを定義する必要がない
 */

package lesson01.impl;

public class Sample03 {
	public static void main(String[] args) {
		Runnable r = () ->{
			System.out.println("Hello!");
		};
		Thread thread = new Thread(r);
		thread.start();
		System.out.println("Finish!");
	}
}
