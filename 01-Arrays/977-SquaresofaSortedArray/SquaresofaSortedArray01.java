class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int i=0;
        int j = n-1;
        for ( int k = n-1;k>=0;k--){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                result[k]=nums[i]*nums[i];
                i++;
            }
            else{
                result[k]=nums[j]*nums[j];
                j--;

            }
        }
        return result; 
    }
}