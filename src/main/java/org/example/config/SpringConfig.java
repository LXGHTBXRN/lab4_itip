package org.example.config;

import org.example.app.Game;
import org.example.app.Weather;
import org.example.app.SocialWeb;
import org.example.app.App;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean(name = "GameBean")
    public App getGameBean() {
        return new Game();
    }

    @Bean(name = "WeatherBean")
    public App getWeatherBean() {
        return new Weather();
    }

    @Bean(name = "SocialWebBean")
    public App getSocialWebBean() {
        return new SocialWeb();
    }
}