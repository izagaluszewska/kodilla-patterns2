package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(Trainee trainee) {
        System.out.println(name + ": New tasks added by " + trainee.getTrainee() + "\n" +
                " (total: " + trainee.getDoneTasks().size() + " tasks)");
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
