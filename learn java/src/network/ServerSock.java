package network;
import java.net.*;

//�ڑ����L���b�`���鑤
public class ServerSock {

	public static void main(String[] args) throws Exception{
		System.out.println("�N������");
		ServerSocket svSock = new ServerSocket(39648);		//�҂��󂯃|�[�g
		Socket sock = svSock.accept();						//�N������ڑ������܂ő҂�������
		System.out.println(sock.getInetAddress() + "����ڑ�");
		sock.getOutputStream().write("WELCOME".getBytes());
		sock.getOutputStream().flush();
		sock.close();										//�f�[�^�𑗐M���Đؒf
		
		// TODO Auto-generated method stub

	}

}
