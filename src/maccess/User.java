package maccess;

public class User {
	public String uName;
	public long phNo;
	public User(String uName, long phNo){
		this.uName = uName;
		this.phNo = phNo;
	}
	
	public String toString() {
		return uName + "\t"+ phNo;
	}
}
