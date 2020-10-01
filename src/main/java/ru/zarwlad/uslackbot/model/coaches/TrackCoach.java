package ru.zarwlad.uslackbot.model.coaches;

public class TrackCoach extends AbstractCoach {

    @Override
    public void initCoach() {
        System.out.println("We just init " + TrackCoach.class);
    }

    @Override
    public void closeCoach() {
        System.out.println("We just destroy " + TrackCoach.class);
    }

    @Override
    public String getDailyWorkout() {
        return "new track daily workout";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
