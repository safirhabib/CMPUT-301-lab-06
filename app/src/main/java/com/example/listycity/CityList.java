package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class holds the City type objects in a list
 */
public class CityList {
    private List<City> cities = new ArrayList<>();
    /**
     * This adds a city to the list if city is not present
     * @param city
     *              This is a City object we want to add to the list
     * @throws IllegalArgumentException if the list already has that city
     *
     */

    public void add(City city){

        if(cities.contains(city)){
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     *
     * @return
     *          a sorted list
     */
    public List<City> getCities(){
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
    /**
     * Checks if a given city exists in the list.
     * @param city City object to check for.
     * @return true if the city exists, false otherwise.
     */
    public boolean hasCity(City city){
        return cities.contains(city);
    }
    /**
     * Removes a city from the list.
     * @param city City object to remove.
     * @throws IllegalArgumentException if city not found.
     */
    public void delete(City city){
        if (!(cities.contains(city))) {
            throw new IllegalArgumentException("City not founds in the list");
        }
        cities.remove(city);

    }
    /**
     * Returns the number of cities currently in the list.
     *
     * @return the number of cities
     */
    public int countCities() {
        return cities.size();
    }
}
