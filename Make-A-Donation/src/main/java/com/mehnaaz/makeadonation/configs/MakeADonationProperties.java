package com.mehnaaz.makeadonation.configs;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@ConfigurationProperties(value =  "mad")
public record MakeADonationProperties (String welcomeMsg, String about, List<String> allCharities){
}
