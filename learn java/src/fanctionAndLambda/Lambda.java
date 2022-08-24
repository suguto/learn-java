package fanctionAndLambda;
import java.util.Date;
import java.util.List;
import java.util.function.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import basicOfInstance.Account;

public class Lambda {

	public static void main(String[] args) {
		Function<String, Integer> func = 
				(String s) -> {return s.length();};		//この行が実行された瞬間、関数の実体が生み出される
		int n = func.apply("Java");
		System.out.println("文字列　Java　は" + n + "文字です");
		
		//例１　Heroインスタンスを受け取り、そのnameを返す
		//Hero h = new Hero("トリー");
		Function <Hero, String> hero = (Hero h) -> {return h.getName();};
		String st = hero.apply(new Hero("トリー"));
		System.out.println(st);
		
		Function <Hero, Integer> hero2 = (Hero h) -> {return h.getHp();};
		int st2 = hero2.apply(new Hero("トリー"));
		System.out.println(st2);
		
		//例２　何も受け取らず、現在日時を返す
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Supplier<Date> D = () -> {return new Date();};
		System.out.println(f.format(D.get()));
		
		//例３　long配列を受け取り、そのコピーを作り、内容を並び変えて返す
//		LongUnaryOperator<Long> l = (long[] org) -> {
//			long[] cpy = Arrays.copyOf(org, org.length());
//			Arrays.sort(cpy);
//			return cpy;
//		};
		
		//例４　関数オブジェクトを受け取り、2回呼び出した合計を返す
//		Function<IntBinaryOperator, Integer> Func = (IntBinaryOperator ibo, int a, int b) -> {
//			int result = ibo.applyAsInt(a, b) + ibo.applyAsInt(a, b);
//			return result;
//		};
		
		List<Account> list = new ArrayList<>();
		Account a1 = new Account();
		a1.setZandaka(1000);
		Account a2 = new Account();
		a2.setZandaka(10000);
		Account a3 = new Account();
		a3.setZandaka(10);
		
		list.add(a1);
		list.add(a2);
		list.add(a3);
		for (Account a : list) {
			System.out.println(a.getZandaka());
		}
		Collections.sort(list, (x, y) -> (x.getZandaka() - y.getZandaka()));	//Comparatorを作らずに並び替えることができる
		for (Account a : list) {
			System.out.println(a.getZandaka());
		}
		
		boolean anyoneKnockOut = list.stream().anyMatch(a -> a.getZandaka() >= 100);	//for文を使わずに残高が100以上のアカウントを探し出してtrueにする
		System.out.println(anyoneKnockOut);
		
		
		// TODO Auto-generated method stub

	}

}
