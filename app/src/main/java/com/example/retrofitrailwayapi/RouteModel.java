package com.example.retrofitrailwayapi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RouteModel {
    @SerializedName("debit")
    @Expose
    private Integer debit;
    @SerializedName("response_code")
    @Expose
    private Integer responseCode;
    @SerializedName("train")
    @Expose
    private Train train;
    @SerializedName("route")
    @Expose
    private List<Route_> route = null;

    public Integer getDebit() {
        return debit;
    }

    public void setDebit(Integer debit) {
        this.debit = debit;
    }

    public Integer getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public List<Route_> getRoute() {
        return route;
    }

    public void setRoute(List<Route_> route) {
        this.route = route;
    }


    public static class Route_ {

        @SerializedName("halt")
        @Expose
        private Integer halt;
        @SerializedName("no")
        @Expose
        private Integer no;
        @SerializedName("distance")
        @Expose
        private Double distance;
        @SerializedName("schdep")
        @Expose
        private String schdep;
        @SerializedName("station")
        @Expose
        private Station station;
        @SerializedName("day")
        @Expose
        private Integer day;
        @SerializedName("scharr")
        @Expose
        private String scharr;

        public Integer getHalt() {
            return halt;
        }

        public void setHalt(Integer halt) {
            this.halt = halt;
        }

        public Integer getNo() {
            return no;
        }

        public void setNo(Integer no) {
            this.no = no;
        }

        public Double getDistance() {
            return distance;
        }

        public void setDistance(Double distance) {
            this.distance = distance;
        }

        public String getSchdep() {
            return schdep;
        }

        public void setSchdep(String schdep) {
            this.schdep = schdep;
        }

        public Station getStation() {
            return station;
        }

        public void setStation(Station station) {
            this.station = station;
        }

        public Integer getDay() {
            return day;
        }

        public void setDay(Integer day) {
            this.day = day;
        }

        public String getScharr() {
            return scharr;
        }

        public void setScharr(String scharr) {
            this.scharr = scharr;
        }

    }


    public static class Station {

        @SerializedName("code")
        @Expose
        private String code;
        @SerializedName("lng")
        @Expose
        private Double lng;
        @SerializedName("lat")
        @Expose
        private Double lat;
        @SerializedName("name")
        @Expose
        private String name;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public Double getLng() {
            return lng;
        }

        public void setLng(Double lng) {
            this.lng = lng;
        }

        public Double getLat() {
            return lat;
        }

        public void setLat(Double lat) {
            this.lat = lat;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }


    public class Train {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("number")
        @Expose
        private String number;
        @SerializedName("classes")
        @Expose
        private List<Class> classes = null;
        @SerializedName("days")
        @Expose
        private List<Day> days = null;

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

        public List<Class> getClasses() {
            return classes;
        }

        public void setClasses(List<Class> classes) {
            this.classes = classes;
        }

        public List<Day> getDays() {
            return days;
        }

        public void setDays(List<Day> days) {
            this.days = days;
        }

    }


    public class Day {

        @SerializedName("code")
        @Expose
        private String code;
        @SerializedName("runs")
        @Expose
        private String runs;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getRuns() {
            return runs;
        }

        public void setRuns(String runs) {
            this.runs = runs;
        }

    }


    public class Class {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("available")
        @Expose
        private String available;
        @SerializedName("code")
        @Expose
        private String code;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAvailable() {
            return available;
        }

        public void setAvailable(String available) {
            this.available = available;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

    }
}
