package object;

public class Enemy {
	String name;
	int hp = 20;
	
	public int attack(Hero h){
		int damage = new java.util.Random().nextInt(5);
		damage++;
		System.out.println(this.name + "��" + h.name + "�ɍU������");
		System.out.println(h.name + "��" + damage + "�̃_���[�W");
		h.hp -= damage;
		return h.hp;
	}
	public void haneru(){
		System.out.println(this.name + "�͒��˂��B�����������N����Ȃ��B");
	}
	
	public Enemy(String name) {
		this.name = name;
	}

}
