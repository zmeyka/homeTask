package homeTask.homeTask17;

import homeTask.homeTask17.homeTask17_3.Student;

/**
 4.	Реализовать класс Group, который работает с массивом студентов. Обязательные поля: ссылка на массив студентов,
 количество человек в группе, название группы, специализация группы, номер курса. Обязательные методы: конструктор по
 умолчанию на 15 студентов (предусмотреть автоматическую генерацию фамилий, имён, возрастов и других данных),
 конструктор с одним параметром типа int (задаётся произвольное количество студентов), конструктор с параметром
 типа Student[] (новая группа формируется на основании уже существующего массива студентов), конструктор с параметром
 типа Group (создаётся точная копия группы). Реализовать следующие методы: показ всех студентов группы
 (сначала - название и специализация группы, затем - порядковые номера, фамилии (в алфавитном порядке)
 и имена студентов), добавление студента в группу, редактирование данных о студенте и группе, перевод студента
 из одной группы в другую, отчисление всех не сдавших сессию студентов, отчисление одного самого неуспевающего студента.
 */
public class homeTask17_4 {

    public static void main(String[] args)
    {

    }

    public class Group
    {
        private Student[] students;
        private String nameGroup;
        private String spec;
        private int course;

        public Group(Student[] students) {
            this.students = students;
        }


    }

    public class StudentGenerator
    {

    }

}
