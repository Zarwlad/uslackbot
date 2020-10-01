package ru.zarwlad.uslackbot;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.zarwlad.uslackbot.model.coaches.AbstractCoach;
import ru.zarwlad.uslackbot.model.coaches.Coach;

public class HelloSpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annoAppContext.xml");
        Coach coach = context.getBean("cricketCoach", Coach.class);
        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getDailyWorkout());
        if (coach instanceof AbstractCoach){
            System.out.println(((AbstractCoach) coach).getEmailAddress());
            System.out.println(((AbstractCoach) coach).getTeam());
        }
        context.close();
    }
}
