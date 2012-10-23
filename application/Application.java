package application;

import ismartcard.ISmartCard;

public class Application {
    private String name;

    public Application(String name) {
        this.name = name;
    }

    public void buildAndDeliverApplication(ISmartCard card) {
        String program = name + " for card " + card.getCardNumber();
        card.deliverApplication(program);
    }
}
