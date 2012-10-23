package smartcard;

import icardholder.ICardHolder;
import ismartcard.ISmartCard;

public class SmartCard implements ISmartCard
{
    private String cardNumber;
    private ICardHolder owner;

    public SmartCard(ICardHolder owner, String cardNumber) {
        this.owner = owner;
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void deliverApplication(String program) {
        owner.getDeliveryChannel().deliverApplication(this, program);
    }

    public void notifyOfNewApplication(String program) {
        // notify the owner
        owner.send("The following application has been delivered to your card: " + program);
    }
}
