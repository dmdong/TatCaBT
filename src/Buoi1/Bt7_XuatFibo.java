package Buoi1;

public class Bt7_XuatFibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		XuatFibo(n);
		
	}
	
	public static void XuatFibo(int n){
		int fibo1=1, fibo2=1, fibo3;
		for(int i=0; i<n; i++)
		{
			fibo3=fibo1+fibo2;
			System.out.printf("%d  ", fibo1);
			fibo1=fibo2;
			fibo2=fibo3;
		}
	}

}
