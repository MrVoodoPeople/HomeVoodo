import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MyFirstTest {

    @Test
    void myIsPrimeTest() {
        assertTrue(Prime.isPrime(2), "2 is a prime number");
        assertTrue(Prime.isPrime(3), "3 is a prime number");
        assertFalse(Prime.isPrime(1), "1 is not a prime number");
        assertFalse(Prime.isPrime(4), "4 is not a prime number");
    }
    void negativeNumberTest(){
        assertFalse(Prime.isPrime(-10), "-1 is not a prime number");
        assertFalse(Prime.isPrime(-5), "-2 is not a prime number");
    }
}
