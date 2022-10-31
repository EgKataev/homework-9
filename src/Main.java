public class Main {
    public static void main(String[] args) {
        System.out.println("Лекция с Ильёй");
        String phone = "+7 999-000-00-00";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Это шо за длинномер???");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Это тож шо за коротышка???");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Вообще иноАгент ");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79990000000";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неуспех))))");
        }


        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        String fullName = String.join(" ", lastName, firstName, middleName);
        System.out.println("ФИО сотрудника- " + fullName);


        System.out.println("Задание 2");
        String fullName1 = "Ivanov Ivan Ivanovich";
        String upperFullName = fullName1.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + upperFullName);


        System.out.println("Задание 3");
        String fullName2 = "Иванов Семён Семёнович";
        String fixedFullName = fullName2.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника- " + fixedFullName);
    }
}
