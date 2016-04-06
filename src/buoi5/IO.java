package buoi5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class IO {
	
	public static void CopyFile(String srclink, String deslink){
		FileInputStream input = null;
		FileOutputStream output = null;
		try {
			input = new FileInputStream(srclink);
			output = new FileOutputStream(deslink);
			
			byte[] copy=new byte[1024];
			int len=0;
			while((len=input.read(copy)) != -1){
				output.write(copy, 0, len);
			}
						
			
			input.close();
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void docUnicode(String file){
		try {
			FileReader docfile = new FileReader(file);
			
			char[] doc = new char[1024];
			int len=0;
			String s = "";
			while ((len=docfile.read(doc)) != -1){
				
				s+= new String(doc, 0, len);
				//Tại sao phải tạo new string ở đây??
			}
			System.out.println(s);
			
			docfile.close();
		} catch (Exception e) {
			// TODO: handle exception đã dùng ctrl space tại try catch
		}
	
		
		
	}
	
	
	
	
	
}
