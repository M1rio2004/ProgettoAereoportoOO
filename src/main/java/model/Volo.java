package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import model.enums.StatoV;

public class Volo {
    protected String codiceV;
    protected String compagniaAerea;
    protected LocalDate dataVolo;
    protected LocalTime orarioPrevisto;
    protected Duration ritardo;
    protected StatoV statoV;

    protected List<Prenotazione> prenotazioni = new ArrayList<>();
    protected Gate gate;

    public void aggiungiPrenotazione(Prenotazione p) {
        prenotazioni.add(p);
    }
}
