package hello;

public class roop {

	public static void main(String[] args) {
		System.out.println("�����ăQ�[���I");
		int ans = new java.util.Random().nextInt(10);
		for(int i = 0; i < 3; i++) {
			System.out.println("�O�`�X�̐�������͂��Ă�������");
			int num = new java.util.Scanner(System.in).nextInt();
			if(ans == num) {
				System.out.println("������I");
				break;
			}else {
				System.out.println("�́`����I");
			}
		}
		System.out.println("�y���������H");
		
		
		// TODO Auto-generated method stub

	}

}
