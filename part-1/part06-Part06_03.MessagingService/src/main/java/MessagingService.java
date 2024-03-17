
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ace
 */
public class MessagingService {

    private ArrayList<Message> sms;

    public MessagingService() {
        this.sms = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length() < 281) {
            this.sms.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return sms;

    }
}
