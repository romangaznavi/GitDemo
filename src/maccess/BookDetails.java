package maccess;

public class BookDetails {
	public String code,name,author;
	public float price;
	public int qty;
	
	public String toString() {
		return code+"\t"+name+"\t"+author+"\t"+price+"\t"+qty;
	}
}
