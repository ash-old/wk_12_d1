import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class TestDeveloper {

private Developer developer;

    @Before
    public void before(){
        developer = new Developer("Bob", "JT654321", 25000);
    }

    @Test
    public void canGetName(){
        assertEquals("Bob", developer.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("JT654321", developer.getNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(25000, developer.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(0.01);
        assertEquals(25250, developer.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(25250, developer.payBonus(), 0.1);
    }

}
