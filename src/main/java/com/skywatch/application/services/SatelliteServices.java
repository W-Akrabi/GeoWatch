package com.skywatch.application.services;

import java.util.ArrayList;
import java.util.List;

public class SatelliteServices {

    private List<Satellite> satellites; // List to hold satellite information

    public SatelliteServices() {
        satellites = new ArrayList<>();
        // Load satellite data from an external API or database if needed
    }

    // Method to add a satellite
    public void addSatellite(Satellite satellite) {
        satellites.add(satellite);
        System.out.println("Satellite added: " + satellite.getName());
    }

    // Method to retrieve satellite information by ID
    public Satellite getSatelliteById(String satelliteId) {
        for (Satellite satellite : satellites) {
            if (satellite.getId().equals(satelliteId)) {
                return satellite;
            }
        }
        return null; // Return null if not found
    }

    // Method to list all satellites
    public List<Satellite> listSatellites() {
        return new ArrayList<>(satellites); // Return a copy of the list
    }

    // Method to simulate tracking satellites
    public void trackSatellites() {
        for (Satellite satellite : satellites) {
            System.out.println("Tracking satellite: " + satellite.getName() +
                    " at coordinates: " + satellite.getCoordinates());
            // Here you would implement actual tracking logic, possibly interacting with an external API
        }
    }

    // Inner class for Satellite
    public static class Satellite {
        private String id;
        private String name;
        private String coordinates; // Could be represented as a more complex structure

        public Satellite(String id, String name, String coordinates) {
            this.id = id;
            this.name = name;
            this.coordinates = coordinates;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getCoordinates() {
            return coordinates;
        }

        // Optionally, you could add more fields like launch date, type, etc.
    }
}
