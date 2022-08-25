package fanctionAndLambda;
import java.util.Date;
import java.util.List;
import java.util.function.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import basicOfInstance.Account;

public class Lambda {

	public static void main(String[] args) {
		Function<String, Integer> func = 
				(String s) -> {return s.length();};		//���̍s�����s���ꂽ�u�ԁA�֐��̎��̂����ݏo�����
		int n = func.apply("Java");
		System.out.println("������@Java�@��" + n + "�����ł�");
		
		//��P�@Hero�C���X�^���X���󂯎��A����name��Ԃ�
		//Hero h = new Hero("�g���[");
		Function <Hero, String> hero = (Hero h) -> {return h.getName();};
		String st = hero.apply(new Hero("�g���["));
		System.out.println(st);
		
		Function <Hero, Integer> hero2 = (Hero h) -> {return h.getHp();};
		int st2 = hero2.apply(new Hero("�g���["));
		System.out.println(st2);
		
		//��Q�@�����󂯎�炸�A���ݓ�����Ԃ�
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Supplier<Date> D = () -> {return new Date();};
		System.out.println(f.format(D.get()));
		
		//��R�@long�z����󂯎��A���̃R�s�[�����A���e����ѕς��ĕԂ�
//		LongUnaryOperator<Long> l = (long[] org) -> {
//			long[] cpy = Arrays.copyOf(org, org.length());
//			Arrays.sort(cpy);
//			return cpy;
//		};
		
		//��S�@�֐��I�u�W�F�N�g���󂯎��A2��Ăяo�������v��Ԃ�
//		Function<IntBinaryOperator, Integer> Func = (IntBinaryOperator ibo, int a, int b) -> {
//			int result = ibo.applyAsInt(a, b) + ibo.applyAsInt(a, b);
//			return result;
//		};
		
		List<Account> list = new ArrayList<>();
		Account a1 = new Account();
		a1.setZandaka(1000);
		Account a2 = new Account();
		a2.setZandaka(10000);
		Account a3 = new Account();
		a3.setZandaka(10);
		
		list.add(a1);
		list.add(a2);
		list.add(a3);
		for (Account a : list) {
			System.out.println(a.getZandaka());
		}
		Collections.sort(list, (x, y) -> (x.getZandaka() - y.getZandaka()));	//Comparator����炸�ɕ��ёւ��邱�Ƃ��ł���
		for (Account a : list) {
			System.out.println(a.getZandaka());
		}
		
		boolean anyoneKnockOut = list.stream().anyMatch(a -> a.getZandaka() >= 100);	//for�����g�킸�Ɏc����100�ȏ�̃A�J�E���g��T���o����true�ɂ���
		System.out.println(anyoneKnockOut);
		
		
		// TODO Auto-generated method stub

	}

}
