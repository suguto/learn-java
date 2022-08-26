package jvm;

import java.util.Iterator;
import java.util.Properties;

public class SystemProperty {

	public static void main(String[] args) {
//		//何らかのデータを読み込む処理
//		boolean isError = true;
//		if (isError) {
//			System.out.println("データが壊れているため異常終了します");
//			System.exit(1);		//ここでJVMを異常終了する
//		}
//		System.out.println("正常終了しました");
		
//		System.out.println("計算を開始します");
//		//何らかの計算処理
//		System.out.println("計算完了。結果をメモ帳で表示します");
//		ProcessBuilder pb = new ProcessBuilder(		//ProcessBuilderクラスを使うことで計算結果を起動したメモ帳に表示させる事が出来る
//		"c:\\windows\\system32\\notepad.exe",		//メモ帳の実行ファイル
//		"calcreport.txt"
//		);
//		pb.start();		//起動
		
		//システムプロパティ
		System.out.println("利用中のJavaバージョン");
		System.out.println(System.getProperty("java.version"));
		System.out.println("利用中のJavaインストール先のディレクトリ");
		System.out.println(System.getProperty("java.home"));
		System.out.println("動作中のOSの名前");
		System.out.println(System.getProperty("os.name"));
		System.out.println("動作中のOSの改行コード");
		System.out.println(System.getProperty("line.separator"));
		System.out.println("実行したユーザーの名前");
		System.out.println(System.getProperty("user.name"));
		System.out.println("");
		
		Properties p = System.getProperties();
		Iterator<String> i = p.stringPropertyNames().iterator();
		System.out.println("システムプロパティ一覧");
		while (i.hasNext()) {
			String key = i.next();
			System.out.print(key + " = ");
			System.out.println(System.getProperty(key));
		}
		System.out.println("");
		
		//システムプロパティは取得するだけでなく追加や変更をする事が出来る
//		String ver = System.getProperty("rpg.version");
//		String author = System.getProperty("rpg.author");
//		System.out.println("RPG: スッキリ魔王征伐　ver" + ver);
//		System.out.println("Developed by " + author);
		
		// TODO Auto-generated method stub

	}

}
