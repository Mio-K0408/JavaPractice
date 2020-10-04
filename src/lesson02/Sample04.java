/*
 * ～Optional～
 * 何かの値を包み込むクラス。
 * Optionalはメソッドの戻り値で使われるのが普通だが、nullかもしれない値に何か処理をしたイトキンいも使える
 *
 * Optionalはpublicなコンストラクタをもたない→Optionalオブジェクトを生成するには以下のメソッドを使う
 * ・empty
 * 	null値をもつOptionalオブジェクトを返す
 *
 *　・of
 * 	非null値を持つOptionalオブジェクトを生成
 * 	ofにnullなオブジェクトを渡すと例外がスロー(NullPointerException)
 *
 * ・ofNullable
 * 	nullかもしれない値を持つOptionalオブジェクトを返す
 *
 *	オブジェクトに対しての操作
 *
 * ・ifPresent
 * nullじゃない場合だけかっこ内の処理を行う
 * Optional<型> 変数　= Optional.ofNullable(値);
 * 変数.ifPresent(処理);
 *
 * ・orElse
 *　String型の変数がnullだったら値を返す
 *
 *	・get
 *	Optionalオブジェクトが保持する値を返す。保持する値がnullの場合はNoSuchElementExceptionがスロー
 *
 *　・isPresent
 *	Optionalオブジェクトが保持する値が非nullの場合はtrue。nullの場合はfalseを返す
 *
 *　・
 */

package lesson02;

import java.util.Optional;

public class Sample04 {
	public static void main(String[] args) {
		//ifPresent

//		SE7
//		String str = null;
//		if(str != null) {
//			System.out.println(str);
//		}

		//SE8
		String str = "abc";
		Optional<String> value = Optional.ofNullable(str);	//Optionalの作成
		value.ifPresent(System.out::println);
		//abc

		//orElse
		//SE7
		String str2 = null;
		if(str2 == null) {
			str2 = "abc";
		}
		System.out.println(str);
		//abc

		//SE8
		String str3 = null;
		Optional<String> value2 = Optional.ofNullable(str3);
		str3 = value2.orElse("abc");
		System.out.println(str);
		//abc

	}

}
