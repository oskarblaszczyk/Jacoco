package pl.task1.model;

import pl.task1.interfaces.DrugController;

import java.util.List;

public class Mdma extends Drug{

    private int timeBeingHigh;

    public Mdma(String name, List<Ingredients> ingredients, DrugController quality, int timeBeingHigh) {
        super(name, ingredients, quality);
        this.timeBeingHigh = timeBeingHigh;
    }
}
