package fanctionAndLambda;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.*;

public class main {

	public static void main(String[] args) {
		FuncList func = new FuncList();
		Func1 f1 = FuncList::isOdd;		//静的メソッド名(static)だから　クラス名::その静的メソッド名
		Func2 f2 = func::passCheck;		//静的メソッド名じゃないから　インスタンス変数名::そのインスタンスのメソッド名
		System.out.println(f1.call(6));	//奇数かどうかのtrue,false判定
		System.out.println(f2.call(70, "坂本"));		//数字が６５より上か否かで合否を決める
		
		//ラムダ式
		Func1 F1 = (int x) -> x % 2 == 1;		//略式returnと波かっこなど省いている
		Func2 F2 = (point, name) -> {
			return name + "さんは" + (point > 65 ? "合格" : "不合格");
		};
		System.out.println(F1.call(7));
		System.out.println(F2.call(60, "西郷"));
		
		IntPredicate boo = x -> {return x % 2 == 1;};
		BiFunction<Integer, String, String> st = (Integer point , String name) -> {
			 return name + "さんは" + (point > 65 ? "合格" : "不合格");
		};
		System.out.println(boo.test(1));
		System.out.println(st.apply(80, "ばかもと"));
		
		List<Meibo> m = new ArrayList<>();
		Meibo m1 = new Meibo("さかもと");
		Meibo m2 = new Meibo("さいごう");
		Meibo m3 = new Meibo("ドンキーコング");
		Meibo m4 = new Meibo("マリオ");
		
		m.add(m1);
		m.add(m2);
		m.add(m3);
		m.add(m4);
		
		List<String> names = m.stream()
				.filter(s -> s.getName().length() <= 4)		//4文字以下の名前
				.map(s -> s.getName() + "さん")
				.collect(Collectors.toList());
		System.out.println(names);
		
		List<String> nameLists = List.of("西郷どん", "坂本", "くにおくん", "ナターリア");
		nameLists.stream()
		.filter(n -> n.length() <= 4)
		.map(n -> n + "さん")
		.forEach(System.out::println);
		
		// TODO Auto-generated method stub

	}

}
