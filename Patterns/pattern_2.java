class pattern_2
{
    public static void main(String[] args) {
        // outer loop length
        int n = 5;
    
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<i+1;j++) // j<=i
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}