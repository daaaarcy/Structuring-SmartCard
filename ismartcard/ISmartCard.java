package ismartcard;

/**
 * Created with IntelliJ IDEA.
 * User: darcy
 * Date: 22/10/2012
 * Time: 11:12
 * To change this template use File | Settings | File Templates.
 */
public interface ISmartCard
{
    public void notifyOfNewApplication(String program);
    public String getCardNumber();
    public void deliverApplication(String program);
}
