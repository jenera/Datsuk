package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите 3 точки: ");
        Scanner in = new Scanner(System.in);
        System.out.println("координата первой: ");
        double x1 = in.nextInt();
        double y1 = in.nextInt();
        double z1 = in.nextInt();
        System.out.println("координата второй: ");
        double x2 = in.nextInt();
        double y2 = in.nextInt();
        double z2 = in.nextInt();
        System.out.println("координата третьей: ");
        double x3 = in.nextInt();
        double y3 = in.nextInt();
        double z3 = in.nextInt();


        Point3d P1 = new Point3d(x1, y1, z1);
        Point3d P2 = new Point3d(x2, y2, z2);
        Point3d P3 = new Point3d(x3, y3, z3);

        double answer = computeArea(P1, P2, P3);
        System.out.println("\nОтвет: " +answer);

    }

    public static double computeArea (Point3d p1, Point3d p2, Point3d p3)
    {
        if (p1.equals(p2) || p2.equals(p3) || p3.equals(p1))
            System.out.print("некорректный ввод");
        double a = p1.distanceTo(p2);
        System.out.print("вывод a = " +a );
        double b = p2.distanceTo(p3);
        System.out.print("\nвывод b = " +b);
        double c = p3.distanceTo(p1);
        System.out.print("\nвывод c = " +c);
        double per = (a + b + c) ;
        System.out.print("\nпериметр = " + per);
        double Area = (Math.sqrt (per * (per - a) * (per - b) * (per - c)) );
        return Area;
    }


}
