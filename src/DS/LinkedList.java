package DS;

public class LinkedList {

    public static void main(String[] args) {
        Node node = new Node();
        node.add(node,10);
        node.add(node,20);
        node.add(node,30);
        node.add(node,40);
        node.show(node);
    }
}
class Node{
    Node head;
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        next = null;
    }
    Node(){}
    public Node createNode(int data){
        Node node = new Node(data);
        return node;
    }
    public Node add(Node root,int data){
        Node node = createNode(data);
        if(root.head==null)
            root.head = node;
        else
        {
            Node last = root.head;
            while(last.next!=null){
                last = last.next;
            }
            last.next = node;
        }
        return node;
    }
    public void show(Node node){
        Node n = node.head;
        while(n.next!=null){
            System.out.println(n.data+",");
            n = n.next;
        }
        System.out.println(n.data+",");
    }
}
