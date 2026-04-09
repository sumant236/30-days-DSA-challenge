import java.util.Scanner;

public class PrintPostOrderTraversal {
    static void printPostOrder(Node node){
        if(node == null){
            return;
        }
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.data + " -> ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        System.out.println("🌳 Tree Banana Shuru Karein 🌳");
        tree.root = tree.buildTree(sc);

        System.out.println("The Post-Order Traversal:");
        printPostOrder(tree.root);
    }
}
