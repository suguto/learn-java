package variousC;

//Inner�N���X�ɂ���
public class Outer {
	int outerField;
	static int outerStaticField;
	static class Inner1 {				//�����o�N���X�̐錾
		void innerMethod() {			//static���Ȃ����ƊO���N���X�𐶐����Ă��炶��Ȃ��Ǝg���Ȃ�
			outerStaticField = 10;
		}
	}
	void outerMethod1() {
		Inner1 i1 = new Inner1();		//�O���N���X����̓N���X���݂̂ŗ��p�\
	}
	
	void outerMethod2() {
		int a = 10;
		class Inner2 {					//���[�J���N���X�̐錾
			public void InnerMethod2() {
				System.out.println("Innermethod2�ł�");
			}
		}
		Inner2 i2 = new Inner2();		//�������\�b�h���ł����ɗ��p����
		i2.InnerMethod2();
	}
}
