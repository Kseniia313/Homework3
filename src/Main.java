import java.util.Locale;

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
    public static void task1 (){
            System.out.println("Задача1");
            int cherries = 350;
            System.out.println("Значение переменной cherries с типом int равно " + cherries);
            byte bananas = 120;
        System.out.println("Значение переменной bananas с типом byte равно "+ bananas);
            short oranges = 10;
        System.out.println("Значение переменной oranges с типом short равно " + oranges);
            long strawberries = 5_000_000L;
        System.out.println("Значение переменной strawberries с типом long равно " + strawberries);
            float apples = 5.55555f;
        System.out.println("Значение переменной apples с типом float равно " + apples);
            double pears = 10.55678;
        System.out.println("Значение переменной pears с типом double равно " + pears);

        }
        public static void task2(){
        System.out.println("Задача 2");
           double a = 27.12;
           long b = 987678965549L;
           float c = 2.786f;
           int d = 569;
           short e = -159;
           int f = 27897;
           byte g = 67;
        }
        public static void task3(){
            System.out.println("Задача 3");
        byte studentsLP = 23;
        short studentsAS = 27;
        int studentsEA = 30;
        int totalPapers = 480;
        int allStudents = studentsLP + studentsAS + studentsEA;
        long paperForOneStudent = totalPapers/allStudents;
            System.out.println("Всего " + allStudents + " учеников");
            System.out.println("На каждого ученика рассчитано " + paperForOneStudent + " листов бумаги ");

        }
        public static void task4(){
            System.out.println("Задача 4");
            System.out.println("Производительность машины 16 бутылок за 2 минуты");
            byte productivityPerOneminute = 16/2;
            int productivityPerTwentyminutes = productivityPerOneminute*20;
            System.out.println("За 20 минут машина произвела " + productivityPerTwentyminutes + " штук бутылок");
            int productivityPerHour = productivityPerTwentyminutes*3;
            int productivityPerDay = productivityPerHour*24;
            System.out.println("За сутки машина произвела " + productivityPerDay + " штук бутылок");
            int productivityPerThreeDays = productivityPerDay*3;
            System.out.println("За три дня машина произвела " + productivityPerThreeDays + " штук бутылок");
            int productivityPerOneMonth = productivityPerThreeDays*10;
            System.out.println("За месяц машина произвела " + productivityPerOneMonth + " штук бутылок");
        }
        public static void task5(){
            System.out.println("Задача 5");
            byte totalColors = 120;
            byte oneClassWhite = 2;
            byte oneClassBrown = 4;
            int totalClasses = (totalColors/(oneClassWhite+oneClassBrown));
            System.out.println("Всего в школе " + totalClasses + " классов");
            int totalWhiteColours = totalClasses*oneClassWhite;
            int totalBrownColours = totalClasses*oneClassBrown;
            System.out.println("В школе где " + totalClasses + " классов, " + "нужно " + totalWhiteColours + " банок белой краски и " + totalBrownColours + " банок коричневой краски ");
        }
        public static void task6(){
            System.out.println("Задача 6");
            byte oneBanan = 80;
            byte oneMilk  = 105;
            byte oneIcecream = 100;
            byte oneEgg = 70;
            int totalWeightGr = oneBanan*5+oneMilk*2+oneIcecream*2+oneEgg*4;
            System.out.println("Вес завтрака спортсмена составляет " + totalWeightGr + " грамм ");
            double totalWeightKg = totalWeightGr/1000;
            System.out.println("Вес завтрака спортсмена составляет " + totalWeightKg + " килограмм ");
        }
        public static void task7(){
            System.out.println(" Задача 7 ");
            int needWeightForFit = 7_000;
            int minLooseWeight = 250;
            int maxLooseWeight = 500;
            int needMaxDays = needWeightForFit/minLooseWeight;
            int needMinDays = needWeightForFit/maxLooseWeight;
            System.out.println(" При диете 250 грамм в день спортсмену понадобится " + needMaxDays + " дней ");
            System.out.println(" При диете 500 грамм в день спортсмену понадобится " + needMinDays + " дней ");
            double looseWeightAverage =  (minLooseWeight+maxLooseWeight)/2D;
            System.out.println( " При среднем темпе похудения в день нужно терять " + looseWeightAverage + " грамм ");
            double needDays3 = needWeightForFit/looseWeightAverage;
            System.out.printf(Locale.US, " Чтобы похудеть при среднем темпе, спортсмену понадобится %.2f%n дней",needDays3);
        }
public static void task8(){
    System.out.println(" Задача 8 ");
    int salaryMasha = 67760;
    int salaryDenis = 83690;
    int salaryKristina = 76230;
    System.out.println( " Заработная плата Маши " + salaryMasha + " рублей ");
    System.out.println( " Заработная плата Дениса " + salaryDenis + " рублей ");
    System.out.println( " Заработная плата Кристины " + salaryKristina + " рублей ");
    int salaryMashaInYear = salaryMasha*12;
    int salaryDenisInYear = salaryDenis*12;
    int salaryKristinaInYear = salaryKristina*12;
    float indexSalary = 1.1f;
    float salaryMashaAfterIncreasing = 67760*indexSalary;
    float salaryDenisAfterIncreasing = 83690*indexSalary;
    float salaryKristinaAfterIncreasing = 76230*indexSalary;
    float salaryMashaAfterIncreasingInYear = salaryMashaAfterIncreasing*12;
    float salaryDenisAfterIncreasingInYear = salaryDenisAfterIncreasing*12;
    float salaryKristinaAfterIncreasingInYear = salaryKristinaAfterIncreasing*12;
    float differenceIncomeMasha = salaryMashaAfterIncreasingInYear-salaryMashaInYear;
    float differenceIncomeDenis = salaryDenisAfterIncreasingInYear-salaryDenisInYear;
    float differenceIncomeKristina = salaryKristinaAfterIncreasingInYear-salaryKristinaInYear;
    System.out.println( " После повышения Маша получает " + salaryMashaAfterIncreasing + " рублей. " + " Годовой доход вырос на " + differenceIncomeMasha + " рублей ");
    System.out.println( " После повышения Денис получает " + salaryDenisAfterIncreasing + " рублей. " + " Годовой доход вырос на " + differenceIncomeDenis + " рублей ");
    System.out.println( " После повышения Кристина получает " + salaryKristinaAfterIncreasing + " рублей. " + " Годовой доход вырос на " + differenceIncomeKristina + " рублей ");



}

    }
