package icardholder;

import deliverychannel.OnlineDeliveryChannel;
import ismartcard.ISmartCard;

/**
 * Created with IntelliJ IDEA.
 * User: darcy
 * Date: 22/10/2012
 * Time: 10:29
 * To change this template use File | Settings | File Templates.
 */
public interface ICardHolder
{
    public void addCard(ISmartCard card);
    public ISmartCard findCard(String cardNumber);
    public OnlineDeliveryChannel getDeliveryChannel();
    public void send(String message);
}
