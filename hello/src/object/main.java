package object;

public class main {

	public static void main(String[] args) {
//		Creric c = new Creric();//�C���X�^���X����
//		c.name = "�}���[";
//		c.selfAid();
//		c.pray(3);
		
		Hero h = new Hero("���");
		Enemy e = new Enemy("�X���C��");
		Matango m = new Matango("�}�^���S");
		Wand wand = new Wand();
		wand.setName("�؂̏�");
		wand.setPower(5);
		Wizard wizard = new Wizard();
		wizard.setHp(50);
		wizard.setMp(20);
		wizard.setName("�݂���");
		wizard.setWand(wand);
		
		//int[] action = { h.attack(e), h.skill(e), h.attack(m), h.skill(m) };
		while(h.hp >= 0) {
			//Hero�̃^�[��
			System.out.println(h.name + "��HP��" + h.hp + "��MP��" + h.mp + "�ł�");
			System.out.println("0:�X���C���ɍU���@1�F�X���C���ɃX�L�� 2:�}�^���S�ɍU�� 3:�}�^���S�ɃX�L��");
			int select = new java.util.Scanner(System.in).nextInt();
			if (select == 0) {
				int e_HP = h.attack(e);				
				if(e_HP <= 0) {
					e.hp = 0;
					System.out.println(e.name + "��|���܂���");
				}	
			}else if (select == 1){
				int e_HP = h.skill(e);
				if(e_HP <= 0) {
					e.hp = 0;
					System.out.println(e.name + "��|���܂���");
				}	
			}else if (select == 2) {
				int m_HP = h.attack(m);
				if (m_HP <= 0) {
					m.hp = 0;
					System.out.println(m.name + "��|���܂���");
				}
			}else if (select == 3) {
				int m_HP = h.skill(m);
				if (m_HP <= 0) {
					m.hp = 0;
					System.out.println(m.name + "��|���܂���");
				}
			}
			if (e.hp == 0 && m.hp == 0) {
				break;
			}
			
			//���@�g���̃^�[��
			wizard.heal(h);
			
			//Enemy�̃^�[��
			if (e.hp > 0) {
				System.out.println(e.name + "��HP��" + e.hp + "�ł�");
				int e_select = new java.util.Random().nextInt(2);
				if(e_select == 0) {
					int h_HP = e.attack(h);
					if(h_HP <= 0) {
						break;
					}	
				}else if(e_select == 1){
					e.haneru();
				}
			}	
			//Matango�̃^�[��
			if (m.hp > 0) {
				System.out.println(m.name + "��HP��" + m.hp + "��MP��" + m.mp + "�ł�");
				int m_select = new java.util.Random().nextInt(2);
				if(m_select == 0) {
					int h_HP = m.attack(h);
					if(h_HP <= 0) {
						break;				
					}
				}	
				if(m_select == 1) {
					int h_HP = m.poison(h);
				}
			}	
		}
		if(e.hp <= 0 && m.hp <= 0) {
			System.out.println("�G��S���|���܂����I");
		}else if(h.hp <= 0) {
			System.out.println("�ڂ̑O���^���ÂɂȂ����E�E�E");
		}
		// TODO Auto-generated method stub

	}

}
