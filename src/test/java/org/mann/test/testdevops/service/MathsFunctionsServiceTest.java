package org.mann.test.testdevops.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathsFunctionsServiceTest {

    private MathsFunctionsService mathsFunctionsService = new MathsFunctionsService();

    @Test
    public void evenNumberShouldBeEvaluatedAsEven() {
        int evenNumber = 20;

        String message = mathsFunctionsService.isEvenOddNumber(evenNumber);

        assertEquals("Number is Even", message);
    }

    @Test
    public void oddNumberShouldBeEvaluatedAsOdd() {
        int evenNumber = 21;

        String message = mathsFunctionsService.isEvenOddNumber(evenNumber);

        assertEquals("Number is Odd", message);

    }

}