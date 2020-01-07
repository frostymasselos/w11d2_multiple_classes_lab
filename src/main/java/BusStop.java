import java.util.ArrayList;

public class BusStop {
    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name){
        this.name = name;
        this.queue = new ArrayList<Person>();
    }
//    ^This is initializing

    public int countPeopleInQueue() {
        return this.queue.size();
    }

    public void addPerson(Person person) {
        this.queue.add(person);
    }

    public void removePerson() {
        if (this.queue.size() != 0) {
            this.queue.remove(0);
        }
    }
}
