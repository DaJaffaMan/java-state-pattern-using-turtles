package Turtles;

public class SleepingState implements State {

    private Turtle turtle;

    public SleepingState(Turtle turtle) {
        this.turtle = turtle;
    }

    public void observe() {
        System.out.println(String.format("%s is sleeping", turtle.toString()));
    }

    public void onEnterState() {
        System.out.println(String.format("*%s starts yawning*", turtle.toString()));
    }
}
