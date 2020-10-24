package Tution;

public class basic {
    static int balance=20000;//global
    public static void main(String[] args) {
        //OOP
        hacker();
    }
    public static void debit(){
        balance = balance-10000;
    }
    public static void credit(){
        balance = balance+10000;
    }
    public static void hacker(){
        balance = 0;
    }
}