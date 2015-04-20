package com.ctrip.infosec.rule.resource;

import com.ctrip.infosec.rule.action.UpdateOrderStatus;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lpxie on 15-4-20.
 */
public class UpdateOrderStatusTest
{
    @Test
    public void testUpdateOrderStatus()
    {
        Map<String ,Object> params = new HashMap();
        params.put("OrderID","123");
        params.put("OrderType","1");
        params.put("OrderStatus","123");
        params.put("MerchantOrderID","123");
        params.put("OrderTime","2015-04-16T16:09:39.9564416+08:00");
        UpdateOrderStatus.updateOrderStatus(params);
    }
}
