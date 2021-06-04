package _03_.baitap;

public class TimPhanTuLonNhatMangHaiChieu {
    public static void main(String[] args) {
        int max = 0;
        int i,j;
        int[][]array2Chieu = {
                {1,2,3},
                {4,9,6}
        };
        for (i=0;i<array2Chieu.length;i++){
            for (j=0;j<array2Chieu[i].length;j++){
//                System.out.print(array2Chieu[i][j]);
                if (array2Chieu[i][j]>max){
                    max = array2Chieu[i][j];
                }

            }
        }
        System.out.print("Phần tử lớn nhất trong mảng 2 chiều "+max);
    }
}
