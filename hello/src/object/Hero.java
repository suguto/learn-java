package object;

public class Hero {
	String name;
	int hp = 100;
	final int MAX_HP = 100;
	int mp = 20;
	final int MAX_MP = 20;
	public int attack(Enemy e){
		int damage = new java.util.Random().nextInt(3);
		damage += 5;
		System.out.println(this.name + "��" + e.name + "���U������");
		System.out.println(e.name + "��" + damage + "�̃_���[�W");
		e.hp -= damage;
		return e.hp;
	}
	public int skill(Enemy e){
		if(this.mp >= 5) {
			this.mp -= 5;
			int damage = new java.util.Random().nextInt(5);
			damage += 15;
			System.out.println(this.name + "�̓X�L�����g����");
			System.out.println(e.name + "��" + damage + "�̃_���[�W");
			e.hp -= damage;
			return e.hp;
		}else {
			System.out.println("MP������܂���");
			return e.hp;
		}
	}
	
	public int attack(Matango m){
		int damage = new java.util.Random().nextInt(3);
		damage += 5;
		System.out.println(this.name + "��" + m.name + "���U������");
		System.out.println(m.name + "��" + damage + "�̃_���[�W");
		m.hp -= damage;
		return m.hp;
	}
	public int skill(Matango m){
		if(this.mp >= 5) {
			this.mp -= 5;
			int damage = new java.util.Random().nextInt(5);
			damage += 15;
			System.out.println(this.name + "�̓X�L�����g����");
			System.out.println(m.name + "��" + damage + "�̃_���[�W");
			m.hp -= damage;
			return m.hp;
		}else {
			System.out.println("MP������܂���");
			return m.hp;
		}
	}
	public Hero(String name) {
		this.name = name;
	}
	public Hero(){
		this.name = "test";
	}

}
