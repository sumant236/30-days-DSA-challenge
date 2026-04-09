import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrintLevelOrderTraversal {
    static void printLevelOrder(Node root){
        if(root == null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node tempNode = q.poll();
            System.out.print(tempNode.data + " ");

            if(tempNode.left!=null){
                q.add(tempNode.left);
            }

            if(tempNode.right != null){
                q.add(tempNode.right);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        System.out.println("🌳 Tree Banana Shuru Karein 🌳");
        tree.root = tree.buildTree(sc);

        System.out.println("The Level-Order Traversal:");
        printLevelOrder(tree.root);
    }
}
