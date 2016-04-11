package qlhv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dshv {
	
	//static List<HocVien> docDSHV = ;
	private static String FileDS = "./src/qlhv/datahocvien/FileDS";
	private static int SLHV = IOHocVien.readHV(FileDS).size();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		xemMenu();
	}
	
	
	public static void xemMenu(){
		String appname = "ỨNG DỤNG QUẢN LÝ HỌC VIÊN";
		System.out.println(appname);
		for (int i=0; i<appname.length(); i++)
			System.out.print("=");		
		System.out.println("\n 1 - Xem danh sách lớp");
		System.out.println(" 2 - Thêm học viên");
		System.out.println(" 3 - Xóa học viên");
		System.out.println(" 4 - Xem menu");
		System.out.println(" 5 - Thoát");
		System.out.println("Nhập một số để chọn chức năng:");
		chonMenu();
		
	}
	
	public static void chonMenu(){
		int chon = 0;
		
		while(chon!=5){
			chon = new Scanner(System.in).nextInt();
			switch (chon){
			case 1:	xemDS(); break;
			case 2:	themHV(); break;
			case 3: xoaHV(); break;
			case 4: xemMenu(); break;
			case 5: System.exit(1); break;
			case 6: 
				{
					SLHV = 0;
					IOHocVien.xoaDS(FileDS); 
					xemMenu();
					break;
				}
				default: System.out.println("Lựa chọn không tồn tại. Hãy chọn lại");
			}
		}
	}
	
	public static void xemDS(){
		System.out.println("DANH SÁCH HỌC VIÊN");
		
		/*for (int i= 0; i<SLHV; i++)
			System.out.println();		*/
		List<HocVien> docDSHV = IOHocVien.readHV(FileDS);
		
		for (HocVien k: docDSHV)
			System.out.println(k.toString());
		xemMenu();
	}
	
	public static void themHV(){
		
		//Hỏi số lượng học viên muốn thêm vào		
		System.out.println("Bạn muốn nhập bao nhiêu HV?");
		int slhvthem = new Scanner(System.in).nextInt();
		
		//Đọc DS học viên đã có trước khi thêm vào
		List<HocVien> HocViens = IOHocVien.readHV(FileDS);
		//Khởi tạo ds HocViens trước khi thêm vào
		//List<HocVien> HocViens = new ArrayList<>();
		for (int i = 0; i<slhvthem; i++)
			{
			HocVien k = new HocVien();
			SLHV++;
			k.NhapHV(SLHV);
			HocViens.add(k);
			}
		
		//Kiểm tra kết quả đã nhập vào
		for (HocVien k: HocViens)
			System.out.println(k.toString());
		
		//Ghi list Học Viên vào dshv
		IOHocVien.writeHV(FileDS, HocViens);
				
		
		
		//Hỏi nhập tiếp
		System.out.println("Bạn có muốn nhập thêm? C/K?");
		//String nhap = "";
		String nhap = new Scanner(System.in).nextLine();
		if (nhap.equals("C") || nhap.equals("c"))
			themHV();
		else
			xemMenu();
	}
	
	public static void xoaHV(){
		
	}
	
	public static int getSLHV() {
		return SLHV;
	}


	public static void setSLHV(int sLHV) {
		SLHV = sLHV;
	}
	
}
