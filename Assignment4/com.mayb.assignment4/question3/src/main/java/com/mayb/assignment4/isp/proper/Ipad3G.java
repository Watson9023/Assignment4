package com.mayb.assignment4.isp.proper;

import com.mayb.assignment4.isp.proper.services.IMobile;
import com.mayb.assignment4.isp.proper.services.IWifiOnly;

/**
 * Created by by Long on 3/31/2017.
 * A 3G ipad/ iPad 3g has both wifi and gprs/cellular network connections
 */
public class Ipad3G implements IMobile, IWifiOnly {

    public void gprsConnection(){
        //specifies ipad gprs connection
    }
    public void wifiConnection(){
        //specifies how ipad connects to wfi
    }
}
