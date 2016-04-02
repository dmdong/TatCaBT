package buoi2;

public class Bt_PhanSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PhanSo a = new PhanSo("a", 5, 2);
		a.Xuat();
				
		PhanSo b = new PhanSo("b", 5, 4);
		b.Xuat();
				
		//PhanSo kq = new PhanSo("kq", 0, 1); 
		a.Cong(b).Xuat();
		a.Tru(b).Xuat();
		a.Nhan(b).Xuat();
		a.Chia(b).Xuat();
	}

}
