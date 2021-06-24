package _14_thuat_toan_sap_xep.baitap;

public class Chen {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        chen(arr);
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

    }
    public static void chen(int[]arr){
        int pos,x;
        for (int i = 0;i<arr.length;i++){
            x = arr[i];
            pos = i;
            while (pos>0 && arr[pos-1] > x){
                arr[pos] = arr[pos-1];
                pos--;
            }
            arr[pos] = x;
        }
    }
}
