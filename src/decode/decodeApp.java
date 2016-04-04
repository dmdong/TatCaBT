package decode;

public class decodeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IO.DocSoChan(IO.ReadData("E:/Android Programming/Baitap/src/decode/data/even"));
		//IO.DocSoChan(IO.ReadData("data/even"));
		
		IO.Decodeso3(IO.ReadData("E:/Android Programming/Baitap/src/decode/data/relate_3"));
		
		IO.DecodeNTo(IO.ReadData("E:/Android Programming/Baitap/src/decode/data/so_nguyen_to"));
		
		//Kiểm tra hàm has 3 hoạt động
		System.out.println();
		System.out.println(IO.has3(0));
	}

	
}
