import java.util.ArrayList;

public class Bus {

    private String destination;
    private Integer capacity;
    private ArrayList<Person> passengers;
    private BusStop stop;

    public Bus(String destination){
        this.destination = destination;
        this.capacity = 25;
        this.passengers = new ArrayList<Person>();
    }

    public String getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public int countPassengers() {
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        if (this.capacity >= 1){
            this.passengers.add(person);
            this.capacity -= 1;
        }
    }

    public void removePassenger() {
        if (passengers.size() != 0){
            this.passengers.remove(0);
            this.capacity += 1;
        }

    }

    public void pickUp(BusStop stop) {
        if (stop.countPeopleInQueue() != 0 && this.capacity >= 1){
            this.passengers.addPassenger();
            this.capacity -= 1;

        }
    }
}
