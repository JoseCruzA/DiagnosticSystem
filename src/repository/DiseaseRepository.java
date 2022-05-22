package repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import classes.Disease;
import classes.Symptom;

public class DiseaseRepository {
    
    public List<Disease> addDiseases() {
        List<Disease> diseases = new ArrayList<>();

        diseases.add(new Disease("Diabetes", "Diabetes is a group of metabolic diseases that involve high blood sugar levels.", Arrays.asList(Symptom.CONSTANTTHIRST, Symptom.EXCESIVEHUNGER, Symptom.WEIGHTLOSS, Symptom.FATIGUE, Symptom.WEAKNESS, Symptom.IRRITATION, Symptom.BLURREDVISION)));
        diseases.add(new Disease("Gastritis", "Gastritis is a chronic inflammation of the stomach and intestines.", Arrays.asList(Symptom.WEIGHTLOSS, Symptom.NAUSEA, Symptom.HICCUP, Symptom.BELCHING, Symptom.STOMACHGASES, Symptom.BADMOUTHTASTE, Symptom.VOMITING, Symptom.GASTRICVACUUM)));
        diseases.add(new Disease("Colesterol", "Colesterol is a compound in the blood that is high in cholesterol.", Arrays.asList(Symptom.BALANCELOSS, Symptom.DIZZINESS, Symptom.HEADACHE, Symptom.YELLOWEYES, Symptom.BLURREDVISION, Symptom.AGITATION, Symptom.CHESTPAIN)));
        diseases.add(new Disease("Hipertension", "Hipertension is a condition in which the blood pressure is too high.", Arrays.asList(Symptom.NAUSEA, Symptom.HEADACHE, Symptom.VOMITING, Symptom.CONFUSION, Symptom.NASALBLEEDING, Symptom.DIZZINESS)));


        return diseases;
    }

}
