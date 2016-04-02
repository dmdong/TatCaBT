package buoi4;

//Sắp xếp lẻ tăng dần, chẵn giảm dần

import java.util.Random;

public class bt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[10];
		Random random = new Random();
		
		for (int i=0; i<a.length; i++)
		{
			a[i]=random.nextInt(100);
		}
		
		//Xuat mang
		for (int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+"\t");
		}
		
		//Sap xep lai mang
		
		for (int i=0; i<a.length-1; i++){
			for (int j=i+1; j<a.length; j++)
				if ( KTChanLe(a[i]) != KTChanLe(a[j]) )
					continue;
				else if ((KTChanLe(a[i])==false && KTChanLe(a[j])==false))
					bt1.Swap(a, i, j);
				else
					Swap2 (a, i, j);
		}
		
		//Xuat mang sau khi sap xep
		System.out.println();
		for (int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+"\t");
		}

	}
	
	static boolean KTChanLe(int n){
		if (n%2==0)
			return true; //So Chan
		else
			return false; //So Le
	}
	
	//Sap xep giam dan
	static void Swap2 (int[] a, int i, int j){
		if (a[i]<a[j])
		{int temp= a[i];  a[i]=a[j]; a[j]=temp;}
	}
}
