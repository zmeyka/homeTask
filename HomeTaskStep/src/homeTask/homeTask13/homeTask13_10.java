package homeTask.homeTask13;

/**
 Есть два игральных кубика со значениями от 1 до 6. Игра происходит с компьютером, кубики бросаются поочерёдно.
 Побеждает тот, у кого сумма выпавших очков по итогам пяти бросков больше. Кубики отображаются при помощи псевдографики.
 В конце игры необходимо вывести среднее арифметическое по броскам для обоих соперников.
 */
public class homeTask13_10 {

    public static void main(String[] arg) {
    String[][] cube = {

            {"*********", "* *", "* O *", "* *", "*********"},

            {"*********", "* O *", "* *", "* O *", "*********"},

            {"*********", "* O *", "* O *", "* O *", "*********"},

            {"*********", "* O O *", "* *", "* O O *", "*********"},

            {"*********", "* O O *", "* O *", "* O O *", "*********"},

            {"*********", "* O O *", "* O O *", "* O O *", "*********"}

    };

    int min = 1;
    int max = 6;
    int amt = 5;
    int sumUser = 0;
    int sumPC = 0;
    int user = 0;
    int PC = 0;

    for (int i = 0; i < amt; i++)
    {
        System.out.println("  Игрок   Компьютер");

        user = (int) (Math.random() * (max - min + 1) + min);

        PC = (int) (Math.random() * (max - min + 1) + min);

        sumUser += user;

        sumPC += PC;

        for (int j = 0; j < amt; j++)
        {

            System.out.print(cube[user - 1][j]);

            System.out.print("  ");

            System.out.print(cube[PC - 1][j]);

            System.out.println(" ");

        }
        System.out.println(" ");
    }

    if (sumUser > sumPC)
    {

        System.out.println("Победил игрок");

    } else if (sumUser < sumPC)
        {

        System.out.println("Победил компьютер");

        } else
            {
                System.out.println("Ничья");
                System.out.println("Среднее арифметическое по броскам для игрока " + sumUser / amt + " и компьютера " + sumPC / amt + ".");
            }
    }


    public static int numberRandom(int min, int max) {

        return (int) (Math.random() * (max - min + 1) + min);

    }
}
