package files;
import java.io.*;

public class Kakidashi {
	
//	���\�b�h��				����					�߂�l		�Ӗ�
//	STEP1 (�R���X�g���N�^)
//	FileWriter()		String							�J���i�㏑���j
//	
//	FileWriter()		String, boolean					�J���i�㏑���܂��͒ǋL�j
//	
//	STEP2
//	write()				String				�Ȃ�			�����i������j
//	
//	write()				int					�Ȃ�			�����i1�����j
//	
//	flush()				�Ȃ�					�Ȃ�			�����I�ɏ�������
//	
//	STEP3
//	close()				�Ȃ�					�Ȃ�			����

	public static void main(String[] args) throws Exception{
		FileWriter fw = new FileWriter("c:/Users/grpn7/Desktop/Java/practice", true);	//�C���X�^���X�����鎖�Ńt�@�C�����J�����Ƃ��o����
		//�w�肵���t�@�C����������Ȃ��ꍇ�w�肵���t�@�C�����ŐV�K�쐬�����
		//����̏ꍇ����true���w�肵�Ă���̂ŁA�t�@�C�������݂��Ă���ꍇ�͂��̖�������f�[�^��ǋL���Ă���
		//false�܂��͏ȗ������ꍇ�͕K���t�@�C���̐擪����f�[�^���㏑�����Ă����܂�
		fw.write('A');
		fw.flush();		//�������݂�����Ă��Ȃ��ꍇ������̂ŕK��flush()���L�q���邱��
		fw.close();
		
		FileWriter ja = new FileWriter("java.txt", true);
		ja.write("Hello World");
		ja.flush();
		ja.close();
		
		// TODO Auto-generated method stub

	}

}
