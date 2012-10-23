package cardholder;

import deliverychannel.OnlineDeliveryChannel;
import icardholder.ICardHolder;
import ismartcard.ISmartCard;

import java.util.ArrayList;
import java.util.List;


public class Cardholder implements ICardHolder
{
    private String name;
    private OnlineDeliveryChannel deliveryChannel;
    private List<ISmartCard> cards = new ArrayList<ISmartCard>();

    public Cardholder(String name, OnlineDeliveryChannel deliveryChannel) {
        this.name = name;
        this.deliveryChannel = deliveryChannel;
    }

    public void addCard(ISmartCard card) {
        cards.add(card);
    }

    public void send(String message) {
        System.out.println("Cardholder: Hi " + name + ", you have new e-mail");
        System.out.println("    Message is: " + message);
    }

    public ISmartCard findCard(String cardNumber) {
        for (ISmartCard card : cards)
            if (card.getCardNumber().equals(cardNumber))
                return card;
        return null;
    }

    public OnlineDeliveryChannel getDeliveryChannel() {
        return deliveryChannel;
    }
}
