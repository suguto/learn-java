package object;

public class main {

	public static void main(String[] args) {
//		Creric c = new Creric();//�C���X�^���X����
//		c.name = "�}���[";
//		c.selfAid();
//		c.pray(3);
		
		Hero h = new Hero("���");
		Enemy e = new Enemy();
		while(h.hp >= 0) {
			//Hero�̃^�[��
			System.out.println(h.name + "��HP��" + h.hp + "��MP��" + h.mp + "�ł�");
			System.out.println(e.name + "��HP��" + e.hp + "�ł�");
			System.out.println("0:�U���@1�F�X�L��");
			int select = new java.util.Scanner(System.in).nextInt();
			if (select == 0) {
				int damage = h.attack();
				System.out.println(h.name + "��" + e.name + "���U������");
				System.out.println(e.name + "��" + damage + "�̃_���[�W");
				e.hp -= damage;
				if(e.hp <= 0) {
					break;
				}	
			}else if (select == 1){
				int damage = h.skill();
				System.out.println(h.name + "�̓X�L�����g����");
				System.out.println(e.name + "��" + damage + "�̃_���[�W");
				e.hp -= damage;
			}
			System.out.println(h.name + "��MP��" + h.mp + "�ł�");
			System.out.println(e.name + "��HP��" + e.hp + "�ł�");
			
			//Enemy�̃^�[��
			int e_select = new java.util.Random().nextInt(1);
			if(e_select == 0) {
				int damage = e.attack();
				System.out.println(e.name + "��" + h.name + "�ɍU������");
				System.out.println(h.name + "��" + damage + "�̃_���[�W");
				h.hp -= damage;
			}else if(e_select == 1){
				e.haneru();
			}
		}
		if(e.hp <= 0) {
			System.out.println(e.name + "��|���܂����I");
		}else if(h.hp <= 0) {
			System.out.println("�ڂ̑O���^���ÂɂȂ����E�E�E");
		}
		// TODO Auto-generated method stub

	}

}
