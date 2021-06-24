package _13_thuat_toan_tim_kiem.thuchanh;

public class CaiDatDeQuy {
    public static  int birary(int[] list,int key){
        int low = 0;
        int high = list.length-1;
        while (high >= low){
            int mid = (low + high) / 2;
            if (key < list[mid]){
                high = mid - 1;
            }
            else if(key == list[mid]){
                return mid;
            }else {
                low = mid + 1 ;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int result = birary(arr,4);
        System.out.println(result);

    }
}
