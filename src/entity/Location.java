package entity;
public class Location extends Thucthe {
	 private String quocgia;
	 
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Location(String dinhdanh, String nhan, String mota, String link,String quocgia) {
		super(dinhdanh, nhan, mota, link);
		// TODO Auto-generated constructor stub
		this.quocgia=quocgia;
	}
	public String getQuocgia() {
		 return this.quocgia;
	 }
	 public void setQuocgia(String qg) {
		 this.quocgia=qg;
	 }
}
