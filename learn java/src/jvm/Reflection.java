package jvm;

public class Reflection {
	//���t���N�V����API�Ƃ̓N���X��C���^�[�t�F�[�X�Ɋւ���l�X�Ȍ^���̒�����JVM�Ɉ˗��ł���
	//��Ȏ擾���@
//	Class<?> cinfo = Class.forName(FQCN������);
//	Class<?> cinfo = Class.�N���X��;
//	Class<?> cinfo = �ϐ���.getClass();
	
	
	
//						����			�߂�l		�Ӗ�
//	getName()						String		FQCN��Ԃ�
//	
//	getSimpleName()					String		�N���X����Ԃ�
//	
//	getPackage()					Package		��������p�b�P�[�W����Ԃ�
//	
//	getModule()						Module		�������郂�W���[������Ԃ�
//	
//	getSuperclass()					Class<?>	�e�N���X�̏���Ԃ�
//	
//	isArray()						boolean		�z�񂩂����łȂ�����Ԃ�
//	
//	isInterface()					boolean		�C���^�[�t�F�[�X���ǂ���
//	
//	isEnum()						boolean		�񋓌^���ǂ���

	public static void main(String[] args) {
		//String�Ɋւ�������擾���ĕ\������
		Class<?> info1 = String.class;
		System.out.println(info1.getSimpleName());
		System.out.println(info1.getName());
		System.out.println(info1.getPackage());
		System.out.println(info1.isArray());
		
		Class<?> info2 = info1.getSuperclass();
		System.out.println(info2.getName());
		
		Class<?> info3 = args.getClass();
		System.out.println(info3.isArray());
		
		// TODO Auto-generated method stub

	}

}
