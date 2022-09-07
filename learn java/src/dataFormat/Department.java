package dataFormat;
import java.io.*;

public class Department implements Serializable{
	private String name;
	private Employee leader;
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee getLeader() {
		return this.leader;
	}
	public void setLeader(Employee leader) {
		this.leader = leader;
	}

}
