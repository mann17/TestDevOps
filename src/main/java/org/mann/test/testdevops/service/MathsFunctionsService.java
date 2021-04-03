package org.mann.test.testdevops.service;

import org.springframework.stereotype.Service;

@Service
public class MathsFunctionsService {

    public String isEvenOddNumber(Integer number) {
        String message;
        if (number % 2 == 0) {
            message = "Number is Even";
        } else {
            message = "Number is Odd";
        }

        return message;
    }
}
