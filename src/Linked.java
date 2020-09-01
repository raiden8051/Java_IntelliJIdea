import java.util.Scanner;

class List {
    public List left;
    public List right;
    public int data;

    public List(int data){
        this.data = data;
        left =right = null;
    }
    public void insert(int data){

    }
}
public class Linked{
    public static void main(String[] args){
        System.out.println("Enter Data");
        int data = new Scanner(System.in).nextInt();
    }
}