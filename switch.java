import java.util.Scanner;
class Practiceswitch
{
    
    /**
     * @param arg
     */
    public static void main(String[] arg)
    {

        // int n=3;

        // if(n==1)
        // {
        //     System.out.println("One");
        // }
        // else if(n==2)
        // {
        //     System.out.println("Two");
        // }
        // else
        // {
        //     System.out.println("Invalid");
        // }
       
        /* Using cases instead of if-else ladder */

        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the day number");
        // int day = scan.nextInt();

        // switch(day)
        // {

        //     case 1: System.out.println("Mon");
        //     break;
        //     case 2: System.out.println("Tues");
        //     break;
        //     case 3: System.out.println("Wed");
        //     break;
        //     case 4: System.out.println("Thurs");
        //     break;
        //     case 5: System.out.println("Fri");
        //     break;
        //     case 6: System.out.println("Sat");
        //     break;
        //     case 7: System.out.println("Sun");
        //     break;
        //     default: System.out.println("Invalid");
        //     break; 
        //     }

        /* Applying switch case to identify the extension of a website */

            // Scanner scan = new Scanner(System.in);
            // System.out.println("Enter the url_name:");

            // String url= scan.nextLine();
            // String extension = url.substring(url.lastIndexOf('.')+1);
            
            // switch(extension)
            // {
            //     case "com": System.out.println("Commercial Website");
            //     break;
            //     case "org": System.out.println("Organization website");
            //     break;
            //     case "net": System.out.println("Networking Website");
            //     break;
            // }

           /* Applying switch case for basic arithmetic operations */
      
           try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the two numbers:");
               int a=sc.nextInt();
               int b=sc.nextInt();
               sc.nextLine(); // If it is not written it will show the next print statement and exit without taking the input "option"
               System.out.println("Enter the options:");
               String option = sc.nextLine();

               switch(option)
               {
                 case "ADD": System.out.println(a+b);
                 break;
                 case "Subtract": System.out.println(a-b);
                 break;
                 case "Multiplication": System.out.println(a*b);
                 break;
                 case "Division": System.out.println((float)a/b);
                 break;
               }
        }


        }
    }


