package buoi4;

//Sắp xếp nguyên tố tăng dần, giữ nguyên vị trí

import java.util.Random;

public class bt3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[10];
		Random random = new Random();
		
		for (int i=0; i<a.length; i++)
		{
			a[i]=random.nextInt(20);
		}
		
		//Xuat mang
		for (int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+"\t");
		}
		
		//Sap xep lai mang
		
		for (int i=0; i<a.length-1; i++){
			for (int j=i+1; j<a.length; j++)
				if ( Buoi1.Bt2_NguyenTo.KTNguyenTo(a[i])==true && Buoi1.Bt2_NguyenTo.KTNguyenTo(a[j])==true)
					bt1.Swap(a, i, j);
				else
					continue;
		}
		
		//Xuat mang sau khi sap xep
		System.out.println();
		for (int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+"\t");
		}

	}
	

}
