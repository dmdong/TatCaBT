package buoi4;

import java.util.Random;

//Sắp xếp mảng tăng dần
public class bt1 {

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
				Swap(a, i, j);
		}
		
		//Xuat mang sau khi sap xep
		System.out.println();
		for (int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+"\t");
		}
		
	}
	
	//Sap xep tang dan
	static void Swap (int[] a, int i, int j){
		if (a[i]>a[j])
		{int temp= a[i];  a[i]=a[j]; a[j]=temp;}
	}

}
