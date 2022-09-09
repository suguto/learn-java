package network;
import java.net.*;
import java.io.*;

public class Sockets {
	
	//接続を行う側
	
//	プロトコル名		標準ポート		用途					RFC文書
//	HTTP			TCP80		Webページの取得		RFC2616ほか
//	HTTPS			TCP443		Webページの取得（暗号化）	RFC2818ほか
//	SMTP			TCP25		メールの送信			RFC5321ほか
//	FTP				TCP20/21	ファイルの伝送			RFC959ほか
//	SSH				TCP22		リモートログイン			RFC4250ほか

	public static void main(String[] args) throws Exception{
		Socket sock = new Socket("dokojava.jp", 80);		//IPアドレスまたはホスト名とポート番号を指定してインスタンス化する
		InputStream is = sock.getInputStream();
		OutputStream os = sock.getOutputStream();
		
		os.write("GET /index.html HTTP/1.0\r\n".getBytes());		//HTTP要求を送信
		os.write("\r\n".getBytes());
		os.flush();
		
		InputStreamReader isr = new InputStreamReader(is);
		int i = isr.read();					//応答を受信
		while (i != -1) {					//
			System.out.println((char)i);	//
			i = isr.read();					//
		}
		sock.close();
		
		
		// TODO Auto-generated method stub

	}

}
