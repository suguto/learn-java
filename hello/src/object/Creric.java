package object;

public class Creric {
	//属性、フィールド
	String name;
	int hp = 50;
	final int MAX_HP = 50;//定数フィールド(final)
	int mp = 10;
	final int MAX_MP = 10;
	//操作、メソッド
	public void selfAid(){
		this.mp -= 5;
		this.hp = MAX_HP;
		System.out.println("HPが全回復しました。");
	}
	public int pray(int sec) {
		System.out.println(this.name +"が" + sec + "秒間祈った。");
		int heal = sec + new java.util.Random().nextInt(3);
		int healActual = Math.min(this.MAX_MP - this.mp, heal);
		this.mp += healActual;
//		this.mp += heal;
//		if (this.mp > this.MAX_MP) {
//			this.mp = this.MAX_MP;
//		}
		System.out.println("MPが" + healActual + "回復しました。");
		return healActual;
	}

}
