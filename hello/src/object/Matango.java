package object;

public class Matango extends Enemy {
	int hp = 50;
	int mp = 20;
	public Matango(String name) {
		super(name);
	}
	public int attack(Hero h) {
		int damage = new java.util.Random().nextInt(5);
		damage += 10;
		System.out.println(this.name + "�̍U��");
		System.out.println(h.name + "��" + damage + "�̃_���[�W");
		h.hp -= damage;
		return h.hp;
	}	
	public int poison(Hero h) {
		this.mp -= 5;
		if (this.mp < 5) {
			this.attack(h);
			return h.hp;
		}else {
			int damage = new java.util.Random().nextInt(5);
			damage += 15;
			System.out.println(this.name + "�̓ōU��");
			System.out.println(h.name + "��" + damage + "�̃_���[�W");
			h.hp -= damage;
			return h.hp;
		}		
	}

}
