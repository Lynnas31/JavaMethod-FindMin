public class FindMin {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);

    }
    public static int minValue(int[] array){
        int min = array[0];
        int index_min = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
                index_min = j ;
            }
        }
        return index_min;
    }
}
