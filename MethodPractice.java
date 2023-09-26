import java.util.Scanner;
public class MethodPractice
{
    // static int max(int x, int y)
    // {
    //     if (x>y)
    //     return x;
    //     else
    //     return y;
    // }
    // public static void main(String[]args)
    // {
    //     int a, b;
    //     a=10;
    //     b=15;
    //     // MethodPractice mp=new MethodPractice(); // used when the method 'max' is not static
    //     // System.out.println(mp.max(a,b));
    //     System.out.println(max(a,b));
    // }


    //passing an object parameter
    // static void change(int X[], int index, int value)
    // {   
    //     X[index] = value;
    // }
   
    // public static void main(String[] args)
    // {
    //     int A[] = { 2,3,4,7,10};
    //     change(A, 2, 20);
    //     for(int x:A)
    //     {
    //         System.out.println(x);
    //     }
    // }

    // passing parameters
        // static int sum(int x , int y) // here, int is the return type
        // {
        //     return x+y;
        // }

        // public static void main(String[] args)
        // {
        //     int a =10;
        //     int b = 15;
        //     int c = a+b;
        //     sum(a,b);
        //     System.out.println(c);
        // }

        // static boolean isPrime(int x)
        // {
        //     for(int i=2; i<x/2; i++)
        //     {
        //         if (x%i==0)
        //         return false;
        //     }
        //     return true;
        // }

        // public static void main(String[] args)
        // {
        //     Scanner sc=new Scanner(System.in);
        //     System.out.println("Enter the number:");
        //     int n = sc.nextInt();
        //     System.out.println(isPrime(n));
        // }


// // finding the GCD of a two numbers

        // public static int gcd(int x, int y)
        // {
        //     while(x!=y)
        //     {
        //         if(x>y)
                
        //             x=x-y;
                
        //         else
                
        //             y=y-x;
                
        //     }
        //     return x;
        // }

        // public static void main(String[] args)
        // {
        //     Scanner sc=new Scanner(System.in);
        //     System.out.println("Enter the numbers:");
        //     int m=sc.nextInt();
        //     int n=sc.nextInt();
          
        //     System.out.println(gcd(m,n));
        // }
        // public static int max(int A[])
        // {
        //     int max = A[0];
        //     for(int i=0; i<A.length; i++)
        //     {
        //         if(A[i]>max)
                
        //             max=A[i];
        //     }
        //     return max; // returning the maximum value after the loop
        // }
        // public static void main(String[] args)
        // {
        //     int X[] = {2, 3, 7, 10, 12, 11};
        //     int B = max(X);
        //     System.out.printf("The maximum number is "+ B);
        // }




// // passing variable arguments
// Define a static method named 'show' that takes a variable number of integer arguments.
            // static void show(int A, int ... B )
            
            // { // Loop through the elements of the integer array 'A'.
            //     for(int x:B)
            //     {
            //         // Print each element 'x' to the console followed by a newline.
            //         System.out.println(x);
            //     }

            //     System.out.print(A);

            // }
            

            // static void showString(String...C)
            // {
            //     System.out.println(" ");

            //     for(int i=1; i<C.length; i++)
            //     {

                
            //         System.out.println(i+". " +C[i]);
            //     }
            // }
            // public static void main(String args [])
            // {
            //     // Call the 'show' method with a number and an array of integers as an argument.
                
            //     show(10,new int []{1,2,3,4,5});
            //     showString("Rahim", "Karim", "Sheldon", "Mitchel");
            // }

            // static int max(int...A)
            // {
            //     if(A.length==0)
            //     return Integer.MIN_VALUE;

            //     else if(A.length==1)
            //     return A[0];

            //     int m = A[0];
            //     for(int i=1; i<A.length; i++)
            //     {
            //         if(A[i]>m)
            //         m=A[i];

                
            //     }
            //     return m;
                
            // }

            // public static void main(String[] args)
            // {
            //     System.out.println(max(1, 3, 5, 4, 21, 15));
            //     System.out.println(max());
            //     System.out.println(max(2));
            //     System.out.println(max(new int [] {5, 15, 10, 13, 14, 15}));

            // }
            static int sum(int...A)
            {
                if(A.length==0)
                return Integer.MIN_VALUE;
                else if(A.length==1)
                return A[0];
                
                int s=A[0];
                for(int i=1;i<A.length;i++)
                {
                    s=s+A[i];
                }
                return s;
            }
            public static void main(String[]args)
            {
                System.out.println(sum());;
                System.out.println(sum(1, 2, 3, 5, 15));
                System.out.println(sum(3));
                System.out.println(sum(new int[] {3, 10, 30, 45, 36}));
            }
}
