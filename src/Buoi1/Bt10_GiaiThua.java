package Buoi1;

public class Bt10_GiaiThua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4;
		long kq = GiaiThua(n);
		System.out.println(kq);
	}
	
	public static long GiaiThua(int n){
		long ketqua = 1;
		for (int i=1; i<=n; i++)
			ketqua *= i;
		return ketqua;
	}
}
