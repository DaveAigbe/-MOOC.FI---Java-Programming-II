import java.util.HashMap;
import java.util.ArrayList;


public class DictionaryOfManyTranslations {
    private final HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        addList(word);

        dictionary.get(word).add(translation);
    }

    public void addList(String word) {
        if (!wordExists(word)) {
            dictionary.put(word, new ArrayList<>());
        }
    }

    public boolean wordExists(String word) {
        return dictionary.containsKey(word);
    }

    public ArrayList<String> translate(String word) {
        if (wordExists(word)) {
            return dictionary.get(word);
        }
        return new ArrayList<>();
    }

    public void remove(String word) {
        if (wordExists(word)) {
            dictionary.remove(word);
        }
    }


}
