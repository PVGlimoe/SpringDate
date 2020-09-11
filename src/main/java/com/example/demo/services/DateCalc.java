package com.example.demo.services;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateCalc {
    private LocalDate todayDate = LocalDate.now();
    private LocalDate enteredDate;

    public String daysBetween(String date){
        enteredDate = LocalDate.parse(date);
        int dif = (int) ChronoUnit.DAYS.between(todayDate,enteredDate);
        dif = Math.abs(dif);

        return "Der er " + dif + " dage mellem " + todayDate + " & " + enteredDate;
    }
}