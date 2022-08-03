package object;

public class Hero {
	String name;
	int hp = 100;
	final int MAX_HP = 100;
	int mp = 20;
	final int MAX_MP = 20;
	public void attack(){
		System.out.println(name + "‚ÍUŒ‚‚µ‚½");
	}
	public void skill(){
		if(this.mp > 5) {
			this.mp -= 5;
			System.out.println(name + "‚ÍƒXƒLƒ‹‚ðŽg‚Á‚½");
		}else {
			System.out.println("MP‚ª‘«‚è‚Ü‚¹‚ñ");
		}
	}
	public Hero(String name) {
		this.name = name;
	}
	public Hero(){
		this.name = "test";
	}

}
