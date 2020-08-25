package lesson01.impl;
//Runnableインタフェースを使った並行処理
public class Function implements Runnable{
	@Override
	public void run() {
		System.out.println("Hello!");
	}
}
