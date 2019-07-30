package com.weather.testing;

import com.weather.controller.WeatherController;
import com.weather.domain.Country;
import org.junit.jupiter.api.Test;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class JUnitWeatherControllerTest {
    @Test
    public void testWeatherController() throws IOException {
        WeatherController weatherController = new WeatherController();
        ModelAndView result = weatherController.showAllWeatherCondition();
        ModelAndView check= new ModelAndView();
        assertEquals(result,check);
    }
}
