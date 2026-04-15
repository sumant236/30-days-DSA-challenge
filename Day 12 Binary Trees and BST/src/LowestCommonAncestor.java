import java.util.Scanner;

public class LowestCommonAncestor {
    private static Node findLCA(Node root, int p, int q) {
        if (root == null) {
            return null;
        }

        if (p < root.val && q < root.val) {
            return findLCA(root.left, p, q);
        }
        if (p > root.val && q > root.val) {
            return findLCA(root.right, p, q);
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BinarySearchTree bst = new BinarySearchTree();
        for (int i = 0; i < n; i++) {
            bst.root = bst.insert(bst.root, sc.nextInt());
        }

        int p = sc.nextInt();
        int q = sc.nextInt();

        System.out.println(findLCA(bst.root, p, q).val);
    }
}
