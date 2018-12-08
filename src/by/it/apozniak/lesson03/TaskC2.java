package by.it.apozniak.lesson03;
/*
    Сумма цифр четырехзначного числа

    Реализуйте метод sumDigitsInNumber(int number).
    Метод на вход принимает целое четырехзначное число.
    Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

    Пример:
    Метод sumDigitsInNumber вызывается с параметром 5467.

    Пример вывода:
    22

    Требования:
    1. В методе sumDigitsInNumber не могут быть использованы никакие дополнительные классы.
    2. Метод sumDigitsInNumber(int) должен быть не приватным и статическим.
    3. Метод sumDigitsInNumber должен возвращать значение типа int.
    4. Метод sumDigitsInNumber не должен ничего выводить на экран.
    5. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*/
public class TaskC2 {

static int sumDigitsInNumber (int zzz) {
    int sum =0;
    int pos3=zzz/1000;
    int pos2=zzz/100%10;
    int pos1=zzz/10%10;
    int pos0=zzz/1%10;
    return pos0+pos1+pos2+pos3;

}


 public static void main(String[] args) {
  System.out.println(sumDigitsInNumber(5467));
   }

}
