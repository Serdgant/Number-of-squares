package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void ShoudSqrCeilNumberOfSquares() {
        SQRService service = new SQRService();
        int expected = 18;
        int actual = service.sqrCeil();
        assertEquals(expected, actual);
    }


}