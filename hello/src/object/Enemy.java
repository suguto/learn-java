package object;

public class Enemy {
	 String name;
	 private int hp = 50;
	 
	 public int getHp() {
		 return this.hp;
	 }
	 public void setHp(int hp) {
		 this.hp = hp;
	 }
	
	public int attack(Hero h){
		int damage = new java.util.Random().nextInt(5);
		damage++;
		System.out.println(this.name + "は" + h.name + "に攻撃した");
		System.out.println(h.name + "に" + damage + "のダメージ");
		h.hp -= damage;
		return h.hp;
	}
	
	public void attack(Wizard w){
		int damage = new java.util.Random().nextInt(5);
		damage++;
		System.out.println(this.name + "は" + w.getName() + "に攻撃した");
		System.out.println(w.getName() + "に" + damage + "のダメージ");
		w.setHp(w.getHp() - damage);
	}
	
	public void haneru(){
		System.out.println(this.name + "は跳ねた。しかし何も起こらない。");
	}
	
	public Enemy(String name) {
		this.name = name;
	}

}
