package object;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	
	public void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int)(basePoint * this.wand.getPower());
		if (h.hp + recovPoint > h.MAX_HP) {
			h.setHp(h.MAX_HP);
		}else {
			h.setHp(h.getHp() + recovPoint);
		}	
		System.out.println(this.name + "��" + h.getName() + "��HP��" + recovPoint + "�񕜂���");
		System.out.println(h.getName() + "��HP��" + h.getHp() + "�ł�");
	}
	
	//�A�N�Z�X�C���q�Ő�������ׂ�getter��setter��p�ӂ��܂��B
	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		//HP�͂O�ȏ�Ń}�C�i�X�̒l�͂O�ɂ���
		if (hp < 0) {
			this.hp = 0;
		}else {
			this.hp = hp;
		}
	}
	public int getMp() {
		return this.mp;
	}
	public void setMp(int mp) {
		//MP�͂O�ȏ�ɂ���
		if (mp < 0) {
			throw new IllegalArgumentException("�ݒ肳��悤�Ƃ��Ă���Mp���ُ�ł�");
		}
		this.mp = mp;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		//���O��3�����ȏ�ɂ���
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("���@�g���ɐݒ肳��悤�Ƃ��Ă��閼�O���ُ�ł�");
		}
		this.name = name;
	}
	public Wand getWand() {
		return this.wand;
	}
	public void setWand(Wand wand) {
		//�K����𑕔�����
		if (wand == null) {
			throw new IllegalArgumentException("�ݒ肳��悤�Ƃ��Ă����null�ł�");
		}
		this.wand = wand;
	}

}
