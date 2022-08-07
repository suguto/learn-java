package object;

public class Enemy {
	final String name = "スライム";
	int hp = 20;
	
	public int attack(String name){
		int damage = new java.util.Random().nextInt(5);
		damage++;
		System.out.println(this.name + "は" + name + "に攻撃した");
		System.out.println(name + "に" + damage + "のダメージ");
		return damage;
	}
	public void haneru(){
		System.out.println(this.name + "は跳ねた。しかし何も起こらない。");
	}

}
