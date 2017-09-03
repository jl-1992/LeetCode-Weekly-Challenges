import java.util.*;

class Solution {
    ArrayList<Integer> l = new ArrayList<Integer>();
    
    public int findSecondMinimumValue(TreeNode root) {
        if(root!=null){
            findSecondMinimumValue(root.left);
            l.add(root.val);
            findSecondMinimumValue(root.right);
        }
        Collections.sort(l);
        for(Integer i : l){
            if(i>l.get(0))
                return i;
        }
        
        return -1;    
    }
}