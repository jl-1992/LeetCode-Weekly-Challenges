public class Solution{

    public int repeatedStringMatch(String a, String b){
        int count=1;
        String temp = a;
        int maxCount=10000/temp.length();
    
                
        while(count<=maxCount+1){
            if(a.length()>2*b.length() && count>10)
                return -1;
            if(a.length()>=b.length()){
                for(int i=0; i<=a.length()-b.length(); i++){
                    if(a.substring(i,i+b.length()).equals(b))
                        return count;
                }
            }
            a+=temp;
            ++count;
        }
        
        return -1;
    }
}