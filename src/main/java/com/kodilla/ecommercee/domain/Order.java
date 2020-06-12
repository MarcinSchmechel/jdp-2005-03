package com.kodilla.ecommercee.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamedNativeQueries({
    @NamedNativeQuery(
            name = "Order.getUserId",
            query = "SELECT * FROM USER",
            resultClass = User.class
    ),

    @NamedNativeQuery(
            name = "Order.getCartId",
            query = "SELECT * FROM CART",
            resultClass = Cart.class
    )
})

@Entity
@Table(name = "ORDERS")
public class Order {
    private Long id;
    private Long userId;
    private Long cartId;

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public Long getId() {
        return id;
    }

    @Column(name = "USER_ID")
    public Long getUserId() {
        return userId;
    }

    @Column(name = "CART_ID")
    public Long getCartId() {
        return cartId;
    }

    public Order() {
    }

    public Order(Long id, Long userId, Long cartId) {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }
}
