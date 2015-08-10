package com.example.sboot.core;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Elo {

    private final String value;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    private final Date createDate;

    public Elo(String value) {
        this.value = value;
        this.createDate = new Date();
    }

    public String getValue() {
        return value;
    }

    public Date getCreateDate() {
        return createDate;
    }
}
