package request;

import application.Application;
import icardholder.ICardHolder;
import ismartcard.ISmartCard;

public class ApplicationRequest {
    private ICardHolder cardholder;
    private Application application;
    private String cardNumber;

    public ApplicationRequest(ICardHolder cardholder, Application application, String cardNumber) {
        this.cardholder = cardholder;
        this.application = application;
        this.cardNumber = cardNumber;
    }

    public void buildApplicationAndDeliverIt() {
        // find the appropriate card from the cardholder
        ISmartCard card = cardholder.findCard(cardNumber);

        // ask the application to build a program
        application.buildAndDeliverApplication(card);
    }
}
