package classes;

import java.util.List;

/**
 * Class representing a disease.
 * 
 * @author Jose Cruz & Camilo Gómez
 * @version 1.0
 */
public class Disease {
    private String name;
    private List<Symptoms> symptoms;

    public Disease(String name, List<Symptoms> symptoms) {
        this.name = name;
        this.symptoms = symptoms;
    }

    public String getName() {
        return name;
    }

    public List<Symptoms> getSymptoms() {
        return symptoms;
    }
}
