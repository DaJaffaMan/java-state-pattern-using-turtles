package Turtles;

public class Turtle {

    private State state;

    public Turtle() {
        state = new SleepingState(this);
    }

    public void doSwimming() {
        if(state instanceof SleepingState){
            updateState(new EatingState(this));
        } else {
            updateState(new SleepingState(this));
        }
    }

    private void updateState(State newState) {
        this.state = newState;
        this.state.onEnterState();
    }

    public void observe() {
        this.state.observe();
    }

    public String toString() {
        return "Turtle";
    }

}
