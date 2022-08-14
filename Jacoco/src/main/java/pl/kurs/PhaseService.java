package pl.kurs;

public class PhaseService {
    // napisz metode która porownuje dwa stringi pod wzgledem dlugosci
    // sa 4 opcje:
    // 1 jest dluzszy, 2 jest dluzszy, sa takie same ale dluzsze niz 5, sa takie same

    public String compareTwoStrings(String word1, String word2) {
        if (word1.length() > word2.length()) {
            return "Word1 is longer";
        } else if (word2.length() > word1.length()) {
            return "Word2 is longer";
        } else {
            if (word1.length() > 5) {
                return "Is same but longer than 5";
            }
        }
        return "Is the same";
    }

}



