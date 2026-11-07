class Solution {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
         boolean hasFirst = false;
         boolean hasSecond = false;
         boolean hasThird = false;
         for (int num : nums) {
            if ((hasFirst && num == first) ||
                (hasSecond && num == second) ||
                (hasThird && num == third)) {
                continue;
            }
            if (!hasFirst || num > first) {
                third = second;
                hasThird = hasSecond;
                second = first;
                hasSecond = hasFirst;
                first = num;
                hasFirst = true;
            }
            else if (!hasSecond || num > second) {
                third = second;
                hasThird = hasSecond;
                second = num;
                hasSecond = true;
            }
            else if (!hasThird || num > third) {
                third = num;
                hasThird = true;
            }
        }
        return hasThird ? (int) third : (int) first;
    }
}