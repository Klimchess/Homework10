public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задача 1");
        //Напишите четыре строки:
        //С именем firstName — для хранения имени.
               // С именем middleName — для хранения отчества.
               // С именем lastName — для хранения фамилии.
               // С именем fullName — для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".
               // Выведите в консоль фразу: «ФИО сотрудника — …».
        //В качестве данных для задачи используйте "Ivanov Ivan Ivanovich".
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

    }
    public static void task2() {
        System.out.println("Задача 2");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }
    public static void task3() {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёныч";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}