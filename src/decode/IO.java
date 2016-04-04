package decode;
 
import java.io.FileReader;
import java.io.IOException;
import Buoi1.*;

public class IO {

	public static String ReadData(String src){
		String s = "";
		try {
			//Bước 1 
			FileReader fr = new FileReader(src);

			//Bước 2
			char [] buffer = new char [1024];
			int len = 0;

			while ((len = fr.read(buffer)) != -1) {
				s+= new String (buffer, 0, len);				
			}

			//Bước 3
			fr.close();						
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return s;
	}

	public static void DocSoChan(String s){
		for (int i = 0; i<s.length(); i++){
			if (i%2 == 0)			
				System.out.print(s.charAt(i));				
		}
		System.out.println();
	}

	public static void Decodeso3(String s){
		for (int i = 0; i<s.length(); i++){
			if ((i%3 == 0) || (has3(i) == true))
				System.out.print(s.charAt(i));
		}
		System.out.println();
	}


	public static boolean has3(int i){
		boolean kq = true;
		for (int j = i; j >0; j/=10 ){
			if (j%10 ==3)
			{kq = true;
			break;}								
			else 
				kq = false;
		}
		return kq;
	}
	
	public static void DecodeNTo(String s){
		for (int i =0; i<s.length(); i++){
			if (Bt2_NguyenTo.KTNguyenTo(i)== true)
				System.out.print(s.charAt(i));
			
		}
		System.out.println();
	}
	
	
}
