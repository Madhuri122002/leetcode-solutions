class Selection_sort
{
    public int[] sortArray(int[] nums)
    {
        int min=0, temp;
        for(int i=0;i<=nums.length-2;i++)
        {
            min=i;
            for(int j=i+1;j<=nums.length-1;j++)
            {
                if(nums[j]<nums[min])
                {
                    min=j;
                }
            }
            temp=nums[min];
            nums[min]=nums[i];
            nums[i]=temp;
        }
        return nums;

    }
}
