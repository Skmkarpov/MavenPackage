package Netology.MavenPackage;

public class CalcService {
    public int calc(int downBorder, int upBorder) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= downBorder) {
                if (i * i <= upBorder) {
                    count++;
                }

            }

        }
        return count;
    }
}