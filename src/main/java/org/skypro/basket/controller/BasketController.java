package org.skypro.basket.controller;

import org.skypro.basket.entity.Basket;
import org.skypro.basket.service.BasketService;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Scope("session")
@RequestMapping(path = "/basket")

public class BasketController {
    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping(path = "/add")
    public List<Basket> add(@RequestParam("ids") List<Integer> basketIds) {
        return basketService.add(basketIds);
    }

    @GetMapping(path = "/get")
    public List<Basket> get() {
        return basketService.getAll();
    }
}
