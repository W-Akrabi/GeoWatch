package com.skywatch.application.services;

import java.util.ArrayList;
import java.util.List;

public class AlertServices {

    private List<Alert> alerts; // List to hold alerts

    public AlertServices() {
        alerts = new ArrayList<>();
    }

    // Method to add an alert
    public void addAlert(Alert alert) {
        alerts.add(alert);
        System.out.println("Alert added: " + alert.getMessage());
    }

    // Method to trigger alerts based on certain conditions
    public void triggerAlerts() {
        for (Alert alert : alerts) {
            if (alert.isTriggered()) {
                sendAlert(alert);
            }
        }
    }

    // Method to send the alert (could be email, SMS, etc.)
    private void sendAlert(Alert alert) {
        // Implementation for sending alert
        System.out.println("Sending alert: " + alert.getMessage());
        // Here you can integrate with an email service or notification service
    }

    // Inner class for Alert
    public static class Alert {
        private String message;
        private boolean triggered;

        public Alert(String message) {
            this.message = message;
            this.triggered = false; // Default to false
        }

        public String getMessage() {
            return message;
        }

        public boolean isTriggered() {
            return triggered;
        }

        public void setTriggered(boolean triggered) {
            this.triggered = triggered;
        }
    }
}
