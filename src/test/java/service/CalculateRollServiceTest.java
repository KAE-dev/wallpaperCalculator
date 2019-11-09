package service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateRollServiceTest {

    @Test
    void calculateFractionalValue() {
        CalculateRollService service = new CalculateRollService();
        int sumRoll = (int) service.calculationOfRolls(10, 10, 2.4, 40, 3);
        assertEquals(2, sumRoll);
    }

    @Test
    void calculateIntegerValue() {
        CalculateRollService service = new CalculateRollService();
        int sumRoll = (int) service.calculationOfRolls(10, 10, 2, 40, 1.9);
        assertEquals(1, sumRoll);
    }
}