package jvm;
import java.text.SimpleDateFormat;
import java.util.*;


public class TimtZones {

	//�^�C���]�[���͎��ԑт�\��
//						static		����			�߂�l		�Ӗ�	
//	setDefault()		�Z			TimeZone	�Ȃ�			�f�t�H���g�]�[���^�C����ݒ肷��	
//	
//	getDfault()			�Z			�Ȃ�			TimeZone	�f�t�H���g�]�[���^�C����Ԃ�
//	
//	getDisplayName()				�Ȃ�			String		�^�C���]�[���̕\������Ԃ�
//	
//	useDatlightTime()				�Ȃ�			boolean		�^�C���]�[�����Ď��Ԃ��̗p���Ă��邩��Ԃ�
//	
//	getRawPffset()					�Ȃ�			int			���E�W��������̎������~���b�ŕԂ��i�Ď��Ԃ��l�����Ȃ��j
//	
//	getOffset()						long		int			���E�W��������̎������~���b�ŕԂ��i�Ď��Ԃ��l������j
	
	public static void main(String[] args) {
		TimeZone tz = TimeZone.getDefault();
		System.out.println("���݂̃^�C���]�[��:");
		String now = (new SimpleDateFormat()).format(new Date());
		System.out.println(tz.getDisplayName() + ": " + now);
		if (tz.useDaylightTime()) {
			System.out.println("�Ď��Ԃ��̗p���Ă��܂�");
		}else {
			System.out.println("�Ď��Ԃ��̗p���Ă��܂���");
		}
		System.out.println("���E�W�����Ƃ̎�����");
		System.out.println(tz.getRawOffset() / 3600000 + "���Ԃł�");
		
		// TODO Auto-generated method stub

	}

}
