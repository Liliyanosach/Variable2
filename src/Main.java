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
    private static void task1() {
        System.out.println("Задача 1");
         byte a = 1;
         short b = 218;
         int c = 32800;
         long d = 135000L;
         float f = 1.5f;
         double g = 34.3d;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной g с типом double равно " + g);
    }
    private static void task2(){
        System.out.println("Задача 2");
         float a = 27.12f;
         long b = 987678965549L;
         float c = 2.786f;
         short d = 569;
         short e = -159;
         short f = 27897;
         byte g = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }

    private static void task3(){
        System.out.println("задача 3");
        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        short buyPaper = 480;

        int totalStudent = teacher1 + teacher2 + teacher3;
        int paperForOne = buyPaper / totalStudent;
        System.out.println("На каждого ученика рассчитано " + paperForOne + " листов бумаги");

    }

    private static void task4(){
        System.out.println("Задача 4");
        byte productivityCar = 16;
        byte timeCar = 2;

        int productCarMinutes = productivityCar / timeCar;
        int productCar20 = productCarMinutes * 20;
        System.out.println("За 20 минут машина произвела " + productCar20 + " штук бутылок");

        int productCarDay = productCarMinutes * 1440;
        System.out.println("За сутки  машина произвела " + productCarDay + " штук бутылок");

        int minutes3Days = 3 * 1440;
        int productCarThreeDay = productCarMinutes * minutes3Days;
        System.out.println("За 3 дня машина произвела " + productCarThreeDay + " штук бутылок");

        int minutesMonth = 30 * 1440;
        int productCarMonth = minutesMonth * productCarMinutes;
        System.out.println("За месяц машина произвела " + productCarMonth + " штук бутылок");

        //Рассчитывайте продолжительность работы машины в том случае, если она работает без перерыва заданный промежуток времени.

    }

    private static void task5(){
        System.out.println("Задача 5");
        byte repairSchool = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;

        int totalPaint = whitePaint + brownPaint;
        int totalClass = repairSchool / totalPaint;
        int totalWhite = totalClass * whitePaint;
        int totalBrown = totalClass * brownPaint;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhite + " банок белой краски и "
                + totalBrown + " банок коричневой краски.");
    }
    private static void task6(){
        System.out.println("Задача 6");
        byte bananas = 5;
        short milk = 2;
        byte iceCream = 2;
        byte egg = 4;
        int bananasGram = bananas * 80;
        int milkGram = milk * 105;
        int iceCreamGram = iceCream * 100;
        int eddGram = egg * 70;
        int totalGram = bananasGram +milkGram +iceCreamGram +eddGram;
        float kg = 1000f;
        float totalKg = totalGram / kg;
        System.out.println("Вес завтрака " + totalGram + " грамм");
        System.out.println("Вес завтрака " + totalKg + " килограмм");
    }

    private static void task7(){
        System.out.println("Задача 7");
        byte weight = 7;
        int weightGram = weight * 1000;
        int loseWeightMin = 250;
        int loseWeightMax = 500;
        double dayLoseWeight = (double) weightGram / loseWeightMin;
        double dayLoseWeightBig = (double) weightGram / loseWeightMax;
        System.out.println("Спортсмену потребуется " + dayLoseWeight + " дней, при потере 250 грамм в день");
        System.out.println("Спортсмену потребуется " + dayLoseWeightBig + " дней, при потере 500 грамм в день");
        double average = 2d;
        double totalDays = loseWeightMin +loseWeightMax;
        double averageDays = totalDays / average;
        double averageDay = weightGram / averageDays;
        System.out.println("Спортсмену в среднем понадобится " + averageDay + " день");
    }

    private static void task8(){
        System.out.println("Задача 8");
        int salaryMasha = 67_760;
        int salaryDenis = 83_690;
        int salaryCris = 76_230;

        int salaryYearMasha = salaryMasha * 12;
        int salaryYearDenis = salaryDenis * 12;
        int salaryYearCris = salaryCris * 12;

        int incSalaryMasha = salaryMasha / 100 * 10;
        int incSalaryDenis = salaryDenis / 100 * 10;
        int incSalaryCris = salaryCris / 100 * 10;

        int newSalaryMasha = salaryMasha + incSalaryMasha;
        int newSalaryDenis = salaryDenis + incSalaryDenis;
        int newSalaryCris = salaryCris + incSalaryCris;

        int totalSalaryYear = salaryYearCris + salaryYearDenis + salaryYearMasha;

        int totalNewSalaryYearM = newSalaryMasha * 12;
        int totalNewSalaryYearD = newSalaryDenis * 12;
        int totalNewSalaryYearC = newSalaryCris * 12;

        int totalNewSalaryYear = totalNewSalaryYearC + totalNewSalaryYearD + totalNewSalaryYearM;

        int dif = totalNewSalaryYear - totalSalaryYear;

        int difYearM = totalNewSalaryYearM - salaryYearMasha;
        int difYearD = totalNewSalaryYearD - salaryYearDenis;
        int difYearC = totalNewSalaryYearC - salaryYearCris;

        System.out.println("Новая зарплата Маши " + newSalaryMasha);
        System.out.println("Новая зарплата Дениса " + newSalaryDenis);
        System.out.println("Новая зарплата Кристины " + newSalaryCris);

        System.out.println("Годовая зарплата у сотруднитков была " + totalSalaryYear);
        System.out.println("Годовая зарплата стала " + totalNewSalaryYear);
        System.out.println("Разница " + dif);

        System.out.println("Зарплата Маши увеличилась на " + incSalaryMasha + " рублей");
        System.out.println("Зарплата Дениса увеличилась на " + incSalaryDenis + " рублей");
        System.out.println("Зарплата Кристины увеличилась на " + incSalaryCris + " рублей");

        System.out.println("Разница в зарплате в год у Маши " + difYearM);
        System.out.println("Разница в зарплате в год у Дениса " + difYearD);
        System.out.println("Разница в зарплате в год у Кристины " + difYearC);


















    }
}