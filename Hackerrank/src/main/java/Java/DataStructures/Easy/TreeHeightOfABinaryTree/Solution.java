package Java.DataStructures.Easy.TreeHeightOfABinaryTree;

import java.util.Scanner;

public class Solution {
    /*
    class Node
    	int data;
    	Node left;
    	Node right;
	*/
    public static int height(Node root) {
        // Write your code here.
        if (root == null) {
            return -1;
        }
        int leftH = height(root.left);
        int rightH = height(root.right);
        if (leftH > rightH) {
            return leftH + 1;
        }
        else {
            return rightH + 1;
        }
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);
    }
}

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
