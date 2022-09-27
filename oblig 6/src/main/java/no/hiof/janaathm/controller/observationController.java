package no.hiof.janaathm.controller;

import io.javalin.http.Context;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import no.hiof.janaathm.model.Observation;
import no.hiof.janaathm.repository.JSONObservationRepository;

import java.util.List;

public class observationController extends JSONObservationRepository {
    public static void getAllObservations(Context ctx, String file) {
        List<Observation> observations = readFromJSON(file);
        ctx.json(observations);
    }
}
