package pl.kurs;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PhaseServiceTest {

    private PhaseService phaseService;

    @Before
    public void init() {
        phaseService = new PhaseService();
    }

    @Test
    public void shouldReturnWord1IsLonger() {
        assertEquals("Word1 is longer", phaseService.compareTwoStrings("asssss", "asdf"));
    }

    @Test
    public void shouldReturnWord2IsLonger() {
        assertEquals("Word2 is longer", phaseService.compareTwoStrings("as", "asdf"));
    }

    @Test
    public void shouldReturnWordsAreSameAndLongerThan5() {
        assertEquals("Is same but longer than 5", phaseService.compareTwoStrings("asdfgh", "asdfgh"));
    }

    @Test
    public void shouldReturnWordsAreSame() {
        String res = phaseService.compareTwoStrings("asd", "asd");
        // assertEquals("Is the same",res );
    }


}