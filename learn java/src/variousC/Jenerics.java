package variousC;

public class Jenerics <E> {		//<>�̂��Ƃ��W�F�l���N�X�Ƃ����@�N���X���`����Ƃ��ɋL�q���āA�Ăяo���Ƃ���E��u�������邱�Ƃ��ł���
	private E data;				//�������ƌ���
	public void put (E d) {
		this.data = d;
	}
	public E getData() {
		return this.data;
	}
	//int�Ȃǂ̊�{�f�[�^�^�͎g�p�ł��Ȃ�
	//�W�F�l���N�X���g�����N���X�̔z��͍��Ȃ�
	//Throwable�̎q���N���X�i��O�N���X�j�ł̓W�F�l���N�X�͎g���Ȃ�
	//public class Jenerics <E extends Character> �Ƃ����Character���p�������q���N���X����E�Ɏw��ł��Ȃ�

}
