package co.com.sofka.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    public Long sub(Long number1, Long number2) {
        logger.info( "Substraction {} - {}", number1, number2 );
        return number1 - number2;
    }

    public Long multi(Long number1, Long number2) {
        logger.info( "Substraction {} * {}", number1, number2 );
        return number1 * number2;
    }

    public Long division(Long number1, Long number2) {
        logger.info( "Substraction {} / {}", number1, number2 );
        Long resultado=0L;
        try {
            resultado= number1 / number2;
        }
        catch (ArithmeticException e){
            logger.info("La división por cero da error");
        }
        return resultado;
    }
}
