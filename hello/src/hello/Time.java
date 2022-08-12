package hello;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Time {

	public static void main(String[] args) throws Exception {
		
		//時間を計測する
		long start = System.currentTimeMillis();
		//ここで計るものの記述
		//int m = new java.util.Scanner(System.in).nextInt();
		long end = System.currentTimeMillis();
		System.out.println((end - start) + "ミリ秒かかりました");
		
		//このインスタンス生成する時はimport java.util.Date;をしておくと便利
		Date now = new Date();
		System.out.println(now);//現在時刻
		
		//このインスタンス生成する時はimport java.util.Calendar;をしておくと良い
		Calendar c = Calendar.getInstance();
		//6つのint値からDateインスタンス生成
		c.set(2022, 7, 12, 22, 22, 22);//月は０～１１で表す　今回は8月
		//c.set(Calendar.MONTH, 9);10月に変更
		Date d = c.getTime();
		System.out.println(d);
		c.setTime(now);
		int time = c.get(Calendar.YEAR);
		System.out.println(time + "年です");
		
		//y: 年　M: 月　d: 日　H:　時刻（０～２３）　m: 分　s: 秒　K：　時刻（０～１１）　E:　曜日　a/p: 午前/午後
		
		//import java.text.SimpleDateFormat;をしておく
		SimpleDateFormat f = 
				new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		//文字列からDateインスタンス生成
		Date da = f.parse("2022/10/25 23:48:33");
		System.out.println(da);
		//Dateインスタンスから文字列を生成
		Date present = new Date();
		String s = f.format(present);
		System.out.println(s);
		// TODO Auto-generated method stub

	}

}
