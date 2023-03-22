package spaceexplorers.strategies;

import spaceexplorers.publicapi.*;

import java.util.List;
import java.util.Queue;

public class StudentStrategy implements IStrategy {

    /**
     * Method where students can observe the state of the system and schedule events to be executed.
     *
     * @param planets          The current state of the system.
     * @param planetOperations Helper methods students can use to interact with the system.
     * @param eventsToExecute  Queue students will add to in order to schedule events.
     */
    @Override
    public void takeTurn(List<IPlanet> planets, IPlanetOperations planetOperations, Queue<IEvent> eventsToExecute) {
        //TODO: Write your strategy here
    }

    @Override
    public String getName() {
        return "Student";
    }

    @Override
    public boolean compete() {
        return false;
    }
}
