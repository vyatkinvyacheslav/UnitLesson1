package ru.netology;


//import org.junit.jupiter.api.Test;

//import org.junit.Test;
//import org.junit.Assert;

//import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void testBuyLess1000N1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 300;
        int actual = service.remain(amount);
        int expected = 700;

        assertEquals(expected, actual);

    }

    @Test
    public void testBuyLess1000N2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);


    }

    @Test
    public void testBuyLess1000N3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);

    }

    @Test
    public void testBuyLess1000N4() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);

    }
    @Test
    public void testBuyEquals1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void testBuyMore1000N1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);

    }

    @Test
    public void testBuyMore1000N2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1200;
        int actual = service.remain(amount);
        int expected = 800;

        assertEquals(expected, actual);

    }

    @Test
    public void testBuyMore1000N3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1999;
        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);

    }

    @Test
    public void testBuyMore1000N4() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);


    }
}


