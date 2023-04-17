package ru.netology.Homework42.controllers;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.Homework42.models.SystemProfile;

@RestController
@ConfigurationProperties("prop")
@RequestMapping("/")
public class ProfileController {
    private String name;
    private SystemProfile profile;

    public void setName(String name) {
        this.name = name;
    }

    public ProfileController(SystemProfile profile) {
        this.profile = profile;
    }

    @GetMapping("name")
    public String printName() {
        return String.format("%s", name);
    }

    @GetMapping
    public String getProfile() {
        return profile.getProfile();
    }
}
