package jvm;
import java.util.*;
import java.text.*;

public class Locales {
//	���P�[���Ƃ͏ꏊ�ƌ���ɂ��Ă̏���\��
	
//							static		����			�߂�l		�Ӗ�
//	setDefault()			�Z			Locale		�Ȃ�			�f�t�H���g���P�[����ݒ肷��
//	
//	getDefault()			�Z			�Ȃ�			Locale		�f�t�H���g���P�[����Ԃ�
//	
//	getCountry()						�Ȃ�			String		���P�[���̍��R�[�h��Ԃ�
//	
//	getDisplayCountry()					�Ȃ�			String		���P�[���̍�����Ԃ�
//	
//	getLanguage()						�Ȃ�			String		���P�[���̌���R�[�h��Ԃ�
//	
//	getDisplaylanguage()				�Ȃ�			String		���P�[���̌��ꖼ��Ԃ�

	public static void main(String[] args) {
		Locale loc = Locale.getDefault();		//�f�t�H���g���P�[�����擾
		System.out.println(loc.getCountry() + "-" + loc.getLanguage());
		String now = (new SimpleDateFormat()).format(new Date());
		if (loc.getLanguage().equals("ja")) {
			System.out.println("���݂̎�����" + now);
		}else {
			System.out.println("Current time is" + now);
		}
		
		// TODO Auto-generated method stub

	}

}
