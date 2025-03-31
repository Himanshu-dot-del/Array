public class trappingrainwater {
    static int trapping(int arr[]){
        int n=arr.length;
        // calculate leftmax boundary in array
        int leftmax[]=new int[n];
        leftmax[0]=arr[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(arr[i], leftmax[i-1]);
        }
         // calculate rightmax boundary in array
         int rightmax[]=new int[n];
         rightmax[n-1]=arr[n-1];
         for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(arr[i],rightmax[i+1]);
         }
         //loop
         int trapped=0;
         for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftmax[i], rightmax[i]);
            trapped+=waterlevel-arr[i];

         }
         return trapped;

    }
    public static void main(String[] args) {
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int ans=trapping(arr);
        System.out.println(ans);
    }
    
}
