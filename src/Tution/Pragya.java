package Tution;
import java.util.Scanner;

public class Pragya {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        OverloadedClass overloadedClass = new OverloadedClass();

        System.out.println("Enter 1 for area of Scalene Triangle");
        System.out.println("Enter 1 for area of Trapezium");
        System.out.println("Enter 1 for area of Rhombus");
        double result = 0;
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter 3 sides of triangle");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                result = overloadedClass.area(a,b,c);
                break;
            case 2:
                System.out.println("Enter 2 sides of trapezium and height");
                int d = sc.nextInt();
                int e = sc.nextInt();
                int height = sc.nextInt();
                result = overloadedClass.area(d,e,height);
                break;
            case 3:
                System.out.println("Enter 2 diagonals of Rhombus");
                double d1 = sc.nextDouble();
                double d2 = sc.nextDouble();
                result = overloadedClass.area(d1,d2);
                break;
            default:
                System.out.println("Wrong Input");
        }
        System.out.println("Answer:"+result);
    }
}
class OverloadedClass{
    public double area(double a, double b, double c){
        double s = a+b+c/2;
        double result = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return result;
    }
    public double area(int a, int b, int height){
        double result = 1/2*height*(a+b);
        return result;
    }
    public double area(double d1, double d2){
        double result = 1/2*d1*d2;
        return result;
    }
}
