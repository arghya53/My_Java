import java.util.Scanner;


public class ArrayPractice{
    public static void main(String[] args)
    {   Scanner sc=new Scanner(System.in);
       
        // int A[]= {4, 7, 8, 3, 2, 20, 19}; 
       // int B[] = new int[5];

    // One way to read from an array 
        // for (int i=A.length-1; i>=0; i--)
        // {
        // System.out.println(A[i]);
        // }
        
    // Another way to read from an array
        
    // for (int i:B)
        // {
        //     System.out.println(i);
        // }
    // int Sum = 0;
    
    // System.out.println("Enter a key:");
    // int Key = sc.nextInt();

// Summation of number

    // for(int i=0; i<A.length; i++)
    // {
    //     Sum = Sum + A[i];
    //     System.out.println(Sum);

    // }

    // Searching a particular element in an array

    // for(int i=0; i<A.length; i++)
    // {
        

    //  if (Key==A[i])
    //     { 
    //         System.out.println("Element found at" + i);
    //         System.exit(0);
    //     }
     
    // }
    // System.out.println("not found");
    
    // System.out.println("Sum is:" + Sum);

// Finding out the greatest number in an array

// int max1 = A[0];

// for (int i=0; i<A.length; i++)
// {
//     if (A[i]> max)
//     {
//         max = A[i];
//     }
// }
// System.out.println(max);

// Finding the second largest number

// int max1, max2;
// max1=max2=A[0];

// for (int i=0; i<A.length; i++)
// {
//     if(A[i]>max1)
//     {
//         max2=max1;
//         max1 =A[i];

//     }
//     else if(A[i]>max2)
//     {
//         max2= A[i];
//     }
// }
// System.out.println("The second largest number is:" +max2);

// rotating entries of an array left-wise

// for(int x:A)
// {
//     System.out.print(x + ", ");
// }

// int temp = A[0];
// for(int i=1; i<A.length; i++)

// {
//     A[i-1] = A[i];
// }
// A[A.length-1]=temp;

// System.out.println(""); // used for linespacing

// for(int x:A)
// {
//     System.out.print(x + ", ");
// }


// rotating entries of an array right-wise


// int temp1= A[A.length-1];

// for(int i = A.length-1; i>0; i--)
// {
//     A[i]=A[i-1]; // replacing the element in front
// }
// A[0]= temp1;
// System.out.println("");

// for(int x:A)
// {
//     System.out.print(x+ ", ");
// }

//int B[]= new int[10];
// int n =6;
// B[0] = 4; B[1] = 10; B[2] = 3; B[3] = 5; B[4] = 11; B[5] = 7;

// for(int x:B)
// {
//  System.out.print(x + ",");
// }

// System.out.println("Enter the numbers:");
// int num;
// int index;
// // num = sc.nextInt();
// index = sc.nextInt();

// for(int i=n; i>index; i-- )
// {
//     B[i] = B[i-1];
// }
// B[index] = num;



// System.out.println("");

// for(int i=0 ; i<n; i++)
// {
//  System.out.print(B[i] + ",");


// }
// for(int i=index+1; i<n+1; i++)
// {
//     B[i-1] = B[i];

// }
// for(int x:B)
// {
//     System.out.print(x+",");
// }

// copying an array into another in a reversed direction

// int B[] = new int[10];

// for(int i= A.length-1, j=0; i>=0; i--, j++)
// {
//     B[j] = A[i];
// }

// System.out.println("");

// for(int x:B)
// {
//     System.out.print(x+ ",");

// }

// // Building a two dimensional array
// int A[][] = new int[3][5];
// int B[][] = {{1,2,3},{4,5,6},{7,8,9}};

// // printing the array as a whole

// for(int i=0; i<B.length; i++)

// {
//     for(int j=0; j<B[i].length; j++ )
//     {
//         System.out.print(B[i][j]);
//     }
// System.out.println("");
// }

// // printing each element of a 2D array

// for(int x[]:B)
// {
//     for(int y:x)
//     {
//         System.out.println(y);
//     }
//     System.out.println("\n");
// }

// // printing a jagged array

// int A[][];
// A = new int [4][];
// A[0]= new int[3];
// A[1]= new int[4];
// A[2]= new int[5];
// A[3] = new int[2];

// for(int i=0; i<A.length; i++) // Accessing the rows denoted with i
// {
//     for(int j=0; j<A[i].length; j++) // Accessing the columns(j) for each row(i)
//     {
//         System.out.print(A[i][j]);
//     }
//     System.out.println("");
// }

// // Adding two matrices

// int A[][] = {{1,2,3},{4,5,6},{7,8,9}};
// int B[][] = {{4,10,12}, {15,17,19}, {39,40,12}};
// int C[][] = new int[3][3];

// for (int i=0; i<3; i++)
// {
//     for(int j=0; j<3; j++)
//     {
//         C[i][j]= A[i][j]+B[i][j];
//         System.out.print(C[i][j]+ " ");
//     }
//     System.out.println("");
// }

// // Multiplication of two matrices

int A[][] = {{1,2,3},{4,5,6},{7,8,9}};
int B[][] = {{4,10,12}, {15,17,19}, {39,40,12}};
int C[][] = new int[3][3];

for (int i=0; i<3; i++)
{
    for(int j=0; j<3; j++)
    {
        C[i][j]=0;

        for(int k=0; k<3; k++)
        {
            C[i][j] = C[i][j] + A[i][k]*B[k][j];
           
        }
        
         System.out.print(C[i][j]+ " ");
       
    }
    System.out.println("");
}
 
    
    }
}