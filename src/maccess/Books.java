package maccess;

public class Books {
	public String bookCode, bookName, bookAuthor;
	public float bookPrice;
	public int bookQty;
	
//	public Books(String bookCode, String bookName, String bookAuthor, float bookPrice, int bookQty) {
//		this.bookCode = bookCode;
//		this.bookName = bookName;
//		this.bookAuthor = bookAuthor;
//		this.bookPrice = bookPrice;
//		this.bookQty = bookQty;
//	}
	
	public String toString() {
		return bookCode+"\t"+bookName+"\t"+bookAuthor+"\t"+bookPrice+"\t"+bookQty;
	}
}
