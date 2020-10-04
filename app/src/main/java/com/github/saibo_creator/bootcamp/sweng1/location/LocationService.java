package com.github.saibo_creator.bootcamp.sweng1.location;

/**
 * This service allows you to get the current location of the user.
 */
public interface LocationService {
    /**
     * Finds the current location of the user
     *
     * @return the current location of the user
     */
    Location getCurrentLocation();
}