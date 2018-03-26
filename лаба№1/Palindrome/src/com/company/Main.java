package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER YOUR STRING: ");
        String a=in.nextLine();
        System.out.println("GIVEN STRING IS: "+a);
        StringBuffer str=new StringBuffer(a);
        //преобразовываем строку:
        StringBuffer str2=new StringBuffer(str.reverse());
        String s2=new String(str2);
        System.out.println("THE REVERSED STRING IS: "+str2);
        //сравниваем полученную строку с изначальной с помощью метода equals():
        if(a.equals(s2))
            System.out.println("ITS A PALINDROME");
        else
            System.out.println("ITS NOT A PALINDROME");
    }

    public static String reverseString(String s){
        String r = "";
        // берем символы исходной строки с конца строки до начала
        // и добавляем ее в начала строки-результата (переменная r)
        for (int i = s.length() - 1; i >= 0; --i)
            r += s.charAt(i);
        return r;
    }
    public static boolean isPalindrome(String s) {
        for (int i=0 , j=s.length()-1 ; i<j ; i++ , j-- ) {
            //посимвольная проверка тождества переменных
            if ( s.charAt(i) != s.charAt(j) ) {
                return false;
            }
        }
        return true;
    }
}