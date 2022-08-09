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
		System.out.println(this.name + "は" + h.getName() + "のHPを" + recovPoint + "回復した");
		System.out.println(h.getName() + "のHPは" + h.getHp() + "です");
	}
	
	//アクセス修飾子で制限する為にgetterとsetterを用意します。
	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		//HPは０以上でマイナスの値は０にする
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
		//MPは０以上にする
		if (mp < 0) {
			throw new IllegalArgumentException("設定されようとしているMpが異常です");
		}
		this.mp = mp;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		//名前は3文字以上にする
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("魔法使いに設定されようとしている名前が異常です");
		}
		this.name = name;
	}
	public Wand getWand() {
		return this.wand;
	}
	public void setWand(Wand wand) {
		//必ず杖を装備する
		if (wand == null) {
			throw new IllegalArgumentException("設定されようとしている杖がnullです");
		}
		this.wand = wand;
	}

}
