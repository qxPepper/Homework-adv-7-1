package ru.netology;

public class Main {
    public static void main(String[] args) {
        double creditSum = 1_000_000;
        int allMonths = 36;
        double rateInYear = 20;
        int count = 5;

        System.out.println("Сумма кредита - " + creditSum + " руб., срок - " +
                allMonths + " месяцев, ставка в год - " + rateInYear + " %.");

        CreditCalculator calculator = new CreditCalculator();

        // Рассчет месячного платежа.
        double monthlyRate = calculator.monthlyPercentage(rateInYear);
        monthlyRate = calculator.rounding(monthlyRate, count);

        double annuityRatio = calculator.annuityRatio(monthlyRate, allMonths);
        annuityRatio = calculator.rounding(annuityRatio, count);

        double monthlyPayment = calculator.monthlyPayment(annuityRatio, creditSum);
        System.out.println("Ежемесячные выплаты - " + monthlyPayment + " руб.");

        // Рассчет общей суммы к возврату в банк.
        double totalAmount = calculator.totalAmount(monthlyPayment, allMonths);
        System.out.println("Общая сумма к возврату в банк - " + totalAmount + " руб.");

        // Рассчет переплаты за весь период.
        double totalOverpayment = calculator.overpayment(totalAmount, creditSum);
        System.out.println("Суммарная переплата за весь период - " + totalOverpayment + " руб.");
    }
}