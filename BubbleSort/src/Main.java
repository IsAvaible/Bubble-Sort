public class Main {

    public static void main(String[] args) {

        int[] array = {1000, 23, 1, 442, 0};

        array = BubbleSort.sort(array);

        for (int num : array){
            System.out.print(num + ", ");
        }
    }

}
