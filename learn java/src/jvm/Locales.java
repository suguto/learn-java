package jvm;
import java.util.*;
import java.text.*;

public class Locales {
//	ロケールとは場所と言語についての情報を表す
	
//							static		引数			戻り値		意味
//	setDefault()			〇			Locale		なし			デフォルトロケールを設定する
//	
//	getDefault()			〇			なし			Locale		デフォルトロケールを返す
//	
//	getCountry()						なし			String		ロケールの国コードを返す
//	
//	getDisplayCountry()					なし			String		ロケールの国名を返す
//	
//	getLanguage()						なし			String		ロケールの言語コードを返す
//	
//	getDisplaylanguage()				なし			String		ロケールの言語名を返す

	public static void main(String[] args) {
		Locale loc = Locale.getDefault();		//デフォルトロケールを取得
		System.out.println(loc.getCountry() + "-" + loc.getLanguage());
		String now = (new SimpleDateFormat()).format(new Date());
		if (loc.getLanguage().equals("ja")) {
			System.out.println("現在の時刻は" + now);
		}else {
			System.out.println("Current time is" + now);
		}
		
		// TODO Auto-generated method stub

	}

}
