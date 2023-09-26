import java.util.Scanner;

class area_of_triangle
{
    public static void main(String arg[])

    {  /* code to determine area of a triangle */
        Scanner sc = new Scanner(System.in);

        // float b, h, a;
        // System.out.println("Input the base :" );
        
        // b = sc.nextFloat();
        
        // System.out.println("input the height :");
        // h= sc.nextFloat();
       
        // a = .5f*b*h;
        
        // System.out.println("the area is:" + a);

        int a, b, c;
        float s;
        double area;

        

        System.out.println("The three sides of the triangle are :" );
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        s = (a+ b+ c)*0.5f;

        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of the triangle is :" + area);





    }
}