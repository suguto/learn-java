package object;

public class Matango extends Enemy {
	int hp = 70;
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
	public void attack(Wizard w){
		int damage = new java.util.Random().nextInt(5);
		damage += 10;
		System.out.println(this.name + "��" + w.getName() + "�ɍU������");
		System.out.println(w.getName() + "��" + damage + "�̃_���[�W");
		w.setHp(w.getHp() - damage);
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
	public void poison(Wizard w) {
		this.mp -= 5;
		if (this.mp < 5) {
			this.attack(w);
		}else {
			int damage = new java.util.Random().nextInt(5);
			damage += 15;
			System.out.println(this.name + "�̓ōU��");
			System.out.println(w.getName() + "��" + damage + "�̃_���[�W");
			w.setHp(w.getHp() - damage);
		}		
	}

}
