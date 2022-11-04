public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию для Android по ссылке");
                break;
        }
    }

    public static void task2() {
        int clientDeviceYear = 2015;
        int clientOS = 1;
        if (clientOS == 0 && clientDeviceYear == 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear == 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию для Android по ссылке");
        }
    }

    public static void task3() {
        int year = 2021;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else
            System.out.println(year + " год не является високосным");
    }

    public static void task4() {
        int deliveryDistance = 95;
        int day = 0;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней:" + (day + 1));
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней:" + (day + 2));
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней:" + (day + 3));
        } else {
            System.out.println("Доставки нету");
        }
    }
    public static void task5(){
        int monthYear = 12;
        switch (monthYear){
            case 1:
                System.out.println("Январь");
            case 2:
                System.out.println("Февраль");
            case 3:
                System.out.println("Март");
            case 4:
                System.out.println("Апрель");
            case 5:
                System.out.println("Май");
            case 6:
                System.out.println("Июнь");
            case 7:
                System.out.println("Июль");
            case 8:
                System.out.println("Август");
            case 9:
                System.out.println("Сентябрь");
            case 10:
                System.out.println("Октябрь");
            case 11:
                System.out.println("Ноябрь");
            case 12:
                System.out.println("Декабрь");
        }
    }
}
