import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestManager {

    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Accounts", "John", "JT123456", 30000 );
    }

    @Test
    public void hasDeptName(){
        assertEquals("Accounts", manager.getDeptName());
    }

    @Test
    public void hasName(){
        assertEquals("John", manager.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("JT123456", manager.getNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000, manager.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(0.01);
        assertEquals(30300, manager.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(30300, manager.payBonus(), 0.1);
    }

    @Test
    public void canSetName() {
        manager.setName("");
        assertEquals("John", manager.getName());
    }

}
