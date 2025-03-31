public class reverseofarray {
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverse(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            swap(arr,i,j);
            i++;
            j--;
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }

    }
    public static void main(String[] args) {
        int arr[]={4,5,3,8,9,10};
        reverse(arr);
    }
}
