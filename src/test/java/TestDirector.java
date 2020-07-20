import management.Director;
import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDirector {

    private Director director;

    @Before
    public void before(){
        director = new Director("Accounts", "Babs", "JT123459", 40000, 50000 );
    }

    @Test
    public void hasBudget(){
        assertEquals(50000, director.getBudget(), 0.1);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Accounts", director.getDeptName());
    }

    @Test
    public void hasName(){
        assertEquals("Babs", director.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("JT123459", director.getNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(40000, director.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(0.01);
        assertEquals(40400, director.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(40800, director.payBonus(), 0.1);
    }




}
