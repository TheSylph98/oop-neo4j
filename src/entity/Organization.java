package entity;
public class Organization extends Thucthe {
	
	 private String truso;
	 public Organization() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Organization(String dinhdanh, String nhan, String mota, String link,String truso) {
		super(dinhdanh, nhan, mota, link);
		// TODO Auto-generated constructor stub
		this.truso=truso;
	}
	public String getTruso() {
		 return this.truso;
	 }
	 public void setTruso(String ts) {
		 this.truso=ts;
	 }
}
