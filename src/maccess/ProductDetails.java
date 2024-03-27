package maccess;

public class ProductDetails {
	public String pCode, pName;
	public float pPrice;
	public int pQty;
	
	public String toString() {
		return pCode +"\t"+pName+"\t"+pPrice+"\t"+pQty;
	}
}
