/*
 * BigDecimal
 * javaは基本数値を2進数で扱っているので、10進数の小数値を正確に表すことが出来ず、
 * 計算結果が予想しないものになる可能性がある。
 * 計算時に値を丸める方法の指定がないから、無限小数などは仕様によって勝手に丸められる。
 * →意図しない丸めを許さない。BigDecimalは計算全てメソッドなので、引数で丸め方を指定できる。
 *
 * ～主なメソッド～
 * ・加算
 * BigDecimal add(BigDecimal augend)
 * a.add(b)(a+bの計算結果を返す)
 *
 * ・減算
 * BigDecimal subtract(BigDecimal subtrahend)
 *
 * ・乗算
 * BigDecimal　multiply（BigDecimal multiplicand）
 *
 * ・除算
 * BigDecimal　divide(BigDecimal divisor)
 * 小数点以下が無限になるため正確な商を表現できない時はArithmeticExceptionがスローされる
 * →丸め方を指定することも可能（オーバーロード）
 *
 */

package Trial;

import java.math.BigDecimal;

public class Sample01 {
	public static void main(String[] args) {
		System.out.println("10 - 0.9 =" + (1-0.9));
		//通常通り、整数と小数の計算を行うと予想しない結果になる
		//→10 - 0.9 =0.09999999999999998（実行結果)

		BigDecimal bdNum1 = new BigDecimal("10");
		BigDecimal bdNum2 = new BigDecimal("0.9");
		System.out.println("10 - 0.9 =" + bdNum1.subtract(bdNum2));
		//BigDecimalを使うと予想通りの結果になる
		//→10 - 0.9 =9.1(実行結果)
		BigDecimal bdNum3 = BigDecimal.valueOf(123);
		BigDecimal bdNum4 = BigDecimal.valueOf(123);
		BigDecimal bdNum5 = new BigDecimal("10");

		//値の出力
		System.out.println("bdNum1 = " + bdNum1);//10
		System.out.println("bdNum2 = " + bdNum2);//0.9
		System.out.println("bdNum3 = " + bdNum3);//123
		System.out.println("bdNum4 = " + bdNum4);//123

		//オブジェクトの比較
		if(bdNum3 == bdNum4) System.out.println("true");//false
		if(bdNum1 == bdNum5) System.out.println("true");//false

	}
}
