import java.util.*;
class Running_sum_of_1d_array
{
    public int[] runningSum(int[] nums) 
    {        
        for(int i=1;i<nums.length;i++)
            nums[i]+=nums[i-1];
        return nums;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size=sc.nextInt();
        System.out.print("Input:");
        int nums[]=new int[size];
        for(int i=0;i<n;i++)
            nums[i]=sc.nextInt();
        Running_sum_of_1d_array obj=new Running_sum_of_1d_array();
        int runningsum[]=obj.runningSum(nums);
        System.out.println("Output:"+Arrays.toString(nums));
    }
}
