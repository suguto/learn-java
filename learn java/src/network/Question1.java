package network;
import java.io.*;
import java.net.*;

public class Question1 {

	public static void main(String[] args) throws Exception{
		URL url = new URL("https://dokojava.jp/favicon.ico");
		InputStream is = url.openStream();
		OutputStream os = new FileOutputStream("dj.ico");
		
		int i = is.read();			//�l�b�g���[�N����ǂݍ���Ńt�@�C���ɏ����o��
		while (i != -1) {
			os.write((byte)i);
			i = is.read();
		}
		is.close();
		os.flush();
		os.close();
		
		// TODO Auto-generated method stub

	}

}
