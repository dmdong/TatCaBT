package Buoi1;

public class Bt4_SoLapPhuong {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=125;
		boolean kq= KTLapPhuong(n);
		System.out.println(kq);
		
	}

	public static boolean KTLapPhuong(int n){
		int canbac3 = (int)Math.cbrt(n);
		if (Math.pow(canbac3,3)==n)
			return true;
		else
			return false;
	}
}
