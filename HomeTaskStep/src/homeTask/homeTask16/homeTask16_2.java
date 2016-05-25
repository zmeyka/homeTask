package homeTask.homeTask16;

import java.awt.*;

/**
 Реализовать класс Point, описывающий точку в двумерном (по желанию – в трёхмерном) пространстве.
 Предусмотреть поля, хранящие координаты по X и Y. Сделать методы, позволяющие переместить точку (например - вверх,
 вниз, влево, вправо) на указанное количество единиц. И ещё добавить метод, который покажет координаты точки
 на экране консоли.
 */
public class homeTask16_2 {

    public static void main(String[] arg)
    {

    }

    public class Point
    {
        private int x;
        private int y;

        Point()
        {
            x=0;
            y=0;
        }

        Point(int xSet, int ySet)
        {
            x=xSet;
            y=ySet;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void moveTop(int count)
        {
            y+=count;
        }

        public void moveDowm(int count)
        {
            y+=count;
        }

        public void moveRight(int count)
        {
            x+=count;
        }

        public void moveLeft(int count)
        {
            x+=count;
        }

        public String showCoordinats()
        {
            return "Координаты точки х = " +x+ " точки y = " +y;
        }
    }
}
