package hu.bme.mit.train.sensor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;

import static org.mockito.Mockito.*;



public class TrainSensorTest {
    TrainSensor sensor;
    TrainUser user;
    TrainController controller;


    @Before
    public void before() {
         sensor = new TrainSensorImpl(controller, user);
    }

    @Test
    public void ThisIsAnExampleTestStub() {
        int speedlimit = 5;
        sensor.overrideSpeedLimit(speedlimit);
        Assert.assertEquals(5, sensor.getSpeedLimit());
    }
}
