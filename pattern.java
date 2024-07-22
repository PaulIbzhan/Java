class Main{
    public static void main(String[] args)
    {
        int n = 1;
        int m = 20;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(n++ +" ");
            }
            for(int k=4;k>=i;k--)
            {
                System.out.print(m-- +" ");
            }
            System.out.println();
            
        }
    }
}
    