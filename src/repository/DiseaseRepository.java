package repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import classes.Symptoms;
import classes.Disease;

public class DiseaseRepository {
    
    public List<Disease> addDiseases() {
        List<Disease> diseases = new ArrayList<>();

        diseases.add(new Disease("Diabetes", Arrays.asList(Symptoms.CONSTANTURINE, Symptoms.CONSTANTTHIRST, Symptoms.EXCESIVEHUNGER, Symptoms.WEIGHTLOSS, Symptoms.FATIGUE, Symptoms.WEAKNESS, Symptoms.IRRITATION, Symptoms.BLURREDVISION)));
        diseases.add(new Disease("Gastritis", Arrays.asList(Symptoms.HEARTBURN, Symptoms.WEIGHTLOSS, Symptoms.NAUSEA, Symptoms.HICCUP, Symptoms.BELCHING, Symptoms.STOMACHGASES, Symptoms.BADMOUTHTASTE, Symptoms.VOMITING, Symptoms.GASTRICVACUUM)));
        diseases.add(new Disease("Colesterol", Arrays.asList(Symptoms.SWELLING, Symptoms.BALANCELOSS, Symptoms.HEADACHE, Symptoms.YELLOWEYES, Symptoms.BLURREDVISION, Symptoms.AGITATION, Symptoms.CHESTPAIN)));


        return diseases;
    }

}
