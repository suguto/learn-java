package files;
import java.io.*;

public class Binary {
	//FileInputStream(),FileOutputStream()�̓o�C�i���t�@�C���Ƃ����A�o�C�g��ŕۑ�����
	//���Excel�ō쐬�����t�@�C���AJava�̃N���X�t�@�C���A�摜�t�@�C���A����t�@�C���ȂǂɎg��
	
//	���\�b�h��				����					�߂�l		�Ӗ�
//	FileOutputStream
//	write()				bite[]				�Ȃ�			�����i�o�C�g��j
//	
//	write()				int					�Ȃ�			�����i1�o�C�g�j
//	
//	FileInputStream
//	read()				�Ȃ�					int			�ǂށi1�o�C�g�j

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
		System.out.println("�t�@�C���̖����ɓ��B");
		fis.close();
		
		// TODO Auto-generated method stub

	}

}
