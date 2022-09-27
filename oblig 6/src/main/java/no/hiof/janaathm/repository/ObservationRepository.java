package no.hiof.janaathm.repository;

import no.hiof.janaathm.model.Animal;
import no.hiof.janaathm.model.Date;
import no.hiof.janaathm.model.Location;
import no.hiof.janaathm.model.Observation;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public interface ObservationRepository {
    List<Observation> createObservation(String id, String name, Animal animal, Location location, Date date, double quantity, String pictureURL, String comment, String file);
    List<Observation> deleteObservation(String id, String file);
    List<Observation> updateObservation(String id, String name, Animal animal, Location location, Date date, double quantity, String pictureURL, String comment, String file);
    Observation findObservation(String id, String file);
    List<Observation> findAllObservation();

}
