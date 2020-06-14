package com.kodilla.ecommercee;

import com.kodilla.ecommercee.domain.Cart;
import com.kodilla.ecommercee.domain.Order;
import com.kodilla.ecommercee.domain.User;
import com.kodilla.ecommercee.repository.CartRepository;
import com.kodilla.ecommercee.repository.OrderRepository;
import com.kodilla.ecommercee.repository.UserRepository;
import com.kodilla.ecommercee.service.OrderService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class OrderRepositoryTestSuite {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private OrderService orderService;

    @Test
    public void testSave() {
        //Given
        User user1 = new User("Jan", true, 1L);
        Cart cart1 = new Cart("Kapcie", "Cieple kapcie", 100.00, "1");

        userRepository.save(user1);
        cartRepository.save(cart1);

        Order order = new Order(user1.getId(), (long) cart1.getId());

        //When
        Order saved = orderService.save(order);

        //Then
        Assert.assertNotNull(saved);

        //Clean up
        orderRepository.delete(order);
        userRepository.delete(user1);
        cartRepository.delete(cart1);
    }
}
