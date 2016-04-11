package qlhv;

import java.io.Serializable;
import java.util.Scanner;

public class HocVien implements Serializable{
	private int maHV;
	private String tenHV, ngaySinh, email, diaChi, soDT;

	//Khởi tạo mặc định
	public HocVien (){
		maHV = 0;
		tenHV = "Unassigned"; //Bị lỗi khi khai bao tenHV = new String
		ngaySinh = "Unassigned";
		email = "Unassigned";
		diaChi= "Unassigned";
		soDT = "Unassigned";
	}


	//Khời tạo truyền tham số
	public HocVien (String tenHV, String ngaySinh, String email, String diaChi, String soDT){
		
	}

	
	//Hàm nhập xuất học viên
	public void NhapHV(int stt){
		this.setMaHV(stt);
		this.setTenHV(tenHV);
		this.setNgaySinh(ngaySinh);
		this.setEmail(email);
		this.setDiaChi(diaChi);
		this.setSoDT(soDT);
		
		System.out.println("Đã nhập xong học viên có Mã Số "+getMaHV());		
	}
	
	
	//------Các hàm xác thực thông tin----
	//Xác thực ngày sinh
	public boolean ValidNgaySinh(String ngaySinh){
		return true;
	}

	//Xác thực số DT
	public boolean ValidSoDT(String soDT){
		return true;
	}

	//Xác thực email
	public boolean ValidMail(String email){
		return true;
	}

	//Các hàm Get và Set
	public int getMaHV() {
		return maHV;
	}

	public void setMaHV(int maHV) {
		
		this.maHV = maHV;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		System.out.println("Nhập Địa Chỉ:");
		diaChi = new Scanner(System.in).nextLine(); 
		this.diaChi = diaChi;
	}

	public String getTenHV() {
		return tenHV;
	}

	public void setTenHV(String tenHV) {
		System.out.println("Nhập tên:");
		tenHV = new Scanner(System.in).nextLine(); 
		this.tenHV = tenHV;
	}

	public String getSoDT() {
		return soDT;
	}

	public void setSoDT(String soDT) {		
		System.out.println("Nhập số DĐ:");
		tenHV = new Scanner(System.in).nextLine(); 
		if (ValidSoDT(soDT) == true)
			this.soDT = soDT;
		else{
			System.out.println("Số Đt vừa nhập không hợp lệ. Hãy nhập lại");
		}
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		System.out.println("Nhập ngày sinh:");
		ngaySinh = new Scanner(System.in).nextLine(); 
		if (ValidNgaySinh(ngaySinh) == true)
			this.ngaySinh = ngaySinh;
		else{
			System.out.println("Ngày Sinh vừa nhập không hợp lệ. Hãy nhập lại");
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("Nhập Email:");
		email = new Scanner(System.in).nextLine(); 
		if (ValidMail(email) == true)
			this.email = email;
		else{
			System.out.println("Email vừa nhập không hợp lệ. Hãy nhập lại");
		}

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return maHV + "\t" + tenHV+ "\t" + ngaySinh + "\t" + email +"\t" + diaChi + "\t" + soDT;
	}


}
