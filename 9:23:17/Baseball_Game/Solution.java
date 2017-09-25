import java.util.ArrayList;

class Solution {
    public int calPoints(String[] ops) {
        ArrayList<Integer> points = new ArrayList<Integer>();
        int sum=0;
        for(int i=0; i<ops.length; ++i){
            if(ops[i].equals("C")){
                sum-=points.get(points.size()-1);
                points.remove(points.size()-1);
            }
            else if(ops[i].equals("D")){
                sum+=(2*points.get(points.size()-1));
                points.add(2*points.get(points.size()-1));
            }
            else if(ops[i].equals("+")){
                sum+=(points.get(points.size()-1) + points.get(points.size()-2));
                points.add(points.get(points.size()-1) + points.get(points.size()-2));
            }
            else{
                sum+=Integer.valueOf(ops[i]);
                points.add(Integer.valueOf(ops[i]));
            }
        }
        return sum;
    }
}