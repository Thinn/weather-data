package com.weather.domain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
//@Data
//@Document(collection = "countries")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {
    @Id
    String name;

    int offset;


    double latitude;

    double longitude;
    String timezone;

    HourlyWeather hourly ;
    DailyWeather daily;

    public void setName(String name) {
        this.name = name;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public void setHourly(HourlyWeather hourly) {
        this.hourly = hourly;
    }

    public void setDaily(DailyWeather daily) {
        this.daily = daily;
    }

    public String getName() {
        return name;
    }

    public int getOffset() {
        return offset;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getTimezone() {
        return timezone;
    }

    public HourlyWeather getHourly() {
        return hourly;
    }

    public DailyWeather getDaily() {
        return daily;
    }
}
