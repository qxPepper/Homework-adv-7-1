package ru.netology;

public class Main {
    public static void main(String[] args) {
        double creditSum = 1_000_000;
        int allMonths = 36;
        double rateInYear = 20;

        System.out.println("Сумма кредита - " + creditSum + " руб., срок - " +
                allMonths + " месяцев, ставка в год - " + rateInYear + " %.");
    }
}