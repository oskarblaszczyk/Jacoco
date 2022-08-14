package pl.task1.services;

import pl.task1.interfaces.DrugDeceptionController;
import pl.task1.model.Drug;
import pl.task1.model.Ingredients;

public class DrugDeceptionService {
    private DrugDeceptionController drugDeceptionController;

    public DrugDeceptionService(DrugDeceptionController drugFactoryController) {
        this.drugDeceptionController = drugFactoryController;
    }

public void makeMoreDrugs(Drug d, Ingredients s){
    drugDeceptionController.addIngredients(d , s);
}

}
