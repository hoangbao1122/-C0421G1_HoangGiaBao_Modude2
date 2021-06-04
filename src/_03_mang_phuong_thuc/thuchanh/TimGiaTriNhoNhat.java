package _03_.thuchanh;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        int[] array = {10, 2, 70, 80, 12, 16, 9};
        int min = minValue(array);
        System.out.println("The smallest element in the array is: " + array[min]);
    }

    public static int minValue(int[] array) {
        int min = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[min]) {
                min = i;
            }
        }
        return min;
    }
}
