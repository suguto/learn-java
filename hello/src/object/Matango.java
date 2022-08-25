package object;

public class Matango extends Enemy {
	private int hp = 70;
	private int mp = 20;
	public Matango(String name) {
		super(name);
	}
	
	 public int getHp() {
		 return this.hp;
	 }
	 public void setHp(int hp) {
		 this.hp = hp;
	 }
	 public int getMp() {
		 return this.mp;
	 }
	 public void setMp(int mp) {
		 this.mp = mp;
	 }
	//@override
	public int attack(Hero h) {
		int damage = new java.util.Random().nextInt(5);
		damage += 10;
		System.out.println(this.getName() + "�̍U��");
		System.out.println(h.name + "��" + damage + "�̃_���[�W");
		h.hp -= damage;
		return h.hp;
	}//@override
	public void attack(Wizard w){
		int damage = new java.util.Random().nextInt(5);
		damage += 10;
		System.out.println(this.getName() + "��" + w.getName() + "�ɍU������");
		System.out.println(w.getName() + "��" + damage + "�̃_���[�W");
		w.setHp(w.getHp() - damage);
	}
	public int poison(Hero h) {
		this.mp -= 5;
		if (this.mp > 5) {
			this.attack(h);
			return h.hp;
		}else {
			int damage = new java.util.Random().nextInt(5);
			damage += 15;
			System.out.println(this.getName() + "�̓ōU��");
			System.out.println(h.name + "��" + damage + "�̃_���[�W");
			h.hp -= damage;
			return h.hp;
		}		
	}
	public void poison(Wizard w) {
		this.mp -= 5;
		if (this.mp > 5) {
			this.attack(w);
		}else {
			int damage = new java.util.Random().nextInt(5);
			damage += 15;
			System.out.println(this.getName() + "�̓ōU��");
			System.out.println(w.getName() + "��" + damage + "�̃_���[�W");
			w.setHp(w.getHp() - damage);
		}		
	}

}
