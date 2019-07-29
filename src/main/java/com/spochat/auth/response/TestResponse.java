package com.spochat.auth.response;

public class TestResponse implements BaseResponse{
    private String testResult;

    public TestResponse(String testResult) {
        this.testResult = testResult ;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
}
