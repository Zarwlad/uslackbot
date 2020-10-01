package ru.zarwlad.uslackbot.model.coaches;

public interface Coach {
    public String getDailyWorkout();
    public String getDailyFortune();
    public void initCoach();
    public void closeCoach();
}
