import java.util.Arrays;
import java.util.Scanner;
// class Rectangle
// {
//     public double length;
//     public double breadth;

//     public double area()
//     {
//         return length*breadth;
//     }

//     public double perimetre()
//     {
//         return 2*(length+breadth);
//     }
//     public boolean isSquare()
//     {
//         if(length==breadth)
//         return true;
//         else
//         return false;
//     }
// }
// public class OopPractice
// {
//     public static void main(String [] args)
//     {
//         Rectangle r1=new Rectangle();       // Creating an object of the class Rectangle with reference r1
//         Scanner sc=new Scanner(System.in);  // Creating an object of the class Scanner with reference sc

//         System.out.println("Enter the length:");
//         r1.length = sc.nextInt();

//         System.out.println("Enter the breadth");
//         r1.breadth = sc.nextInt();
        
//         System.out.println("The area is:"+ r1.area());
//         System.out.println("The perimeter is:"+ r1.perimetre());
//         System.out.println("Is it a square? "+r1.isSquare());
//     }
// }

// class Cylinder
// {
//     private double radius;
//     private double height;

//     // getter(read only) and setter(write only) methods can be used for every properties in a class
    
//     public double getRadius() // get method allows for reading the property
//     {
//         return radius;
//     }
//     public double getHeight() 
//     {
//         return height;
//     }
//     public void setRadius(double r)   // set method for writing the property
//     {
//         radius = r;
//     }
//     public void setHeight(double h)
//     {
//         height = h;
//     }

    
//     public double surface_area()
//     {
//         return 2*Math.PI*getRadius()*getRadius();
//     }
//     public double curved_area()
//     {
//         return 2*Math.PI*getRadius()*getHeight();
//     }
//     public double total_surface_area()
//     {
//         return surface_area()+curved_area();
//     }
//     public double volume()
//     {
//         return 0.5*surface_area()*getHeight();
//     }
// }
// class OopPractice
// {
//     public static void main(String [] args)
//      {
//         Scanner sc = new Scanner(System.in);
//         // Cylinder cy=new Cylinder(); // A new object cy is created from class Cylinder.Cylinder() is the method of that class
        
//         Cylinder cy = new Cylinder();
//         System.out.println("Enter the radius of the cylinder:");
//         double radius = sc.nextDouble();
//         cy.setRadius(radius);
//         System.out.println("Enter the height of the cylinder:");
//         double height = sc.nextDouble();
//         cy.setHeight(height);
        
//         // Crea te a Cylinder object with the provided radius and height


//         System.out.println("The surface area of the cylinder is: "+ cy.surface_area());
//         System.out.println("The curved area of the cylinder is: "+ cy.curved_area());
//         System.out.println("The total surface area of the cylinder is: "+ cy.total_surface_area());
//         System.out.println("The volume of the cylinder is: "+ cy.volume());
//     }

// }



// class Student
// {
//     public String roll;
//     public String name;
//     public String course;
//     public int mark_m1, mark_m2, mark_m3;
    

//     public double total()
//     {
//         return mark_m1+mark_m2+mark_m3;
//     }

//     public double average()
//     {
//         return total()/3;
//     }

//     public String grade()
//     {
//         if( average()<40)
//         return "F";
//         else if( average()>=40 && average()<50)
//         return "D";
//         else if(average()>=50 && average()<60)
//         return "C";
//         else if(average()>=60 && average()<70)
//         return "B";
//         else if(average()>=70 && average()<80)
//         return "A";
//         else
//         return "A+";


//     }
// class OopPractice
// {
//     public static void main(String [] args)
//     {

//     }
// }
// }

////property methods and constructors for class Rectangle

// class Rectangle
// {
//  // properties
//     private double length;
//     private double breadth;
 
//     // constructor 1
//     public Rectangle() // when we don't pass anything this constructor is called
//     {
//         length =1;
//         breadth =1;
//     }
// // constructor 2
//     public Rectangle(double l, double b)
//     {
//        setLength(l);
//        setBreadth(b);
//     }
// // constructor 3
//     public Rectangle(double s)
//     {
//         length=breadth=s;
//     }

// // getter method for property 1
//     public double getLength()
//     {
//         return length;
//     }

// // setter method for property 1
//     public void setLength(double l)
//     {
//         if(l>=0)
//         length= l;
//         else
//         length =0;
//     }
// // getter and setter method for property 2

//     public double getBreadth()
//     {
//         return breadth;
//     }
//     public void setBreadth(double b)
//     {
//         if(b>=0)
//         breadth= b;
//         else
//         breadth =0;
//     }

// // behaviour or function or methods related to the class Rectangle
//     public double area()
//     {
//         return getBreadth()*getLength();
//     }
//     public boolean isSquare()
//     {
//         if(length==breadth)
//         return true;
//     return false;
//     }
// }
// public class OopPractice
//     {
//         public static void main(String[] args)
//         {
//             Rectangle r=new Rectangle(-10, 5);
//             System.out.println("The area is: " + r.area());
//             System.out.println(r.isSquare());

//         }
//     }


// //property methods and constructors for class Cylinder

// class Cylinder
// {
//     private double height;
//     private double radius;

//     public Cylinder() // default constructor
//     {
//         height = 1;
//         radius = 1;
//     }
//     public Cylinder(double h, double r) // manually set constructor
//     {
//         height = h;
//         radius = r;
//     }

//     public double getHeight()
//     {
//         return height;
//     }
//     public void setHeight(double h)
//     {
//         height = h;
//     }
//     public double getRadius()
//     {
//         return radius;
//     }
//     public void setRadius(double r)
//     {
//         radius = r;
//     }
//     public double surface_area()
//     {
//         return 2*Math.PI*getRadius()*getRadius();
//     }
//     public double curved_area()
//     {
//         return 2*Math.PI*getRadius()*getHeight();
//     }
//     public double total_area()
//     {
//         return surface_area()+curved_area();
//     }
//     public double volume()
//     {
//         return 0.5*surface_area()*getHeight();
//     }
// }

// class OopPractice
// {
//     public static void main(String[] args)
//     {
//         Cylinder c=new Cylinder(20, 15); // creating object of the class cylinder

//         System.out.println("The area of total surface of the cylinder is : " + c.total_area());
//     }
// }

class Student
{
    private String rollno;
    private String name;
    private String dept;
    private String subs[];

    public Student(String rollno, String name, String dept, String subs[])
    
    {
        this.rollno = rollno;
        this.name = name;
        this.dept = dept;
        this.subs = subs;
    }
        public String getRollno(){return rollno;}
        public String getName(){return name;}
        public String getDept(){return dept;}
        public String[] getSubs(int...A){return subs;}

        public void setSubs(String[] s){subs=s;}

        public String toString()
        {
            return "\nRoll No: "+ rollno +"\nName: "+ name + "\ndept: "+ dept + "\nsub: "+ Arrays.toString(subs);
        }
    }
    
public class OopPractice
{
    public static void main(String[] args)
    {
        Student stu[]=new Student[3];

        stu[0] = new Student("15-02-085", "Arghya", "EEE", new String[] {"Maths", "Physics", "CHemistry"});
        stu[1] = new Student("15-0-086", "Omar", "CSE", new String[] {"English", "Calculus", "Programming"});

        for (Student x:stu)
        {
            System.out.println(x.toString());
        }
    }
}
        



