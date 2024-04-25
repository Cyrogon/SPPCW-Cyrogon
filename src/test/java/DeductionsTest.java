import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sppcw.Deductions;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Deductions Tests")
public class DeductionsTest {

    @Test
    @DisplayName("Testing a single Deduction")
    public void testSingle() {
        Deductions ded = new Deductions();
        ded.addDeduction("Ded 1", 200);

        assertEquals(200, ded.totalDeductions());

    }

    @Test
    @DisplayName("Testing Multiple Deductions total")
    public void testMultiple() {
        Deductions ded = new Deductions();
        ded.addDeduction("Ded 1", 200);
        ded.addDeduction("Ded 2", 200);
        ded.addDeduction("Ded 3", 200);
        assertEquals(600, ded.totalDeductions());
    }

    @Test
    @DisplayName("No deductions total test")
    public void testNone() {
        Deductions ded = new Deductions();
        assertEquals(0, ded.totalDeductions());
    }
}
