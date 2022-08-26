package jvm;

public class Reflection {
	//リフレクションAPIとはクラスやインターフェースに関する様々な型情報の調査をJVMに依頼できる
	//主な取得方法
//	Class<?> cinfo = Class.forName(FQCN文字列);
//	Class<?> cinfo = Class.クラス名;
//	Class<?> cinfo = 変数名.getClass();
	
	
	
//						引数			戻り値		意味
//	getName()						String		FQCNを返す
//	
//	getSimpleName()					String		クラス名を返す
//	
//	getPackage()					Package		所属するパッケージ情報を返す
//	
//	getModule()						Module		所属するモジュール情報を返す
//	
//	getSuperclass()					Class<?>	親クラスの情報を返す
//	
//	isArray()						boolean		配列かそうでないかを返す
//	
//	isInterface()					boolean		インターフェースかどうか
//	
//	isEnum()						boolean		列挙型かどうか

	public static void main(String[] args) {
		//Stringに関する情報を取得して表示する
		Class<?> info1 = String.class;
		System.out.println(info1.getSimpleName());
		System.out.println(info1.getName());
		System.out.println(info1.getPackage());
		System.out.println(info1.isArray());
		
		Class<?> info2 = info1.getSuperclass();
		System.out.println(info2.getName());
		
		Class<?> info3 = args.getClass();
		System.out.println(info3.isArray());
		
		// TODO Auto-generated method stub

	}

}
