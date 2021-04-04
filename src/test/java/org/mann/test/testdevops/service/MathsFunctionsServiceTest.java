package org.mann.test.testdevops.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathsFunctionsServiceTest {

    private MathsFunctionsService mathsFunctionsService = new MathsFunctionsService();

    @Test
    public void evenNumberShouldBeEvaluatedAsEven() {
        int evenNumber = 20;

        String actualMessage = mathsFunctionsService.isEvenOddNumber(evenNumber);

        assertEquals("Number 20 is an Even number", actualMessage);
    }

    @Test
    public void oddNumberShouldBeEvaluatedAsOdd() {
        int evenNumber = 21;

        String actualMessage = mathsFunctionsService.isEvenOddNumber(evenNumber);

        assertEquals("Number 21 is Odd number", actualMessage);
    }

    @Test
    public void checkForNegativeNumberShouldReturnInvalidMessage() {
        int negativeNumber = -20;

        String actualMessage = mathsFunctionsService.isPrimeNumber(negativeNumber);

        assertEquals("Number -20 is not a valid number for evaluation", actualMessage);
    }

    @Test
    public void checkForZeroShouldReturnInvalidMessage() {
        int number = 0;

        String actualMessage = mathsFunctionsService.isPrimeNumber(number);

        assertEquals("Number 0 is not a valid number for evaluation", actualMessage);
    }

    @Test
    public void oneShouldBeEvaluatedAsPrime() {
        int number = 1;

        String actualMessage = mathsFunctionsService.isPrimeNumber(number);

        assertEquals("Number 1 is a prime number", actualMessage);
    }

    @Test
    public void twoShouldBeEvaluatedAsPrime() {
        int number = 2;

        String actualMessage = mathsFunctionsService.isPrimeNumber(number);

        assertEquals("Number 2 is a prime number", actualMessage);
    }

    @Test
    public void threeShouldBeEvaluatedAsPrime() {
        int number = 3;

        String actualMessage = mathsFunctionsService.isPrimeNumber(number);

        assertEquals("Number 3 is a prime number", actualMessage);
    }

    @Test
    public void primeNumberShouldBeEvaluatedAsPrime() {
        int number = 113;

        String actualMessage = mathsFunctionsService.isPrimeNumber(number);

        assertEquals("Number 113 is a prime number", actualMessage);
    }

    @Test
    public void nonPrimeNumberShouldNotBeEvaluatedAsPrime() {
        int number = 1000;

        String actualMessage = mathsFunctionsService.isPrimeNumber(number);

        assertEquals("Number 1000 is not a prime number", actualMessage);
    }

}