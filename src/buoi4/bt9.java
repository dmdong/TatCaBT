package buoi4;

import java.util.Random;

//Nhập mảng 2 chiều và sắp xếp tăng dần

public class bt9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = new int [3][4];
		Random random = new Random();

		for (int i=0; i<a.length; i++){
			for (int j=0; j<a[0].length; j++){
				a[i][j] = random.nextInt(100);
			}
		}

		//Xuất mảng:

		for (int i=0; i<a.length; i++){
			for (int j=0; j<a[0].length; j++){
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}

		//Sắp xếp mảng
		
		for (int i=0; i<a.length; i++){
			for (int j=0; j<a[0].length; j++){
				int m, n;
				for (int k=i*a[0].length+j+1; k<a[0].length*a.length; k++){
					m = k/a[0].length;
					n=k%a[0].length;					
					Swap(a, i, j , m, n);
				}
			}
		}

		//Xuất mảng:
		System.out.println("Mảng sau khi sắp xếp:");
		for (int i=0; i<a.length; i++){
			for (int j=0; j<a[0].length; j++){
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}

	}

	//Sap xep tang dan
	static void Swap (int a[][], int i, int j, int m, int n){
		if (a[i][j]>a[m][n])
		{int temp= a[i][j];  a[i][j]=a[m][n]; a[m][n]=temp;}
	}

}
