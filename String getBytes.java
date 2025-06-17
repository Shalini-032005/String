import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string: ");
    String str = sc.nextLine();
    byte[] byteArray;
    byteArray = str.getBytes();
    System.out.println(Arrays.toString(byteArray));
  }
}