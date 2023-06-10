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
            System.out.println("������������ ����������� IOS");
            if (clientDeviceYear < currentYear) {
                System.out.println("���������� ����������� ������ ���������� ��� iOS �� ������");
            } else {
                System.out.println("��������� ����������");
            }
        } else if (clientOs == android) {
            System.out.println("������������ ����������� Android");
            if (clientDeviceYear < currentYear) {
                System.out.println("���������� ����������� ������ ���������� ��� Android �� ������");
            } else {
                System.out.println("��������� ����������");
            }
        } else {
            System.out.println("�� �� ��������������");
        }
    }


    public static void task3() {

        int days = calculateDeliveryDays(65);

        if (days > 0) {
            System.out.println("�������� ������ " + days);
        } else {
            System.out.println("�������� ���");
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
            System.out.println("��� �����������");
        } else {
            System.out.println("�� �����������");
        }
    }
}