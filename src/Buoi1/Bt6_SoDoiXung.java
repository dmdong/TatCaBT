package Buoi1;

public class Bt6_SoDoiXung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=12344321; //tai sao khi them khong dang truoc thi ra sai?
		boolean kq = KTDoiXung(n);
		System.out.print(kq);
	}
	
	public static boolean KTDoiXung(int n){
		int sodaonguoc=0, m=n; ///Lam sao de truyen ban sao cua n?
		
		do{
			int temp=m%10;
			m/=10;
			sodaonguoc=10*sodaonguoc + temp;
		}
		while (m!=0);
		if (sodaonguoc==n)
			return true;
		else
			return false;
	}
}
