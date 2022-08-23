package fanctionAndLambda;
import java.util.Date;
import java.util.function.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;


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
		LongUnaryOperator<Long> l = (long[] org) -> {
			long[] cpy = Arrays.copyOf(org, org.length());
			Arrays.sort(cpy);
			return cpy;
		};
		
		
		// TODO Auto-generated method stub

	}

}
