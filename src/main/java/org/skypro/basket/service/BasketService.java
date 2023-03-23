package org.skypro.basket.service;

import org.skypro.basket.entity.Basket;

import java.util.List;

public interface BasketService {

    List<Basket> add(List<Integer> ids);

    List<Basket> getAll();
}
