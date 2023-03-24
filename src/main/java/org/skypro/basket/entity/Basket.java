package org.skypro.basket.entity;

import org.springframework.context.annotation.Scope;

@Scope("session")
public class Basket {
    private Integer id;

    public Basket(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
