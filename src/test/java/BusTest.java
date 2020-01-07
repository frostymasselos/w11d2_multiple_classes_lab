import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStopOne;

    @Before
    public void before(){
        bus = new Bus("Glasgow");
        person = new Person();
        busStopOne = new BusStop("Princess Street");
        bus.addPassenger(person);
    }

    @Test
    public void busHasDestination(){
        assertEquals("Glasgow", bus.getDestination());
    }

    @Test
    public void busHasCapacity(){
        bus = new Bus("Glasgow");
        assertEquals(25, bus.getCapacity());
    }

    @Test
    public void busHasNoPassengersAtStart(){
        bus = new Bus("Glasgow");
        assertEquals(0, bus.countPassengers());
    }

    @Test
    public void canAddPassengersWithinCapacity(){
        assertEquals(1, bus.countPassengers());
    }
//    It's a variable that is a person object!

    @Test
    public void whenAddPassengerCapacityDecreases(){
        assertEquals(24, bus.getCapacity());
    }

    @Test
    public void canRemovePassengerFromBus_CapacityIncreases(){
        bus.removePassenger();
        assertEquals(25, bus.getCapacity());
    }
    @Test
    public void canRemovePassengerFromBus_ListDecreases(){
        bus.removePassenger();
        assertEquals(0, bus.countPassengers());
    }
    @Test
    public void cantRemovePassengerWhenBusIsEmpty(){
        bus = new Bus("Glasgow");
        assertEquals(25, bus.getCapacity());
    }
    @Test
    public void canPickUpPersonFromStop_CapacityDecreases(){
        busStopOne.addPerson(person);
        bus.pickUp(busStopOne);
        assertEquals(23, bus.getCapacity());
    }

    @Test
    public void canPickUpPersonFromStop_PassengersIncreases(){
        busStopOne.addPerson(person);
        bus.pickUp(busStopOne);
        assertEquals(2, bus.countPassengers());
    }

    @Test
    public void canPickUpPersonFromStop_QueueDecreases(){
        busStopOne.addPerson(person);
        bus.pickUp(busStopOne);
        assertEquals(0, busStopOne.countPeopleInQueue());
    }
}
