package com.weather.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//public class HourlyWeather {
//    String summary;
//    Hourly[] data;
//
//    public String getSummary() {
//        return summary;
//    }
//
//    public Hourly[] getData() {
//        return data;
//    }
//
//    public void setSummary(String summary) {
//        this.summary = summary;
//    }
//
//    public void setData(Hourly[] data) {
//        this.data = data;
//    }
//}
@JsonIgnoreProperties(ignoreUnknown = true)
public class HourlyWeather {
    String summary;
    String icon;
    Hourly[] data;

    public String getSummary() {
        return summary;
    }

    public String getIcon() {
        return icon;
    }

    public Hourly[] getData() {
        return data;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }


    public void setData(Hourly[] data) {
        this.data = data;
    }
}
