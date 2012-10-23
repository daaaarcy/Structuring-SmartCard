package company;

import deliverychannel.OnlineDeliveryChannel;
import icardholder.ICardHolder;
import ismartcard.ISmartCard;
import smartcard.SmartCard;

import java.util.ArrayList;
import java.util.List;


public class CompanyCardholder implements ICardHolder
{
    private String companyName;
    private OnlineDeliveryChannel deliveryChannel;
    private List<ISmartCard> cards = new ArrayList<ISmartCard>();

    public CompanyCardholder(String companyName, OnlineDeliveryChannel deliveryChannel) {
        this.companyName = companyName;
        this.deliveryChannel = deliveryChannel;
    }

    public void addCard(ISmartCard card) {
        cards.add(card);
    }

    public void send(String message) {
        System.out.println("CompanyCardHolder: Attention " + companyName + ", you have a new fax");
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
