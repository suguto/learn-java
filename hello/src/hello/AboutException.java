package hello;
import java.io.*;

public class AboutException {
	//例外処理について

	public static void main(String[] args) {
		
		//FileWriterを使うときはimport java.io.*;をしておく
		//変数のスコープの関係でfinallyでfwが上手く使えなくなってしまうためスコープの外で定義する
		FileWriter fw  = null;								//nullをセットする
		try {												//メインの実行文(try)
			fw = new FileWriter("data.txt");
			fw.write("hello!");
			fw.close();
		}catch(IOException e){								//もしIoExceptionエラーが発生したら実行する(catch)
			System.out.println("エラーが発生しました");			//ここで使われているeにはエラーの詳細情報が格納されている	
		}													//e.getMessage()でエラーメッセージを取得する e.printStackTrace()でスタックトレースの内容を表示する
															//スタックトレースとはどこで例外が発生したかを記録した情報
		finally {											//finallyとは例外があってもなくても実行する処理 あと片付け処理など
			if (fw != null) {								//ファイル、データベース接続、ネットワーク接続などの時に記述する
				try {
					fw.close();
				}catch(IOException e) {
					;
				}
			}
		}
		
		//この長い処理を簡略化した処理
		try (FileWriter FW = new FileWriter("data.txt");){	//closeによる後片付けが必要な変数の宣言
			FW.write("hey!");								//finallyをしなくても自動的にcloseされる
		}catch(Exception e) {
			System.out.println("何らかの例外が発生しました");
		}
		
		//例外的状況の報告（例外を）投げる throw 例外インスタンス;
		//一般的には　throw new 例外クラス名　（"エラーメッセージ"）;と使う
		//例：　ObjectパッケージのWand,Wizardクラスを参照
		
		try {
			String s = null;
			System.out.println(s.length());
		}catch (NullPointerException e) {
			System.out.println("NullPointerException例外を　catchしました");
			System.out.println("スタックトレース（ここから）　" );
			e.printStackTrace();
			System.out.println("スタックトレース（ここまで）　");
		}
		
		try {
			int i = Integer.parseInt("三");
		}catch (NumberFormatException e) {
			System.out.println("NumberFormatException例外をcatchしました");
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
