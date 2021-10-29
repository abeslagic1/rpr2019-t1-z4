package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void getArtikli() {
        Korpa novaKorpa = new Korpa();
        novaKorpa.dodajArtikl(new Artikl("auto", 20000, "5"));
        Artikl[] artikli = new Artikl[50];
        artikli[0] = new Artikl("motor", 10000, "4");
        assertAll("poredjenje",
                () -> assertEquals("motor", artikli[0].getNaziv()),
                () -> assertEquals(10000, artikli[0].getCijena()),
                () -> assertEquals("4", artikli[0].getKod()));
    }

    @Test
    void dodajArtikl() {
        Artikl a = new Artikl("motor", 12000, "11");
        Korpa novaKorpa = new Korpa();
        assertTrue(novaKorpa.dodajArtikl(a));
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa novaKorpa = new Korpa();
        novaKorpa.dodajArtikl(new Artikl("auto", 20000, "7"));
        novaKorpa.dodajArtikl(new Artikl("motor", 7000, "3"));
        novaKorpa.dodajArtikl(new Artikl("biciklo", 300, "1"));
        assertEquals(27300, novaKorpa.dajUkupnuCijenuArtikala());
    }
    @Test
    void dajUkupnuCijenuArtikla(){
        Korpa novaKorpa = new Korpa();
        assertEquals(0, novaKorpa.dajUkupnuCijenuArtikala());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa novaKorpa = new Korpa();
        novaKorpa.dodajArtikl(new Artikl("auto", 20000, "1"));
        novaKorpa.dodajArtikl(new Artikl("motor", 7000, "2"));
        novaKorpa.dodajArtikl(new Artikl("biciklo", 300, "3"));
        Artikl a = novaKorpa.izbaciArtiklSaKodom("2");
        assertAll("izbaci",
                () -> assertEquals("motor", a.getNaziv()),
                () -> assertEquals(7000, a.getCijena()),
                () -> assertEquals("2", a.getKod()));
    }

    @Test
    void izbaciArtiklSaKodomVelicinaKorpe(){
        Korpa novaKorpa = new Korpa();
        novaKorpa.dodajArtikl(new Artikl("auto", 20000, "1"));
        novaKorpa.dodajArtikl(new Artikl("motor", 7000, "2"));
        novaKorpa.dodajArtikl(new Artikl("biciklo", 300, "3"));
        Artikl a = novaKorpa.izbaciArtiklSaKodom("2");
        assertEquals(2, novaKorpa.getVelicina());
    }
}