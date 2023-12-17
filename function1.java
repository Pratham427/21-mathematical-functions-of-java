import java.util.Scanner;
import java.lang.Math;

class MiniProject {
    private final Scanner sc;

    public MiniProject() {
        this.sc = new Scanner(System.in);
    }

     void getInput() {
        System.out.println("Enter first number: ");
    }

    private int getNumber() {
        return sc.nextInt();
    }

    private void performOperation(int choice) {
        switch (choice) {
            case 1:
                add();
                break;
            case 2:
                subt();
                break;
            case 3:
                multiply();
                break;
            case 4:
                div();
                break;
            case 5:
                rev();
                break;
            case 6:
                palindrome();
                break;
            case 7:
                armstrong();
                break;
            case 8:
                fibonacci();
                break;
            case 9:
                square();
                break;
            case 10:
                squareroot();
                break;
            case 11:
                cube();
                break;
            case 12:
                cuberoot();
                break;
            case 13:
                modulo();
                break;
            case 14:
                power();
                break;
            case 15:
                evenodd();
                break;
            case 16:
                factorial();
                break;
            case 17:
                prime();
                break;
            case 18:
                gcf();
                break;
            case 19:
                lcm();
                break;
            case 20:
                leapyear();
                break;
            case 21:
                sum_in_range();
                break;
            case 22:
                System.exit(0);
            default:
                System.out.println("Invalid input");
        }
    }

    public void run() {
        while (true) {
            displayMenu();
            int choice = getNumber();
            performOperation(choice);
        }
    }

    private void displayMenu() {
        System.out.println("----------------------------------------");
        System.out.println("Enter your choice:");
        System.out.println("-----------------------------------------");
        System.out.println("1. Addition of two numbers");
        System.out.println("2. Subtraction of two numbers");
        System.out.println("3. Product of two numbers");
        System.out.println("4. Division of two numbers");
        System.out.println("5. Reverse of a number");
        System.out.println("6. To check if a number is palindrome or not");
        System.out.println("7. To check if a number is armstrong or not");
        System.out.println("8. Fibonacci series");
        System.out.println("9. Square of a number");
        System.out.println("10. Square root of a number");
        System.out.println("11. Cube of a number");
        System.out.println("12. Cube root of a number");
        System.out.println("13. Modulo of 2 numbers");
        System.out.println("14. Power of 1 number raise to other");
        System.out.println("15. To check if a number is even or odd");
        System.out.println("16. Factorial of a number");
        System.out.println("17. To check if a number is prime or not");
        System.out.println("18. Greatest common factor between 2 numbers");
        System.out.println("19. Least common multiple between two numbers");
        System.out.println("20. To check if the year is leap year or not");
        System.out.println("21. Sum of all numbers in a range");
        System.out.println("22. EXIT");
    }

