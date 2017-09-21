import java.util.*;

class MapSum {
    HashMap<String,Integer> h;

    public MapSum() {
        h = new HashMap<String,Integer>();
    }
    
    public void insert(String key, int val) {
        h.put(key,val);
    }
    
    public int sum(String prefix) {
        int sum=0;
        for(String key : h.keySet()){ 
            if(prefix.length()<=key.length() && key.substring(0,prefix.length()).equals(prefix)){
                sum+=h.get(key);
            }
        }
        return sum;
    }
}