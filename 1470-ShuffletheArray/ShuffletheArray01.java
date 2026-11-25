class Solution {
    public int[] shuffle(int[] nums, int n) {
        int shuffle[] = new int[nums.length];
        for ( int i = 0; i < n; i++){
            shuffle[2*i]=nums[i];
            shuffle[2*i+1]=nums[n+i];
        }
        return shuffle;
    }
}