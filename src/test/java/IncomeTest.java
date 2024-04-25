import org.junit.jupiter.api.*;
import sppcw.Income;
import sppcw.Rate;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Income Enum tests")
public class IncomeTest {

    @Test
    @DisplayName("Testing Work Income Getter")
    public void testIncomeGetter() {

        Income income= new Income(200000, 0);

        assertEquals(200000, income.getWorkIncome());

    }

    @Test
    @DisplayName("Testing Work Savings Getter")
    public void testSavingsGetter() {
        Income income= new Income(0, 200000);
        assertEquals(200000, income.getSavingsIncome());
    }

    @Test
    @DisplayName("Expected Data Tests")
    public void testRegularIncome() {

        Income basicInc = new Income(49000, 0);
        Income higherInc = new Income(140000, 0);
        Income additionalInc = new Income(200000, 0);

        assertEquals(Rate.BASIC, basicInc.taxBand());
        assertEquals(Rate.HIGHER, higherInc.taxBand());
        assertEquals(Rate.ADDITIONAL, additionalInc.taxBand());

    }

    @Test
    @DisplayName("Edge Case Data Tests")
    public void testEdgeCases() {
        Income basicEdgeInc = new Income(50000, 0);
        Income higherEdgeInc = new Income(150000, 0);

        assertEquals(Rate.BASIC, basicEdgeInc.taxBand());
        assertEquals(Rate.HIGHER, higherEdgeInc.taxBand());
    }

    @Test
    @DisplayName("Test Savings")
    public void testSavings() {
        Income withSave = new Income(149000, 2000);
        assertEquals(Rate.ADDITIONAL, withSave.taxBand());
    }
}
