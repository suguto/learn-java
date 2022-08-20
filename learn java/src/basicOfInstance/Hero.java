package basicOfInstance;

//toString()���I�[�o�[���C�h���鎖�ɂ���ĕ\��������������\����n�����Ƃ��o����
public class Hero implements Cloneable{
	private String name;
	private int hp, mp;
	private Sword sword;
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Sword getSword() {
		return this.sword;
	}
	public void setSword(Sword sword) {
		this.sword = sword;
	}
	//@orverride
	public String toString() {	//Object�N���X��toString()���I�[�o�[���C�h
		return "�E�� (���O = " + this.name + "/ HP = " + this.hp + "/ MP = " + this.mp + ")" + "/ �\�[�h = " + this.sword;
	}
	//@orverride
	//clone���`���� Hero h2 = h1.clone()�ŕ�������
	//Hero��clone������`����ƁA�󂢃R�s�[�ƌĂ΂��@���̃C���X�^���X�݂̂𕡐�����
	public Hero clone() {
		Hero result = new Hero();
		result.name = this.name;
		result.hp = this.hp;
		result.mp = this.mp;
		result.sword = this.sword.clone();		//this.sword;�󂢏ꍇ�͂���
		return result;
	}
	//�����Sword������̂ł����clone���`����
	//���̃C���X�^���X���Q�Ƃ��Ă�����܂߂ĕ������鎖��[���R�s�[�Ƃ���
	

}
