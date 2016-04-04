package buoi7;
import java.util.Date;
import java.text.*;
  
public class DateDemo {

   public static void main(String args[]) {
      SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 

      String input = args.length != 0 ? "1818-11-11" : "2016-13-30"; 

      System.out.print(input + " Parses as "); 

      Date t; 

      try { 
          t = ft.parse(input); 
          System.out.println(t); 
      } catch (ParseException e) { 
          System.out.println("Unparseable using " + ft); 
      }
   }
}