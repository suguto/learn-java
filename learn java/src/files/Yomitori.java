package files;
import java.io.*;

public class Yomitori {
	
//	メソッド名				引数					戻り値		意味
//	STEP1 (コンストラクタ)
//	FileReader()		String							開く
//	
//	STEP2
//	read()				String				int			読む（1文字）
//	
//	skip()				long				long		n文字分読み飛ばす
//
//	STEP3
//	close()				なし					なし			閉じる

	public static void main(String[] args)  {
		try(
				FileReader fr = new FileReader("java.txt");
			){	
				System.out.println("全てのデータを読んで表示します");
				int i = fr.read();		//1文字読む
				while (i != -1) {		//これ以上読めるデータがない場合は-1
					char c = (char)i;
					System.out.print(c);
					i = fr.read();
				}
				System.out.println("");
				System.out.println("末尾に到達しました");
				//fr.close();
			}catch (IOException e) {
				System.out.print("エラーが発生しました");
			}
		
		// TODO Auto-generated method stub

	}

}
