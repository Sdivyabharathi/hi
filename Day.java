# hi
import java.io.*;
import java.util.*;
public class Day
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String a="true";
    String b="false";
    System.out.println("Enter a day");
    String day=br.readLine();
    if(day.equals("sunday"))
    System.out.println(b);
    else 
    System.out.println(a);
   
  }
}
