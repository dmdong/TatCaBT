package Buoi1;

public class Bt9_TongSn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=4;
		double kq = TongSn2(n);
		System.out.println(kq);
	}
	
	public static double TongSn2(int n){
		double sum = 0.0;
		for (int i=1; i<=n; i+=2)
		{
			double j= (double)i;
			j= (j-1)/j;
			sum+=j;
		}
		return sum;
	}

}
