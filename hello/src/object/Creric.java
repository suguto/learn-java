package object;

public class Creric {
	//�����A�t�B�[���h
	String name;
	int hp = 50;
	final int MAX_HP = 50;//�萔�t�B�[���h(final)
	int mp = 10;
	final int MAX_MP = 10;
	//����A���\�b�h
	public void selfAid(){
		this.mp -= 5;
		this.hp = MAX_HP;
		System.out.println("HP���S�񕜂��܂����B");
	}
	public int pray(int sec) {
		System.out.println(this.name +"��" + sec + "�b�ԋF�����B");
		int heal = sec + new java.util.Random().nextInt(3);
		int healActual = Math.min(this.MAX_MP - this.mp, heal);
		this.mp += healActual;
//		this.mp += heal;
//		if (this.mp > this.MAX_MP) {
//			this.mp = this.MAX_MP;
//		}
		System.out.println("MP��" + healActual + "�񕜂��܂����B");
		return healActual;
	}

}
