package ru.ntr.lesson2;

import lombok.Getter;

@Getter
public class CartEntity {
    private Product product;
    private int amount;

    public CartEntity(Product product) {
        this.product = product;
        amount++;
    }

    public void incAmount() {
        amount++;
    }

    public void decAmount() {
        if (amount > 0) {
            amount --;
        }
    }
}
