
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList> translation;

    public DictionaryOfManyTranslations() {
        this.translation = new HashMap<>();

    }

    public void add(String word, String translation) {
        this.translation.putIfAbsent(word, new ArrayList());
        this.translation.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        ArrayList<String> translated = this.translation.get(word);
        if (translated == null) {
            return new ArrayList<>();
        }
        return translated;
    }

    public void remove(String word) {
        this.translation.remove(word);
    }
}
