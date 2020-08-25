/*
 * ラムダ式を使わずにやると、新しくクラスを定義する必要がある
 */

package lesson01.impl;

public class Sample02 {
	public static void main(String[] args) {
		Thread thread = new Thread(new Function());
		thread.start();
		System.out.println("Finish!");
	}

}
