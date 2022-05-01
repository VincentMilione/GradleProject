import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestProva {

    int prova=0;

    @Test
    void add() {
        assertEquals(4, Calculator.add(2, 2));

    }



    @Test
    public void testInvoice() throws Throwable
    {
        Item expItem = Calculator.process();
        Item actual = new Item ("Patatine", 4, "queste sono patatine");
// some code here…
        expItem.getName();
        assertEquals(expItem.getDesc(), actual.getDesc());
        assertEquals(expItem.getQt(), actual.getQt());
    }


    @Test
    void multiply() {
    }
}
