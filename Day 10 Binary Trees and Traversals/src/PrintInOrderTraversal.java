import java.util.Scanner;

public class PrintInOrderTraversal {
    static void printInOrder(Node node){
        if(node == null){
            return;
        }
        printInOrder(node.left);
        System.out.print(node.data + " -> ");
        printInOrder(node.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        System.out.println("🌳 Tree Banana Shuru Karein 🌳");
        tree.root = tree.buildTree(sc);

        System.out.println("The In-Order Traversal:");
        printInOrder(tree.root);
    }
}
