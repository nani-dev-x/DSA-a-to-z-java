class pattern_18
{
    public static void main(String[] args) {
        int n =5;

        for(int i=0;i<n;i++)
        {
            int num =(64+n)-i;
            System.out.print((char) num);
            for(int j=1;j<=i;j++)
            {
                char m=(char) (num+j);
                System.out.print(m);
            }
            System.out.println();
        }
    }
}