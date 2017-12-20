package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class MentorTaskSuite {
    @Test
    public void testUpdate() {
        //Given
        Trainee iza = new Trainee("iza");
        Trainee maciej = new Trainee("maciej");
        Trainee kamila = new Trainee("kamila");
        Trainee patrycja = new Trainee("patrycja");
        Mentor michal = new Mentor("michal");
        Mentor tomek = new Mentor("tomek");
        iza.getObservers().add(michal);
        maciej.getObservers().add(michal);
        kamila.getObservers().add(tomek);
        patrycja.getObservers().add(michal);
        //When
        iza.addTask(1);
        iza.addTask(3);
        maciej.addTask(2);
        maciej.addTask(1);
        maciej.addTask(3);
        kamila.addTask(4);
        patrycja.addTask(2);
        //Then
        Assert.assertEquals(6, michal.getUpdateCount());
        Assert.assertEquals(1, tomek.getUpdateCount());
    }
}
