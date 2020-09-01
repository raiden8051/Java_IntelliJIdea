package Ridhima;

import java.util.Scanner;

public class switch_example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, val1, val2;
        System.out.println("Press 1 for Extra variable Swap");
        System.out.println("Press 2 for Without Extra variable Swap");

        choice = sc.nextInt();

        System.out.println("Enter First Value : ");
        val1 = sc.nextInt();

        System.out.println("Enter Second Value : ");
        val2 = sc.nextInt();

        System.out.println("Value 1 : "+val1+", Value 2 : "+val2);

        switch (choice)
        {
            case 1:
                //Extra
                int temp=0;
                temp = val1;
                val1 = val2;
                val2 = temp;
                System.out.println("With Using Extra Variable \nValue 1 : "+val1+", Value 2 : "+val2);
                break;
            case 2:
                //Without extra   v1 = 10, v2 = 20
                val1 = val1 + val2; //  v1 = 30
                val2 = val1 - val2; //  v2 = 30 - 20 = 10  =>  v2 = 10
                val1 = val1 - val2; //  v1 = 30-10 = 20    =>  v1 = 20
                System.out.println("Without Using Extra Variable \nValue 1 : " + val1 + ", Value 2 : " + val2);
                break;
        }
    }
}
