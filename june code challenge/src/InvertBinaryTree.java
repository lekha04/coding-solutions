import java.util.*;
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<TreeNode>();
        if(root==null){
            return root;
        }

        q.add(root);

        while(q.size()>0){
            TreeNode node = q.poll();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;

            if(node.left!=null){
                q.add(node.left);
            }

            if(node.right!=null){
                q.add(node.right);
            }
        }

        return root;
    }
}
