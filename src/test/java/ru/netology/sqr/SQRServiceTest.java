package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import javax.swing.*;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {

    @Test
    void shouldNumberOfSquaresInTheGraniteRange() {
        SQRService service = new SQRService();
        int maximumValue = 300;
        int minimumValue = 100;
        int expected = 8;
        int actual = service.numberOfSquares(minimumValue, maximumValue);
        assertEquals(expected, actual);

    }

    @Test
    void shouldNumberOfSquaresInTheGraniteRangeAlternativMin() {
        SQRService service = new SQRService();
        int maximumValue = 100;
        int minimumValue = 10;
        int expected = 1;
        int actual = service.numberOfSquares(minimumValue, maximumValue);
        assertEquals(expected, actual);
    }

    @Test
    void shouldNumberOfSquaresInTheGraniteRangeAlternativ() {
        SQRService service = new SQRService();
        int maximumValue = 99;
        int minimumValue = 10;
        int expected = 0;
        int actual = service.numberOfSquares(minimumValue, maximumValue);
        assertEquals(expected, actual);
    }


}
