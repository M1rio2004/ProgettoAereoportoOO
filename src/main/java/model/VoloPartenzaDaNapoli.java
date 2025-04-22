package model;

public class VoloPartenzaDaNapoli extends Volo {
    private String aeroportoOrigine = "Napoli";
    private String aeroportoDestinazione;
    private Gate gate;

    //Costruttore
    public VoloPartenzaDaNapoli(String codiceVolo, String compagniaAerea, java.time.LocalDate dataVolo, java.time.LocalTime orarioPrevisto, java.time.Duration ritardo, StatoVolo stato, String aeroportoDestinazione) {
        super(codiceVolo, compagniaAerea, dataVolo, orarioPrevisto, ritardo, stato);
        this.aeroportoDestinazione = aeroportoDestinazione;
    }

    //Metodo per modificare il gate di imbarco del volo
    public void setGate(Gate gate) {
        this.gate = gate;
    }
}
