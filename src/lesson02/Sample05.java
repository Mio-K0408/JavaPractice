/*
 * ～defaultメソッド～
 * インタフェースにdefaultメソッドが導入
 * 	→インタフェースに具象メソッドが定義可能になった
 * 	インタフェースを実装したクラスでdefaultメソッドをオーバーライドすることも可能
 */


package lesson02;

interface If{
	default void method1() {
		System.out.println("default method1");
	}
	default void method2() {
		System.out.println("default method2");
	}
	static void method3() {
		System.out.println("default method3");
	}
}



public class Sample05 implements If {
	public void method2() {
		System.out.println("override method2");
	}
}
