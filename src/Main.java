public class Main {
    public static void main(String[] args) {
      // задание 1:
        int dog = 7;
        byte cat = 1;
        short elephant = 4;
        long mouse = 300L;
        double weightSugar = 15.5;
        float weightCat = 7.5f;
        char bar = 35;
       // boolean dogIsAdult = dog > 7;

        //System.out.println(bar);


        //  Задание 2:
         double boxer1 = 78.2;
         double boxer2 = 82.7;
         double weightAllBoxers = boxer1 + boxer2;
         double weightDifference = boxer2 - boxer1;
        System.out.println(" Общий вес боксеров " + weightAllBoxers);
        System.out.println(" Разница в вее боксеров "+ weightDifference);


        // Задание 3:

        double weightBananas = 5 * 80;
        double weightMilk = 200 * 1.05;
        double weightIceCream = 2 * 100;
        double weightEgg = 4 * 0.7;
        double weightAllBreakfast = weightBananas + weightMilk + weightIceCream + weightEgg;
        int grPerKg = 1000;
        double weightKg = weightAllBreakfast / grPerKg;
        System.out.println( " Общий вес завтрака спотрсмена соствил : " + weightKg + " кг");


        // Задание 4:

        int weightSportsmen = 7000;  // перевес спортсмена
        int weightDay250 = 250;
        int weightDay500 = 500;
        int scoreDay250 = weightSportsmen / weightDay250;
        int scoreDay500 = weightSportsmen / weightDay500;
        int averageValue = ( scoreDay250 + scoreDay500) / 2;
        System.out.println( " При сбросе в весе 250 грам в день, спортсмену понадобиться: " + scoreDay250);
        System.out.println( " При сбросе в весе 500 грам в день, спортсмену понадобиться: " + scoreDay500);
        System.out.println( " Среднее количесво дней спортсмену понадобиться: " + averageValue);


        // Задание 5:

        double MashaMoneyMonth = 67760;                                  // зарплата в месяц
        double MashaMoneyYear = MashaMoneyMonth * 12;                    // зарплата в год без повышения
        double MashaMoneyMonthUp = MashaMoneyMonth * 1.1;                // зарплата в месяц после повышения
        double MashaMoneyYearUp = MashaMoneyMonthUp * 12;                // зарплата в год после повышения на 10 %
        double MashaDifferenceYear = MashaMoneyYearUp - MashaMoneyYear;  // разница в год после повышения
        System.out.println("Маша теперь получает " + MashaMoneyMonthUp + " рублей. Годовой доход вырос на "
                + MashaDifferenceYear + " рублей");

        double DenisMoneyMonth = 83690;                                  // зарплата в месяц
        double DenisMoneyYear = DenisMoneyMonth * 12;                    // зарплата в год без повышения
        double DenisMoneyMonthUp = DenisMoneyMonth * 1.1;                // зарплата в месяц после повышения
        double DenisMoneyYearUp = DenisMoneyMonthUp * 12;                // зарплата в год после повышения на 10 %
        double DenisDifferenceYear = DenisMoneyYearUp - DenisMoneyYear;  // разница в год после повышения
        System.out.println("Денис теперь получает " + DenisMoneyMonthUp + " рублей. Годовой доход вырос на "
                + DenisDifferenceYear + " рублей");


        double KristinaMoneyMonth = 76230;                                        // зарплата в месяц
        double KristinaMoneyYear = KristinaMoneyMonth * 12;                       // зарплата в год без повышения
        double KristinaMoneyMonthUp = KristinaMoneyMonth * 1.1;                   // зарплата в месяц после повышения
        double KristinaMoneyYearUp = KristinaMoneyMonthUp * 12;                   // зарплата в год после повышения на 10 %
        double KristinaDifferenceYear = KristinaMoneyYearUp - KristinaMoneyYear;  // разница в год после повышения
        System.out.println("Маша теперь получает " + KristinaMoneyMonthUp + " рублей. Годовой доход вырос на "
                + KristinaDifferenceYear + " рублей");
















    }


}