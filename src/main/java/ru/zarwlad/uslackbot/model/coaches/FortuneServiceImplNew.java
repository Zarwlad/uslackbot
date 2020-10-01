package ru.zarwlad.uslackbot.model.coaches;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class FortuneServiceImplNew implements FortuneService{
    private static List<String> fortunes = new ArrayList<>();
    static {
        Collections.addAll(fortunes,"Fort1", "Fort2", "Fort3");
    }

    @Override
    public String getFortune() {
        Random random = new Random(0);

        return fortunes.get(random.nextInt(3));
    }
}
