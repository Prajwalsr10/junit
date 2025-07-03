
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.ust.Calculator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
/**
 *
 * @author Administrator
 */
public class TestCalculator {

    @Rule
    public ExpectedException monitor = ExpectedException.none();
    Calculator calculator = new Calculator();

    @Test
    public void testDivideForException() {
        monitor.expect(IllegalAccessException.class);
        calculator.divide(100, 0);
    }
}
