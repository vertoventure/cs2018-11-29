package by.it.apozniak.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c =34+26;
        System.out.println("DEC:"+ a + "+"+b+"="+c);

        String binB= Integer.toBinaryString(b);
        String binA= Integer.toBinaryString(a);
        String binC= Integer.toBinaryString(c);
        System.out.println("BIN:"+ binA + "+"+binB+"="+binC);

        String hexB= Integer.toHexString(b);
        String hexA= Integer.toHexString(a);
        String hexC= Integer.toHexString(c);
        System.out.println( "HEX:" +hexA + "+"+hexB+"="+hexC);
    }

}
