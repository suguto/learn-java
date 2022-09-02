package files;
import java.io.*;

public class Binary {
	//FileInputStream(),FileOutputStream()はバイナリファイルといい、バイト列で保存する
	//主にExcelで作成したファイル、Javaのクラスファイル、画像ファイル、動画ファイルなどに使う
	
//	メソッド名				引数					戻り値		意味
//	FileOutputStream
//	write()				bite[]				なし			書く（バイト列）
//	
//	write()				int					なし			書く（1バイト）
//	
//	FileInputStream
//	read()				なし					int			読む（1バイト）

	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("Binary.txt", true);
		fos.write(65);
		fos.flush();
		fos.close();
		
		FileInputStream fis = new FileInputStream("Binary.txt");
		int i = fis.read();
		while (i != -1) {
			System.out.print(i);
			i = fis.read();
		}
		System.out.println("");
		System.out.println("ファイルの末尾に到達");
		fis.close();
		
		// TODO Auto-generated method stub

	}

}
