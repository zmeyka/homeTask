package homeTask.homeTask13;

/**
 Написать статический булевский метод isSimple, который проверяет, является ли переданное ему число простым.
 Число называется простым, если оно делится без остатка только на себя и на единицу.
 */
public class homeTask13_4 {

    public static void main(String[] arg) {


        System.out.println(isSimple(17));
    }

    private static boolean isSimple(int j)
    {

        for (int i = 2; i < j; i++)
        {
            if (j % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
