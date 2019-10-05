package vehicles;

import org.junit.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CarTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(CarTest.class);//logger de test
    //sa vedem ca before o sa fie rulat inaintea fiecarui test
    private Vehicle testVehicle; //cu static se modifica si ramane aceeasi pentru toate testele

    @BeforeClass
    public static void carTestSetup() {
        LOGGER.info("Before all tests.");
    }

    @Before
    public void testSetup() {
        LOGGER.info("Before each test.");
        testVehicle = new Car(30);
    }

    @Test(expected = Vehicle.VehicleCrashedException.class)
//    public void testMaxSpeedIsReachable() {
    public void testMaxSpeedCanNotBeExceeded() {
        int startSpeed = testVehicle.getCurrentSpeed();
        int maxSpeed = testVehicle.getMaxSpeed();
        for (int i = startSpeed; i <= maxSpeed; i++){
            testVehicle.increaseSpeed();
        }
//        assertTrue(testVehicle.getCurrentSpeed() == maxSpeed);
//        assertEquals(30, testVehicle.getCurrentSpeed());
        assertEquals(maxSpeed, testVehicle.getCurrentSpeed());
    }

    @After
    public void testCleanup() {
        LOGGER.info("After each test.");
    }

    @AfterClass //undeva after all si before all mai sus
    public static void finalizeTestingProgram() {
        LOGGER.info("Finalizing testing program.");
    }
}
