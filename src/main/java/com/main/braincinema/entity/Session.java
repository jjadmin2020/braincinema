package com.main.braincinema.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Map;

@Data
public class Session {
    private Long id;
    private String filmName;
    private String filmDuration;
    private String filmStartDate;
    private String filmEndDate;
    private Integer seatsNumbers;
    private Integer seatsNumbersFree = seatsNumbers;
    private Integer seatsNumbersTaken = 0;
    private Integer seatsTypeCount = 1;
    private Map<String, BigDecimal> seatsTypeAndPrice;

    public Session(Long id, String filmName, String filmStartDate, String filmEndDate, Integer seatsNumbers) {
        this.id = id;
        this.filmName = filmName;
        this.filmStartDate = filmStartDate;
        this.filmEndDate = filmEndDate;
        this.seatsNumbers = seatsNumbers;
    }

    public void setSeatsTypeAndPrice(String seats, BigDecimal price) {
    }
}
