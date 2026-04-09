import java.util.Scanner;

public class MaxDepthOfTree {
    static int findMaxDepth(Node root){
        if(root == null){
            return 0;
        }

        int leftHeight = findMaxDepth(root.left);
        int rightHeight = findMaxDepth(root.right);

        return 1 + Math.max(leftHeight,rightHeight);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        System.out.println("🌳 Tree Banana Shuru Karein 🌳");
        tree.root = tree.buildTree(sc);

        System.out.println("Maximum height of the tree: " + findMaxDepth(tree.root));
    }
}
