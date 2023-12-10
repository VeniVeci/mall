package com.macro.mall.utils;

/**
 * @author VeniVeci
 * @program: mall
 * @description:
 * @date: 2023/12/10
 */
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.macro.mall.dto.PmsProductParam;

public class JsonConverter {
    public static String convertToJsonString(PmsProductParam productParam) {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString;

        try {
            jsonString = objectMapper.writeValueAsString(productParam);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            jsonString = ""; // Handle the exception as needed
        }

        return jsonString;
    }

    public static void main(String[] args) {
        // Assuming you have an instance of PmsProductParam named 'productParam'
        PmsProductParam productParam = new PmsProductParam();

        // Populate the fields of the object...

        // Convert the object to a JSON string
        String jsonString = convertToJsonString(productParam);

        // Print the JSON string
        System.out.println(jsonString);
    }
}
