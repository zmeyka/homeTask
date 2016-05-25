package homeTask.homeTask18;

import java.awt.*;

/**
 Реализовать класс MyArrayList, представляющий собой одномерный безразмерный динамический массив для
 удобной работы с целыми числами типа int.
 В классе должно быть три поля:
 -	ссылка на инкапсулированный массив типа int[] (можно назвать её data, или ar);
 -	текущее количество существующих элементов в массиве (int size, изначально - 0);
 -	резерв памяти (int capacity, по умолчанию 10).
 Конструкторы:
 - по умолчанию (без параметров), который выделяет память под массив на десять 10 элементов, равных нулю (capacity = 10, size = 0)
 - параметризированный конструктор - принимает один параметр (задаёт capacity), выделяет память под массив (size по-прежнему 0).
 Методы:
 - геттеры для size и capacity. Сеттера для size не должно быть!
 - print (показ на экран консоли всех элементов массива)
 - ensureCapacity (закрытый метод! проверяет, достаточно ли резерва памяти для хранения указанного в параметре
   количества элементов. Если значение параметра меньше текущего capacity, то ничего не происходит. Если значение
   параметра больше текущего capacity, то массив пересоздаётся, памяти выделяется в 1.5 раза + 1 элемент больше, а
   существующие элементы не должны быть потеряны)
 - pushBack (добавление элемента в конец массива. Должна быть проверка, достаточно ли памяти!)
 - pushFront (добавление одного элемента в начало массива)
 - insert (вставка одного элемента в массив по указанному индексу, с проверкой на выход за пределы массива)
 - removeAt (удаление одного элемента по указанному индексу. Должна быть проверка на допустимость индекса)
 */
public class homeTask18_1 {

    public static void main(String[] arg)
    {

    }

    public class MyArrayList
    {
        private int[] data;
        //private int size = 0;
        private int capacity = 10;
        //List lis[] = new List[capacity, size];


        public MyArrayList()
        {
          //  data = new int[size];
        }
    }
}
