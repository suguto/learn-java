package fanctionAndLambda;
import java.util.Date;
import java.util.function.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;


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
		LongUnaryOperator<Long> l = (long[] org) -> {
			long[] cpy = Arrays.copyOf(org, org.length());
			Arrays.sort(cpy);
			return cpy;
		};
		
		
		// TODO Auto-generated method stub

	}

}
