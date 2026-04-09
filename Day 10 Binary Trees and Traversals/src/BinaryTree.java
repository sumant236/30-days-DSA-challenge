import java.util.Scanner;

public class BinaryTree {
    Node root;

    Node buildTree(Scanner sc){
        System.out.print("Enter data (-1 for null): ");
        int data = sc.nextInt();

        if(data == -1){
            return null;
        }

        Node newNode = new Node(data);

        System.out.println("Enter LEFT child for " + data + " ->");
        newNode.left = buildTree(sc);

        System.out.println("Enter Right child for " + data + " ->");
        newNode.right = buildTree(sc);

        return newNode;
    }
}
