//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Задача 1");
        int clientOs = 1;
        if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOs ==0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        System.out.println("Задача 2");
        int os = 1;
        int clientDeviceYear = 2015;
        if (os == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (os ==0 && clientDeviceYear >=2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if (os == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else if (os == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (os > 3) {
            System.out.println("Ошибка при введении данных");
        }
        System.out.println("Задача 3");
        int year = 2021;
        if (year > 1585 && ((year % 4 == 0 && year % 100 != 0)|| year % 400 == 0)) {
            System.out.println( year + "год является високосным.");
        }else {
            System.out.println( year + "год не является високосным.");
        }
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println( "Потребуется дней: " + 1);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println( "Потребуется дней: " + 2);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println( "Потребуется дней: " + 3);
        } else {
            System.out.println( "Доставки нет");
        }
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12 :
            case 1 :
            case 2 :
                System.out.println( "Зима.");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Весна.");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println( "Лето.");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println( "Осень.");
                break;
            default:
                System.out.println( "Неверный номер");
        }

    }
}