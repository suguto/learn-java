package network;
import java.io.*;
import java.net.*;

public class Question2 {
//	���̂Ł[���𑗂�ƃ��[���𑗐M���Ă����T�[�r�X��smtp.example.com�̂U�O�O�Q�T�ԃ|�[�g�ɂ���Ƃ���
//	HELO smtp.example.com
//	MAIL FROM: asaka@example.com
//	RCPT TO: minato@example.com
//	DATA
//	From: asaka@example.com
//	Subject: Please send me your RPG
//	Hello minato. i would like to play your RPG.
//	Could you please send it to me?
//	
//	.
//	
//	QUIT

	public static void main(String[] args) throws Exception{
		Socket sock = new Socket("smtp.example.com", 60025);
		OutputStream os = sock.getOutputStream();
		os.write("HELO smtp.example.com\r\n".getBytes());
		os.write("asaka@example.com\r\n".getBytes());
		os.write("minato@example.com\r\n".getBytes());
		os.write("asaka@example.com\r\n".getBytes());
		os.write("Please send me your RPG\r\n".getBytes());
		os.write("Hello minato. i would like to play your RPG.\r\n".getBytes());
		os.write("Could you please send it to me?\r\n".getBytes());
		
		os.flush();
		sock.close();
		
		// TODO Auto-generated method stub

	}

}
