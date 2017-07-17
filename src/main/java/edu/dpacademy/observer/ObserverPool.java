package edu.dpacademy.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * This is dpacademy. Good Luck!
 */
public class ObserverPool {

    public static void main(String args[]) {
        Subject sub = new Subject();

        new TVPObserver(sub);
        new TVNObserver(sub);

        for (int i = 0; i < 10; i++) {
            System.out.println("i ----------" + i);
            sub.setState(i);
        }
    }
}

abstract class Observer {

    protected Subject subject;

    public abstract void update();
}

class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        exe();
        this.state = state;
    }

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void exe() {
        for (Observer o : observers) {

            o.update();
        }
    }
}

class TVNObserver extends Observer {

    public TVNObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("TVN : " + this.subject.getState() + 100);
    }
}

class TVPObserver extends Observer {

    public TVPObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("TVP : " + this.subject.getState() + 30);
    }
}