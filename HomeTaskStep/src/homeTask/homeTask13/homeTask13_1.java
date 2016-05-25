package homeTask.homeTask13;

/**
 Написать статический метод myLine, который можно будет вызвать так:
 myLine(20, '@', true);
 и при этом на экране консоли нарисуется горизонтальная линия, состоящая из 20 «собачек».
 Если передать в последнем параметре false – линия станет вертикальной.
 */
public class homeTask13_1 {

    public static void main(String[] args)
    {
        myLine(20, "@", true);
    }

    public static void myLine(int number, String symbol,boolean line) {

        for (int i = 0; i < number; i++)
        {
            if (line)
            {
                System.out.print(symbol);
            } else System.out.println(symbol);
        }
    }
}
