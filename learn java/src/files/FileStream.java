package files;
import java.io.*;

public class FileStream {
	
	//StringReader�̓t�@�C���ł͂Ȃ��A�R���X�g���N�^�Ŏw�肳�ꂽ������Ɍq�����Ă��܂�

	public static void main(String[] args) {
		String msg = "�����͑勹�؂�b���܂�";
		try(
				Reader sr = new StringReader(msg);
			)
		{
			int i = sr.read();	
			while (i != -1) {
				char c = (char)i;
				System.out.print(c);
				i = sr.read();
			}
		}catch (IOException e) {
			System.out.println("�G���[������");
		}
		System.out.println("");
		
		//�o�C�g�z��ɒl����������
		
		try(
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
		){
			baos.write(65);
			baos.write(66);
			byte[] data = baos.toByteArray();
			for (byte b : data) {
				System.out.println(b);
			}
		}catch (IOException e) {
			
		}
		
		// TODO Auto-generated method stub

	}

}
