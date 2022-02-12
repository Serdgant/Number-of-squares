package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {


    @Test
    void shouldNumberOfSquaresInTheGraniteRange() {
        SQRService service = new SQRService();

        int expected = 7;
        int actual = service.numberOfSquares();
        assertEquals(expected, actual);

    }
}