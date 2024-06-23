package dictionary;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SaveableDictionary {

    private String file;
    private HashMap<String, String> translations;

    public SaveableDictionary() {
        this.translations = new HashMap();
    }

    public SaveableDictionary(String file) {
        this.file = file;
        this.translations = new HashMap();
    }

    public void add(String words, String translation) {
        this.translations.putIfAbsent(words, translation);
    }

    public String translate(String word) {
        for (Map.Entry<String, String> entry : translations.entrySet()) {
            if (entry.getValue().equals(word)) {
                return entry.getKey();
            }
            if (translations.containsKey(word)) {
                return this.translations.get(word);
            }
        }
        return null;
    }

    public void delete(String word) {
        Iterator<Map.Entry<String, String>> iterator = translations.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getKey().equals(word) || entry.getValue().equals(word)) {
                iterator.remove(); // Remove the current entry from the map
            }
        }
    }

    public boolean load() {
        String thefile = this.file;
        try (Scanner fileReader = new Scanner(Paths.get(this.file))) {
            if (fileReader.hasNextLine()) {
                while (fileReader.hasNextLine()) {
                    String row = fileReader.nextLine();
                    String[] parts = row.split(":");
                    add(parts[0], parts[1]);
                }
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
        return false;
    }

    public boolean save() {
        Iterator<Map.Entry<String, String>> iterator = translations.entrySet().iterator();
        try {
            FileWriter writer = new FileWriter(this.file);
            while (iterator.hasNext()) {
                Map.Entry<String, String> entry = iterator.next();
                String row = entry.getKey() + ":" + entry.getValue() + "\n";
                writer.write(row);
                
            }writer.close();
            return true;
        } catch (IOException ex) {
            Logger.getLogger(SaveableDictionary.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
