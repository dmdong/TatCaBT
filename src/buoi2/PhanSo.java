package buoi2;

public class PhanSo {
	private int tu;
	private int mau;
	public String tenphanso;
		
	public PhanSo(){	// 	Đây là khởi tạo mặc định không sử dụng tham số. 
		tenphanso="";
		setTu(0);
		setMau(1);
	};	
	
	public PhanSo(String tenphanso, int tu, int mau){	//PT khởi tạo mặc định có truyền tham số.
		this.tenphanso=tenphanso;
		this.setTu(tu);
		this.setMau(mau);
	}
	

	public void Xuat(){
		System.out.println(getTu() + "/" + getMau());
		if (this.tu>=this.mau)
			this.HonSo();
	}
		
	//--------------------------------//
	public PhanSo Cong(PhanSo b){
		PhanSo kq = new PhanSo("kq", 0, 1);
		kq.setTu(this.getTu() * b.getMau() + this.getMau()* b.getTu());
		kq.setMau(this.getMau() * b.getMau());
		kq.ToiGian();
		//System.out.println("Tổng 2 phân số là:");
		return kq;		
	}
	
	PhanSo Tru(PhanSo b){
		PhanSo kq = new PhanSo("kq", 0, 1);
		kq.setTu(this.getTu() * b.getMau() - this.getMau()* b.getTu());
		kq.setMau(this.getMau() * b.getMau());
		kq.ToiGian();
		System.out.println("Hiệu 2 phân số là:");
		return kq;		
	}
	
	public PhanSo Nhan(PhanSo b){
		PhanSo kq = new PhanSo("kq", 1, 1);
		kq.setTu(this.getTu() *b.getTu());
		kq.setMau(this.getMau() * b.getMau());
		kq.ToiGian();
	//	System.out.println("Tích 2 phân số là:");
		return kq;		
	}
	
	PhanSo Chia(PhanSo b){
		PhanSo kq = new PhanSo("kq", 0, 1);
		kq.setTu(this.getTu() *b.getMau());
		kq.setMau(this.getMau() * b.getTu());
		kq.ToiGian();
		System.out.println("Thương 2 phân số là:");
		return kq;		
	}
		
	public PhanSo ToiGian(){
		int uscln = 1;
		for (int i=1; i<=this.tu; i++){
			if ((this.tu%i==0) && (this.mau%i==0)){
				uscln=i; 
			}
		}
		this.tu/=uscln;
		this.mau/=uscln;
		return this;
	}
	
	public void HonSo(){
		int phannguyen;
		int newtu;
		int newmau=this.mau;
		phannguyen = this.tu/this.mau;
		if (this.tu%this.mau==0)
			System.out.println("Phân số "+this.tenphanso+" rút gọn thành "+phannguyen);
		else
			{newtu=this.tu%this.mau;
			System.out.println("Phân số "+this.tenphanso+" rút gọn thành "+phannguyen+" "+newtu+"/"+newmau);}
	}
	
	public int getTu() {
		return tu;
	}

	public void setTu(int tu) {
		this.tu = tu;
	}

	public int getMau() {
		return mau;
	}

	public void setMau(int mau) {
		if(mau == 0)
		{
			//loi
			System.out.println("Lỗi, mẫu phải khác không nhé!\nPhương thức trả về mặc định");
			this.tu=0;
			this.mau=1;
		}
		else
			this.mau=mau;
	}
	
}
