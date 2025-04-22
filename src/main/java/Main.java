package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Duration;

public class MainTest {
    public static void main(String[] args) {
        VoloPartenzaDaNapoli volo1 = new VoloPartenzaDaNapoli(
                "NAP123", "ITA Airways",
                LocalDate.now(), LocalTime.of(14, 30),
                Duration.ofMinutes(0), StatoVolo.PROGRAMMATO,
                "Roma Fiumicino"
        );

        Gate gate5 = new Gate(5);
        UtenteAmministratore admin = new UtenteAmministratore("admin", "password");
        admin.modificaGate(volo1, gate5);

        UtenteGenerico utente = new UtenteGenerico("utente1", "password1");
        Prenotazione prenotazione = new Prenotazione(
                "TCK123", "RSSMRA00A01H501Z", "Mario", "Rossi",
                "12A", StatoPrenotazione.CONFERMATA, volo1
        );

        utente.prenotaVolo(volo1, prenotazione);
        utente.visualizzaPrenotazioni();
    }
}
