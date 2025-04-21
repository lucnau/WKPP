package hw2.ex3;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Mail {
    private String senderAddress;
    private String subject;
    private String message;
    private Timestamp datetime;
    private Boolean isRead;

    public Mail(String senderAddress, String subject, String message) {
        this.senderAddress = senderAddress;
        this.message = message;
        this.subject = subject;
        this.datetime = new Timestamp(System.currentTimeMillis());
        this.isRead = false;
    }

    public String format() {
        StringBuilder sb = new StringBuilder();
        sb.append(subject).append(" from ").append(senderAddress).append(" on ").append(datetime.toString()).append(": ").append(message).append(".");
        return sb.toString();
    }

    public String formatHeader() {
        StringBuilder sb = new StringBuilder();
        sb.append(isRead).append(" | ").append(subject).append(" | ").append(senderAddress).append(" | ").append(datetime.toString());
        return sb.toString();
    }

    // getter und setter methods
    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Timestamp getDatetime() {
        return datetime;
    }

    public void setDatetime(Timestamp datetime) {
        this.datetime = datetime;
    }

    public Boolean getIsRead() {
        return isRead;
    }

    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
    }

    public void markAsRead() {
        this.isRead = true;
    }

    public void markAsUnread() {
        this.isRead = false;
    }

}