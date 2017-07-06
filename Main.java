# hi
 import java.io.*;
 import java.util.*;
 public class Main
 {
   public static void main(String args[])
{
  String a, b;
  Scanner scan = new Scanner(System.in);
  
  System.out.print("Enter a String : ");
  a= scan.nextLine();
  
    System.out.print("Removing Vowels from The String [" +a+ "]\n");
  b= a.replaceAll("[aeiouAEIOU]", "");   
  
  System.out.print(b);
}
}
