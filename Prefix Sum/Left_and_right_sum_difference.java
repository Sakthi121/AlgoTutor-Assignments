class Solution {
    public int[] leftRightDifference(int[] nums) {
         int leftsum[]=new int[nums.length];
        int rightsum[]=new int[nums.length];
        int newarr[] = new int[nums.length];
         leftsum[0]=nums[0];
         
         rightsum[nums.length -1]=nums[nums.length -1];
        for(int i=1;i<nums.length;i++)   leftsum[i]=leftsum[i-1]+nums[i];
        for(int i=nums.length -2;i>=0;i--)  rightsum[i]=rightsum[i+1]+nums[i];
        for(int i=0;i<nums.length;i++){
        if(leftsum[i] >= rightsum[i])
         newarr[i]=leftsum[i] - rightsum[i];
         else
          newarr[i]= rightsum[i]-leftsum[i] ;
        }
return newarr;
    }
}