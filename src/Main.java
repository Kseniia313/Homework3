public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }
    public static void task1 (){
            System.out.println("Задача1");
            int cherries = 350;
            System.out.println("Значение переменной " + " cherries " + " с типом " + " int " + "равно " + cherries);
            byte bananas = 120;
        System.out.println("Значение переменной " + " bananas " + "с типом " + " byte " + " равно " + bananas);
            short oranges = 100;
        System.out.println("Значение переменной " + " oranges " + " с типом " + " short " + " равно " + oranges);
            long strawberries = 500L;
        System.out.println("Значение переменной " + " strawberries " + " с типом " + " long " + " равно " + strawberries);
            float apples = 5.5f;
        System.out.println("Значение переменной " + " apples " + " с типом " + " float " + " равно " + apples);
            double pears = 10.5;
        System.out.println("Значение переменной " + " pears " + " с типом " + " double " + " равно " + pears);

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
            byte productivityForOneminute = 16/2;
            int productivityForTwentyminutes = productivityForOneminute*20;
            System.out.println("За 20 минут машина произвела " + productivityForTwentyminutes + " штук бутылок");
            int productivityForDay = productivityForTwentyminutes*3*24;
            System.out.println("За сутки машина произвела " + productivityForDay + " штук бутылок");
            int productivityForThreeDays = productivityForDay*3;
            System.out.println("За три дня машина произвела " + productivityForThreeDays + " штук бутылок");
            int productivityForOneMonth = productivityForThreeDays*10;
            System.out.println("За месяц машина произвела " + productivityForOneMonth + " штук бутылок");
        }
        public static void task5(){
            System.out.println("Задача 5");
            int totalColors = 120;
            int oneClassWhite = 2;
            int oneClassBrown = 4;
            int totalClasses = totalColors/(oneClassWhite+oneClassBrown);
            System.out.println("Всего в школе " + totalClasses + " классов");
            int totalWhiteColours = totalClasses*oneClassWhite;
            int totalBrownColours = totalClasses*oneClassBrown;
            System.out.println("В школе где " + totalClasses + " классов, " + "нужно " + totalWhiteColours + " банок белой краски и " + totalBrownColours + " банок коричневой краски ");
        }
        public static void task6(){
            System.out.println("Задача 6");
            int oneBanan = 80;
            int oneMilk  = 105;
            int oneIcecream = 100;
            int oneEgg = 70;
            int totalWeight = oneBanan*5+oneMilk*2+oneIcecream*2+oneEgg*4;
            System.out.println("Вес завтрака спортсмена составляет " + totalWeight + " грамм ");
        }

    }
