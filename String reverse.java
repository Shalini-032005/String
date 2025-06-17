import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the string to be reversed: ");
		String str=sc.nextLine();
		String rev="";
		for(int i=str.length()-1;i>=0;i--){
		    rev+=str.charAt(i);
		}
		System.out.println("The reversed string is: "+rev);
	}
}