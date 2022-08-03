package object;

public class Hero {
	String name;
	int hp = 100;
	final int MAX_HP = 100;
	int mp = 20;
	final int MAX_MP = 20;
	public void attack(){
		System.out.println(name + "は攻撃した");
	}
	public void skill(){
		if(this.mp > 5) {
			this.mp -= 5;
			System.out.println(name + "はスキルを使った");
		}else {
			System.out.println("MPが足りません");
		}
	}
	public Hero(String name) {
		this.name = name;
	}
	public Hero(){
		this.name = "test";
	}

}
