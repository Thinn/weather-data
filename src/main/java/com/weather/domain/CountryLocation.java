package com.weather.domain;

public class CountryLocation {
   double latitude;
    double longitude;
    public CountryLocation() {

    }

    public CountryLocation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getLatitude())+String.valueOf(this.getLongitude());
    }
}
