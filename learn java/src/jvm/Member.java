package jvm;
import java.lang.reflect.*;

public class Member {
	
//								引数			戻り値		意味
//	getDeclaredFields()						Fields[]	フィールドの一覧を返す
//	
//	getDeclaredField()			String		Field		指定した名前のフィールドを返す
//	
//	getDeclaredMethods()					Methods[]	メソッドの一覧を返す
//	
//	getDeclaredMethod()			String		Method		指定した名前と引数の型を持つメソッドを返す
//								Class<?>
//	
//	getDeclaredConstructors()				Constructor	コンストラクタの一覧を返す
//	
//	getDeclaredConstructor()	Class<?>	Constructor	指定した引数の型を持つコンストラクタを返す

	public static void main(String[] args) throws Exception{
		Class<?> clazz = RefSample.class;
		//引数１つのコンストラクタを取得し、インスタンスを生成する
		Constructor<?> cons = clazz.getConstructor(int.class);
		RefSample rs = (RefSample)cons.newInstance(256);
		//timesフィールドに関するFieldを取得して読み書き
		Field f = clazz.getField("times");
		f.set(rs, 2);						//rsのtimesに代入
		System.out.println(f.get(rs));		//rsのtimesを取得
		//引数のhelloメソッドを取得して呼び出す
		Method m = clazz.getMethod("hello", String.class, int.class);
		m.invoke(rs, "reflection!", 128);
		//クラスやメソッドへの修飾（publicやfinalの有無）を調べる
		boolean pubc = Modifier.isPublic(clazz.getModifiers());
		boolean finm = Modifier.isFinal(m.getModifiers());
		
		// TODO Auto-generated method stub

	}

}
