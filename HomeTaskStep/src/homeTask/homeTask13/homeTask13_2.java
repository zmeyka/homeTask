package homeTask.homeTask13;

/**
 Написать статический метод myRectangle, который выводит на экран консоли прямоугольник.
 Метод принимает 4 параметра: ширина, высота, символ рамки, символ заливки.
 */
public class homeTask13_2 {

    public static void main(String[] args)
    {
        myRectangle(20, 10, "#", "!");
    }
    public static void myRectangle(int width, int height, String bordersymbol, String fillsymbol)
    {
        for (int h=0; h<height; h++)
        {
            for (int w=0; w<width; w++)
            {
                if (w == 0 || h == 0 || w == width - 1 || h == height - 1)
                    System.out.print(bordersymbol);
                else System.out.print(fillsymbol);
            }
            System.out.print("\n");
        }


    }
}
