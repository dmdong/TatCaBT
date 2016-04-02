package Buoi1;

public class Bt2_NguyenTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=113;
		boolean kq= KTNguyenTo(n);
		System.out.println(kq);
		
	}
	
	public static boolean KTNguyenTo(int n){
			
			if (n<2)
				return false;
			else
			{
				int dem=0;
				for (int i=1; i<=n; i++)
				{
					if (n%i==0)
						dem++;						
				}
				if (dem==2)
					return true;
				else
					return false;
				
			}
		
	}
	

}
