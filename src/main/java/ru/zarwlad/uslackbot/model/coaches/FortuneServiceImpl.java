package ru.zarwlad.uslackbot.model.coaches;

import org.springframework.stereotype.Component;

@Component
public class FortuneServiceImpl implements FortuneService {
    @Override
    public String getFortune() {
        return "not bad, not bad";
    }
}
