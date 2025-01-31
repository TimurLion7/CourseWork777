package ru.xpressed.javatemplatecoursework.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ru.xpressed.javatemplatescoursework.entity.Order;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
public class OrderTest {

    @Test
    @DisplayName("SetDeparture Test")
    public void setDeparture() {
        Order order = new Order();
        order.setDeparture(new Date());

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.y HH:mm");

        Assertions.assertEquals(order.getDeparture(), dateFormat.format(new Date()));
    }
}