package com.mehnaaz.makeadonation.controller;

import com.mehnaaz.makeadonation.configs.MakeADonationProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final MakeADonationProperties properties;
    @Value("${mad.welcomeMessage: Hello,😅 }")
    private String welcomeMessage;

    public HomeController(MakeADonationProperties properties) {
        this.properties = properties;
    }



    @GetMapping("/")
    public MakeADonationProperties homePage(){
        return  this.properties;
    }
}
