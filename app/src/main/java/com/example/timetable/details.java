package com.example.timetable;

public class details {
    private String pStartTime;
    private String pSubject;
    private String pEndTime;
    public details(String startTime, String endTime, String subject){
        pStartTime = startTime;
        pEndTime = endTime;
        pSubject = subject;
    }

    public String getSubject() {
        return pSubject;
    }

    public String getStartTime() {
        return pStartTime;
    }

    public String getEndTime() {
        return pEndTime;
    }
}
