package jvm;
import java.text.SimpleDateFormat;
import java.util.*;


public class TimtZones {

	//タイムゾーンは時間帯を表す
//						static		引数			戻り値		意味	
//	setDefault()		〇			TimeZone	なし			デフォルトゾーンタイムを設定する	
//	
//	getDfault()			〇			なし			TimeZone	デフォルトゾーンタイムを返す
//	
//	getDisplayName()				なし			String		タイムゾーンの表示名を返す
//	
//	useDatlightTime()				なし			boolean		タイムゾーンが夏時間を採用しているかを返す
//	
//	getRawPffset()					なし			int			世界標準時からの時差をミリ秒で返す（夏時間を考慮しない）
//	
//	getOffset()						long		int			世界標準時からの時差をミリ秒で返す（夏時間を考慮する）
	
	public static void main(String[] args) {
		TimeZone tz = TimeZone.getDefault();
		System.out.println("現在のタイムゾーン:");
		String now = (new SimpleDateFormat()).format(new Date());
		System.out.println(tz.getDisplayName() + ": " + now);
		if (tz.useDaylightTime()) {
			System.out.println("夏時間を採用しています");
		}else {
			System.out.println("夏時間を採用していません");
		}
		System.out.println("世界標準時との時差は");
		System.out.println(tz.getRawOffset() / 3600000 + "時間です");
		
		// TODO Auto-generated method stub

	}

}
