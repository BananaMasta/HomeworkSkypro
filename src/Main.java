public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }


    public static void task1() {
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("task1 " + dog + ", " + cat + "," + paper);
    }

    public static void task2() {
        var dog = 8 + 4;
        var cat = 3.6 + 4;
        var paper = 763789 + 4;
        System.out.println("task2 " + dog + ", " + cat + ", " + paper);
    }

    public static void task3() {
        var dog = 8 - 3.5;
        var cat = 3.6 - 1.6;
        var paper = 763789 - 7639;
        System.out.println("task3 " + dog + ", " + cat + ", " + paper);
    }

    public static void task4() {
        var friend = 19;
        System.out.println("task 4-1: " + friend);
        friend = friend + 2;
        System.out.println("task 4-2: " + friend);
        friend = friend / 7;
        System.out.println("task 4-3: " + friend);
    }

    public static void task5() {
        var frog = 3.5;
        System.out.println("task 5-1: " + frog);
        frog = frog * 10;
        System.out.println("task 5-2: " + frog);
        frog = frog / 3.5;
        System.out.println("task 5-3: " + frog);
        frog = frog + 4;
        System.out.println("task 5-4: " + frog);
    }

    public static void task6() {
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var sum = firstBoxer + secondBoxer;
        var dif = secondBoxer - firstBoxer;
        System.out.println("task 6-sum: " + sum);
        System.out.println("task 6-dif: " + dif);
    }

    public static void task7() {
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var dif = secondBoxer - firstBoxer;
        var del = firstBoxer % secondBoxer;
        System.out.println("task 6-sum: " + dif);
        System.out.println("task 6-dif: " + del);
    }

    public static void task8() {
        var workTime = 640;
        var normalTime = 8;
        var workers = workTime / normalTime;
        System.out.println("Всего работников в компании - " + workers + " человек");
        var workersIf = workers + 94;
        var newTime = normalTime * workersIf;
        System.out.println("Если в компании работе - " + workersIf + " человек, то всего " + newTime + " часов работы может быть поделено между сотрудниками");
    }
}