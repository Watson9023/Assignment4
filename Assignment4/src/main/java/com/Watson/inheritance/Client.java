package com.Watson.inheritance;

/**
 * Created by Long on 3/31/2017.
 */
public class Client extends Accounts{
    private String clientName;
    private String clientSurname;

    public Client()
    {

    }

    public Client(String n, String sn, Accounts acc)
    {

    }

    public void setClientName(String n)
    {
        clientName = n;
    }

    public void setClientSurname(String sn)
    {
        clientSurname = sn;
    }

    public String getClientName()
    {
        return clientName;
    }

    public String getClientSurname()
    {
        return clientSurname;
    }

}
