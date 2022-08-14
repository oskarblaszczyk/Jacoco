package pl.task1.model;

import pl.task1.interfaces.DrugController;

import java.util.List;

public class Mefedron extends Drug{

    private String typeOfFunnyFace;

    public Mefedron(String name, List<Ingredients> ingredients, DrugController quality, String typeOfFunnyFace) {
        super(name, ingredients, quality);
        this.typeOfFunnyFace = typeOfFunnyFace;
    }
}
