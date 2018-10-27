package algoritmosdeordenacao;

public class MergeSort {
	
	public static int[] organizar(int [] array){

        int size = array.length;
        if(size<2)
            return array;
        int[] left = new int[(size/2)];
        int[] right = new int[(size-(size/2))];
        for(int i=0; i<(size/2); i++ ){
            left[i] = array[i];
        }
        for(int i=(size/2); i<(size); i++ ){
            right[i-(size/2)] = array[i];
        }
        organizar(left);
        organizar(right);
        int[] a= mergeSort(left, right, array);
        return a;

    }

    public static int[] mergeSort(int[] left, int[] right,int[] array){
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                array[k] = left[i];
                i++;
            }
            else{
                array[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            array[k] = left[i];
            i++;
            k++;
        }
        while(j<right.length){
            array[k] = right[j];
            j++;
            k++;
        }
        return array;
    }        

}
