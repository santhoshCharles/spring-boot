package com.udaan.interview;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldDeserialiseGetBalanceResponse() throws java.io.IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String inputString = "{\"getBalanceResponse\":{\"Version\":\"2.0\",\"accountCurrencyCode\":\"INR\",\"accountBalanceAmount\":\"4064912.71\",\"lowBalanceAlert\":false}}";
        GetBalanceModel data =  objectMapper.readValue(inputString, GetBalanceModel.class);
        assertTrue(data.giveBalance() == 4064912.71);
    }

    @Test
    public void shouldDeserialiseErrorRespone() throws java.io.IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String inputString = "{ \"httpCode\":\"500\", \"httpMessage\":\"Internal Server Error\", \"moreInformation\":\"Connection error\" }";
        GetBalanceErrorResponseModel data = objectMapper.readValue(inputString, GetBalanceErrorResponseModel.class);
        assertTrue(data.getHttpCode() == 500);
    }

    /** Bonus 
     * @throws IOException */
    @org.junit.Test
    public void shouldHandleBothInputStringsInSingleClassHierarchy() throws IOException {
        String inputString1 = "{\"getBalanceResponse\":{\"Version\":\"2.0\",\"accountCurrencyCode\":\"INR\",\"accountBalanceAmount\":\"4064912.71\",\"lowBalanceAlert\":false}}";
        String inputString2 = "{ \"httpCode\":\"500\", \"httpMessage\":\"Internal Server Error\", \"moreInformation\":\"Connection error\" }";
        /**
         * TODO
         * 1. Implement the 'parseInputString' method
         * 2. Uncomment the assert lines below and make them pass
          */
        GetBalanceBaseModel data = parseInputString(inputString1);
        //System.out.println("data"+data);
        assertTrue(data instanceof com.udaan.interview.GetBalanceModel);
        //GetBalanceBaseModel data2 = parseInputString(inputString2);
        //assertTrue(data2 instanceof com.udaan.interview.GetBalanceErrorResponseModel);
    }

    private com.udaan.interview.GetBalanceBaseModel parseInputString(String inputString) throws IOException {
    	ObjectMapper objectMapper = new ObjectMapper();
    	//System.out.println("data"+objectMapper);
    	GetBalanceBaseModel data = objectMapper.readValue(inputString, GetBalanceBaseModel.class);
    	//System.out.println("data"+data);
    	return data;
    }
}
