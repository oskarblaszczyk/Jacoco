package pl.task1.model;

import pl.task1.interfaces.DrugController;

import java.util.List;

public class Lsd extends Drug{
    private int amountOfDragons;

    public Lsd(String name, List<Ingredients> ingredients, DrugController quality, int amountOfDragons) {
        super(name, ingredients, quality);
        this.amountOfDragons = amountOfDragons;
    }
}
