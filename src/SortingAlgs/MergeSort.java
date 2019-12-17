import java.lang.reflect.Array;
import java.util.List;

public class MergeSort {
    void mergeSort(int[] array) {
        int[] helper = new int[array.length];
        mergeSort(array, helper, 0, array.length -1);
    }

    void mergeSort(int[] array, int[] helper,int low, int high) {
        if(low < high){
            int middle = (low + high)/2;
            mergeSort(array, helper, low, middle -1 );  //Sort left half
            mergeSort(array, helper, middle +1 , high); //Sort right half
            merge(array, helper, low, middle, high);
        }
    }

    void merge(int[] array, int[] helper, int low, int middle, int high) {
        //Copy both halfs in a helper array
        for(int i = low; i <= high; i++){
            helper[i] = array[i];
        }
    }
    public static void main(String args[]) {
        int[] input = new int[100];
        input[0] = 1;

    }

}
