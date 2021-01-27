package DS;

public class BST {

    public static void main(String[] args) {
        BSTNode tree = new BSTNode();
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        tree.insert(arr);
        tree.traverse(tree.root);
    }
}
class BSTNode{
    int data;
    BSTNode left;
    BSTNode right;
    BSTNode(int data){
        this.data = data;
        left = right = null;
    }
    BSTNode(){}
    BSTNode root = null;

    public BSTNode add(BSTNode root, int i, int n, int[] arr){
        if(i<n)
        {
            BSTNode temp = new BSTNode(arr[i]);
            root = temp;

            root.left = add(root.left,2*i+1,n,arr);
            root.right = add(root.right,2*i+2,n,arr);
        }
        return root;
    }

    public void insert(int[] data){
        root = add(root,0,data.length,data);
    }
    public void traverse(BSTNode node){
        if(node!=null){
            traverse(node.left);
            System.out.print(node.data);
            traverse(node.right);
        }
    }
    public void inorder(){
        BSTNode node = root;
        traverse(node);
    }
}