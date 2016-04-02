package buoi4;

import java.util.Random;
import buoi2.PhanSo;

public class bt78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PhanSo[] a = new PhanSo[3];
		
		Random random = new Random();
		
		for (int i=0; i<a.length; i++)
		{
			a[i] = new PhanSo();
			a[i].tenphanso = "a"+i;
			a[i].setTu(random.nextInt(10)+1);
			a[i].setMau(random.nextInt(10));
			
		}
		
		//Xuat mang Phan So
		for (int i=0; i<a.length; i++){
			System.out.println("Phân số "+a[i].tenphanso+" là:");
			a[i].Xuat();
						
		}
		
		//Tính tổng các phân số
		PhanSo sum= new PhanSo();
		for (int i=0; i<a.length; i++)
			sum=sum.Cong(a[i]);						
		System.out.println("Tổng tất cả phân số là:");
		sum.Xuat();
		
		//Tính tích các phân số
		PhanSo tich = new PhanSo("Tich", 1, 1);
		for (int i=0; i<a.length; i++)
					tich=tich.Nhan(a[i]);						
		System.out.println("Tích tất cả phân số là:");
		tich.Xuat();
	}

}
