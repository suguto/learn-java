package hello;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class AboutApi {

	public static void main(String[] args) {
		String s1 = "���߂܂���Hello";
		String s2 = "Hello";
		String s3 = "hello";
		String s4 = "";
		String s5 = "Java and Javascript";
		String s6 = " ��ɂ�@";
		
		if (!s2.equals(s3)) {
			System.out.println("���e�������ł͂Ȃ�");
		}
		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("�啶������������ʂ��Ȃ���Γ���");
		}
		System.out.println("s1�̒�����" + s1.length() + "�ł�");
		if (s4.isEmpty()) {
			System.out.println("s4�͋󕶎��ł�");
		}
		if (s5.contains("Java")) {
			System.out.println("s5��Java���܂܂�Ă��܂�");
		}
		if (s5.endsWith("Java")) {
			System.out.println("s5�̖�����Java������܂�");
		}
		if (s5.startsWith("Java")) {
			System.out.println("s5�̍ŏ���Java������܂�");
		}
		System.out.println("s5�ōŏ���Java���o�ꂷ��̂�" + s5.indexOf("Java") + "�Ԗ�");
		System.out.println("s5�ōŌ��Java���o�ꂷ��̂�" + s5.lastIndexOf("Java") + "�Ԗ�");
		
		System.out.println("�����" + s5.charAt(0) + "�ł�");//�w���1�����؂���܂�
		System.out.println("�����" + s5.substring(9) + "�ł�");//�w��̏ꏊ����\�����܂�
		System.out.println("�����" + s5.substring(5, 8) + "�ł�");//�w��̏ꏊ����w��̏ꏊ��؂���܂�
		
		System.out.println(s5.toLowerCase());
		System.out.println(s5.toUpperCase());
		System.out.println(s6.trim() + "��ɂ�");//�O��̋󔒂������܂����A�S�p�X�y�[�X�͏����܂���
		System.out.println(s5.replace("Java", "��ɂ�"));//���������ւ��܂�
		
		StringBuilder sb = new StringBuilder();//StringBuilder�N���X���g����+���Z�q���g�����������������邱�Ƃ��o����
		for (int i = 0; i < 10; i++) {
			sb.append("Java");//append���g��
		}
		String s = sb.toString();
		System.out.println(s);//�A������Ƃ��݂̂Ɏg��
		
		//�`�F�b�N���s�����\�b�h
		if (s2.matches("Hello")) {//s2��Hello��������
			System.out.println("true 1");
		}
		if (s2.matches("H.llo")) {//.�͉��ł������̂�1�����������Ă�Ηǂ�
			System.out.println("true 2");
		}
		if ("Hellllllo".matches("Hel*o")) {//*�͒��O�̕������O��ȏ�J��Ԃ��Ă��悢
			System.out.println("true 3");
		}
		if (s2.matches(".*")) {//���ł��悢
			System.out.println("true 4");
		}
		//{} �w��񐔂̌J��Ԃ�
		//{n} n��̌J��Ԃ�
		//{n,} n��ȏ�̌J��Ԃ�
		//{n,m} n��ȏ�m��ȉ��̌J��Ԃ�
		//? ���O�̕�����0��1��̌J��Ԃ�
		//+ ���O�̕����̂P��ȏ�̌J��Ԃ�
		
		//[] �w�肷�镶��
		//ex( s2.matches("[Heo]") Heo�̂ǂꂩ
		//[a-z]��a~z�̂ǂꂩ
		if (s3.matches("[a-z]{5}")) {//a-z�̂ǂꂩ��5��������v���Ă��邩�@[]{}�͊Ԃ��J���Ȃ�
			System.out.println("true 5");
		}
		// \\d��[0-9], \\w��[a-zA-Z_0-9]
		if ("7438".matches("\\d{4}")) {//0-9��4����
			System.out.println("true 6");
		}
		if (s2.matches("^H.*o$")) {//^�͐擪�̕����iH�j�A*�͖����̕����io�j
			System.out.println("true 7");
		}
		
		String separate = "ABC,def, EFG";
		String[] s_array = separate.split("[,]");//�C��:�ŋ�؂��Ď��o��
		for (String sepa : s_array) {
			System.out.println(sepa + "");
		}
		
		String r = s5.replaceAll("[Ja]", "X");//"[Ja]"��"X"�ɕς���
		System.out.println(r);
		
		//%(,3�����ƂɃJ���}������A�@0�󂫗̈���O���߁A�@-���l�߁A�@+�����������\���j�i�����j�id:�����@s:������@f:�@�����@b:�^�U�j
		//�Ⴆ�΁A%,d %-5s�Ȃǁ@�ŏ��̂Q�͏ȗ��ł��� 
		String n = "AB";
		String n1 = "ABCDE";
		int money = 1234567;
		final String FORMAT = "%-3s %-5s ������%-7d";
		String s_for = String.format(FORMAT, n, n1, money);
		System.out.println(s_for);
		

		
		
		// TODO Auto-generated method stub

	}

}
