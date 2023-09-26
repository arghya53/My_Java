import java.util.Scanner;

class keybread
{
    public static void main(String arg[])
    {
       
        /* code to read a new line from keyboard */
        // Scanner s= new Scanner(System.in);
        // String name;
        // System.out.println("May I know your name?");
        // name = s.nextLine();
        // System.out.println("Welcome Mr./Mrs" + name);
        
        /* code to add two integers entered from keyboard */
        // Scanner sc=new Scanner(System.in);
        // int a, b, c;
        // System.out.println("Input the numbers:");
        // a = sc.nextInt();
        // b = sc.nextInt();
        // c = a + b;
        
        // System.out.println("Sum of the numbers are: " + c);
        
        /* Code to convert binary to decimal */

        Scanner sc = new Scanner(System.in);
        sc.useRadix(2); /* The input will take binary number */
        int x;
        x = sc.nextInt();
        System.out.println("The decimal number is :" + x);
        
    }
}