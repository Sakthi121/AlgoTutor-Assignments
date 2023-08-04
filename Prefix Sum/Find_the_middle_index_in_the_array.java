class Solution {
    public int findMiddleIndex(int[] nums) {
        int leftsum[]=new int[nums.length];
        int rightsum[]=new int[nums.length];
         leftsum[0]=nums[0];
         int k=-1;
         rightsum[nums.length -1]=nums[nums.length -1];
        for(int i=1;i<nums.length;i++)   leftsum[i]=leftsum[i-1]+nums[i];
        for(int i=nums.length -2;i>=0;i--)  rightsum[i]=rightsum[i+1]+nums[i];
         for(int i=0;i<nums.length;i++){
             if( leftsum[i] ==  rightsum[i])
             {
                 k=i;
                 break;
             }
         }
         return k;
    }
}