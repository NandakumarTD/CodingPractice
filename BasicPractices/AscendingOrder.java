package BasicPractices;

import java.util.Arrays;

public class AscendingOrder {

    public static void main(String[] args) {
        int [] arr = {23,453,12,4,10,2};
        int n = arr.length;
        sortAscending(arr,n);
    }

    public static void sortAscending(int [] arr, int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
