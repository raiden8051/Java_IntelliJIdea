package DS;

public class QueueLL {

    public static void main(String[] args) {
        DS.Queue<Integer> si = new DS.Queue<>();
        si.enqueue(10);
        si.enqueue(20);
        si.enqueue(30);
        System.out.println(si.dequeue());
        si.display();
    }
}
class Queue<T>{
    DS.Queue<T> head = null;
    T data;
    DS.Queue<T> next;
    public Queue(T data){
        this.data = data;
        next = null;
    }
    public void peek(){
        if(isEmpty())
            System.out.println("Queue Underflow");
        else{
            DS.Queue<T> node = this.head;
            while(node.next!=null)
                node = node.next;
            System.out.println(node.data);
        }
    }
    public Queue(){}
    public DS.Queue<T> createNode(T data){
        return new DS.Queue<>(data);
    }
    public void enqueue(T data){
        DS.Queue<T> new_node = createNode(data);
        if(this.head == null)
            this.head = new_node;
        else{
            DS.Queue<T> traverseNode = this.head;
            while(traverseNode.next!=null)
                traverseNode = traverseNode.next;
            traverseNode.next = new_node;
        }
    }
    public void display(){
        DS.Queue<T> node = this.head;
        while(node!=null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
    public T dequeue(){
        DS.Queue<T> node = this.head;
        T data = null;
        if(isEmpty())
            return null;
        else {
            if (node.next != null) {
                data = node.data;
                node = node.next;
            }
            return data;
        }
    }
    public boolean isEmpty(){
        DS.Queue<T> node = this.head;
        return node == null;
    }
}