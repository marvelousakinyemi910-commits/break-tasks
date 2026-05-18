package data.repository;

import data.Message;
import data.Seeker;


import java.util.List;

public interface MessageRepository {
    Message save(Message message);
    int count();
    List<Message>  findBySender(Seeker sender);
    List<Message>  findByReceiver(Seeker receiver);
    List<Message>  findByReceiverAndIsNotRead(Seeker receiver);
    void delete(Message message);

    List<Message> getMessages();
}
