package fanctionAndLambda;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.Set;

public class VariousFunc {
//																					Bi/Binary		Unary
//	Function�@�������󂯎���Ď󂯎���������ƕʂ̌^��Ԃ�		apply()�ň�����n���Č��ʂ��󂯎��		�Z
//	
//	Operator�@�������󂯎���Ď󂯎���������Ɠ����^��Ԃ�		apply()�ň�����n���Č��ʂ��󂯎��		�Z		�@�@	�@�@�Z
//	
//	Consumer�@�������󂯎���ĉ����Ԃ��Ȃ�					accept()�ň�����n��					�Z
//	
//	Supplier�@�����󂯎�炸�Ɍ��ʂ�Ԃ�					get()�Ō��ʂ��󂯎��					�Z
//	
//	Predicate�@�������󂯎����boolean�̔��f��Ԃ�			�Ăяo����test()���g��
	
	
	public static Integer len(String s) {		//��������󂯎�肻�̕�������Ԃ��֐�
		return s.length();
	}
	//�I���W�i���̊֐��C���^�[�t�F�[�X
//			@FunctionalInterface		����͏����Ȃ��Ă��������A�ǂ����Ƃ�����
//			public interface PartyInfoConsumer{
//				public abstract void process(Set<Hero> party, Hero leader, String pName);
//			}			�i�[�����֐��I�u�W�F�N�g��process�Ƃ������O�ŌĂяo����

	
	//������������\�b�h��static���ۂ��ŋL�q���ς��
	//�ÓI���\�b�h�istatic�j�Ȃ�@�N���X��::���̐ÓI���\�b�h���A�@�ۂȂ�@�C���X�^���X�ϐ���::���̃C���X�^���X�̃��\�b�h���Ŋi�[����
	public static void main(String[] args) {
		//import java util.function.*;�����Ă���
				//<�����̌^, �߂�l�̌^>
		Function<String, Integer> func = VariousFunc::len;		//(�N���X��::���̃N���X�̐ÓI���\�b�h��)�����ő�����āc 
		//�ϐ�fanc�Ɋi�[����Ă��鏈�����W�b�N���A����"Java"�Ŏ��s����
		int a = func.apply("Java");
		System.out.println("������@Java�@��" + a + "�����ł�");
		
		//�P�C�߂�l���Ȃ��֐����i�[����
//		System.out.println();�̂悤�ɁA�P�̈����������󂯎���Ė߂�l��Ԃ��Ȃ��֐����i�[����ɂ́A
//		java.util.function.Consumer�C���^�[�t�F�[�X���g�p����
		Consumer<String> C = System.out::println;
		C.accept("Hello, world");
//		�߂�l���Ȃ��A��{�f�[�^�^�̈������󂯎��֐��̂��߂�
//		IntConsumer, LongConsumer, DoubleConsumer������
		
//		�Q�C�������Ȃ��֐����i�[����
//		�������Ȃ��߂�l�݂̂�Ԃ��֐��̊i�[�ɂ�java.util.function.Supplier�C���^�[�t�F�[�X���g�p����
				//�߂�l�̌^
		Supplier<String> S = System::lineSeparator;
		System.out.println("���s���܂�" + S.get());
//		�������Ȃ��A��{�f�[�^�^�̖߂�l��Ԃ��֐��ɂ́A
//		IntSupplier, LongSupplier, DoubleSupplier������
		
//		�R�C�����̈������󂯎��֐����i�[����
//		Function�^�ł́A�P�̈��������󂯎��֐������i�[�ł��Ȃ����߁A�����^�̂Q�̈����ɑΉ����鎖���o����
//		java.util.function.BiFunction�C���^�[�t�F�[�X���g�p����
				  //<�����̌^, �����̌^, �߂�l�̌^>
		BiFunction<String, String, String> B = System::getProperty;
		System.out.println(B.apply("java.version", "�s��"));
		
		
		
	}

}
