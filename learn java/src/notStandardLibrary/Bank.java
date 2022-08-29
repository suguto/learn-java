package notStandardLibrary;

import org.apache.commons.lang3.builder.*;

//Javaに最初から標準で組み込まれているAPIをライブラリーと呼び、
//最初から組み込まれていない、他の人が作ったAPIを非標準のライブラリーと呼び、サイトから入手して自分で組み込む
//組み込む手順は　projectを右クリックしbuild pathからAdd extrnal Archivesを選択しダウンロードした非標準のライブラリーを選択する
//configure build pathからも出来る、消したい時や何か設定する時はここから入る

public class Bank {
	String name;
	String address;
	
//	public boolean equals(Object o) {
//		if (o == this) return true;
//		if (o == null) return false;
//		if (!(o instanceof Bank)) return false;
//		Bank r = (Bank)o;
//		if (!this.name.equals(r.name)) return false;
//		if (!this.address.equals(r.address)) return false;
//		return true;
//	}
	//非標準のライブラリーを使うことで一行でまとめることが出来る
	public boolean equals(Object o) {
		return EqualsBuilder.reflectionEquals(this, o);
	}

}
