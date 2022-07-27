package com.dolittle.testinglecture.taskthree;

//Przetestuj PaymentDelayNotifier zarówno używając stuba jak i mocka
public class PaymentDelayNotifier {
    private final NotificationSender notificationSender;

    public boolean sendNotification(String message, String sender) {
        if (message.length() != 20) {
            throw new IllegalArgumentException("Message for client is too short");
        }
        if (sender == null) {
            throw new IllegalArgumentException("Message cannot be send without author");
        }
        StringBuilder finalMessage = new StringBuilder().append("Good morning, ").append(message).append(" ").append(sender);
        return notificationSender.notify(finalMessage);

    }

    public PaymentDelayNotifier(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }
}
