package data.repository;
import data.Message;
import data.Seeker;

import java.util.ArrayList;
import java.util.List;

public class MessageRepositoryImpl implements MessageRepository{
    private List<Message> messages = new ArrayList<>();
    private int idCounter = 1;

    @Override
    public Message save(Message message){
        message.setId(idCounter);
        idCounter++;

        messages.add(message);

        return message;
    }
    @Override
    public int count(){
       return messages.size();
    }


    @Override
    public List<Message > findBySender(Seeker sender){
        List<Message> senderMessages = new ArrayList<>();
        for(Message message : messages){
            if(message.getSender().equals(sender)){
                senderMessages.add(message);
            }
        }
        return senderMessages;
    }


    @Override
    public List<Message>findByReceiver(Seeker receiver){
        List<Message> receiverMessages = new ArrayList<>();
        for(Message message : messages){
            if(message.getReceiver().equals(receiver)){
                receiverMessages.add(message);
            }
        }
        return receiverMessages;
    }

    @Override
    public List<Message> findByReceiverAndIsNotRead(Seeker receiver){
        List<Message> unreadMessages = new ArrayList<>();
        for(Message message: messages){
            if(message.getReceiver().equals(receiver) && !message.isRead()){
                unreadMessages.add(message);
            }
        }
        return unreadMessages;
    }
    @Override

    public void delete(Message message){
        messages.remove(message);
    }
    @Override
    public List<Message> getMessages(){
        return messages;
    }
}
