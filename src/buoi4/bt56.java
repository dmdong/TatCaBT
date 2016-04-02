package buoi4;

import java.util.Random;

//Tính tổng và tích tất cả phần tử trong mảng

public class bt56 {

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
			System.out.print(a[i]+"\t");
				
		//Tính tổng các phần tử trong mảng
		int sum=0;
		for (int i=0; i<a.length; i++){
			sum+=a[i];
		}
		System.out.println();
		System.out.println("Tổng là: "+sum);
		
		//Tính tích các phần tử trong mảng\
		int tich=1;
		for (int i=0; i<a.length; i++){
			tich*=a[i];
		}
		System.out.println("Tích là: "+tich);
	
	
	}

}
