//Leetcode 103

import java.util.*;

public class BinaryTreeZigZagLevelOrderTraversal {

    public static List<List<Integer>> binaryTreeZigZagLevelOrderTraversal(TreeNode root){

        List<List<Integer>> out = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        if(root!=null){
            q.add(root);
        }
        else{
            return out;
        }
        int count = 0;
        while(q.size()>0){
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            while(size>0){
                TreeNode node = q.poll();
                if(count%2==0){
                    list.add(node.val);
                }
                else{
                    list.add(0,node.val);
                }
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
                size--;
            }
            out.add(list);
            count++;
        }

        return out;
    }
}
