package object;

public class main {

	public static void main(String[] args) {
//		Creric c = new Creric();//�C���X�^���X����
//		c.name = "�}���[";
//		c.selfAid();
//		c.pray(3);
		
		Hero h = new Hero("���");
		System.out.println("0:�U���@1�F�X�L��");
		int select = new java.util.Scanner(System.in).nextInt();
		if (select == 0) {
			h.attack();
		}else if (select == 1){
			h.skill();
		}
		System.out.println("�c��MP��" + h.mp + "�ł�");
		// TODO Auto-generated method stub

	}

}
