import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sppcw.Income;
import sppcw.Rate;
import static org.junit.jupiter.api.Assertions.*;

public class IncomeTest {

    @Test
    public void testIncome() {
        Income basicInc = new Income(49000, 0);
        Income basicEdgeInc = new Income(50000, 0);
        Income higherInc = new Income(140000, 0);
        Income higherEdgeInc = new Income(150000, 0);
        Income additionalInc = new Income(200000, 0);
        Income withSave = new Income(149000, 2000);


        assertEquals(Rate.BASIC, basicInc.taxBand());
        assertEquals(Rate.BASIC, basicEdgeInc.taxBand());
        assertEquals(Rate.HIGHER, higherInc.taxBand());
        assertEquals(Rate.HIGHER, higherEdgeInc.taxBand());
        assertEquals(Rate.ADDITIONAL, additionalInc.taxBand());
        assertEquals(Rate.HIGHER, withSave.taxBand());
    }
}
