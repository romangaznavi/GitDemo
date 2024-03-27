package maccess;

public class CheckBranch {
	boolean verify(String brName) {
		boolean k = false;
		switch(brName) {
		case "CIVIL": k = true;
			break;	
		case "EEE": k = true;
			break;
		case "MECH": k = true;
			break;
		case "ECE": k = true;
			break;
		case "CSE": k = true;
		}
		return k;
	}
}
