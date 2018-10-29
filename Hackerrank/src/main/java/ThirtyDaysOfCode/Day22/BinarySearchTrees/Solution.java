package ThirtyDaysOfCode.Day22.BinarySearchTrees;

import java.util.Scanner;

public class Solution {
    public static int getHeight(Node root) {

        if (root == null) {
            return -1;
        } else {
            int lDepth = getHeight(root.left);
            int rDepth = getHeight(root.right);
            return 1 + Math.max(lDepth, rDepth);
        }
    }
    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }

}
