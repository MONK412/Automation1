package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturnFrom1000() {
        int actual1 = service.remain(900);
        int expected1 = 100;
        int actual2 = service.remain(100);
        int expected2 = 900;
        int actual3 = service.remain(1);
        int expected3 = 999;
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
    }

    @Test
    public void shouldNotReturnFrom1000() {
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFrom5000() {
        int actual1 = service.remain(4350);
        int expected1 = 650;
        int actual2 = service.remain(4910);
        int expected2 = 90;
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    public void shouldNotReturnFrom5000() {
        int actual = service.remain(5000);
        int expected = 0;
        assertEquals(expected, actual);
    }
}