package qlhv;

//import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.io.Reader;
import java.util.Scanner;


public class IO {
	static String MaHV = null;
	static String Ten = null;
	static String NgaySinh = null;
	static String Email = null;
	static String DiaChi = null;
	static String SDT = null;
	public static void ReadFile(String path){
		FileInputStream fi = null;
		BufferedReader br = null;
		try {
			fi = new FileInputStream(path);
			br = new BufferedReader(new InputStreamReader(fi));
			String line = "";
			String s= "";
			while((line = br.readLine())!=null){
				s+=line;
			}
			System.out.println(s);
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void WriteFile(String path){
		
		String[] ss = {MaHV,Ten,NgaySinh,Email,DiaChi,SDT};
		String s ="";
		BufferedWriter out;
		try {
			out = new BufferedWriter(new FileWriter(path));
			for(int i = 0;i<ss.length;i++){
				out.write(ss[i]+"\r\t");
				out.write(s);
			}
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void Input(){
		
		dshv.themHV();
		/*Scanner sc = new Scanner(System.in);
		String a = "";
		System.out.print("Tên học viên:");
		Ten = sc.nextLine();
		System.out.print("Ngày sinh:");
		NgaySinh = sc.nextLine();
		System.out.print("Email:");
		Email = sc.nextLine();
		System.out.print("Địa chỉ:");
		DiaChi = sc.nextLine();
		System.out.print("Số điện thoại:");
		SDT = sc.nextLine();*/
		
	}
}