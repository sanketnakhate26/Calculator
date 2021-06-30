package in.techlocalhost.microProjects;

import java.io.IOException;
import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args) throws IOException {
        int choice = 1;
        while (choice !=5 ) {
            Menu();
            System.out.print("Enter you choise : ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
                int a;
                int b;
                switch (choice) {
                    case 1:
                        System.out.print("Enter two numbers : ");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println("Addition = " + add(a, b));
                        break;
                    case 2:
                        System.out.print("Enter two numbers : ");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println("Substraction = " + sub(a, b));
                        break;
                    case 3:
                        System.out.print("Enter two numbers : ");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println("Multiplication = " + mul(a, b));
                        break;
                    case 4:
                        System.out.print("Enter two numbers : ");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println("Division = " + div(a, b));
                        break;
                    case 5:
                        System.exit(1);
                    default:
                        System.out.println("Wrong choice");
                }
            System.out.println("Press any key to continue :");
            char ch = (char) System.in.read();

        }
    }
    public static void Menu() {

        // Menu
        System.out.println("***********************************");
        System.out.println("\t\t\t MENU ");
        System.out.println("************************************");
        System.out.println(" 1. Add two Number");
        System.out.println(" 2. Sub two Number");
        System.out.println(" 3. Mul two Number");
        System.out.println(" 4. Div two Number");
        System.out.println(" 5. Exit ");
        System.out.println("**************************************");
    }

    public static int add(int a, int b)
    {
        return(a + b);
    }

    public static int sub(int a, int b)
    {
        return (a - b);
    }

    public static int mul(int a, int b)
    {
        return (a * b);
    }

    public static int div(int a, int b)
    {
        if(b != 0)
        {
            return (a / b);
        }else
        {
            return -1;
        }
    }
}
