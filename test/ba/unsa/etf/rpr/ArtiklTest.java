package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void getNaziv() {
        Artikl a = new Artikl("laptop", 1000, "1");
        assertEquals("laptop", a.getNaziv());
    }

    @Test
    void getCijena() {
        Artikl a = new Artikl("laptop", 1000, "1");
        assertEquals(1000, a.getCijena());
    }

    @Test
    void getKod() {
        Artikl a = new Artikl("laptop", 1000, "1");
        assertEquals("1", a.getKod());
    }
}