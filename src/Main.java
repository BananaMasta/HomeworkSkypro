public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        int age = 16;
        if (age >= 18) {
            System.out.println("Твой возраст: " + age + ", можешь войти");
        } else {
            System.out.println("Твой возраст: " + age + ", что является недопустимым, так что уходи");
        }
    }

    public static void task2() {
        int temperature = 4;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно не надевать шапку");
        }
    }

    public static void task3() {
        int speed = 59;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " штраф плати");
        } else {
            System.out.println("Если скорость " + speed + "штраф не плати");
        }
    }

    public static void task4() {
        int age = 34;
        if (age == 2 && age < 6) {
            System.out.println("Если возраст равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age == 7 && age < 18) {
            System.out.println("Если возраст равен " + age + ", то ему нужно ходить в школу");
        } else if (age > 18 && age < 24) {
            System.out.println("Если возраст равен " + age + ", то ему нужно ходить в универ");
        } else {
            System.out.println("Если возраст равен " + age + ", то ему нужно ходить на работу");
        }
    }

    public static void task5() {
        int age = 13;
        boolean parent = true;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + " то ему нельзя кататься");
        } else if (age > 5 && age < 14) {
            if (parent == true) {
                System.out.println("Если возраст ребенка равен " + age + " то ему можно кататься, так как с ним есть взрослый");
            } else {
                System.out.println("Если возраст ребенка равен " + age + " то ему нельзя кататься, так как с ним нету взрослого");
            }
        } else if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + " то ему можно кататься");
        }
    }

    public static void task6() {
        int occupiedSeats = 60;
        if (occupiedSeats < 60) {
            System.out.println("Есть сидячие и стоячие");
        } else if (occupiedSeats >= 102) {
            System.out.println("Мест нет");
        } else {
            System.out.println("Остались только стоячие");
        }
    }

    public static void task7() {
        int one = 15;
        int two = 12;
        int three = 20;
        if (one > two && one > three) {
            System.out.println(one + " первое значение больше чем второе и третье");
        } else if (one < two && two > three) {
            System.out.println(two + " второе значение больше первого и третьего");
        } else {
            System.out.println(three + " третье значение больше первого и второго");
        }
    }
}