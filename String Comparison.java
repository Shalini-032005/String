public class Main{
    public static void main(String args[]){
        String name1="Dolu";
        String name2="Bolu";
        String name3="Bolu";
        System.out.println("1. "+name1);
        System.out.println("2. "+name2);
        System.out.println("3. "+name3);
        boolean result1=name1.equals(name2);
        boolean result2=name1.equals(name3);
        boolean result3=name2.equals(name3);
        System.out.println("The comparison between 1 and 2 is: "+result1);
        System.out.println("The comparison between 1 and 3 is: "+result2);
        System.out.println("The comparison between 2 and 3 is: "+result3);
    }
}