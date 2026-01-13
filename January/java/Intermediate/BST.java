package January.java.Intermediate;
import java.util.Scanner;

public class BST {
    public class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }
    Node root=null;
    public void insert(int key) {
        root = insertRec(root, key);
    }
    private Node insertRec(Node root, int key){
        if(root == null ){
            return new Node(key);
        }
        if(key <root.data){
            root.left = insertRec(root.left, key);
        }
        else{
            root.right = insertRec(root.right, key);
        }
        return root;
    }
    
private void inorder(Node root) {
    // 1. LEFT recursion
    if(root != null) {
        inorder(root.left);
        // 2. Visit ROOT (print data)
        System.out.print(root.data + " ");
        // 3. RIGHT recursion
        inorder(root.right);
    }
}

public void printInorder() {
    // Public wrapper - call private method
    inorder(root);
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes : ");
        int n = sc.nextInt();
        BST bst = new BST();
        for(int i=1; i<=n; i++){
            System.out.print("Enter node " + i + " : ");
            int node = sc.nextInt();
            bst.insert(node);
        }
        System.out.println("Inorder (sorted):");
        bst.printInorder();
        }
}
