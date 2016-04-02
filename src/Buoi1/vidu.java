package Buoi1;

public class vidu {

	/*public static void Swap(int a,int b){
		int temp=a; a=b; b=temp;
	}*/
	
	/*public static void Swap(MyClass a, MyClass b){
		MyClass temp=new MyClass(a);
		a.x=b.x; b.x=temp.x;
	}*/
/*	
	public static void Test(int...a){
		for(int i:a)
			System.out.println(i);
	}
*/
	
	
	class ConNguoi{
		public void getThongTin(){
			System.out.println("Toi yeu lap trinh di dong");
		}
	}
	
	public class Hocvien extends ConNguoi{
		public void getThongTin(){
			System.out.println("TJi yeu lap trnih android");
			super.getThongTin();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a=1, b=2;
		System.out.printf("a=%d, b=%d", a, b);
		Swap(a,b);
		System.out.printf("a=%d, b=%d", a, b);*/
		
		
		/*MyClass a=new MyClass(1);
		MyClass b=new MyClass(2);
		System.out.printf("a=%d, b=%d",a.x,b.x);
		Swap(a,b);
		System.out.printf("a=%d, b=%d",a.x,b.x);*/
		
//		Test(1,2,3,4,5);
//		Test(10,20);
//		
//		ConNguoi cn= new Hocvien();
//		cn.getThongTin();
	}
	
	
	

}
