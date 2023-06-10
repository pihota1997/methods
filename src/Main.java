import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int os1 = 0;
        int year1 = 2023;

        printVersionType(os1, year1);

        task3();

        checkYearLeap(LocalDate.now().getYear());
    }

    public static void printVersionType(int clientOs, int clientDeviceYear) {

        int iOs = 0;
        int android = 1;
        int currentYear = LocalDate.now().getYear();

        if (clientOs == iOs) {
            System.out.println("Пользователь пользуеться IOS");
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установка приложения");
            }
        } else if (clientOs == android) {
            System.out.println("Пользователь пользуеться Android");
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установка приложения");
            }
        } else {
            System.out.println("ОС не поддерживается");
        }
    }


    public static void task3() {

        int days = calculateDeliveryDays(65);

        if (days > 0) {
            System.out.println("Доставка займет " + days);
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static int calculateDeliveryDays(int distance) {
        int deliveryDays;

        if (distance < 20) {
            deliveryDays = 1;
        } else if (distance < 60) {
            deliveryDays = 2;
        } else if (distance < 100) {
            deliveryDays = 3;
        } else {
            deliveryDays = -1;
        }

        return deliveryDays;
    }

    public static void checkYearLeap(int year) {

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Год высокостный");
        } else {
            System.out.println("Не высокостный");
        }
    }
}