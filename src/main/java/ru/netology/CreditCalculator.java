package ru.netology;

public class CreditCalculator {
    public double rounding(double input, int count) {
        //округление
        return 0.0;
    }

    public double monthlyPercentage(double rateInYear) {
        // i=y/12/100
        return 0.0;
    }

    public double annuityRatio(double monthlyRate, int allMonths) {
        // k=i*(1+i)^n/((1+i)^n-1)
        return 0.0;
    }

    public double monthlyPayment(double annuityRatio, double creditSum) {
        // m=k*s
        return 0.0;
    }

    public double totalAmount(double monthlyPayment, int allMonths) {
        // t=m*n
        return 0.0;
    }

    public double overpayment(double totalAmount, double creditSum) {
        // o=t-s
        return 0.0;
    }
}