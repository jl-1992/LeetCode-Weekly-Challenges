class Solution {
    public int maximumSwap(int num) {
        int max = num;
        String number = Integer.toString(num);
        for(int i=0;i<number.length()-1;++i){
            for(int j=i+1; j<number.length();++j){
                number = Integer.toString(num);
                if((int) number.charAt(j)> (int) number.charAt(i)){
                    number = number.substring(0,i) + number.charAt(j) + number.substring(i+1,j) + number.charAt(i) + number.substring(j+1, number.length());
                    if(max<Integer.parseInt(number))
                        max=Integer.parseInt(number);
                 }
            }
        }
        return max;
    }
}