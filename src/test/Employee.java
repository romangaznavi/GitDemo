package test;

public class Employee {
	public String id;
	public String name;
	public String desg;
	public int bSal;
	public float totSal;
	
	public String toString() {
		String data = id+"\t"+name+"\t"+desg+"\t"+bSal+"\t"+totSal;
		return data;
	}
	
}
