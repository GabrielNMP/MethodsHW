package ru.skypro;

public class Main {


    public static void main(String[] args) {
// Task 1
        namingTitle("1");
        chekingLeapYear(2022);

// Task 2
        namingTitle("2");
        installingApplications(0, 2010);

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
        if (year % 4 == 0 && year / 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - ��� ���������� ���. ");
        } else {
            System.out.println(year + " - ��� �� ���������� ���. ");
        }
    }

    public static void installingApplications (int clientOs, int clientDeviceYear) {
        if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("�� ������ ���������� ������ ��� iOS �� ������: ");
        }
        if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("�� ������ ���������� ����������� ������ ��� iOS �� ������: ");
        }
        if (clientOs != 0 && clientDeviceYear >= 2015) {
            System.out.println("�� ������ ���������� ������ ��� Android �� ������:");
        }
        if (clientOs != 0 && clientDeviceYear < 2015) {
            System.out.println("�� ������ ���������� ����������� ������ ��� Android �� ������:");
        }

    }

    public static int calculateDeliveryDistance ( int deliveryDistance) {
        int days = 0;
        //int daysDelivery = 0;
        if (deliveryDistance < 20) {
            days = days + 1;
            //System.out.println("�� �������� ����������� " + daysDelivery + " ����.");
        } else {
            if (deliveryDistance < 60) {
                days = days + 2;
                //System.out.println("�� �������� ����������� " + daysDelivery + " ���.");

            } else {
                days = days + 3;
                //System.out.println("�� �������� ����������� " + daysDelivery + " ���."); }
            }
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
                break;
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

