package com.example.listycity;

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
}
