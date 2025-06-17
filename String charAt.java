import java.util.*;
public class Main {
	public static void main(String args[]) {
		String str=new String("Tangled is a 2010 Disney animated musical fantasy comedy film loosely based on the German fairy tale Rapunzel. It tells the story of Rapunzel, a long-haired princess hidden in a tower, who escapes with the help of a charming thief named Flynn Rider to see the floating lanterns she's always admired. The movie explores themes of self-discovery, overcoming adversity, and the power of friendship and love. ");
		System.out.println(str);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the index to display the character at the given index: ");
		int a=sc.nextInt();
		System.out.println("The character present at the entered index is: "+str.charAt(a));
	}
}