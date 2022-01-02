public class Assign4
 {
     public static void main(String args[])
     {
         int arr[]={10, 20, 30, -10, -5, 80};
         sortArray(arr,arr.len);
         for(int i=0;i<arr.len;i++)
         {
             System.out.println(arr[i]);
         }
         
     }
     public static void sortArray(int arr[],int n)
     {
         for(int i=0;i<n;i++)
         {
             for(int j=i+1;j<n;j++)
             {
                 if(arr[i]<arr[j])
                 {
                     int temp=arr[i];
                     arr[i]=arr[j];
                     arr[j]=temp;
                 }
             }
         }

     }

    
}








