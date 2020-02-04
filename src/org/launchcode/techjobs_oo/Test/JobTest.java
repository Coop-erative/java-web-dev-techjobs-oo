package org.launchcode.techjobs_oo.Test;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class JobTest {

    //Construct test objects
    Job testJob1, testJob2,testJob3,testJob4;

    //Test job

    @Before
    public void setup() {
        testJob1 = new Job();
        testJob2 = new Job();
        testJob3 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        testJob4 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
    }
    @Test
    public void testSettingJobId() {
        assertEquals(1, testJob2.getId() - testJob1.getId());
     }
    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals("Product Tester", testJob3.getName());
        assertEquals("ACME", testJob3.getEmployer().getValue());
        assertEquals("Desert", testJob3.getLocation().getValue());
        assertEquals("Quality Control", testJob3.getPositionType().getValue());
        assertEquals("Persistence", testJob3.getCoreCompetency().getValue());
    }
    @Test
    public void testJobsForEquality() {
        assertFalse(testJob1.equals(testJob2));
        assertFalse(testJob3.equals(testJob4));
    }
    public void jobConstructorTest() {
        Job jobTest = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertEquals(1,jobTest.getId());
    }
    @Test
    public void jobToStringTest() {
        assertEquals("ID: 11" + "\n" +
                "Name: Product Tester\n" +
                "employer: ACME\n" +
                "Location: Desert\n" +
                "positionType: Quality Control\n" +
                "coreCompetency: Persistence\n", testJob3.toString());
    }

    @Test
    public void jobDoesNotExist() {
        Job jobTest = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        assertEquals("OOPS! This job does not seem to exist.",jobTest.toString());
    }

    @Test
    public void jobDataNotAvailableTest() {
        Job jobTest = new Job("Product tester", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        assertEquals("ID: 7" + "\n" +
                "Name: Product tester\n" +
                "employer: Data not available\n" +
                "Location: Data not available\n" +
                "positionType: Data not available\n" +
                "coreCompetency: Data not available\n", jobTest.toString());
    }
    //Test CoreCompetency

    //Test Employer

    //Test Location

    //Test PositionType

}
