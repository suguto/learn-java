package files;
import java.io.*;

public class Yomitori {
	
//	���\�b�h��				����					�߂�l		�Ӗ�
//	STEP1 (�R���X�g���N�^)
//	FileReader()		String							�J��
//	
//	STEP2
//	read()				String				int			�ǂށi1�����j
//	
//	skip()				long				long		n�������ǂݔ�΂�
//
//	STEP3
//	close()				�Ȃ�					�Ȃ�			����

	public static void main(String[] args)  {
		try(
				FileReader fr = new FileReader("java.txt");
			){	
				System.out.println("�S�Ẵf�[�^��ǂ�ŕ\�����܂�");
				int i = fr.read();		//1�����ǂ�
				while (i != -1) {		//����ȏ�ǂ߂�f�[�^���Ȃ��ꍇ��-1
					char c = (char)i;
					System.out.print(c);
					i = fr.read();
				}
				System.out.println("");
				System.out.println("�����ɓ��B���܂���");
				//fr.close();
			}catch (IOException e) {
				System.out.print("�G���[���������܂���");
			}
		
		// TODO Auto-generated method stub

	}

}
