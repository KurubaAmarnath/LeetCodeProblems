class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int leftProduct=1;
        int rightProduct=1;
        int arr[] = new int[n];
        for ( int i = n - 1; i>=0; i--){
            arr[i]=rightProduct;
            rightProduct = rightProduct*nums[i];
        }
        for ( int i = 0; i<n;i++){
            arr[i]=arr[i]*leftProduct;
            leftProduct = leftProduct*nums[i];
        }
        return arr;
    }
}