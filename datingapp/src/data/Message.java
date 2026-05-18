package data;

import java.time.LocalDate;

public class Message {

    private int id;
    private String message;
    private Seeker sender;
    private Seeker receiver;
    private LocalDate timeSent;
    private boolean isRead;

    public Message(){

    }
    public Message(String message, Seeker sender, Seeker receiver) {
        this.message = message;
        this.sender = sender;
        this.receiver = receiver;
        this.timeSent = LocalDate.now();
        this.isRead = false;
    }

    public String getMessage() {
        return message;
    }

   public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
    public Seeker getSender() {
        return sender;
    }

    public Seeker getReceiver(){
        return receiver;
    }
    public LocalDate getTimeSent() {
        return timeSent;
    }
    public void setRead(boolean read) {
        isRead = read;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setSender(Seeker sender) {
        this.sender = sender;
    }

    public void setReceiver(Seeker receiver) {
        this.receiver = receiver;
    }
}
