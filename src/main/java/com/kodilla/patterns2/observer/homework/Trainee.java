package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Trainee implements Observable {
    private final List<Observer> observers;
    private final Queue<Integer> doneTasks;
    private final String trainee;

    public Trainee(String trainee) {
        observers = new ArrayList<>();
        doneTasks = new ArrayDeque<>();
        this.trainee = trainee;
    }

    public void addTask(int number) {
        doneTasks.add(number);
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public String getTrainee() {
        return trainee;
    }

    public Queue<Integer> getDoneTasks() {
        return doneTasks;
    }
}
