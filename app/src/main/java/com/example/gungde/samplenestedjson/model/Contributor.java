package com.example.gungde.samplenestedjson.model;

/**
 * Created by gungde on 08/03/17.
 */

public class Contributor {

    String login;
    String html_url;

    int contributions;

    @Override
    public String toString() {
        return login + " (" + contributions + ")";
    }
}
