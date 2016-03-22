package com.example.nav.navmap.models;

/**
 * Created by mobiliser on 3/10/16.
 */

public class Sys {
    private String message;

    private String sunset;

    private String sunrise;

    private String country;

    public String getMessage() {
        return message;
    }
      public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "ClassPojo [message = " + message + ", sunset = " + sunset + ", sunrise = " + sunrise + ", country = " + country + "]";
    }
}
