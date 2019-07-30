package com.weather.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Daily {
    double windGust;
    int apparentTemperatureMinTime;
    double temperatureMax;
    String icon;
    double precipIntensityMax;
    double windBearing;
    int temperatureMaxTime;
     double apparentTemperatureMin;
     int sunsetTime;
     double temperatureLow;
     String precipType;
    double humidity;
     double moonPhase;
     double windSpeed;
     int apparentTemperatureLowTime;
    int sunriseTime;
    double apparentTemperatureLow;
    String summary;
    int precipProbability;
    int temperatureHighTime;
    double visibility;
    double precipIntensity;
    double cloudCover;
    double temperatureMin;
    int apparentTemperatureHighTime;
     double pressure;
     double dewPoint;
     int temperatureMinTime;
     int uvIndexTime;
     double apparentTemperatureMax;
    double  temperatureHigh;
    int  temperatureLowTime;
    double  precipAccumulation;
    double  apparentTemperatureHigh;
    int  time;
    int precipIntensityMaxTime;
    int windGustTime;
    int uvIndex;
    int apparentTemperatureMaxTime;

    public double getWindGust() {
        return windGust;
    }

    public int getApparentTemperatureMinTime() {
        return apparentTemperatureMinTime;
    }

    public double getTemperatureMax() {
        return temperatureMax;
    }

    public String getIcon() {
        return icon;
    }

    public double getPrecipIntensityMax() {
        return precipIntensityMax;
    }

    public double getWindBearing() {
        return windBearing;
    }

    public int getTemperatureMaxTime() {
        return temperatureMaxTime;
    }

    public double getApparentTemperatureMin() {
        return apparentTemperatureMin;
    }

    public int getSunsetTime() {
        return sunsetTime;
    }

    public double getTemperatureLow() {
        return temperatureLow;
    }

    public String getPrecipType() {
        return precipType;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getMoonPhase() {
        return moonPhase;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public int getApparentTemperatureLowTime() {
        return apparentTemperatureLowTime;
    }

    public int getSunriseTime() {
        return sunriseTime;
    }

    public double getApparentTemperatureLow() {
        return apparentTemperatureLow;
    }

    public String getSummary() {
        return summary;
    }

    public int getPrecipProbability() {
        return precipProbability;
    }

    public int getTemperatureHighTime() {
        return temperatureHighTime;
    }

    public double getVisibility() {
        return visibility;
    }

    public double getPrecipIntensity() {
        return precipIntensity;
    }

    public double getCloudCover() {
        return cloudCover;
    }

    public double getTemperatureMin() {
        return temperatureMin;
    }

    public int getApparentTemperatureHighTime() {
        return apparentTemperatureHighTime;
    }

    public double getPressure() {
        return pressure;
    }

    public double getDewPoint() {
        return dewPoint;
    }

    public int getTemperatureMinTime() {
        return temperatureMinTime;
    }

    public int getUvIndexTime() {
        return uvIndexTime;
    }

    public double getApparentTemperatureMax() {
        return apparentTemperatureMax;
    }

    public double getTemperatureHigh() {
        return temperatureHigh;
    }

    public int getTemperatureLowTime() {
        return temperatureLowTime;
    }

    public double getPrecipAccumulation() {
        return precipAccumulation;
    }

    public double getApparentTemperatureHigh() {
        return apparentTemperatureHigh;
    }

    public int getTime() {
        return time;
    }

    public int getPrecipIntensityMaxTime() {
        return precipIntensityMaxTime;
    }

    public int getWindGustTime() {
        return windGustTime;
    }

    public int getUvIndex() {
        return uvIndex;
    }

    public int getApparentTemperatureMaxTime() {
        return apparentTemperatureMaxTime;
    }

    public void setWindGust(double windGust) {
        this.windGust = windGust;
    }

    public void setApparentTemperatureMinTime(int apparentTemperatureMinTime) {
        this.apparentTemperatureMinTime = apparentTemperatureMinTime;
    }

    public void setTemperatureMax(double temperatureMax) {
        this.temperatureMax = temperatureMax;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setPrecipIntensityMax(double precipIntensityMax) {
        this.precipIntensityMax = precipIntensityMax;
    }

    public void setWindBearing(double windBearing) {
        this.windBearing = windBearing;
    }

    public void setTemperatureMaxTime(int temperatureMaxTime) {
        this.temperatureMaxTime = temperatureMaxTime;
    }

    public void setApparentTemperatureMin(double apparentTemperatureMin) {
        this.apparentTemperatureMin = apparentTemperatureMin;
    }

    public void setSunsetTime(int sunsetTime) {
        this.sunsetTime = sunsetTime;
    }

    public void setTemperatureLow(double temperatureLow) {
        this.temperatureLow = temperatureLow;
    }

    public void setPrecipType(String precipType) {
        this.precipType = precipType;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public void setMoonPhase(double moonPhase) {
        this.moonPhase = moonPhase;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public void setApparentTemperatureLowTime(int apparentTemperatureLowTime) {
        this.apparentTemperatureLowTime = apparentTemperatureLowTime;
    }

    public void setSunriseTime(int sunriseTime) {
        this.sunriseTime = sunriseTime;
    }

    public void setApparentTemperatureLow(double apparentTemperatureLow) {
        this.apparentTemperatureLow = apparentTemperatureLow;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setPrecipProbability(int precipProbability) {
        this.precipProbability = precipProbability;
    }

    public void setTemperatureHighTime(int temperatureHighTime) {
        this.temperatureHighTime = temperatureHighTime;
    }

    public void setVisibility(double visibility) {
        this.visibility = visibility;
    }

    public void setPrecipIntensity(double precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    public void setCloudCover(double cloudCover) {
        this.cloudCover = cloudCover;
    }

    public void setTemperatureMin(double temperatureMin) {
        this.temperatureMin = temperatureMin;
    }

    public void setApparentTemperatureHighTime(int apparentTemperatureHighTime) {
        this.apparentTemperatureHighTime = apparentTemperatureHighTime;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public void setDewPoint(double dewPoint) {
        this.dewPoint = dewPoint;
    }

    public void setTemperatureMinTime(int temperatureMinTime) {
        this.temperatureMinTime = temperatureMinTime;
    }

    public void setUvIndexTime(int uvIndexTime) {
        this.uvIndexTime = uvIndexTime;
    }

    public void setApparentTemperatureMax(double apparentTemperatureMax) {
        this.apparentTemperatureMax = apparentTemperatureMax;
    }

    public void setTemperatureHigh(double temperatureHigh) {
        this.temperatureHigh = temperatureHigh;
    }

    public void setTemperatureLowTime(int temperatureLowTime) {
        this.temperatureLowTime = temperatureLowTime;
    }

    public void setPrecipAccumulation(double precipAccumulation) {
        this.precipAccumulation = precipAccumulation;
    }

    public void setApparentTemperatureHigh(double apparentTemperatureHigh) {
        this.apparentTemperatureHigh = apparentTemperatureHigh;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setPrecipIntensityMaxTime(int precipIntensityMaxTime) {
        this.precipIntensityMaxTime = precipIntensityMaxTime;
    }

    public void setWindGustTime(int windGustTime) {
        this.windGustTime = windGustTime;
    }

    public void setUvIndex(int uvIndex) {
        this.uvIndex = uvIndex;
    }

    public void setApparentTemperatureMaxTime(int apparentTemperatureMaxTime) {
        this.apparentTemperatureMaxTime = apparentTemperatureMaxTime;
    }
}
