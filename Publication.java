import java.util.ArrayList;

class Publication extends Content {
	
	private String publisher;
	private int pages;
	
	public Publication(String ID, String cName, int dwnlds, double cPrice,ArrayList<Comments> reviews, String publisher, int pages) {
		super.setID(ID);
		super.setName(cName);
		super.setDownloads(dwnlds);
		super.setPrice(cPrice);
		super.setComments(reviews);
		this.publisher = publisher;
		this.pages = pages;
	}
	
	public Publication(String ID, String cName, double cPrice, String publisher, int pages) {
		super.setID(ID);
		super.setName(cName);
		super.setPrice(cPrice);
		this.publisher = publisher;
		this.pages = pages;
	}
	
	
	public String getPublisher() {
		return this.publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public int getPages() {
		return this.pages;
	}
	
	public void setPages(int pages) {
		this.pages = pages;
	}
	
    
}