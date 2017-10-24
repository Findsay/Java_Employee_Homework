package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Fiona1 on 24/10/2017.
 */

public class DirectorTest {
    Director director;

    @Before
    public void setUp() {
        director = new Director();
    }

    @Test
    public void canGetBudget() {
        assertEquals(0, director.getBudget(), 0.1);
    }

}
