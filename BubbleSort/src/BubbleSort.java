public class BubbleSort {

    public static int[] sort(int[] array){ //[1, 5, 1, 2]

        for (int i = 0; i < array.length; i++){

            int carry = array[0];
            for (int j=1; j < array.length; j++){

                if (carry < array[j]){
                    carry = array[j];
                } else {
                    array[j-1] = array[j];
                    array[j] = carry;
                }

            }
        }
        return array;


    }

}
