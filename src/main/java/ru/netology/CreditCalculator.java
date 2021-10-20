package ru.netology;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CreditCalculator {
    public double rounding(double input, int count) {
        //округление
        BigDecimal result = new BigDecimal(input);
        result = result.setScale(count, RoundingMode.HALF_UP);

        return result.doubleValue();
    }

    public double monthlyPercentage(double rateInYear) {
        // i=y/12/100
        final int MONTHS_IN_YEAR = 12;
        final int ALL_PERCENTS = 100;

        return rateInYear / MONTHS_IN_YEAR / ALL_PERCENTS;
    }

    public double annuityRatio(double monthlyRate, int allMonths) {
        // k=i*(1+i)^n/((1+i)^n-1)
        return monthlyRate * Math.pow(1 + monthlyRate, allMonths) /
                (Math.pow(1 + monthlyRate, allMonths) - 1);
    }

    public double monthlyPayment(double annuityRatio, double creditSum) {
        // m=k*s
        return annuityRatio * creditSum;
    }

    public double totalAmount(double monthlyPayment, int allMonths) {
        // t=m*n
        return monthlyPayment * allMonths;
    }

    public double overpayment(double totalAmount, double creditSum) {
        // o=t-s
        return totalAmount - creditSum;
    }
}