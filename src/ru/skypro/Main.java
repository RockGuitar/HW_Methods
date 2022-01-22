package ru.skypro;

public class Main {
    //    Задание 1
    public static void leapYearCheck ( int year ) {
        boolean leapYearCheck = (year % 4 == 0) && ((year % 100 != 0) || year % 400 == 0);
        //True когда кратен 4 И (не кратен 100 ИЛИ кратен 400)
        if (leapYearCheck) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    //    Задание 2
    public static void osVersion ( int operationalSystem, int clientDeviceYear ) {
        boolean yearCheck = clientDeviceYear >= 2022;
        if (operationalSystem == 1 && yearCheck) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (operationalSystem == 1) {
            System.out.println("Установите lite-версию приложения для Android по ссылке");
        }
        if (operationalSystem == 0 && yearCheck) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (operationalSystem == 0) {
            System.out.println("Установите lite-версию приложения для iOS по ссылке");
        }
    }

    //    Задание 3
    public static int deliveryDaysAmount ( float deliveryDistance ) {
        int deliveryDays = 0;
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays += 1;
        } else if (deliveryDistance > 60) {
            deliveryDays += 2;
        }
        return deliveryDays;
    }

    //    Задание 4
    public static void doublesCheck ( String sortedString ) {
        char[] sortedStringArray = sortedString.toCharArray();
        boolean doublesCheckSuccess = true;
        for (int i = 0; i < sortedStringArray.length; i++) {
            for (int ii = i + 1; ii < sortedStringArray.length; ii++) {
                boolean doublesChecker = sortedStringArray[i] == sortedStringArray[ii];
                if (doublesChecker) {
                    System.out.println("Символ " + sortedStringArray[i] + " продублирован в строке " +
                            sortedString + "! Остальные символы проверять нет смысла.");
                    doublesCheckSuccess = false;
                    break;
                }
            }
            if (!doublesCheckSuccess) {
                break;
            }
        }
        if (doublesCheckSuccess) {
            System.out.println("В строке " + sortedString + " нет дублей.");
        }
    }

    //    Задание 5
    public static void reverseMassive ( int[] massive ) {
        int[] reversedMassive = new int[massive.length];
        for (int i = massive.length - 1, j = 0; i > -1; i--, j++) {
            reversedMassive[j] = massive[i];
            System.out.print(reversedMassive[j] + " ");
        }
    }
    public static void main(String[] args) {
//        К заданию 1
        leapYearCheck(2022);
//        К заданию 2
        osVersion(0,2020);
//        К заданию 3
        System.out.println("Потребуется дней: " + deliveryDaysAmount(21));
//        К заданию 4
        String inputString = "aabccddefgghiijjkk";
        doublesCheck(inputString);
//        К заданию 5
        int[] numbers = {3, 2, 1, 6, 5};
        reverseMassive(numbers);
        }
    }
