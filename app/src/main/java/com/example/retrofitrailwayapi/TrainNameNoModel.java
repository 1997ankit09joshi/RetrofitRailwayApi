package com.example.retrofitrailwayapi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TrainNameNoModel {
    @SerializedName("debit")
    @Expose
    private Integer debit;
    @SerializedName("train")
    @Expose
    private Train train;
    @SerializedName("response_code")
    @Expose
    private Integer responseCode;

    public Integer getDebit() {
        return debit;
    }

    public void setDebit(Integer debit) {
        this.debit = debit;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Integer getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }


    public class Train {

        @SerializedName("days")
        @Expose
        private List<Day> days = null;
        @SerializedName("classes")
        @Expose
        private List<Class> classes = null;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("number")
        @Expose
        private String number;

        public List<Day> getDays() {
            return days;
        }

        public void setDays(List<Day> days) {
            this.days = days;
        }

        public List<Class> getClasses() {
            return classes;
        }

        public void setClasses(List<Class> classes) {
            this.classes = classes;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

    }

    public class Day {

        @SerializedName("runs")
        @Expose
        private String runs;
        @SerializedName("code")
        @Expose
        private String code;

        public String getRuns() {
            return runs;
        }

        public void setRuns(String runs) {
            this.runs = runs;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

    }



    public class Class {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("code")
        @Expose
        private String code;
        @SerializedName("available")
        @Expose
        private String available;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getAvailable() {
            return available;
        }

        public void setAvailable(String available) {
            this.available = available;
        }
    }
    }
