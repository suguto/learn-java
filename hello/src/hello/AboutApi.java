package hello;

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
		
		// TODO Auto-generated method stub

	}

}
