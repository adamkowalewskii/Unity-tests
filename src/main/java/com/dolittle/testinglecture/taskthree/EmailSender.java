package com.dolittle.testinglecture.taskthree;

public class EmailSender implements NotificationSender {
    @Override
    public boolean notify(Object o) {
        return false;
    }
}
