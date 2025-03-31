public class roatateanarray {
    static int[] reverse(int arr[],int i,int j){
        while (i<j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
            
        }
        return arr;
    }
    static int[] rotate(int arr[],int k){
        int n=arr.length;
        if(k>n){
            k=k%n;
        }
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={5,10,20,6,9,3};
        int ans[]=rotate(arr, 3);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
    
}
