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
		System.out.println(this.name + "��" + h.name + "�ɍU������");
		System.out.println(h.name + "��" + damage + "�̃_���[�W");
		h.hp -= damage;
		return h.hp;
	}
	
	public void attack(Wizard w){
		int damage = new java.util.Random().nextInt(5);
		damage++;
		System.out.println(this.name + "��" + w.getName() + "�ɍU������");
		System.out.println(w.getName() + "��" + damage + "�̃_���[�W");
		w.setHp(w.getHp() - damage);
	}
	
	public void haneru(){
		System.out.println(this.name + "�͒��˂��B�����������N����Ȃ��B");
	}
	
	public Enemy(String name) {
		this.name = name;
	}

}
