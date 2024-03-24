
import java.util.HashMap;

public class SimpleDictionary {

    private HashMap<String, String> translations= new HashMap<>();

    public SimpleDictionary() {
        this.translations = new HashMap<>();
    }

    public String translate(String word) {
        return this.translations.get(word);
    }
     public boolean exists (String word) {
        return this.translations.containsKey(word);
     }

    public void add(String word, String translation) {
        this.translations.put(word, translation);
    }
}
