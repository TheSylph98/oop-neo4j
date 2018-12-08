
public class CreateEntity  {
    

	public Person CreatePerson1(){
	Person p1= new Person();
    p1.setDinhdanh("Thu_Tuong_Nguyen_Xuan_Phuc");
    p1.setNhan("Thu Tuong Nguyen Xuan Phuc");
    p1.setMota("Nguyen Xuan Phuc La thu tuong thu 7 cua nuoc CHXHCNVN");
    p1.setLink("http://baochinhphu.vn/Tin-noi-bat/Thu-tuong-gapmat-cac-doanh-nhan-quoc-te-tai-Van-Mieu-Quoc-TuGiam/302025.vgp");
	p1.setAge(60);
	p1.setJob("Thu tuong");
	p1.setQuoctich("Viet Nam");
	return p1;
	}
	public Organization CreateOrganization1(){
	Organization o1 = new Organization();
	o1.setDinhdanh("Apple");
	o1.setNhan("Apple");
	o1.setMota("la 1 tap doan cong nghe cua My");
	o1.setLink("http://abc.1");
	o1.setTruso("Cupertino, California");
	return o1;
	}
	public Location CreateLocation1(){
	Location l= new Location();
	l.setDinhdanh("Da_Nang");
	l.setNhan("Da Nang");
	l.setMota("Da Nang la 1 trong nhung thanh pho truc thuoc trung uong, nam trong vung phia Nam Trung Bo Viet Nam");
	l.setQuocgia("Viet Nam");
	return l; 
	}  
}
