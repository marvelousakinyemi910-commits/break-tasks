import datingapp.data.Message;
import datingapp.data.Seeker;
import datingapp.data.repository.MessageRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageRepositoryImplTest {
    private MessageRepositoryImpl messageRepository;

    @BeforeEach
    public void setUp() {
        messageRepository = new MessageRepositoryImpl();
    }

    @Test
    public void testThatMessageIsSaved() {
        Message message = new Message();
        Message savedMessage = messageRepository.save(message);
        assertEquals(1, savedMessage.getId());

    }
    @Test
    public void testThatTwoMessagesIsSaved(){
        Message message1 = new Message();
        messageRepository.save(message1);
        Message message2 = new Message();
        messageRepository.save(message2);
        assertEquals(2, messageRepository.count());
    }

    @Test
    public void testThat_a_messageIsDeleted() {
        Message message = new Message();
        messageRepository.save(message);
        assertEquals(1, messageRepository.count());
        messageRepository.delete(message);
        assertEquals(0, messageRepository.count());
    }


    @Test
    public void testMessageSentBySender() {
        Seeker sender = new Seeker();
        Seeker receiver = new Seeker();

        Message message1 = new Message();
        message1.setSender(sender);
        message1.setReceiver(receiver);

        Message message2 = new Message();
        message2.setSender(sender);
        message2.setReceiver(receiver);

        messageRepository.save(message1);
        messageRepository.save(message2);

        // assertEquals(2, messageRepository.count());
        List<Message> foundMessages = messageRepository.findBySender(sender);

        assertEquals(2, foundMessages.size());

    }
    @Test

    public void testFindMessageByReceiver() {
        Seeker sender = new Seeker();
        Seeker receiver = new Seeker();

        Message message1 = new Message();
        message1.setSender(sender);
        message1.setReceiver(receiver);

        Message message2 = new Message();
        message2.setSender(sender);
        message2.setReceiver(receiver);

        messageRepository.save(message1);
        messageRepository.save(message2);


        List<Message> receivedMessages = messageRepository.findByReceiver(receiver);

        assertEquals(2, receivedMessages.size());


    }
@Test
    public void testThatAMessageSentIsNotReadByTheReceiver(){
    Seeker sender = new Seeker();
    Seeker receiver = new Seeker();

    Message unreadMessage = new Message();
    unreadMessage.setSender(sender);
    unreadMessage.setReceiver(receiver);
    unreadMessage.setRead(false);

    Message readMessage = new Message();
    readMessage.setSender(sender);
    readMessage.setReceiver(receiver);
    readMessage.setRead(true);

    messageRepository.getMessages().add(unreadMessage);
    messageRepository.getMessages().add(readMessage);

    List<Message> unreadMessages = messageRepository.findByReceiverAndIsNotRead(receiver);
    assertEquals(1,unreadMessages.size());
}
}