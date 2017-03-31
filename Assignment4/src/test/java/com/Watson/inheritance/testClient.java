package com.Watson.inheritance;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Long on 3/31/2017.
 */
public class testClient {
    private Client absaClient;
    @Before
    public void setUp() throws Exception {
        absaClient = new Client();
    }

    @Test
    public void testSetClientName() throws Exception {
        absaClient.setClientName("Watson");
        Assert.assertEquals("Watson","Watson");
    }

    @Test
    public void testSetClientSurname() throws Exception {
        absaClient.setClientSurname("Matunhire");
        Assert.assertEquals("Matunhire", "Matunhire");
    }

    @Test
    public void testGetClientName() throws Exception {
        absaClient.setClientName("Watson");
        Assert.assertEquals("Watson", absaClient.getClientName());
    }

    @Test
    public void testGetClientSurname() throws Exception {
        absaClient.setClientSurname("Matunhire");
        Assert.assertEquals("Matunhire",absaClient.getClientSurname());
    }
}
