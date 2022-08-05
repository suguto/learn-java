package object;

public class Hero {
	String name;
	int hp = 100;
	final int MAX_HP = 100;
	int mp = 20;
	final int MAX_MP = 20;
	public int attack(){
		int damage = new java.util.Random().nextInt(3);
		damage += 5;
		return damage;
	}
	public int skill(){
		if(this.mp > 5) {
			this.mp -= 5;
			int damage = new java.util.Random().nextInt(5);
			damage += 10;
			return damage;
		}else {
			System.out.println("MP‚ª‘«‚è‚Ü‚¹‚ñ");
			return 0;
		}
	}
	public Hero(String name) {
		this.name = name;
	}
	public Hero(){
		this.name = "test";
	}

}
