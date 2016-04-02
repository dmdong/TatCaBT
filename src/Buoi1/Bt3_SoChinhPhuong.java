package Buoi1;

public class Bt3_SoChinhPhuong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=625;
		boolean kq= KTChinhPhuong(n);
		System.out.println(kq);
		
	}

	public static boolean KTChinhPhuong(int n){
		int canbac2 = (int)Math.sqrt(n);
		if (Math.pow(canbac2,2)==n)
			return true;
		else
			return false;
	}
	
}
