package com.example.solid.ocp;

public interface Notification {

    /**
     *
     * WE Implemented this interface for multiple classes like
     * {@link EmailNotificationImpl}, {@link MobileNotificationImpl}, {@link WhatsAppNotificationImpl}
     * It's mean
     * we Open for coming class who will Implement this interface
     * & Close for further modification in this interface
     */

    public void sentOTP(String medium);

    public void sendTransactionReport(String medium);

}
