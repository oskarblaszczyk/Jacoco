package pl.task1.services;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import pl.task1.interfaces.DrugController;
import pl.task1.interfaces.DrugDeceptionController;
import pl.task1.model.Ingredients;
import pl.task1.model.Lsd;
import pl.task1.model.Mdma;

import java.util.Arrays;

import static org.junit.Assert.*;

public class DrugDeceptionServiceTest {

    private DrugDeceptionService drugDeceptionService;


    @Mock
    private DrugDeceptionController drugDeceptionControllerMock;

    @Mock
    private DrugController drugControllerMock;

    @Mock
    private Lsd lsdMock;

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
        drugDeceptionService = new DrugDeceptionService(drugDeceptionControllerMock);
    }


    @Test
    public void shouldOpenAddFlourMethod() {
        drugDeceptionService.makeMoreDrugs(lsdMock, Ingredients.FLOUR);
        Mockito.verify(drugDeceptionControllerMock).addIngredients(lsdMock, Ingredients.FLOUR);
    }

    @Test
    public void shouldReturnTrueWhenIngredientIsAdded() {
        Mdma mdma = new Mdma("Drug", Arrays.asList(Ingredients.SKLADNIK3, Ingredients.SKLADNIK4, Ingredients.SKALDNIK1), d -> d.getIngredients().size()<6, 5);
        drugDeceptionService = new DrugDeceptionService((d,s) -> d.getIngredients().add(s));
        drugDeceptionService.makeMoreDrugs(mdma, Ingredients.FLOUR);
        assertEquals(4, mdma.getIngredients().size());
    }

}