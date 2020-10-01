package ru.zarwlad.uslackbot.model.coaches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach extends AbstractCoach {
    public CricketCoach() {
    }

    @Override
    @Value("${coach.email}")
    public void setEmailAddress(String emailAddress) {
        super.setEmailAddress(emailAddress);
    }

    @Override
    @Value("${coach.team}")
    public void setTeam(String team) {
        super.setTeam(team);
    }

    @Autowired
    @Qualifier(value = "fortuneServiceImplNew")
    @Override
    public void setFortuneService(FortuneService fortuneService) {
        super.setFortuneService(fortuneService);
    }

    @Override
    public void initCoach() {
        System.out.println("We just init " + CricketCoach.class);
    }

    @Override
    public void closeCoach() {
        System.out.println("We just destroy " + CricketCoach.class);
    }

    @Override
    public String getDailyWorkout() {
        return "cricketCoachDailyWorkout";
    }

    @Override
    public String getDailyFortune() {
        return "cricketDailyFortune: " + super.getFortuneService().getFortune();
    }
}
