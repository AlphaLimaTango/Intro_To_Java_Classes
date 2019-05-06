import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void volumeStartsAt100(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void drinkTakes10(){
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void emptyWaterBottle(){
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void fillWaterBottle(){
        waterBottle.drink();
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume());
    }

}
