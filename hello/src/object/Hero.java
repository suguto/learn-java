package object;

public class Hero {
	String name;
	int hp = 100;
	final int MAX_HP = 100;
	int mp = 20;
	final int MAX_MP = 20;
	public int attack(String name){
		int damage = new java.util.Random().nextInt(3);
		damage += 5;
		System.out.println(this.name + "��" + name + "���U������");
		System.out.println(name + "��" + damage + "�̃_���[�W");
		return damage;
	}
	public int skill(String name){
		if(this.mp > 5) {
			this.mp -= 5;
			int damage = new java.util.Random().nextInt(5);
			damage += 10;
			System.out.println(this.name + "�̓X�L�����g����");
			System.out.println(name + "��" + damage + "�̃_���[�W");
			return damage;
		}else {
			System.out.println("MP������܂���");
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
