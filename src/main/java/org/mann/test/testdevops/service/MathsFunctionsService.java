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

    public String isPrimeNumber(Integer number) {
        String message = String.format("Number %d is not a prime number", number);

        if( number <= 1) {
            message = String.format("Number %d is not a valid number for evaluation", number);
        } else {
            for (int i = 2; i <= number; i++) {
                if(number % i == 0 && i == number) {
                    message = String.format("Number %d is a prime number", number);

                    break;
                }
            }
        }

        return message;
    }

}
