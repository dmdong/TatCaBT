package overrideClass;

public class Student extends Human{
	
	public String ten;
	public int tuoi;
	public void getinfo(){
		
		super.getinfo();
		System.out.println("Student goes to school");
	}
}
