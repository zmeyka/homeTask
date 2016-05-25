package homeTask.homeTask12;

import java.math.BigInteger;
import java.util.Scanner;

/**
 В виде строк вводятся два очень длинных целых числа. Найти их сумму.
 */
public class homeTask12_21 {

    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);
        String sNum1 = scanner.nextLine();
        String sNum2 = scanner.nextLine();
        scanner.close();

        int maxLength = (sNum1.length() > sNum2.length()) ? sNum1.length() : sNum2.length();
        BigInteger sum = BigInteger.valueOf(0);
        for (int i = 0; i < maxLength; i++)
        {
            sum = sum.add(sumOneRow(sNum1, i));
            sum = sum.add(sumOneRow(sNum2, i));
        } System.out.println("\nСумма чисел равна " + sum);
    }


    public static BigInteger sumOneRow(String str, int i) {
        BigInteger sumOne = BigInteger.valueOf(0);
        BigInteger powNum = BigInteger.valueOf(10).pow(i);
        if ((str.length() - i - 1) >= 0)
        {
            for (int j = 0; j < 10; j++)
            {
                if (str.substring(str.length() - i - 1, str.length() - i).equals(Integer.toString(j)))
                {
                    sumOne = sumOne.add(powNum.multiply(BigInteger.valueOf(j)));
                }
            }
        }
        return sumOne;
    }
}
