package object;

public class Enemy {
	final String name = "�X���C��";
	int hp = 20;
	
	public int attack(String name){
		int damage = new java.util.Random().nextInt(5);
		damage++;
		System.out.println(this.name + "��" + name + "�ɍU������");
		System.out.println(name + "��" + damage + "�̃_���[�W");
		return damage;
	}
	public void haneru(){
		System.out.println(this.name + "�͒��˂��B�����������N����Ȃ��B");
	}

}
