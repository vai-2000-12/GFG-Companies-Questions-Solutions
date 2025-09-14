
// A Binary Tree node
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}


class Solution {
    /*you are required to complete this function */
    boolean hasPathSum(Node root, int target) {
        if(root == null) return false;
        if(root.data == target && root.left == null && root.right == null) return true;
        return hasPathSum(root.left, target-root.data) || hasPathSum(root.right, target-root.data);
        
    }
}