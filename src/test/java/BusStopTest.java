import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    private BusStop stop1;
    private Person person1;
    private Person person2;

    @Before
    public void before (){
        stop1 = new BusStop("Princess Street");
        person1 = new Person();
        person2 = new Person();
    }

    @Test
    public void queStartsEmpty(){
        assertEquals(0, stop1.countPeopleInQueue());
    }

    @Test
    public void canAddPersonToQueue(){
        stop1.addPerson(person1);
        stop1.addPerson(person2);
        assertEquals(2, stop1.countPeopleInQueue());
    }

    @Test
    public void removePersonFromQueue(){
        stop1.addPerson(person1);
        stop1.removePerson();
        assertEquals(0, stop1.countPeopleInQueue());
    }

}
