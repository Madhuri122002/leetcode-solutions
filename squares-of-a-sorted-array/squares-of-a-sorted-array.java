class Solution {
    public int[] sortedSquares(int[] nums) {
        int square_array[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            square_array[i]=nums[i]*nums[i];
        }
        Arrays.sort(square_array);
        return square_array;
    }
}