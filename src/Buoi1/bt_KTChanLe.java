package Buoi1;

public class bt_KTChanLe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int n=100;
		
	boolean kq=kiemTraChanLe(n);
	if (kq==true)
		System.out.println("Day la so chan");
	else
		System.out.println("Day la so le");
	}
	
	public static boolean kiemTraChanLe(int n)	{
		if(n%2==0)
			return true;
		else
			return false;
	}

}
