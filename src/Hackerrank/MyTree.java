package Hackerrank;

public class MyTree {

    Mytree root;

    public void addNode(int data){
        Mytree newnode = new Mytree(data);
        if(root == null){
            root = newnode;
        }
        else{
            Mytree focusNode = root;
            Mytree parent;
            while(true){
                parent = focusNode;
                if(data<focusNode.data){
                    focusNode = focusNode.left;
                    if(focusNode == null){
                        parent.left = newnode;
                        return;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {

    }
}
class Mytree{
    int data;
    Mytree left;
    Mytree right;
    public Mytree(int data){
        this.data = data;
    }
}
