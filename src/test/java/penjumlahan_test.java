import org.example.Main.penjumlahan;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class penjumlahan_test {

    @Test
    public void test_penjumlahan_positive_numbers(){
        penjumlahan calculator = new penjumlahan();
        int result = calculator.add(2, 3);
        assertEquals(5, result, "2 + 3 seharusnya 5");
    }

    @Test
    public void test_penjumlahan_negative_numbers(){
        penjumlahan calculator = new penjumlahan();
        int result = calculator.add(-2, -3);
        assertEquals(-5, result, "-2 + -3 seharusnya -5");
    }

    @Test
    public void test_penjumlahan_mixed_numbers(){
        penjumlahan calculator = new penjumlahan();
        int result = calculator.add(-2, 3);
        assertEquals(1, result, "-2 + 3 seharusnya 1");
    }

    @Test
    public void test_penjumlahan_zero(){
        penjumlahan calculator = new penjumlahan();
        int result = calculator.add(0, 0);
        assertEquals(0, result, "0 + 0 seharusnya 0");
    }


    @Test
    public void test_penjumlahan_failure_case(){
        penjumlahan calculator = new penjumlahan();
        int result = calculator.add(2, 3);
        assertEquals(7, result, "2 + 3 seharusnya bukan 7");
    }

    @Test
    public void test_penjumlahan_failure_case_pass(){
        penjumlahan calculator = new penjumlahan();
        int result = calculator.add(2, 3);
        assertNotEquals(7, result, "2 + 3 seharusnya bukan 7");
    }


}
