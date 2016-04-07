package qlhv;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class IOHocVien {

	//Ghi Học Viên theo ObjectStream
	public static void writeHV(String FileDS, List<HocVien> HocViens){
	
		try {
			ObjectOutputStream OOS = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(FileDS)));
			
			for(HocVien a: HocViens)
				OOS.writeObject(a);
			
			
			OOS.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Đọc Học Viên theo ObjectStream
	public static List<HocVien> readHV(String FileDS){
		//Khai báo List bên ngoài try catch
		List<HocVien> HocViens = new ArrayList<>();
		try {
			ObjectInputStream OIS= new ObjectInputStream(new BufferedInputStream(new FileInputStream(FileDS)));
			
			try {
				while (true)
					HocViens.add((HocVien) OIS.readObject());
				
			} catch (EOFException e) {
				// TODO Auto-generated catch block
				System.out.println("het file");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			OIS.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return HocViens;
	}
	
	
	
}
