package com.weather.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Hourly {
    String summary;
    double precipProbability;
    double visibility;
    double precipIntensity;
    String icon;
    double cloudCover;
    double windBearing;
    double apparentTemperature;
    double pressure;
    double dewPoint;
    double temperature;
    double humidity;
    int time;
    double windSpeed;
    double uvIndex;

    public String getSummary() {
        return summary;
    }

    public double getPrecipProbability() {
        return precipProbability;
    }

    public double getVisibility() {
        return visibility;
    }

    public double getPrecipIntensity() {
        return precipIntensity;
    }

    public String getIcon() {
        return icon;
    }

    public double getCloudCover() {
        return cloudCover;
    }

    public double getWindBearing() {
        return windBearing;
    }

    public double getApparentTemperature() {
        return apparentTemperature;
    }

    public double getPressure() {
        return pressure;
    }

    public double getDewPoint() {
        return dewPoint;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public int getTime() {
        return time;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public double getUvIndex() {
        return uvIndex;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setPrecipProbability(double precipProbability) {
        this.precipProbability = precipProbability;
    }

    public void setVisibility(double visibility) {
        this.visibility = visibility;
    }

    public void setPrecipIntensity(double precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setCloudCover(double cloudCover) {
        this.cloudCover = cloudCover;
    }

    public void setWindBearing(double windBearing) {
        this.windBearing = windBearing;
    }

    public void setApparentTemperature(double apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public void setDewPoint(double dewPoint) {
        this.dewPoint = dewPoint;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public void setUvIndex(double uvIndex) {
        this.uvIndex = uvIndex;
    }
}
