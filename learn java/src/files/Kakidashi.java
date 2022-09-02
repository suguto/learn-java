package files;
import java.io.*;

public class Kakidashi {
	
	//FileWriter()とFileReader()はテキストファイルといい、主に文字列を保存する
	//メモ帳で作成したファイル、Javaのソースファイル、、HTMLファイルなどに使う
	
//	メソッド名				引数					戻り値		意味
//	STEP1 (コンストラクタ)
//	FileWriter()		String							開く（上書き）
//	
//	FileWriter()		String, boolean					開く（上書きまたは追記）
//	
//	STEP2
//	write()				String				なし			書く（文字列）
//	
//	write()				int					なし			書く（1文字）
//	
//	flush()				なし					なし			強制的に書き込む
//	
//	STEP3
//	close()				なし					なし			閉じる

	public static void main(String[] args){
		try(												//自動的にclose()が追加される
				FileWriter fw = new FileWriter("c:/Users/grpn7/Desktop/Java/practice", true);	//インスタンス化する事でファイルを開くことが出来る
		//指定したファイルが見つからない場合指定したファイル名で新規作成される
		//今回の場合だとtrueを指定しているので、ファイルが存在している場合はその末尾からデータを追記していく
		//falseまたは省略した場合は必ずファイルの先頭からデータを上書きしていきます
			) {	
				fw.write('A');
				fw.flush();		//書き込みがされていない場合があるので必ずflush()を記述すること
				//fw.close();
			  }catch (IOException e){
				  System.out.print("ファイル書き込みエラーです");
			  }
		
		try(
				FileWriter ja = new FileWriter("java.txt", true);
			){
			ja.write("Hello World");
			ja.flush();
		}catch (IOException e) {
			System.out.print("error");
		}
		
		//ja.close();
		
		// TODO Auto-generated method stub

	}

}
