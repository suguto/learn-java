package hello;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Time {

	public static void main(String[] args) throws Exception {
		
		//���Ԃ��v������
		long start = System.currentTimeMillis();
		//�����Ōv����̂̋L�q
		//int m = new java.util.Scanner(System.in).nextInt();
		long end = System.currentTimeMillis();
		System.out.println((end - start) + "�~���b������܂���");
		
		//���̃C���X�^���X�������鎞��import java.util.Date;�����Ă����ƕ֗�
		Date now = new Date();
		System.out.println(now);//���ݎ���
		
		//���̃C���X�^���X�������鎞��import java.util.Calendar;�����Ă����Ɨǂ�
		Calendar c = Calendar.getInstance();
		//6��int�l����Date�C���X�^���X����
		c.set(2022, 7, 12, 22, 22, 22);//���͂O�`�P�P�ŕ\���@�����8��
		//c.set(Calendar.MONTH, 9);10���ɕύX
		Date d = c.getTime();
		System.out.println(d);
		c.setTime(now);
		int time = c.get(Calendar.YEAR);
		System.out.println(time + "�N�ł�");
		
		//y: �N�@M: ���@d: ���@H:�@�����i�O�`�Q�R�j�@m: ���@s: �b�@K�F�@�����i�O�`�P�P�j�@E:�@�j���@a/p: �ߑO/�ߌ�
		
		//import java.text.SimpleDateFormat;�����Ă���
		SimpleDateFormat f = 
				new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		//�����񂩂�Date�C���X�^���X����
		Date da = f.parse("2022/10/25 23:48:33");
		System.out.println(da);
		//Date�C���X�^���X���當����𐶐�
		Date present = new Date();
		String s = f.format(present);
		System.out.println(s);
		// TODO Auto-generated method stub

	}

}
