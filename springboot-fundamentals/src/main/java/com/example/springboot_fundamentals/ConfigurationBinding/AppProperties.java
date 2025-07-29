package com.example.springboot_fundamentals.ConfigurationBinding;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app")
public class AppProperties {
 private String title;
 public String getTitle()
 {
     return title;
 }
public void setTitle(String Title)
 {
    this.title=Title;
 }
}
