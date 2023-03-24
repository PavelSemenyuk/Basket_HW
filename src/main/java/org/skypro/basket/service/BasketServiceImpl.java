package org.skypro.basket.service;

import org.skypro.basket.entity.Basket;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service

public class BasketServiceImpl implements BasketService {

    private List<Basket> basketList = new ArrayList<>();

    @Override
    public List<Basket> add(List<Integer> ids) {
        List<Basket> newBasket = ids.stream()
                .map(Basket::new)
                .collect(Collectors.toList());
        basketList.addAll(newBasket);
        return newBasket;
    }

    @Override
    public List<Basket> getAll() {
        return basketList;
    }
}
