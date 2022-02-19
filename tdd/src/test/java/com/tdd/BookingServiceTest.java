package com.tdd;

import com.tdd.service.BookingService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class BookingServiceTest {

    static class BookingServiceTestConfiguration{
        
    }

    @Autowired
    BookingService bookingService;

    @Test
    public void bookingServiceTestDaysCalculator(){
        String name = "Allan";
        int days = bookingService.daysCalculatorWithDatabase(name);

        Assertions.assertEquals(days, 10);
    }

}
