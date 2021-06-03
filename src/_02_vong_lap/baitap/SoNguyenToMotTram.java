package _02_vong_lap.baitap;

public class SoNguyenToMotTram {
    public static void main(String[] args) {
        int countPrime = 0;
        int run = 1;

        for (int j = 0; j < 100; j++) {
            int cout = 0;
            int i = 1;
            for (i = 1; i <= run; i++) {
                if (run % i == 0) {
                    cout++;
                }
            }
            if (cout == 2) {
                System.out.println(run);
                countPrime++;
            }

            run++;

        }
    }
}
