package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    public Long substract(Long number1, Long number2) {
        logger.info( "Substraction {} - {}", number1, number2 );
        return number1 - number2;
    }

    public Long multiply(Long number1, Long number2) {
        logger.info( "Multiplication {} * {}", number1, number2 );
        return number1 * number2;
    }

    public Float division(Long number1, Long number2) {
        logger.info( "Division {} / {}", number1, number2 );
        Float resultado=0f;
        try {
            resultado= Float.valueOf(number1/number2);
        }
        catch (ArithmeticException e){
            logger.info("La división por cero da error");
        }
        return resultado;
    }
}
