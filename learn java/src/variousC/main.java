package variousC;
import static variousC.AccountType.*;

import java.util.*;

import basicOfInstance.Account;



public class main {
//	������s�𕶎�c�ŋ���ő������郁�\�b�h
//	������s��null�܂��͒���0�̏ꍇ�́Anull��Ԃ�
//	�߂�l�́unull�̉\��������v���𖾎����邽�߂ɁA�P�Ȃ�String�ł͂Ȃ�Optional<String>�Ƃ���
	
	public static Optional<String> decorate (String s, char c){		//Optional<String>�Ŗ߂�l��null�̉\�������鎖��F�������
		String r;
		if (s == null || s.length() == 0) {
			r = null;
		}else {
			r = c + s + c;
		}
		return Optional.ofNullable(r);
	}

	public static void main(String[] args) {
		Optional<String> Os = decorate("", '*');
		System.out.println(Os.orElse("null�̈׏����ł��܂���"));		//null���l����������������
		
		Jenerics<String> j = new Jenerics<>();	//�C���X�^���X�𐶐����鎞��<>�̒��Ɍ^���w�肷��
		j.put("�f�[�^");
		String s = j.getData();
		System.out.println(s);
		
		//import static variousC.AccountType.*;�Ƃ��Ă������Ƃ�AccountType.TENKI�Ƃ���K�v���Ȃ��Ȃ�
		Kouza k = new Kouza("1234", TENKI);
		System.out.println(k.getAccountNo() + " " + k.getAccountType());
		
		Outer.Inner1 i1 = new Outer.Inner1();		//���֌W�ȃN���X����͊O���N���X��.�����o�N���X���ŗ��p
		
		//�����N���X�̎g�����i���̏����̎g���̂āj
//		Collections.sort(null, new Comparator<Account>() {
//			public compare(Account x, Account y) {
//				return (x.getZandaka() - y.getZandaka());
//			}
//		});		����Ȋ����Ŏg���Ɨ]�v�ɃN���X����炸�ɍς�
		

		
		// TODO Auto-generated method stub
	}

}
