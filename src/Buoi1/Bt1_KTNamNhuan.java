package Buoi1;

public class Bt1_KTNamNhuan {

	public static boolean KTNamNhuan(int nam){
		if ((nam%4==0&&nam%100!=0) || nam%400==0)
			return true;
		else
			return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nam = 2016;
		boolean kq= KTNamNhuan(nam);
		System.out.println(kq);
	}

}
