package Buoi1;

public class Bt8_TongSn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4;
		int kq = TongSn(n);
		System.out.println(kq);
	}
	
	public static int TongSn(int n){
		int sum = 0;
		for (int i=1; i<=n; i++)
			sum+=i;
		return sum;
	}
}
