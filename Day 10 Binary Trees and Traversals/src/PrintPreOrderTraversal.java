import java.util.Scanner;

public class PrintPreOrderTraversal {
    static void printPreOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data + " -> ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        System.out.println("🌳 Tree Banana Shuru Karein 🌳");
        tree.root = tree.buildTree(sc);

        System.out.println("The In-Order Traversal:");
        printPreOrder(tree.root);
    }
}
