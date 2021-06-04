package _03_.baitap;

public class GopMang {
    public static void main(String[] args) {
        int []array1 = {10,20,30,40,50};
        int []array2 = {6,7,8,9,10};
        int []array3 = new int[10];
        array3 = new int[10];
        int i;
        int result;
        for (i=0;i<array1.length;i++){
            array3[i] = array1[i];
        }
        for (int j=0;j<array2.length;j++){
            array3[array2.length+j] = array2[j];
        }
        for (int x : array3){
            System.out.print(x+ " ");
        }

    }
}
