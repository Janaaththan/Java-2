package no.hiof.larseknu.oblig4.repository;

import no.hiof.larseknu.oblig4.model.Planet;
import no.hiof.larseknu.oblig4.model.PlanetSystem;

import java.util.ArrayList;

public interface IUniversityRepository {
    PlanetSystem getPlanetSystem(String planetSystemName);
    ArrayList<PlanetSystem> getPlanetSystems();
    Planet getPlanet(String planetSystemName, String planet);
    ArrayList<Planet> getPlanets(String planetSystemName);
}
