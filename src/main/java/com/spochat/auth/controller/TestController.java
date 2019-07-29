package com.spochat.auth.controller;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.spochat.auth.response.BaseResponse;
import com.spochat.auth.response.TestResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class TestController {

    @GetMapping(value="/test")
    public BaseResponse test(){
        return new TestResponse("Succesful");
    }

    @GetMapping(value="/testHeaders")
    public BaseResponse testHeaders(@RequestHeader Map<String, String> headers){
        return new TestResponse(headers.toString());
    }

    @GetMapping(value="/testRequest")
    public BaseResponse testRequest() {
        return null;
    }
}
