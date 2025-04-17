package org.example.main;

import org.example.app.App;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class AppManager {
    private final List<App> app;

    public AppManager(ApplicationContext context) {
        this.app = List.of(
                context.getBean("GameBean", App.class),
                context.getBean("WeatherBean", App.class),
                context.getBean("SocialWebBean", App.class)
        );
    }

    public void printNames() {
        for (App app : app) {
            System.out.println("App name: " + app.getName());
        }
    }
}