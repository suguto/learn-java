package hello;

public class calculation {

	public static void main(String[] args) {
		System.out.println("�悤�������݂����{�b�N�X��");
		System.out.println("���Ȃ��̖��O����͂��Ă�������");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("���Ȃ��̔N�����͂��Ă�������");
		String ageString = new java.util.Scanner(System.in).nextLine();
		//int age = Integer.parseInt(ageString);
		int fortune = new java.util.Random().nextInt(5);
		System.out.println(name + "����(" + ageString + ")�̉^���́E�E�E�H");
		String[] omikuji = {"��g", "���g", "�g", "��", "�勥"};
		System.out.println(omikuji[fortune] + "�ł��I");
		
		
		// TODO Auto-generated method stub

	}

}
