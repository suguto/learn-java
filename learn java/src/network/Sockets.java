package network;
import java.net.*;
import java.io.*;

public class Sockets {
	
	//�ڑ����s����
	
//	�v���g�R����		�W���|�[�g		�p�r					RFC����
//	HTTP			TCP80		Web�y�[�W�̎擾		RFC2616�ق�
//	HTTPS			TCP443		Web�y�[�W�̎擾�i�Í����j	RFC2818�ق�
//	SMTP			TCP25		���[���̑��M			RFC5321�ق�
//	FTP				TCP20/21	�t�@�C���̓`��			RFC959�ق�
//	SSH				TCP22		�����[�g���O�C��			RFC4250�ق�

	public static void main(String[] args) throws Exception{
		Socket sock = new Socket("dokojava.jp", 80);		//IP�A�h���X�܂��̓z�X�g���ƃ|�[�g�ԍ����w�肵�ăC���X�^���X������
		InputStream is = sock.getInputStream();
		OutputStream os = sock.getOutputStream();
		
		os.write("GET /index.html HTTP/1.0\r\n".getBytes());		//HTTP�v���𑗐M
		os.write("\r\n".getBytes());
		os.flush();
		
		InputStreamReader isr = new InputStreamReader(is);
		int i = isr.read();					//��������M
		while (i != -1) {					//
			System.out.println((char)i);	//
			i = isr.read();					//
		}
		sock.close();
		
		
		// TODO Auto-generated method stub

	}

}
