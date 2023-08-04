class Solution {
    public int[] runningSum(int[] nums) {
      int arr[]=new int[nums.length];
      for(int row=0;row<nums.length;row++){
          int sum=0;
          for(int col=0;col<=row;col++){
            sum+=nums[col];
          }
          arr[row]=sum;
      }  
      return arr;
    }
}