public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        String firstName = "Kirill";
        String middleName = "Semenikhin";
        String lastName = "Nikolaevich";
        String fullName = middleName + " " + firstName + " " + lastName;
        System.out.println("ФИО сотрудника — " + fullName);
    }

    public static void task2() {
        System.out.println("Задача 2");
        String firstName = "ivan";
        String middleName = "ivanov";
        String lastName = "ivanovich";
        String fullName = middleName + " " + firstName + " " + lastName;
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }

    public static void task3() {
        System.out.println("Задача 3");
        String firstName = "Семён";
        firstName = firstName.replace("ё", "е");
        String middleName = "Иванов";
        middleName = middleName.replace("ё", "е");
        String lastName = "Семёнович";
        lastName = lastName.replace("ё", "е");
        String fullName = middleName + " " + firstName + " " + lastName;
        System.out.println("ФИО сотрудника — " + fullName);
    }
}