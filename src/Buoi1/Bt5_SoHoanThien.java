package Buoi1;

public class Bt5_SoHoanThien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=33550336;
		boolean kq = KTHoanThien(n);
		System.out.print(kq);
		
	}
	
	public static boolean KTHoanThien(int n){
		int sum = 0;
		for (int i=1; i<=n/2; i++)
		{
			if (n%i==0)
				sum+=i;
		}
		if (sum==n)
			return true;
		else
			return false;
	}
}
