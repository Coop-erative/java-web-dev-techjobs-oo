package org.launchcode.techjobs_oo;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


public class SetUpAndTearDownTest {

    //Construct test objects
    /*    private CoreCompetency testCoreCompetency = new CoreCompetency("test");
    //
    //    private Employer testEmployer = new Employer("test");
    //
    //    private Location kansas = new Location("test");
    //
    //    private PositionType testPositionType = new PositionType("test");
*/

    //Test CoreCompetency

    //Test Employer

//    //Test Job
    @Test
    public void jobConstructorTest() {
        Job jobTest = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(1,jobTest.getId());
    }
    @Test
    public void jobEqualsTest() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(true, job1.getName().equals(job2.getName()));
    }
    @Test
    public  void jobToStringTest() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Name: Product tester\n" +
                "employer: ACME\n" +
                "Location: Desert\n" +
                "positionType: Quality control\n" +
                "coreCompetency: Persistence\n", job1.toString());

    }
    //Test Location


    //Test PositionType

}
