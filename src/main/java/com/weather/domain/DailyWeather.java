package com.weather.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DailyWeather {
    String summary;
   Daily data[];


    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Daily[] getData() {
        return data;
    }

    public void setData(Daily[] data) {
        this.data = data;
    }
}
