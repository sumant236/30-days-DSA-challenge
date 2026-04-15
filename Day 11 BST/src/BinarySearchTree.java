public class BinarySearchTree {
    public Node root;

    public Node searchValue(Node root, int num){
        if(root == null || root.val == num){
            return root;
        }
        if(root.val < num){
            return searchValue(root.right, num);
        } else {
            return searchValue(root.left, num);
        }
    }

    public Node insert(Node root, int num){
        if(root == null){
            return new Node(num);
        }
        if(num < root.val){
            root.left = insert(root.left, num);
        } else {
            root.right = insert(root.right, num);
        }
        return root;
    }

    public Node delete(Node root, int num){
        if (root == null) return null;

        // Pehle node ko dhoondho (Search logic)
        if (num < root.val) {
            root.left = delete(root.left, num);
        } else if (num > root.val) {
            root.right = delete(root.right, num);
        }

        // Node mil gaya! Ab delete karo:
        else {
            // Case 1 & 2: No child ya Single child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Case 3: Two children
            // 1. Successor dhoondho (Right ka sabse chota)
            Node IS = findSuccessor(root.right);
            // 2. Apni jagah Successor ki value rakho
            root.val = IS.val;
            // 3. Successor ko uski purani jagah se delete maro
            root.right = delete(root.right, IS.val);
        }
        return root;
    }

    Node findSuccessor(Node root ){
        // Left mein tab tak jao jab tak null na mil jaye
        while(root.left != null){
            root= root.left;
        }
        return root;
    }
}