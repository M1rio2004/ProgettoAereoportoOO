package model;

public class VoloArrivoANapoli extends Volo {
    private String aeroportoOrigine;
    private String aeroportoDestinazione = "Napoli";

    public VoloArrivoANapoli(String codiceVolo, String compagniaAerea, String dataVolo, String orarioPrevisto, String ritardo, StatoVolo stato, String aeroportoOrigine) {
        super(codiceVolo, compagniaAerea, dataVolo, orarioPrevisto, ritardo, stato);
        this.aeroportoOrigine = aeroportoOrigine;
    }
}
