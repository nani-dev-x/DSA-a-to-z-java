class pattern_11
{
    public static void main(String[] args) {
        int n =5;
        int first =1;
        int number  =1;
        for(int i =0;i<n;i++)
        {
             if(first ==0)
                {
                    System.out.print("0 ");
                    first =1;
                }else{
                    System.out.print("1 ");
                    first = 0;
                }
                // u can do as if(i%2 ==0) first =1;
                // else first =0;
                number = first;
            for(int j=1;j<=i;j++)
            {
            
                if(number ==0)
                {
                    System.out.print("0 ");
                    number =1;
                }
                else{
                    System.out.print("1 ");
                    number =0;
                }
                // System.out.print(first);
                // are u do as first = 1-first;
            }
            System.out.println();
        }
    }
}