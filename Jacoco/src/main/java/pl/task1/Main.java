package pl.task1;

import pl.task1.model.Ingredients;
import pl.task1.model.Mdma;
import pl.task1.services.DrugDeceptionService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Mdma mdma = new Mdma("Drug", Arrays.asList(Ingredients.SKLADNIK4, Ingredients.SKALDNIK1), () -> true, 5);
        DrugDeceptionService dds = new DrugDeceptionService((d,s) -> d.getIngredients().add(s));
        dds.makeMoreDrugs(mdma, Ingredients.FLOUR);

        System.out.println(mdma.getIngredients());
    }
}
