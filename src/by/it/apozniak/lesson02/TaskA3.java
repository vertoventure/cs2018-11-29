package by.it.apozniak.lesson02;
/*
Измените переменные и строку вывода в программе так,
чтобы она рассчитывала и печатала следующее выражение
3*3+4*4=25
 */

class TaskA3 {
    public static void main(String[] args) {
        int i = 2;
        int j = 3;
        int k = j*j;
        int m = i*i;
     int n = k + m * m;
        System.out.println(j + "*" + j + "+" + m + "*" + m + "=" + n);
    }
}
