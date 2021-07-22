package com.solvd;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;

public class JsonToJava {
    private final static Logger LOGGER = Logger.getLogger(JsonToJava.class);

    public String convertToJsonString(Object obj) {

        String jsonStr = "";

        try {
            jsonStr = new ObjectMapper().writeValueAsString(obj);
            LOGGER.info("convert to string");
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonStr;

    }
    public Driver convertJsonToPojo(String jsonStr) {
        Driver driver = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            driver = objectMapper.readValue(jsonStr, Driver.class);
            LOGGER.info("convert to Pojo");
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return driver;
    }
}
