package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {


    @Test
    void numberOfSquares() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.numberOfSquares();
        assertEquals(expected, actual);

    }
}