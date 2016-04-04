package overrideClass;

import java.util.ArrayList;
import java.util.List;

public class myClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human A = new Student();
		A.getinfo();
		
		//List<Student> listStudent = new ArrayList<>();
		List<Student> listStudent = new ArrayList<>();
		
		Student a = new Student();
		a.ten = "HS a";
		a.tuoi = 18;
		listStudent.add(a);
		
		Student b = new Student();
		b.ten = "HS b";
		b.tuoi = 19;
		listStudent.add(b);
				
		Student c = new Student();
		c.ten = "HS c";
		c.tuoi = 20;
		listStudent.add(c);
		
		System.out.println("Thông tin các học sinh đã thêm vào là");
		for (int i = 0; i<listStudent.size(); i++){
			System.out.println("Tên: "+listStudent.get(i).ten+" Tuổi:"+listStudent.get(i).tuoi);
		}
		
		System.out.println("Tuổi học sinh b");
		System.out.println(b.tuoi);
		b.tuoi = 1900;
		System.out.println(listStudent.get(1).tuoi);

	}

} 
