package no.hiof.janaathm.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import no.hiof.janaathm.model.Animal;
import no.hiof.janaathm.model.Date;
import no.hiof.janaathm.model.Location;
import no.hiof.janaathm.model.Observation;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class JSONObservationRepository implements ObservationRepository {
    List<Observation> observationList = new ArrayList<Observation>();

    public JSONObservationRepository() {

    }

    public static void writeToJSON (String filName, List<Observation> observations) {
        ObjectMapper objectMapper = new ObjectMapper();
        //objectMapper.registerModule(new JavaTimeModule());
        //objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(filName), observations);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<Observation> readFromJSON (String filName) {
        List<Observation> observations = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            Observation[] observationsArr = objectMapper.readValue(new File(filName), Observation[].class);
            observations = Arrays.asList(observationsArr);


        } catch (IOException e) {
            e.printStackTrace();
        }

        return observations;

    }

    @Override
    public Observation findObservation(String id, String file) {
        List<Observation> observations = readFromJSON(file);
        for (Observation observation : observations) {
            if (observation.getName().equals(id)) {
                return observation;
            }
        }
        return null;
    }

    @Override
    public List<Observation> findAllObservation() {
        return observationList;
    }

    @Override
    public List<Observation> createObservation(String id, String name, Animal animal, Location location, Date date, double quantity, String pictureURL, String comment, String file) {
        Observation observation = new Observation(id, name, animal, location, date, quantity, pictureURL, comment);
        List<Observation> observations = readFromJSON(file);
        observations.add(observation);
        writeToJSON("observation.json", observations);
        return observations;
    }

    @Override
    public List<Observation> deleteObservation(String id, String file) {
        List<Observation> observations = readFromJSON(file);
        Observation observation = findObservation(id, file);
        observations.remove(observation);
        writeToJSON("observation.json", observations);
        return observations;

    }

    @Override
    public List<Observation> updateObservation(String id, String name, Animal animal, Location location, Date date, double quantity, String pictureURL, String comment, String file) {
        List<Observation> observations = readFromJSON(file);
        Observation observation = findObservation(id,file);
        observation.setName(name);
        observation.setAnimal(animal);
        observation.setLocation(location);
        observation.setDate(date);
        observation.setQuantity(quantity);
        observation.setPictureURL(pictureURL);
        observation.setComment(comment);
        writeToJSON("observation.json", observations);
        return null;
    }
}
