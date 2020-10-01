package ru.zarwlad.uslackbot.model.coaches;

public class BaseballCoach extends AbstractCoach {
    public BaseballCoach(FortuneService fortuneService) {
        super.setFortuneService(fortuneService);
    }

    @Override
    public void initCoach() {
        System.out.println("We just init " + BaseballCoach.class);
    }

    @Override
    public void closeCoach() {
        System.out.println("We just destroy " + BaseballCoach.class);
    }

    @Override
    public String getDailyWorkout(){
        return "Spend some time for stupid game";
    }

    @Override
    public String getDailyFortune() {
        return super.getFortuneService().getFortune();
    }
}
