package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class TestCreditCalculator {
    @Test
    public void testRounding() {
        CreditCalculator calculator = new CreditCalculator();

        double input = 34.727554;
        int count = 3;
        double expected = 34.728;

        double result = calculator.rounding(input, count);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testMonthlyPercentage() {
        CreditCalculator calculator = new CreditCalculator();

        double rateInYear = 20.0;
        double expected = 0.016666666666666666;

        double result = calculator.monthlyPercentage(rateInYear);

        Assertions.assertEquals(expected, result);
    }


    @Test
    public void testAnnuityRatio() {
        CreditCalculator calculator = new CreditCalculator();

        double monthlyRate = 0.01667;
        int allMonths = 36;
        double expected = 0.03716562149806031;

        double result = calculator.annuityRatio(monthlyRate, allMonths);

        Assertions.assertEquals(expected, result);
    }


    @Test
    public void testMonthlyPayment() {
        CreditCalculator calculator = new CreditCalculator();

        double annuityRatio = 0.03717;
        double creditSum = 1000000.0;
        double expected = 37170.0;

        double result = calculator.monthlyPayment(annuityRatio, creditSum);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testTotalAmount() {
        CreditCalculator calculator = new CreditCalculator();

        double monthlyPayment = 37170.0;
        int allMonths = 36;
        double expected = 1338120.0;

        double result = calculator.totalAmount(monthlyPayment, allMonths);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testOverpayment() {
        CreditCalculator calculator = new CreditCalculator();

        double totalAmount = 1338120.0;
        double creditSum = 1000000.0;
        double expected = 338120.0;

        double result = calculator.overpayment(totalAmount, creditSum);

        Assertions.assertEquals(expected, result);
    }
}