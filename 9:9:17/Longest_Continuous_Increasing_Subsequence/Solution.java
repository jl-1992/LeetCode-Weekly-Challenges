class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==0)
            return 0;
        int count=1;
        int length=1;
        for(int i=0; i<nums.length-1; ++i){
            if(nums[i]<nums[i+1]){
                ++count;
                if(count>length){
                    length=count;
                }
            }
            if(nums[i]>=nums[i+1]){
                if(count>length){
                    length=count;
                }
                count=1;
            }
        }
        return length;
    }
}