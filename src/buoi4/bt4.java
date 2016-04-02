package buoi4;

//Xuất các số chính phương trong mảng

import java.util.Random;

public class bt4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[10];
		Random random = new Random();
		
		for (int i=0; i<a.length; i++)
		{
			a[i]=random.nextInt(40);
		}
		
		//Xuat mang
		for (int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+"\t");
		}
		
		//Xuất các số chính phương trong mảng
		System.out.println();
		for (int i=0; i<a.length; i++)
		{
			if (Buoi1.Bt3_SoChinhPhuong.KTChinhPhuong(a[i]) == true)
				System.out.print(a[i]+"\t");
		}
		
	}
	

}
