package fanctionAndLambda;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.Set;

public class VariousFunc {
//																					Bi/Binary		Unary
//	Function　引数を受け取って受け取った引数と別の型を返す		apply()で引数を渡して結果を受け取る		〇
//	
//	Operator　引数を受け取って受け取った引数と同じ型を返す		apply()で引数を渡して結果を受け取る		〇		　　	　　〇
//	
//	Consumer　引数を受け取って何も返さない					accept()で引数を渡す					〇
//	
//	Supplier　何も受け取らずに結果を返す					get()で結果を受け取る					〇
//	
//	Predicate　引数を受け取ってbooleanの判断を返す			呼び出しはtest()を使う
	
	
	public static Integer len(String s) {		//文字列を受け取りその文字数を返す関数
		return s.length();
	}
	//オリジナルの関数インターフェース
//			@FunctionalInterface		これは書かなくてもいいが、良いことがある
//			public interface PartyInfoConsumer{
//				public abstract void process(Set<Hero> party, Hero leader, String pName);
//			}			格納した関数オブジェクトはprocessという名前で呼び出せる

	
	//代入したいメソッドがstaticか否かで記述が変わる
	//静的メソッド（static）なら　クラス名::その静的メソッド名、　否なら　インスタンス変数名::そのインスタンスのメソッド名で格納する
	public static void main(String[] args) {
		//import java util.function.*;をしておく
				//<引数の型, 戻り値の型>
		Function<String, Integer> func = VariousFunc::len;		//(クラス名::そのクラスの静的メソッド名)ここで代入して… 
		//変数fancに格納されている処理ロジックを、引数"Java"で実行する
		int a = func.apply("Java");
		System.out.println("文字列　Java　は" + a + "文字です");
		
		//１，戻り値がない関数を格納する
//		System.out.println();のように、１つの引数だけを受け取って戻り値を返さない関数を格納するには、
//		java.util.function.Consumerインターフェースを使用する
		Consumer<String> C = System.out::println;
		C.accept("Hello, world");
//		戻り値がなく、基本データ型の引数を受け取る関数のために
//		IntConsumer, LongConsumer, DoubleConsumerがある
		
//		２，引数がない関数を格納する
//		引数がなく戻り値のみを返す関数の格納にはjava.util.function.Supplierインターフェースを使用する
				//戻り値の型
		Supplier<String> S = System::lineSeparator;
		System.out.println("改行します" + S.get());
//		引数がなく、基本データ型の戻り値を返す関数には、
//		IntSupplier, LongSupplier, DoubleSupplierがある
		
//		３，複数の引数を受け取る関数を格納する
//		Function型では、１つの引数しか受け取る関数しか格納できないため、同じ型の２つの引数に対応する事が出来る
//		java.util.function.BiFunctionインターフェースを使用する
				  //<引数の型, 引数の型, 戻り値の型>
		BiFunction<String, String, String> B = System::getProperty;
		System.out.println(B.apply("java.version", "不明"));
		
		
		
	}

}
