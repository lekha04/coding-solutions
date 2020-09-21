//Leetcode 102
import java.util.*;
public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> out = new ArrayList<List<Integer>>();
        List<Integer> list;
        Queue<TreeNode> q = new ArrayDeque<TreeNode>();
        q.add(root);

        while(q.size()>0){
            int size = q.size();
            list = new ArrayList<>();
            while(size>0){
                TreeNode node = q.poll();
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
                list.add(node.val);
                size--;
            }
            out.add(list);
        }

        return out;
    }

}


