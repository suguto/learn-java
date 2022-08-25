package basicOfInstance;

//toString()をオーバーライドする事によって表示したい文字列表現を渡すことが出来る
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
	public String toString() {	//ObjectクラスのtoString()をオーバーライド
		return "勇者 (名前 = " + this.name + "/ HP = " + this.hp + "/ MP = " + this.mp + ")" + "/ ソード = " + this.sword;
	}
	//@orverride
	//cloneを定義する Hero h2 = h1.clone()で複製する
	//Heroのcloneだけ定義すると、浅いコピーと呼ばれる　そのインスタンスのみを複製する
	public Hero clone() {
		Hero result = new Hero();
		result.name = this.name;
		result.hp = this.hp;
		result.mp = this.mp;
		result.sword = this.sword.clone();		//this.sword;浅い場合はこれ
		return result;
	}
	//今回はSwordがあるのでこれもcloneを定義する
	//そのインスタンスが参照しているを含めて複製する事を深いコピーという
	

}
