package com.weather.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.weather.domain.Country;
import com.weather.domain.CountryLocation;
import com.weather.repository.WeatherRepository;
//import org.json.JSONArray;
//import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("weather")
public class WeatherController {



    @Autowired
    private WeatherRepository repository;


    //retrieve data from Dark Sky API and save it to database
    private void saveToDatabase() throws IOException {

        //Set latitue and longtitue for countries (key => countryName, value => CountryLocation)
        HashMap<String, CountryLocation> countryMap = new HashMap<String, CountryLocation>();
        CountryLocation campbell_CA=new CountryLocation(37.287167, -121.949959);
        CountryLocation omaha_NE= new CountryLocation(41.257160, -95.995102);
        CountryLocation austin_TX=new CountryLocation(30.266666, -97.733330);
        CountryLocation japan1= new CountryLocation(42.7787100, 140.6690300);
        CountryLocation japan2= new CountryLocation(34.68505, 135.80485);
        CountryLocation jakarta_Indonesia=new CountryLocation(	-6.200000,	106.816666);
        countryMap.put("campbell_CA",campbell_CA);
        countryMap.put("omaha_NE",omaha_NE);
        countryMap.put("austin_TX",austin_TX);
        countryMap.put("niseko_Japan",japan1);
        countryMap.put("nara_Japan",japan2);
        countryMap.put("jakarta_Indonesia",jakarta_Indonesia);


        RestTemplate restTemplate = new RestTemplate();
        for (Map.Entry<String, CountryLocation> entry : countryMap.entrySet()) {
            CountryLocation i= entry.getValue();
            String lat= String.valueOf(i.getLatitude());
            String lon=String.valueOf(i.getLongitude());

            //fetch data from Dark Sky API
            final String uri = "https://api.darksky.net/forecast/951049c23a4fe52eea9eb045c520daf2/"+lat+","+ lon+"?exclude=currently,flags";
            String result = restTemplate.getForObject(uri, String.class);

            //create ObjectMapper instance
            ObjectMapper objectMapper = new ObjectMapper();

            //convert json string to object
            Country country_obj = objectMapper.readValue(result, Country.class);
            country_obj.setName(entry.getKey());

            //save to database
            repository.save(country_obj);
        }
    }

    //Retrieve all weather information from database
    private List<Country> getWeatherInfo(){
        List<Country> countryList= repository.findAll();
        return countryList;
    }

    @GetMapping("showAll")
    public ModelAndView showAllWeatherCondition() throws IOException {
        try{
            //retrieve data from Dark Sky API and save it to database
            saveToDatabase();
        }
        catch(Error error){
            System.out.println("error happen when saving to database...");
        }

        //Retrieve all weather information from database
        List<Country> weatherlist= getWeatherInfo();
        ModelAndView mav = new ModelAndView();
        mav.setViewName("weather");
        mav.addObject("weathers", weatherlist);
        return mav;
    }

}
