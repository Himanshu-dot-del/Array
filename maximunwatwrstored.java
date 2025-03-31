public class maximunwatwrstored {
    static int maximunvolume(int arr[]){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int i=0;
        int j=n-1;
        while(i<=j){
                int breath=Math.abs(j-i);
                int len=Math.min(arr[i], arr[j]);
                int area=breath*len;
                max=Math.max(area, max);
                if(arr[i]<arr[j]){
                    i++;
                }
                else{
                    j--;
                }

            }
            return max;
        }
       
    
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        int ans=maximunvolume(arr);
        System.out.println(ans);
    }
}
    

