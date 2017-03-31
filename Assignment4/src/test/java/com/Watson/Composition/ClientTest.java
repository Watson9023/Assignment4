package com.Watson.Composition;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;

/**
 * Created by Long on 3/30/2017.
 */
public class ClientTest {

    private Client fnbClient;
    private Account fnbAccount;
    @Before
    public void setUp() throws Exception {
        fnbClient = new Client();
        fnbAccount = new Account();
    }

    @Test
    public void testSetClientName() throws Exception {
        fnbClient.setClientName("Ijaaz");
        Assert.assertEquals("Ijaaz","Ijaaz");
    }

    @Test
    public void testSetClientSurname() throws Exception {
        fnbClient.setClientSurname("Lagardien");
        Assert.assertEquals("Lagardien", "Lagardien");
    }

    @Test
    public void testSetClientAccount() throws Exception {
        boolean set = false;
        try{
            fnbClient.setClientAccount(fnbAccount);
            set = true;
        }catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertTrue(set);
    }

    @Test
    public void testGetClientName() throws Exception {
        fnbClient.setClientName("Ijaaz");
        Assert.assertEquals("Ijaaz", fnbClient.getClientName());
    }

    @Test
    public void testGetClientSurname() throws Exception {
        fnbClient.setClientSurname("Lagardien");
        Assert.assertEquals("Lagardien",fnbClient.getClientSurname());
    }

    @Test
    public void testGetClientAccount() throws Exception {
        boolean set = false;
        try{
            fnbClient.setClientAccount(fnbAccount);
            fnbClient.getClientAccount();
            set = true;
        }catch (Exception e) {
            e.printStackTrace();
        }

        Assert.assertTrue(set);
    }

}
