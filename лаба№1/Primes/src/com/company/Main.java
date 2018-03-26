package com.company;

public class Main {

    public static void main(String[] args) {
        int n=100;//объявляем кол-во перебираемых чисел
        for (int i=2; i < n; i++) {
            boolean a=true;//объявляем возвращаемую переменную
            int q=(int)Math.sqrt(i);//функция возвращает квадратный
            //корень из аргумента
            for (int j=2; j <= q; j++) {
                if ((i%j) == 0) {
                    a = false;
                    //переменная полностью делится на аргумент
                    //->срабатывает оператор false
                    break;
                }
            }
            //значение не делится на аргумент без остатка->
            //это простое число, и оператор покажет true
            if(a) {
                System.out.print(i+" ");
            }
        }
    }
}
