public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int numberOne = 524;
        System.out.println("Значение переменной numberOne с типом int равно "+ numberOne);
        byte numberTwo = -125;
        System.out.println("Значение переменной numberTwo с типом byte равно "+ numberTwo);
        short numberThree = 3256;
        System.out.println("Значение переменной numberThree с типом short равно "+ numberThree);
        long numberFour = 4_596_885_156L;
        System.out.println("Значение переменной numberFour с типом long равно "+ numberFour);
        float numberFive = 154.045F;
        System.out.println("Значение переменной numberFive с типом float равно "+ numberFive);
        double numberSix = 154.0452681;
        System.out.println("Значение переменной numberSix с типом double равно "+ numberSix);

        //Задача 2
        float variablesOne = 27.12F;
        long variablesTwo = 987_678_965_549L;
        double variablesThree = 2.786;
        boolean variablesFour = false;
        char variablesFive = 569;
        short variablesSix = -159;
        int variablesSeven = 27897;
        byte variablesEight = 67;

        //Задача 3
        System.out.println("Задача 3");
        byte studentsLudmila = 23;
        byte studentsAnna = 27;
        byte studentsEkaterina = 30;
        short zakupka = 480;
        System.out.println("На каждого ученика рассчитано " + zakupka / (studentsLudmila + studentsAnna + studentsEkaterina) + " листов бумаги");

        //Задача 4
        System.out.println("Задача 4");
        byte bottles = 16;
        byte time = 2;
        int productivity = bottles / time;
        int variables1 = 20;
        System.out.println("За " + variables1 + " минут машина произвела бутылок " + productivity * variables1 + " штук");
        short minutesDay = 24 * 60;
        System.out.println("За " + minutesDay + " минут машина произвела бутылок " + productivity * minutesDay + " штук");
        int threeDay = minutesDay * 3;
        System.out.println("За " + threeDay + " минут машина произвела бутылок " + productivity * threeDay + " штук");
        int month = minutesDay * 30;
        System.out.println("За " + month + " минут машина произвела бутылок " + productivity * month + " штук");

        //Задача 5
        System.out.println("Задача 5");
        int totalCans = 120;
        int whiteColor = 2;
        int brownColor = 4;
        int totalClasses = totalCans / (whiteColor + brownColor);
        int totalWhiteCans = totalClasses * whiteColor;
        int totalBrownCans = totalClasses * brownColor;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банки коричневой краски");

        //Задача 6
        System.out.println("Задача 6");
        int banasWeigt = 80;
        int banansAmount = 5;
        int bananasTotalWeight = banansAmount * banasWeigt;
        int packageMilkAmount = 200 / 100;
        int milkWeight = 105;
        int milkTotalWeight = packageMilkAmount * milkWeight;
        int icecreamAmount = 2;
        int icecreamWeight = 100;
        int icecreamTotalWeight = icecreamWeight * icecreamAmount;
        int eggsAmount = 4;
        int eggsWeight = 70;
        int eggsTotalWeight = eggsWeight * eggsAmount;
        int weightInGrams = bananasTotalWeight + milkTotalWeight + icecreamTotalWeight + eggsTotalWeight;
        float weighInKilo = weightInGrams / 1000F;
        System.out.println("Вес одного из рецептов спортивного завтрака в граммах составляет " + weightInGrams + " грамм или "+ weighInKilo + " килограмм");

        //Задача 7
        System.out.println("Задача 7");
        int gramsToKilo = 1000;
        int resetInGrams = 1000 * 7;
        int lossPerDay1 = 250;
        int daysToReset1 = resetInGrams / lossPerDay1;
        int lossPerDay2 = 500;
        int daysToReset2 = resetInGrams / lossPerDay2;
        int daysOnAversge = (daysToReset1 + daysToReset2) / 2;
        System.out.println("Если спортсмен будет терять каждый день по " + lossPerDay1 + " грамм, то он потерят 7 килограмм за " + daysToReset1 + " дней");
        System.out.println("Если спортсмен будет терять каждый день по " + lossPerDay2 + " грамм, то он потерят 7 килограмм за " + daysToReset2 + " дней");
        System.out.println("В среднем, теряя от " + lossPerDay1 + " до " + lossPerDay2 + " грамм в день, он сбросит 7 килограмм за " + daysOnAversge + " день");

        //Задача 8
        System.out.println("Задача 8");
        int zpMasha = 67_760;
        float zaMashaRise = zpMasha * 0.10F;
        float zpMashaSumm = zpMasha + zaMashaRise;
        int zpMashaAnnualPast = zpMasha * 12;
        float zpMashaAnnualCurrent = zpMashaSumm * 12;
        float mashaDifference = zpMashaAnnualCurrent - zpMashaAnnualPast;
        System.out.println("Маша теперь получает " + zpMashaSumm + " рублей. Годовой доход вырос на " + mashaDifference + " рублей");
        int zpDenis = 83_690;
        float zaDenisRise = zpDenis * 0.10F;
        float zpDenisSumm = zpDenis + zaDenisRise;
        int zpDenisAnnualPast = zpDenis * 12;
        float zpDenisAnnualCurrent = zpDenisSumm * 12;
        float denisDifference = zpDenisAnnualCurrent - zpDenisAnnualPast;
        System.out.println("Денис теперь получает " + zpDenisSumm + " рублей. Годовой доход вырос на " + denisDifference + " рублей");
        int zpKris = 76_230;
        float zaKrisRise = zpKris * 0.10F;
        float zpKrisSumm = zpKris + zaKrisRise;
        int zpKrisAnnualPast = zpKris * 12;
        float zpKrisAnnualCurrent = zpKrisSumm * 12;
        float krisDifference = zpKrisAnnualCurrent - zpKrisAnnualPast;
        System.out.println("Кристина теперь получает " + zpKrisSumm + " рублей. Годовой доход вырос на " + krisDifference + " рублей");

    }
}