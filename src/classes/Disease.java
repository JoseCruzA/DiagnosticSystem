package classes;

import java.util.List;

/**
 * Class that represents a disease.
 * 
 * @author Jose Cruz & Camilo Gómez
 * @version 1.0
 */
public class Disease {
    private String name;
    private String description;
    private List<Symptom> symptoms;

    public Disease(String name, String description, List<Symptom> symptoms) {
        this.name = name;
        this.description = description;
        this.symptoms = symptoms;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Symptom> getSymptoms() {
        return symptoms;
    }
}
