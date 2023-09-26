import java.util.Scanner;

class stringpractise

{ 
    public static void main(String[] args)

    {
        
        // String len=str.chars();
        // System.out.println(len);

        // str=str.toUpperCase(); // if we refer it as the same name as str mentioned above then a new pointer 'str' will be created and the previous one will be collected as garbage
        // String str2=str.toUpperCase();
        
        // System.out.println(str); // the 'str' here is not changed to uppercase as string is immutable
        // System.out.println(str2); //  here a string is generated newly named 'str2' which is in the uppercase format
        
        // str = str.trim(); 
        // System.out.println(str); 
        // System.out.println(str.charAt(3));

        /* Determine different characters inside a gmail id */
        
        // String str = new String("programmer@gmail.com");

        // int i= str.indexOf('@');
        // String uname=str.substring(0, i);
        // String domain = str.substring(i+1, str.length());
        // System.out.println(uname+ " " + domain);
        // int k= domain.indexOf('.');
        // String mail = domain.substring(0, k);
        // System.out.println(mail.compareTo("gmail"));

    /* Removing special characters from a string */  
    //    String str=new String("a?B.c!1#2%3/");
    //    System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));

    /* Removing extra spaces from a string */

    // String str=new String(" abc  13  FDDHS 133   ergelg   ");
    // System.out.println(str.replace("  ", " ").trim()); //Every modifier generates a new string it doesn't change the existing one. 
                                                                          // So here the new string created from replace method gets trimmed a creates another new string

    /* Checking whether a number is even or odd */

    // int n;
    // Scanner sc=new Scanner(System.in);
    // System.out.println("Enter the number");
    // n = sc.nextInt();
    // if (n%2==0)
    // {
    //     System.out.println("The number is even");
    // }

    // else
    // {
    //     System.out.println("The number is odd");


    // }

/* Checking the grade of students */

    // int m1, m2, m3;

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the numbers:");
    // m1= sc.nextInt();
    // m2 = sc.nextInt();
    // m3 = sc.nextInt();
    
    
    // float avg = (float)(m1+m2+m3)/3;
    // System.out.println("The average of the number is:" + avg);
   
    
    // if (40 <= avg && avg < 50)
    //     {
    //         System.out.println("Obtained Grade: D");        
    //     }
    // else if (50 <= avg && avg < 60)
    // {
    //     System.out.println("Obtained Grade: C");
    // }

    // else if (60 <= avg && avg < 65)
    // {
    //     System.out.println("Obtained Grade: B");
    // }

    // else if (65 <= avg && avg < 70)
    // {
    //     System.out.println("Obtained Grade: A-");
    // }
    // else if (70 <= avg && avg < 80)
    // {
    //     System.out.println("Obtained Grade: A");
    // }
    // else if (80<= avg && avg <= 100)
    // {
    //     System.out.println("Obtained Grade: A-");
    // }
    
    // else 
    // {
        
    //     System.out.println("Obtained Grade: F");
    
    // }

    /*Checking the base of a number */

    // String num;
    // Scanner sc=new Scanner(System.in);
    // System.out.println("Enter the number");
    // num = sc.nextLine();

    // if (num.matches("[01]+"))
    // {
    //     System.out.println("It is a binary number");
    // }
    // else if( num.matches("[0-9A-F]+"))
    // {
    //     System.out.println("It is a hexadecimal number");
    // }
    // else if(num.matches("[0-7]+"))
    // {
    //     System.out.println("The number is octal");
    // }
    // else if(num.matches("[0-9]"))
    // {
    //     System.out.println("The number is decimal");
    // }

    /* Determine the type of website and protocol used */
    Scanner str =new Scanner(System.in);
    
    System.out.println("Enter a url");
    String url = str.nextLine();
    String protocol = url.substring(0, url.lastIndexOf(':'));

    if (protocol.matches("http"))
    {
        System.out.println("Hypertext protocol");

    }
    if (protocol.matches("ftp"))
    {
        System.out.println("File transfer protocol");

    }

    String extension=url.substring(url.lastIndexOf('.')+1); // it determines the strings which come after the last '.' in an url.
                                                               //  For that reason lastIndexOf method is used
    if (extension.matches("com"))
    {
        System.out.println("Commercial");
    }

    if (extension.matches("net"))
    {
        System.out.println("Network");
    }

}

}
               