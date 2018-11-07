package ar.edu.itba.poo.ej3;

public class Participant {

    private String name;
    private int age;
    private int startTime;
    private int endTime;

    public Participant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void start(int time) {
        startTime = time;
    }

    public void end(int time) {
        endTime = time;
    }

    public boolean hasTime() {
        return startTime != 0 && endTime != 0;
    }

    public int getTotalTime() {
        return endTime - startTime;
    }

    @Override
    public String toString() {
        return String.valueOf(endTime);
    }
}
