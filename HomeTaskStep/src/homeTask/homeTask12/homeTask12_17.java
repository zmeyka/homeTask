package homeTask.homeTask12;

import java.math.BigInteger;

/**
 Перевести строку в целое число. JDK-методы использовать запрещено!
 */
public class homeTask12_17 {

    public static void main(String[] arg){

        String sNum = "23049458348947564263545372982349834324268763427364555";
        BigInteger num = BigInteger.valueOf(0);
        BigInteger powNum = BigInteger.valueOf(1);
        for (int i = 0; i < sNum.length(); i++)
        {
            for (int j = 0; j < 10; j++)
            {
                if (sNum.substring(sNum.length() - i - 1, sNum.length() - i).equals(Integer.toString(j)))
                {
                    num = num.add(powNum.multiply(BigInteger.valueOf(j)));
                }
            }
            powNum = powNum.multiply(BigInteger.valueOf(10));
        } System.out.println("\n" + num);
    }
}
