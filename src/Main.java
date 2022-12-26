import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Enter your first name");
        String name= scanner.nextLine();
        System.out.println("Enter your last name");
        String lastName = scanner.nextLine();
        System.out.println( " Welcome "+ name + " "+ lastName);/*
         */


        String a = "my namlle l";
        String b = " hi you jh";
        char n = 'l';
        //System.out.println(a.charAt(8));
        //theLonger(a,b);
        System.out.println(numberOfChar(a,n));
    }
    public static void theLonger ( String a, String b){
        if (a.length()>b.length())
            System.out.println(a);
        else if (b.length()>a.length()) {
            System.out.println(b);
        }
        else System.out.println(" The strings length are equal");
    }
    public static int numberOfChar (String a,char n){
        int sum=0;
        for ( int i =0; i<a.length();i++){
            if (a.charAt(0) == n){
                sum+=1;

            }

        }
        return sum;
    }

}