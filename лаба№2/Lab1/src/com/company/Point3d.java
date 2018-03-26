package com.company;

public class Point3d {

        //public static void main(String[] args) {
            /**
             * трехмерный класс точки
             */
            //class Point3d {

                /** X координат точки */
                private double xCoord;

                /** Y координат точки */
                private double yCoord;

                /** Z координат точки */
                private double zCoord;

                /** Конструктор, чтобы инициализировать точку к (x, y, z) значение. */
                public Point3d(double x, double y, double z) {
                    xCoord = x;
                    yCoord = y;
                    zCoord = z;
                }

                /** Конструктор без параметров: значения по умолчанию к точке в источнике. */
                public Point3d() {
                    // вызываем конструктор с тремя параметрами и определяем источник.
                    this(0, 0, 0);
                }

                /** сравниваем два момента равенства */
                public boolean equals(Object o) {
                    if (o.getClass() == Point3d.class) {
                        Point3d pt = (Point3d) o;
                        return (xCoord == pt.getX()) && (yCoord == pt.getY()) && (zCoord == pt.getZ());
                    } else
                        return false;
                }

                /** вычисляем расстояние между точками */
                public double distanceTo(Point3d pt) {
                    double deltaX = xCoord - pt.getX();
                    double deltaY = yCoord - pt.getY();
                    double deltaZ = zCoord - pt.getZ();
                    return Math.sqrt(deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ);
                }

                /** возвращаем Х координат точки. */
                public double getX() {
                    return xCoord;
                }

                /** возвращаем Y координат точки. */
                public double getY() {
                    return yCoord;
                }

                /** возвращаем Z координат точки. */
                public double getZ() {
                    return zCoord;
                }

                /** Набор координат Х точки. */
                public void setX(double val) {
                    xCoord = val;
                }

                /** Набор координат Y точки. */
                public void setY(double val) {
                    yCoord = val;
                }

                /** Набор координат Z точки. */
                public void setZ(double val) {
                    zCoord = val;
                }
}

