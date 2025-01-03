class LargestNum 
{
    public static void main(String[] args) 
    {
     int n = 5;
     int [] a = {1,3,5,7,8};
     int small = a[0];
     for(int i=0; i<n; i++)
     {
         if(small>a[i])
         {
             small = a[i];
         }
     }
     System.out.println("Smallest value is: " + small);
    }
}
