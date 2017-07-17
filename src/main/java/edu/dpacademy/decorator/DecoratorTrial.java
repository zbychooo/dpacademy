package edu.dpacademy.decorator;

/**
 * This is dpacademy. Good Luck!
 */
public class DecoratorTrial {

    public static void main(String args[]) {
        Person p = new Frank();
        SingingSkill pd = new SingingSkill(p);
        System.out.println(pd.getName());

        DrawingSkill pd2 = new DrawingSkill(pd);
        System.out.println(pd2.getName());

    }
}


abstract class Person {
    public String getName() {
        return "";
    }
}

class Frank extends Person {

    @Override
    public String getName() {
        return "Frank";
    }
}

class Anna extends Person {

    @Override
    public String getName() {
        return "Anna";
    }
}

abstract class PersonDecorator extends Person {

    public abstract String getName();
}

class DrawingSkill extends  PersonDecorator {

    private Person p;

    public DrawingSkill(Person p) {
        this.p = p;
    }

    public String getName() {
        return p.getName() + " +Drawing";
    }
}

class SingingSkill extends PersonDecorator {

    private Person p;

    public SingingSkill(Person p) {
        this.p = p;
    }

    public String getName() {
        return p.getName() + " +Singing";
    }
}
