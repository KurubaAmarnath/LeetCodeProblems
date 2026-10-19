class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
         HashSet<Integer> resultSet = new HashSet<>();
         for ( int i = 0;i<nums1.length;i++){
            set1.add(nums1[i]);
         }
         for ( int j = 0;j<nums2.length;j++){
            if(set1.contains(nums2[j])){
                resultSet.add(nums2[j]);
            }
         }
         int[] result = new int[resultSet.size()];
         Iterator<Integer> iter = resultSet.iterator();
         for ( int k = 0; k<result.length;k++){
            result[k]=iter.next();
         }
         return result;
    }
}