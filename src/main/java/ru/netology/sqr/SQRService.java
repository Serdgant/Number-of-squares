package ru.netology.sqr;

public class SQRService {
    int a = 100;
    int b = 300;

    public int sqrCeil() {
        for (int i = 10; i <= a; i++) {
            if (i * i >= b) {
                return i;
            }
        }
        return 0;

    }


}