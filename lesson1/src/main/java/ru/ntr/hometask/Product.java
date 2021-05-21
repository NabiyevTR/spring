package ru.ntr.hometask;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Product {
    private int id;
    private String title;
    private double cost;

    @Override
    public String toString() {
        return String.format("id: %d, title: %s, cost: %.2f$", id, title, cost);
    }
}
