package fanctionAndLambda;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.*;

public class main {

	public static void main(String[] args) {
		FuncList func = new FuncList();
		Func1 f1 = FuncList::isOdd;		//�ÓI���\�b�h��(static)������@�N���X��::���̐ÓI���\�b�h��
		Func2 f2 = func::passCheck;		//�ÓI���\�b�h������Ȃ�����@�C���X�^���X�ϐ���::���̃C���X�^���X�̃��\�b�h��
		System.out.println(f1.call(6));	//����ǂ�����true,false����
		System.out.println(f2.call(70, "��{"));		//�������U�T���ォ�ۂ��ō��ۂ����߂�
		
		//�����_��
		Func1 F1 = (int x) -> x % 2 == 1;		//����return�Ɣg�������ȂǏȂ��Ă���
		Func2 F2 = (point, name) -> {
			return name + "�����" + (point > 65 ? "���i" : "�s���i");
		};
		System.out.println(F1.call(7));
		System.out.println(F2.call(60, "����"));
		
		IntPredicate boo = x -> {return x % 2 == 1;};
		BiFunction<Integer, String, String> st = (Integer point , String name) -> {
			 return name + "�����" + (point > 65 ? "���i" : "�s���i");
		};
		System.out.println(boo.test(1));
		System.out.println(st.apply(80, "�΂�����"));
		
		List<Meibo> m = new ArrayList<>();
		Meibo m1 = new Meibo("��������");
		Meibo m2 = new Meibo("��������");
		Meibo m3 = new Meibo("�h���L�[�R���O");
		Meibo m4 = new Meibo("�}���I");
		
		m.add(m1);
		m.add(m2);
		m.add(m3);
		m.add(m4);
		
		List<String> names = m.stream()
				.filter(s -> s.getName().length() <= 4)		//4�����ȉ��̖��O
				.map(s -> s.getName() + "����")
				.collect(Collectors.toList());
		System.out.println(names);
		
		List<String> nameLists = List.of("�����ǂ�", "��{", "���ɂ�����", "�i�^�[���A");
		nameLists.stream()
		.filter(n -> n.length() <= 4)
		.map(n -> n + "����")
		.forEach(System.out::println);
		
		// TODO Auto-generated method stub

	}

}
