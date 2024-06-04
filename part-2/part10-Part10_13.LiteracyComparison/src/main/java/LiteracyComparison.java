
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class LiteracyComparison {

    public static void main(String[] args) {
        String filePath = "literacy.csv";
        ArrayList<Countries> countriesList = reader(filePath);

//        System.out.println(reader(filePath));
        for (Countries country : countriesList) {
            System.out.println(country);
        }
    }

    public static ArrayList<Countries> reader(String file) {
        ArrayList<Countries> files = new ArrayList();

        try {
            Files.lines(Paths.get(file)).
                    map(rows -> rows.split(",")).
                    filter(parts -> parts.length >= 6)
                    .map(parts -> new Countries(parts[0].trim(), parts[1].trim(), parts[2].trim(), parts[3].trim(), Integer.valueOf(parts[4].trim()), Double.valueOf(parts[5].trim())))
                    .sorted((s1, s2) -> Double.compare(s1.getLiterature(), s2.getLiterature()))
                    .forEach(row -> files.add(row));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return files;
    }

}
