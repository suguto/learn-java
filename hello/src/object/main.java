package object;

public class main {

	public static void main(String[] args) {
//		Creric c = new Creric();//インスタンス生成
//		c.name = "マリー";
//		c.selfAid();
//		c.pray(3);
		
		Hero h = new Hero("上条");
		Enemy e = new Enemy();
		while(h.hp >= 0) {
			//Heroのターン
			System.out.println(h.name + "のHPは" + h.hp + "でMPは" + h.mp + "です");
			System.out.println(e.name + "のHPは" + e.hp + "です");
			System.out.println("0:攻撃　1：スキル");
			int select = new java.util.Scanner(System.in).nextInt();
			if (select == 0) {
				int damage = h.attack(e.name);
				e.hp -= damage;
				if(e.hp <= 0) {
					break;
				}	
			}else if (select == 1){
				int damage = h.skill(e.name);
				e.hp -= damage;
			}
			System.out.println(h.name + "のMPは" + h.mp + "です");
			System.out.println(e.name + "のHPは" + e.hp + "です");
			
			//Enemyのターン
			int e_select = new java.util.Random().nextInt(1);
			if(e_select == 0) {
				int damage = e.attack(h.name);
				h.hp -= damage;
			}else if(e_select == 1){
				e.haneru();
			}
		}
		if(e.hp <= 0) {
			System.out.println(e.name + "を倒しました！");
		}else if(h.hp <= 0) {
			System.out.println("目の前が真っ暗になった・・・");
		}
		// TODO Auto-generated method stub

	}

}
