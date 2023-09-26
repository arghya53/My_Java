import java.util.Arrays;
import java.util.Scanner;

// class Parent
// {
//     Parent()
//     {
//         System.out.println("This is non-parameterized of father.");
//     }
//     Parent(int x)
//     {
//         System.out.println("This is parameterized " +x);
//     }
// }

// class Child extends Parent
// {
//     Child()
//     {
//         System.out.println("This is non-parameterized of child.");
//     }
//     Child(int y)
//     {
//         System.out.println("This is parameterized of child " +y);
//     }
//     Child(int x, int y)
//     {
//         super(x);
//         System.out.println("Two params of child " +y);
//     }
// }

// public class InheritencePractise
// {
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         Child c=new Child(20, 30);
//        // System.out.println(c);
//     }
// }

class Super
{
    public void display()
    {
        System.out.println("This is super class display");
    }    
}

class Sub extends Super
{
    public void display()
    {
        System.out.println("This is a sub class display");
    }
}
class InheritencePractise
{
    public static void main(String[] args)
    {
        Super su=new Super();
        su.display();
        Sub su1=new Sub();
        su1.display();
    }
}