import java.util.Scanner;

public class LoopPractice
{
    public static void main(String[] arg)
    {
        // for (int i=0, j =1; i<=10; i++, j= j*2)
        // {
        //     System.out.println(i + " " +j);
        // }

/*Printing the multiplication table of any digit */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        
        // for (int i=1; i<=n; i++)
        // {
        //     System.out.println(n+ "X" + i +"="+ n*i);
        // }
        
/*Arithmetic series adding */

        // int Sum = 0;
        // for(int i=1; i<=n; i++)
        // {
        //     Sum=Sum+i;
        // }
        // System.out.println(Sum);
        
/*Calculating the factorial of a number */
     
        // int Factorial = 1;
        // for (int i=1; i<=n; i++)
        // {
        //     Factorial = i*Factorial;
        // }
        // System.out.println("The factorial of " + n + " is " + Factorial);
      
/* Displaying the digits and counting the total digits of a number */

        // int count =0;
        // while(n>0)
        // {
        //     int r = n%10;
        //     System.out.println(r);
        //     n = n/10;
        //     count=count+1;
        // } 
        // System.out.println(count);


        /*Determining an Armstrong number */
        
        // int m = n;
        // int Sum =0;
        // while(n>0)
        // {
        //     int r = n%10;
        //     System.out.println(r);
        //     m=m*10+r;
        //     n = n/10;
        //     Sum = Sum + r*r*r;
        // }
        // System.out.println(Sum);
        
        // if (m==Sum)
        // {
        //     System.out.println("The number is an Armstrong Number");
        // }
        // else
        // {
        //     System.out.println("This is not an armstrong number");
        // }

        
/* Reversing a number and checking whether it is a pallindrome */
        
        // int m=0;
        // int a=n;

        // while(n>0)
        // {
        //     int r=n%10;
        //     System.out.println(r);
        //     m=m*10+r;
        //     n=n/10;

        // }
        // System.out.println(n);

        // System.out.println(m);
        
        // if(m==a)
        // {
        //     System.out.println("It is a pallindrome number");
        // }
        // else
        // {
        //     System.out.println("It is not a pallindrome number");

        // }


/* Display a number in words even with tailing 0 */
       
        // String str="";
        // while(n>0)
        // {
        //     int r = n%10;
        //     System.out.println(r);
        //     str= str + r;
        //     n=n/10;

        // }
        // System.out.println(str);

        // for (int i=str.length()-1;i>=0;i--)
        // {
        //     char c= str.charAt(i);


        //     switch(c)
        //     {
        //         case '0': System.out.print("zero ");
        //         break;
        //         case '1': System.out.print("one ");
        //         break;
        //         case '2': System.out.print("two ");
        //         break;
        //         case '3': System.out.print("three ");
        //         break;
        //         case '4': System.out.print("four ");
        //         break;
        //         case '5': System.out.print("five ");
        //         break;
        //         case '6': System.out.print("six ");
        //         break;
        //         case '7': System.out.print("seven ");
        //         break;
        //         case '8': System.out.print("eight ");
        //         break;
        //         case '9': System.out.print("nine ");
        //         break;
            
        //     }
        
        // }

     /*Printing out an arithmetic progression series */

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the numbers:");
        // int a=sc.nextInt();
        // int n=sc.nextInt();
        // int d=sc.nextInt();

        
        // for(int i=1; i<=n; i++)
        //     {
        //         int y = a + (i-1)*d;
                
        //          System.out.print(y + ",");
        //     }

        /* Printing a fibonacci series */

        //  int a=0, b=1, c;
            
        // System.out.print(a + ", " + b + ", ");
        // for(int i=0; i<=n-2; i++) 
        // {
        
        //         c = a+b;
        //         System.out.print(c + ", ");
        //         a=b;
        //         b=c;
           
        // }
        /*Printing different patterns with nested for loop */
        int a =1;
        for(int i=1; i<=n; i++)
        {
                for(int j=1; j<=5; j++)
                {
                        
                        // System.out.print("(" + i + ", " +j+ ") ");
                        //  System.out.print(j + " ");
                        // System.out.print(a + " ");
                        if(j+i>5)
                        
                                System.out.print("* ");

                        
                        else
                        
                                System.out.print(" ");
                        
                        

                        // a=a+1;
                }
                System.out.println(" ");
        }
           
        }

}