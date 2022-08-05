package object;

public class Enemy {
	final String name = "スライム";
	int hp = 20;
	
	public int attack(){
		int damage = new java.util.Random().nextInt(5);
		damage++;
		return damage;
	}
	public void haneru(){
		System.out.println(this.name + "は跳ねた。しかし何も起こらない。");
	}

}
