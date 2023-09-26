import java.util.Scanner;

class miscellaneous
{
    public static void main(String arg[])
    {
        /*Code Declaring Variables */
       
        // byte b = 120;
        // short s = 200;
        // int i = 2000;
        // char c = 'A';

        // System.out.println(b);
        // System.out.println(s);
        // System.out.println(i);
        // System.out.println(c);

        /* code to read a new line from keyboard */
        // Scanner s= new Scanner(System.in);
        // String name;
        // System.out.println("May I know your name?");
        // name = s.nextLine();
        // System.out.println("Welcome Mr./Mrs" + name);
        
        // /* code to add two integers entered from keyboard */
        //  Scanner sc = new Scanner(System.in);
        //  int a, b, c;
        //  System.out.println("Input the numbers:");
        //  a = sc.nextInt();
        //  b = sc.nextInt();
        //  c = a + b;
        //  System.out.println("Sum of the numbers are: " + c);
        
        /* Code to convert binary to decimal */
        // Scanner sc = new Scanner(System.in);
        // sc.useRadix(2); /* The input will take binary number */
        // int x = sc.nextInt();
        // System.out.println("The decimal number is :" + x);

        /*Code to convert integer to binary */
        // int a = 5;
        // System.out.println(Integer.toBinaryString(a));
        
        /* Visualizing any unicode character  */
        // char x = 0x07FD;  /*Converting into a hex value  */
        // System.out.println(x);

        /* Visualizing all the greek letters */
        // for (char c=0x0370;c<=0x03FF;c++)
        //     System.out.print(c+" ");

        int x = 10;
        float y = 12.564f;
        char w = 'A';
        System.out.printf("Hello %d %f %c World", x, y, w );

    }
}