package notStandardLibrary;

import org.apache.commons.lang3.builder.*;

//Java�ɍŏ�����W���őg�ݍ��܂�Ă���API�����C�u�����[�ƌĂсA
//�ŏ�����g�ݍ��܂�Ă��Ȃ��A���̐l�������API���W���̃��C�u�����[�ƌĂсA�T�C�g������肵�Ď����őg�ݍ���
//�g�ݍ��ގ菇�́@project���E�N���b�N��build path����Add extrnal Archives��I�����_�E�����[�h������W���̃��C�u�����[��I������
//configure build path������o����A�����������≽���ݒ肷�鎞�͂����������

public class Bank {
	String name;
	String address;
	
//	public boolean equals(Object o) {
//		if (o == this) return true;
//		if (o == null) return false;
//		if (!(o instanceof Bank)) return false;
//		Bank r = (Bank)o;
//		if (!this.name.equals(r.name)) return false;
//		if (!this.address.equals(r.address)) return false;
//		return true;
//	}
	//��W���̃��C�u�����[���g�����Ƃň�s�ł܂Ƃ߂邱�Ƃ��o����
	public boolean equals(Object o) {
		return EqualsBuilder.reflectionEquals(this, o);
	}

}
