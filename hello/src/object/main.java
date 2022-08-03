package object;

public class main {

	public static void main(String[] args) {
//		Creric c = new Creric();//インスタンス生成
//		c.name = "マリー";
//		c.selfAid();
//		c.pray(3);
		
		Hero h = new Hero("上条");
		System.out.println("0:攻撃　1：スキル");
		int select = new java.util.Scanner(System.in).nextInt();
		if (select == 0) {
			h.attack();
		}else if (select == 1){
			h.skill();
		}
		System.out.println("残りMPは" + h.mp + "です");
		// TODO Auto-generated method stub

	}

}
