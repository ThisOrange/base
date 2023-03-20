package hu.bme.mit.train.sensor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import hu.bme.mit.train.interfaces.TrainSensor;

public class TrainSensorTest {
    TrainSensor sensor;

    @Before
    public void before() {
         
    }

    @Test
    public void ThisIsAnExampleTestStub() {
        int speedlimit = 10;
        sensor.overrideSpeedLimit(speedlimit);
        Assert.assertEquals(10, sensor.getSpeedLimit());
    }
}
