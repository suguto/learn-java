package basicOfInstance;

public class Sword implements Cloneable{
	private String name;
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return this.name;
	}
	
	public Sword clone() {
		Sword result = new Sword();
		result.name = this.name;
		return result;
	}

}
