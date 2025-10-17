package com.example.listycity;

import java.util.Objects;
/**
 * Represents a city with a name and a province.
 */

public class City implements Comparable<City>{
    /**
     * This is a class that defines a City.
     */
    private String city;
    private String province;
    @Override
    public int compareTo(City o){
        return this.city.compareTo(o.getCity());
    }


    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    public String getCity() {
        return city;
    }
    public String getProvince(){
        return province;
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if (!(o instanceof City)) return false;
        City cityObj = (City) o;
        return city.equals(cityObj.getCity()) && province.equals(cityObj.getProvince());
    }
    @Override
    public int hashCode() {
        // Added: when overriding equals(), must override hashCode()
        return Objects.hash(city, province);
    }
}
