package ru.skypro;

public class Main {


    public static void main(String[] args) {
// Task 1
        namingTitle("1");
        chekingLeapYear(2022);

// Task 2
        namingTitle("2");
        installingApplications(1, 2013);

// Task 3
        namingTitle("3");
        int daysDelivery = calculateDeliveryDistance(95);
        System.out.println("�� �������� ����������� - " + daysDelivery + " ���." );

// Task 4

        namingTitle("4");
        serchingDuble("aabccddefgghiijjkk");

// Task 5

        namingTitle("5");
        int[] arr = {3, 2, 1, 6, 5};
        reverceArray(arr);



    }

    public static void namingTitle(String name) {
        System.out.println();
        System.out.println("___________________");
        System.out.println("������� " + name + ". ������.");

    }

    public static void chekingLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - ��� ���������� ���. ");
        } else {
            System.out.println(year + " - ��� �� ���������� ���. ");
        }
    }

    public static void installingApplications (int clientOs, int clientDeviceYear) {
        if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("�� ������ ���������� ������ ��� iOS �� ������: ");
        } else if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("�� ������ ���������� ����������� ������ ��� iOS �� ������: ");
        } else if (clientOs != 0 && clientDeviceYear >= 2015) {
            System.out.println("�� ������ ���������� ������ ��� Android �� ������:");
        } else  {
            System.out.println("�� ������ ���������� ����������� ������ ��� Android �� ������:");
        }

    }

    public static int calculateDeliveryDistance ( int deliveryDistance) {
        int days = 0;
        if (deliveryDistance < 20) {
            days = days + 1;
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            days = days + 2;
        }
        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            days = days + 3;
        }

        return days;
    }

    public static void serchingDuble(String duble) {
        System.out.println("����������� ������ - " + duble);
        for (int i = 0; i < duble.charAt(i)-1; i++) {
            if (duble.charAt(i) == duble.charAt(i+1)) {
                System.out.println("� ������ ���� �����, ������ ��������������� ������ - " + duble.charAt(i));
                break;
            } else {
                System.out.println("� ������ ��� ������");

            }
        }

    }

    public static void reverceArray (int[] arr) {
        System.out.println("�������� ������: ");
        for (int i = 0 ; i <= arr.length -1; i++ ) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("������������ ������: ");
        for (int i = arr.length - 1; i >= 0; i-- ) {
            System.out.print(arr[i] + " ");
        }

    }
}

