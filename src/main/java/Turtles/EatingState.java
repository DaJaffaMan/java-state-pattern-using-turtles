package Turtles;

public class EatingState implements State {

    private Turtle turtle;

    public EatingState(Turtle turtle) {
        this.turtle = turtle;
    }

    public void observe() {
        System.out.println(String.format("%s is eating", turtle.toString()));
    }

    public void onEnterState() {
        System.out.println(String.format("*%ss stomach begins to rumble*", turtle.toString()));
    }
}
