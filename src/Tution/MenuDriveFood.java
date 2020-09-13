package Tution;

import java.util.Scanner;

public class MenuDriveFood {
    public static void main(String[] args) {

        /*
        Welcome to Chinese Food Court
        Enter Your Name :
        1. Noodles         => (F)199.00, (H) 119.00  => quantity (2) => 398.00
        2. Biryani         => 249.00
        3. Pizza           => 155.00
        4. Momo            => 99.00
        5. Sweet Corn      => 149.00
        Press Item Number for Placing your order :
        Bill for Jack is => Biryani ----------- 249.00

        */

        //Variable
        String name,bill;
        char ch;
        int price = 0, choice = 0;

        //Work
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Chinese Food Court\nEnter Your Name : ");
        name = sc.nextLine();

        System.out.println("1. Noodles         => (F)\u20B9 199.00, (H)\u20B9 119.00 ");
        System.out.println("2. Biryani         => 249.00");
        System.out.println("3. Pizza           => 155.00");
        System.out.println("4. Momo            => 99.00");
        System.out.println("5. Sweet Corn      => 149.00");

        bill = "Bill for "+name+" => ";

        choice = sc.nextInt();
        sc.nextLine();
        ch = sc.nextLine().charAt(0);
        switch(choice){
            case 1:
                if(ch=='F')
                    price = 199;
                else
                    price = 119;
                bill += "Noodles ------ "+price+".00";
                break;
            case 2:
                if(ch=='F')
                    price = 119;
                else
                    price = 199;
                bill += "Biryani ------ "+price+".00";
                break;
            case 3:
                if(ch=='F')
                    price = 119;
                else
                    price = 199;
                bill += "Pizza ------ "+price+".00";
                break;
            case 4:
                if(ch=='F')
                    price = 119;
                else
                    price = 199;
                bill += "Momo ------ "+price+".00";
                break;
            case 5:
                if(ch=='F')
                    price = 119;
                else
                    price = 199;
                bill += "Sweet Corn ------ "+price+".00";
                break;
            default:
                bill = "No Order Placed..";
                break;
        }
        System.out.println(bill);
    }
}
