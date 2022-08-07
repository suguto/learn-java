package object;

public class Enemy {
	String name;
	int hp = 20;
	
	public int attack(Hero h){
		int damage = new java.util.Random().nextInt(5);
		damage++;
		System.out.println(this.name + "は" + h.name + "に攻撃した");
		System.out.println(h.name + "に" + damage + "のダメージ");
		h.hp -= damage;
		return h.hp;
	}
	public void haneru(){
		System.out.println(this.name + "は跳ねた。しかし何も起こらない。");
	}
	
	public Enemy(String name) {
		this.name = name;
	}

}
