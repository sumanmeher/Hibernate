package p4;

public class Book {
	int bid;
	String bname;
	public Publisher pub;
	
	public Publisher getPub() {
		return pub;
	}
	public void setPub(Publisher pub) {
		this.pub = pub;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}

}
