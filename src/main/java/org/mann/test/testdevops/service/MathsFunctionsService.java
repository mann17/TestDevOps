package org.mann.test.testdevops.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
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
        String message = String.format("Number %d is a prime number", number);

        if( number <= 0) {
            message = String.format("Number %d is not a valid number for evaluation", number);
        } else if (number == 1) {
            message = String.format("Number %d is a prime number", number);
        } else {
            for (int i = 2; i < number; i++) {
                if(number % i == 0) {
                    log.info("Number <{}> is divisible by <{}> hence not a prime number", number, i);
                    message = String.format("Number %d is not a prime number", number);

                    break;
                }
            }
        }

        return message;
    }

}
