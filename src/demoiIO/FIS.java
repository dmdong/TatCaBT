package demoiIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		String s = "";
		try {
			FileInputStream in = new FileInputStream("E:/baitap.txt");

			while (( i=in.read()) != -1)
				s+= (char)i;
			System.out.println(s);
			
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Ghi file dùng inputstream
		
		try {
			FileOutputStream out = new FileOutputStream("E:/ghibaitap.txt");
			for (int j = 0; j<s.length(); j++)
			out.write(s.charAt(j));
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Đọc ghi file dùng file reader
		
		try {
			FileReader fr = new FileReader("E:/ghibaitap.txt");
			s = "";
			while ((i = fr.read()) != -1)
				s+= (char) i;
			System.out.println(s);			
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileWriter fw = new FileWriter("E:/copybaitap.txt");
			s = "làm bài tập 2222";
			for (int k = 0; k<s.length(); k++)
				fw.write(s.charAt(k)+"\r");
			
			
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