    void add()
    {
        System.out.println("Enter first number : ");
        int a=sc.nextInt();
        System.out.println("Enter second number : ");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Sum of 2 nos : "+c);
    }
    void subt()
    {
        System.out.println("Enter first number : ");
        int a=sc.nextInt();
        System.out.println("Enter second number : ");
        int b=sc.nextInt();
        int c=a-b;
        System.out.println("Difference of 2 nos : "+c);
    }
    void multiply()
    {
        System.out.println("Enter first number : ");
        int a=sc.nextInt();
        System.out.println("Enter second number : ");
        int b=sc.nextInt();
        int c=a*b;
        System.out.println("Product of 2 nos : "+c);
    }
    void div()
    {
        System.out.println("Enter first number : ");
        int a=sc.nextInt();
        System.out.println("Enter second number : ");
        int b=sc.nextInt();
        int c=a/b;
        System.out.println("Division of 2 nos : "+c);
    }
    void rev()
    {
        int rev=0;
        int rem,num;
        System.out.println("Enter a number : ");
        num=sc.nextInt();
        while(num!=0)
        {
           rem=num%10;
           rev=rev*10+rem;
           num=num/10;
        }
        System.out.println("Reverse of the number : "+rev);
    }
    void palindrome()
    {
        int num,rem;
        int rev=0;
        System.out.println("Enter a number : ");
        num=sc.nextInt();
        int t=num;
        while(num!=0)
        {
           rem=num%10;
           rev=rev*10+rem;
           num=num/10;
        }
        if(t==rev)
        System.out.println("It is a palindrome number");
        else
        System.out.println("It is not a palindrome number");
    }
    void armstrong()
    {
        int num,temp;
        double sum=0;
        int rem,digits=0;
        System.out.println("Enter a number : ");
        num=sc.nextInt();
        temp=num;
        while(temp!=0)
        {
            temp=temp/10;
            digits++;
        }
        temp=num;
        while(temp!=0)
        {
            rem=temp%10;
            sum=sum+(Math.pow(rem,digits));
            temp=temp/10;
        }
        if(num==sum)
        System.out.println("It is an armstrong number");
        else
        System.out.println("It is not an armstrong number");
        
    }
    void fibonacci()
    {
        int num1=0;
        int num2=1;
        int num3;
        System.out.print("Fibonacci series : "+num1+" "+num2+" ");
        for(int i=2;i<10;i++)
        {
           num3=num1+num2;
           System.out.print(num3+" ");
           num2=num1;
           num3=num2;
        }
    }
    void square()
    {
        System.out.println("Enter a number");
        double a=sc.nextDouble();
        double sq=a*a;
        System.out.println("Square of the number : "+ sq);
    }
    void squareroot()
    {
        System.out.println("Enter a number : ");
        double a=sc.nextDouble();
        double b=Math.sqrt(a);
        System.out.println("Square root of the number : "+b);
    }
    void cube()
    {
        System.out.println("Enter a number : ");
        double a=sc.nextDouble();
        double b=a*a*a;
        System.out.println("Cube of the number : "+b);
    }
    void cuberoot()
    {
        System.out.println("Enter a number : ");
        double a=sc.nextDouble();
        double b=Math.cbrt(a);
        System.out.println("Cube Root of the number : "+b);
    }
    void modulo()
    {
        System.out.println("Enter a number : ");
        int a=sc.nextInt();
        System.out.println("Enter another number : ");
        int b=sc.nextInt();
        int m=a%b;
        System.out.println("Modulus of the 2 numbers : "+m);
    }
    void power()
    {
        System.out.println("Enter a number and its power : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        double p=Math.pow(a,b);
        System.out.println(a + " raised to " + b + " is : " + p);
    }
    void evenodd()
    {
        System.out.println("Enter a number : ");
        int a=sc.nextInt();
        if(a%2==0)
        System.out.println("It is an even number.");
        else
        System.out.println("It is an odd number.");
    }
    void factorial()
    {
        int fact=1;
        int num;
        System.out.println("Enter a number : ");
        num=sc.nextInt();
        for(int i=num;i>0;i--)
        {
          fact=fact*i;
        }
        System.out.println("Factorial of the number : "+fact);
    }
    void prime()
    {
        int count=0,num;
        System.out.println("Enter a number : ");
        num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
                count++;
        }
        if(count==2)
            System.out.println("It is a prime number!");
        else 
            System.out.println("It is not a prime number!");

    }
    void gcf()
    {
        int a,b,gcf=1;
        System.out.println("Enter first number : ");
        a=sc.nextInt();
        System.out.println("Enter second number");
        b=sc.nextInt();
        for(int i=1;i<=a && i<=b;i++)
        {
            if(a%i==0 && b%i==0 )
            gcf=i;
        }
        System.out.println("The greatest common factor of the 2 numbers is : "+gcf);
    }
    void lcm()
    {
        int a,b,gcf=1;
        System.out.println("Enter first number : ");
        a=sc.nextInt();
        System.out.println("Enter second number");
        b=sc.nextInt();
        for(int i=1;i<=a && i<=b;i++)
        {
            if(a%i==0 && b%i==0 )
            gcf=i;
        }
        int lcm=(a*b)/gcf;
        System.out.println("The LCM of the 2 numbers is : "+lcm);
    }
    void leapyear()
    {
        int yr;
        System.out.println("Enter a year");
        yr=sc.nextInt();
        if((yr%4==0 && yr%100!=0)||(yr%400==0))
        System.out.println("It is a leap year");
        else 
        System.out.println("It is not a leap year");   
     }
    void sum_in_range()
    {
       int sum=0;
       System.out.println("Enter starting number of the range : ");
       int a=sc.nextInt();
       System.out.println("Enter ending number of the range : ");
       int b=sc.nextInt();
       if(b<a)
       System.out.println("ERROR: ending number must be greater than or equal to the starting number !");
       for(int i=a;i<=b;i++)
       {
        sum=sum+i;
       } 
       System.out.println("Sum of all numbers between " + a + " and " + b + " is : " + sum);
    }


}

 class Main {
    public static void main(String[] args) {
        MiniProject obj = new MiniProject();
        obj.run();
    }
}
