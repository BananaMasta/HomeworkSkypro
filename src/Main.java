import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        task1();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        int learnValue = 2885;
        System.out.println("Значение переменной learnValue с типом int равно " + learnValue);
        byte learnValue1 = 23;
        System.out.println("Значение переменной learnValue1 с типом byte равно " + learnValue1);
        short learnValue2 = 124;
        System.out.println("Значение переменной learnValue2 с типом short равно " + learnValue2);
        long learnValue3 = 233;
        System.out.println("Значение переменной learnValue3 с типом long равно " + learnValue3);
        float learnValue4 = 34.234F;
        System.out.println("Значение переменной learnValue4 с типом float равно " + learnValue4);
        double learnValue5 = 34.2;
        System.out.println("Значение переменной learnValue5 с типом double равно " + learnValue5);
    }

    public static void task2() {
        float valueDouble = 27.12F;
        long valueLong = 987678965549L;
        double valueFloat = 2.786;
        short valueShort = 569;
        short valueShort1 = -159;
        short valueShort2 = 27897;
        byte valueByte = 67;
    }

    public static void task3() {
        byte firstClass = 23;
        byte secondClass = 27;
        byte thirdClass = 30;
        int allStudent = firstClass + secondClass + thirdClass;
        int sheets = 480 / allStudent;
        System.out.println("На каждого ученика рассчитано " + sheets + " листов бумаги");
    }

    public static void task4() {
        byte oneBottleInMinutes = 16 / 2;
        short bottlesForTwentyMinutes = (short) (oneBottleInMinutes * 20);
        System.out.println("За 20 минут машина произвела " + bottlesForTwentyMinutes + " штук бутылок");
        short bottlesForOneDay = (short) (oneBottleInMinutes * 1440);
        System.out.println("За один день машина произвела " + bottlesForOneDay + " штук бутылок");
        int bottlesForThreeDays = oneBottleInMinutes * 4320;
        System.out.println("За три дня машина произвела " + bottlesForThreeDays + " штук бутылок");
        int bottlesForOneMonth = oneBottleInMinutes * 43200;
        System.out.println("За один месяц машина произвела " + bottlesForOneMonth + " штук бутылок");
    }

    public static void task5() {
        byte classRooms = 120 / (2 + 4);
        byte whitePaint = (byte) (classRooms / 2);
        byte brownPaint = (byte) (classRooms / 4);
        System.out.println("В школе, где " + classRooms + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");
    }

    public static void task6() {
        short banana = 5 * 80;
        double milkGramm = (double) 105 / 100;
        short milk = (short) (milkGramm * 200);
        short iceCream = 2 * 100;
        short egg = 4 * 70;
        short breakfastWeight = (short) (banana + milk + iceCream + egg);
        float grammToKilogram = breakfastWeight / 1000F;
        System.out.println("Завтрак в граммах: " + breakfastWeight + " - Завтрак в килограммах: " + grammToKilogram);
    }

    public static void task7() {
        float firstRation = 250 / 1000F;
        float secondRation = 500 / 1000F;
        byte ifFirstRation = (byte) (7 / firstRation);
        System.out.println("Если спортсмен будет худеть по 250 грамм в день, ему потребуется " + ifFirstRation + " дней");
        byte ifSecondRation = (byte) (7 / secondRation);
        System.out.println("Если спортсмен будет худеть по 500 грамм в день, ему потребуется " + ifSecondRation + " дней");
        byte middleDay = (byte) ((ifFirstRation + ifSecondRation) / 2);
        System.out.println("В среднем, ему потребуется " + middleDay + " дней");
    }

    public static void task8() {
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        int mashaNewSalary = (mashaSalary / 100) * 10 + mashaSalary;
        int denisNewSalary = (denisSalary / 100) * 10 + denisSalary;
        int kristinaNewSalary = (kristinaSalary / 100) * 10 + kristinaSalary;
        int yearlyDifferenceM = (mashaNewSalary * 12) - (mashaSalary * 12);
        int yearlyDifferenceD = (denisNewSalary * 12) - (denisSalary * 12);
        int yearlyDifferenceK = (kristinaNewSalary * 12) - (kristinaSalary * 12);
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + yearlyDifferenceM + " рублей");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + yearlyDifferenceD + " рублей");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + yearlyDifferenceK + " рублей");

    }
}