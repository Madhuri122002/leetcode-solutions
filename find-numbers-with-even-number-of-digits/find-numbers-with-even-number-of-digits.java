class Solution {
    public int findNumbers(int[] nums) {
        int count=0,digit_count;
        for(int i=0;i<nums.length;i++)
        {
            String num=String.valueOf(nums[i]);
            digit_count=num.length();
            if(digit_count%2==0)
                count++;
        }
        return count;
    }
}