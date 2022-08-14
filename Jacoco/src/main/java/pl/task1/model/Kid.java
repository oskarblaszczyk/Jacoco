package pl.task1.model;

import pl.task1.exceptions.TheKidIsAlreadyDeadException;

import java.util.ArrayList;
import java.util.List;

public class Kid {
    private String name;
    private String surname;
    private int age;
    private List<Drug> drugs = new ArrayList<>();

    public Kid(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public  void buyDrug(Drug drug){
        if (drugs.size() >= 5){
            throw new TheKidIsAlreadyDeadException();
        }
        drugs.add(drug);
        if(drug.getKid() != null){
            throw new IllegalArgumentException("This drug was sold");
        }
        drug.setKid(this);
    }

    public List<Drug> getDrugs() {
        return drugs;
    }

}
