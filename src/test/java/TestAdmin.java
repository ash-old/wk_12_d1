import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class TestAdmin {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Giles", "JT654320", 20000);
    }
    @Test
    public void canGetName(){
        assertEquals("Giles", databaseAdmin.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("JT654320", databaseAdmin.getNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(20000, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(0.01);
        assertEquals(20200, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(20200, databaseAdmin.payBonus(), 0.1);
    }

}
