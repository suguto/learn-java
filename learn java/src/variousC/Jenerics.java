package variousC;

public class Jenerics <E> {		//<>のことをジェネリクスという　クラスを定義するときに記述して、呼び出すときにEを置き換えることができる
	private E data;				//仮引数と言う
	public void put (E d) {
		this.data = d;
	}
	public E getData() {
		return this.data;
	}
	//intなどの基本データ型は使用できない
	//ジェネリクスを使ったクラスの配列は作れない
	//Throwableの子孫クラス（例外クラス）ではジェネリクスは使えない
	//public class Jenerics <E extends Character> とするとCharacterを継承した子孫クラスしかEに指定できない

}
