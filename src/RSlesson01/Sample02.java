package RSlesson01;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Sample02 {
	public static void main(String[] args) {

		List<BigDecimal> prices = Arrays.asList(
				new BigDecimal("10"),new BigDecimal("30"),new BigDecimal("35"),
				new BigDecimal("15"),new BigDecimal("20"),new BigDecimal("50"),
				new BigDecimal("70"),new BigDecimal("45"),new BigDecimal("50"));

		BigDecimal totalPrice = BigDecimal.ZERO;//static変数（0）


		//取り出した値が30以上なら0.9かけて変数に格納（加算していく）
		for(BigDecimal price: prices) {
			if(price.compareTo(BigDecimal.valueOf(30)) > 0) {
				totalPrice = totalPrice.add(price.multiply(BigDecimal.valueOf(0.9)));
			}
		}
		//合計額の出力
		System.out.println("合計金額は" + totalPrice + "です");//225.0

		//上記のコードを書き換え
		BigDecimal totalPrice2 =
				prices.stream()
						.filter(price -> price.compareTo(BigDecimal.valueOf(30)) > 0)
						.map(price -> price.multiply(BigDecimal.valueOf(0.9)))
						.reduce(BigDecimal.ZERO,BigDecimal::add);
		/*reduce→第一引数：アキュムレータの初期値
		*		　第二引数：実際に行いたい処理（今回はメソッド参照）
		*/

		System.out.println("合計金額は" + totalPrice2 + "です");
	}
}
