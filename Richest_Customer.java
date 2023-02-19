class Richest_Customer 
{
    public int[] maximumWealth(int[][] accounts)
    {
        int max=0,sum=0;
        int acc[]=new int[accounts.length];
        for(int i=0;i<accounts.length;i++)
        {
            for(int j=0;j<accounts[i].length;j++)
            {
                sum+=accounts[i][j];
            }
        acc[i]=sum;
        sum=0;
        } 
       return acc;
    }
  public int find_max(int []acc)
  {
    int max=0;
    for(int i=0;i<acc.length;i++)
    {
      if(max<acc[i])
        max=acc[i];
    }
    return max;
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the 2d array:");
    int row=sc.nextInt();
    int col=sc.nextInt();
    int accounts[][]=new int[row][col];
    System.out.println("Input:");
    for(int i=0;i<size;i++)
      accounts[i][j]=sc.nextInt();
    Richest_Customer obj=new Richest_Customer();
    int findmax[]=obj.maximumwealth(accounts);
    int max=obj.find_max(findmax);
    System.out.println("Output:"+Arrays.toString(findmax)+" Total:"+max);
}}
