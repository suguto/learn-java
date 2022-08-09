package object;

public class main {

	public static void main(String[] args) {
//		Creric c = new Creric();//インスタンス生成
//		c.name = "マリー";
//		c.selfAid();
//		c.pray(3);
		
		Hero h = new Hero("上条");
		Enemy e = new Enemy("スライム");
		Matango m = new Matango("マタンゴ");
		Wand wand = new Wand();
		wand.setName("木の杖");
		wand.setPower(5);
		Wizard wizard = new Wizard();
		wizard.setHp(50);
		wizard.setMp(20);
		wizard.setName("みこと");
		wizard.setWand(wand);
		
		//int[] action = { h.attack(e), h.skill(e), h.attack(m), h.skill(m) };
		while(h.hp >= 0) {
			//Heroのターン
			System.out.println(h.name + "のHPは" + h.hp + "でMPは" + h.mp + "です");
			System.out.println("0:スライムに攻撃　1：スライムにスキル 2:マタンゴに攻撃 3:マタンゴにスキル");
			int select = new java.util.Scanner(System.in).nextInt();
			if (select == 0) {
				int e_HP = h.attack(e);				
				if(e_HP <= 0) {
					e.hp = 0;
					System.out.println(e.name + "を倒しました");
				}	
			}else if (select == 1){
				int e_HP = h.skill(e);
				if(e_HP <= 0) {
					e.hp = 0;
					System.out.println(e.name + "を倒しました");
				}	
			}else if (select == 2) {
				int m_HP = h.attack(m);
				if (m_HP <= 0) {
					m.hp = 0;
					System.out.println(m.name + "を倒しました");
				}
			}else if (select == 3) {
				int m_HP = h.skill(m);
				if (m_HP <= 0) {
					m.hp = 0;
					System.out.println(m.name + "を倒しました");
				}
			}
			if (e.hp == 0 && m.hp == 0) {
				break;
			}
			
			//魔法使いのターン
			wizard.heal(h);
			
			//Enemyのターン
			if (e.hp > 0) {
				System.out.println(e.name + "のHPは" + e.hp + "です");
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
			//Matangoのターン
			if (m.hp > 0) {
				System.out.println(m.name + "のHPは" + m.hp + "でMPは" + m.mp + "です");
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
			System.out.println("敵を全員倒しました！");
		}else if(h.hp <= 0) {
			System.out.println("目の前が真っ暗になった・・・");
		}
		// TODO Auto-generated method stub

	}

}
