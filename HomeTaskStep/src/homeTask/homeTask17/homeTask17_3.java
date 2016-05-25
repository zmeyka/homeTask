package homeTask.homeTask17;

import java.util.*;

/**
 3.	Реализовать класс Student, который содержит поля для хранения фамилии, имени, отчества, даты рождения,
 домашнего адреса, телефонного номера. Также за каждым студентом закреплены 3 массива оценок – зачёты, курсовые работы,
 экзамены. Обязательные методы: 2-3 версии конструктора с параметрами, геттеры и сеттеры для всех полей, показ всех
 данных о студенте.
 */
public class homeTask17_3 {

    public static void main(String[] args)
    {
        Student st1 = new Student("Vasia", "Vaskov", "Vaskovich", "street12", "0984765455", new Date(20122010));

        System.out.println(st1);
    }


    public static class Student
    {
        public String lastName; //
        public String firstName; //
        public String secondName; //
        public String address; //
        public String phoneNumber; //
        public Date bearthday; //
        public boolean[] evaluationTest; //
        public int[] evaluationWork; //
        public int[] evaluatioExam; //

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getSecondName() {
            return secondName;
        }

        public void setSecondName(String secondName) {
            this.secondName = secondName;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public Date getBearthday() {
            return bearthday;
        }

        public void setBearthday(Date bearthday) {
            this.bearthday = bearthday;
        }

        public boolean[] getEvaluationTest() {
            return evaluationTest;
        }

        public void setEvaluationTest(boolean[] evaluationTest) {
            this.evaluationTest = evaluationTest;
        }

        public int[] getEvaluationWork() {
            return evaluationWork;
        }

        public void setEvaluationWork(int[] evaluationWork) {
            this.evaluationWork = evaluationWork;
        }


        public int[] getEvaluatioExam() {
            return evaluatioExam;
        }

        public void setEvaluatioExam(int[] evaluatioExam) {
            this.evaluatioExam = evaluatioExam;
        }


        public Student(String firstName, String lastName, String secondName, String address, String phoneNumber, Date bearthday) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.secondName = secondName;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.bearthday = bearthday;
        }

        public Student(String firstName, String lastName, String secondName, int[] evaluatioExam, int[] evaluationWork, boolean[] evaluationTest) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.secondName = secondName;
            this.evaluatioExam = evaluatioExam;
            this.evaluationWork = evaluationWork;
            this.evaluationTest = evaluationTest;
        }

        public Student(String firstName, String lastName, String secondName, String address, String phoneNumber, Date bearthday, boolean[] evaluationTest, int[] evaluationWork, int[] evaluatioExam) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.secondName = secondName;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.bearthday = bearthday;
            this.evaluationTest = evaluationTest;
            this.evaluationWork = evaluationWork;
            this.evaluatioExam = evaluatioExam;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", secondName='" + secondName + '\'' +
                    ", address='" + address + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    ", bearthday=" + bearthday +
                    ", evaluationTest=" + Arrays.toString(evaluationTest) +
                    ", evaluationWork=" + Arrays.toString(evaluationWork) +
                    ", evaluatioExam=" + Arrays.toString(evaluatioExam) +
                    '}';
        }
    }
}
