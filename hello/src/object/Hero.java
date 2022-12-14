package object;

public class Hero {
	String name;
	int hp = 100;
	final int MAX_HP = 100;
	int mp = 20;
	final int MAX_MP = 20;
	
	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getName() {
		return this.name;
	}
	
	public int attack(Enemy e){
		int damage = new java.util.Random().nextInt(3);
		damage += 5;
		System.out.println(this.name + "は" + e.getName() + "を攻撃した");
		System.out.println(e.getName() + "に" + damage + "のダメージ");
		return damage;
	}
	public int skill(Enemy e){
		if(this.mp >= 5) {
			this.mp -= 5;
			int damage = new java.util.Random().nextInt(5);
			damage += 15;
			System.out.println(this.name + "はスキルを使った");
			System.out.println(e.getName() + "に" + damage + "のダメージ");
			int hp = e.getHp();
			return damage;
		}else {
			System.out.println("MPが足りません");
			int hp = e.getHp();
			return hp;
		}
	}
	
//	public int attack(Matango m){
//		int damage = new java.util.Random().nextInt(3);
//		damage += 5;
//		System.out.println(this.name + "は" + m.name + "を攻撃した");
//		System.out.println(m.name + "に" + damage + "のダメージ");
//		m.hp -= damage;
//		return m.hp;
//	}
//	public int skill(Matango m){
//		if(this.mp >= 5) {
//			this.mp -= 5;
//			int damage = new java.util.Random().nextInt(5);
//			damage += 15;
//			System.out.println(this.name + "はスキルを使った");
//			System.out.println(m.name + "に" + damage + "のダメージ");
//			m.hp -= damage;
//			return m.hp;
//		}else {
//			System.out.println("MPが足りません");
//			return m.hp;
//		}
//	}
	public Hero(String name) {
		this.name = name;
	}
	public Hero(){
		this.name = "test";
	}

}
