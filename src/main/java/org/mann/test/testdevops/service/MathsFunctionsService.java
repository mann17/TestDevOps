package org.mann.test.testdevops.service;

import org.springframework.stereotype.Service;

@Service
public class MathsFunctionsService {

    public String isEvenOddNumber(Integer number) {
        String message;
        if (number % 2 == 0) {
            message = String.format("Number %d is Even", number);
        } else {
            message = String.format("Number %d is Odd", number);
        }

        return message;
    }
}
