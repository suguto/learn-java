package jvm;
import java.lang.reflect.*;

public class Member {
	
//								����			�߂�l		�Ӗ�
//	getDeclaredFields()						Fields[]	�t�B�[���h�̈ꗗ��Ԃ�
//	
//	getDeclaredField()			String		Field		�w�肵�����O�̃t�B�[���h��Ԃ�
//	
//	getDeclaredMethods()					Methods[]	���\�b�h�̈ꗗ��Ԃ�
//	
//	getDeclaredMethod()			String		Method		�w�肵�����O�ƈ����̌^�������\�b�h��Ԃ�
//								Class<?>
//	
//	getDeclaredConstructors()				Constructor	�R���X�g���N�^�̈ꗗ��Ԃ�
//	
//	getDeclaredConstructor()	Class<?>	Constructor	�w�肵�������̌^�����R���X�g���N�^��Ԃ�

	public static void main(String[] args) throws Exception{
		Class<?> clazz = RefSample.class;
		//�����P�̃R���X�g���N�^���擾���A�C���X�^���X�𐶐�����
		Constructor<?> cons = clazz.getConstructor(int.class);
		RefSample rs = (RefSample)cons.newInstance(256);
		//times�t�B�[���h�Ɋւ���Field���擾���ēǂݏ���
		Field f = clazz.getField("times");
		f.set(rs, 2);						//rs��times�ɑ��
		System.out.println(f.get(rs));		//rs��times���擾
		//������hello���\�b�h���擾���ČĂяo��
		Method m = clazz.getMethod("hello", String.class, int.class);
		m.invoke(rs, "reflection!", 128);
		//�N���X�⃁�\�b�h�ւ̏C���ipublic��final�̗L���j�𒲂ׂ�
		boolean pubc = Modifier.isPublic(clazz.getModifiers());
		boolean finm = Modifier.isFinal(m.getModifiers());
		
		// TODO Auto-generated method stub

	}

}
