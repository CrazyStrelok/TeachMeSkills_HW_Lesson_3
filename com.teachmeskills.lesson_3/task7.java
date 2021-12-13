import java.util.Arrays;

public class task7 {
    public static void main(String[] args) {
        int [] array = {53, 54, 186, 166, 5457};
        boolean isSorted = false;
        int a;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;
                    a = array[i];
                    array[i] = array[i+1];
                    array[i+1] = a;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}


