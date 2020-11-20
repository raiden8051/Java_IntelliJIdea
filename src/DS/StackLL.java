package DS;

public class StackLL {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Ram");
        stack.push("Shyam");
        stack.push("Peter");
        stack.push("Hero");

        Stack<Integer> si = new Stack<>();
        si.push(10);
        si.peek();
        stack.display();
        System.out.println(stack.pop());
        stack.display();
    }
}
class Stack<T>{
    Stack<T> head = null;
    T data;
    Stack<T> next;
    public Stack(T data){
        this.data = data;
        next = null;
    }
    public void peek(){
        if(isEmpty())
            System.out.println("Stack Underflow");
        else{
            Stack<T> node = this.head;
            while(node.next!=null)
                node = node.next;
            System.out.println(node.data);
        }
    }
    public Stack(){}
    public Stack<T> createNode(T data){
        return new Stack<>(data);
    }
    public void push(T data){
        Stack<T> new_node = createNode(data);
        if(this.head == null)
            this.head = new_node;
        else{
            Stack<T> traverseNode = this.head;
            while(traverseNode.next!=null)
                traverseNode = traverseNode.next;
            traverseNode.next = new_node;
        }
    }
    public void display(){
        Stack<T> node = this.head;
        while(node!=null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
    public T pop(){
        Stack<T> node = this.head;
        T data;
        if(isEmpty())
        {
            return null;
        }
        else {
            if (node.next != null) {
                while (node.next.next != null)
                    node = node.next;
                data = node.next.data;
                node.next = null;
            } else {
                data = node.data;
                this.head = null;
            }
            return data;
        }
    }
    public boolean isEmpty(){
        Stack<T> node = this.head;
        return node == null;
    }
}
