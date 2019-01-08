package org.apache.rocketmq.namesrv;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.rocketmq.common.namesrv.NamesrvConfig;
import org.apache.rocketmq.remoting.netty.NettyServerConfig;

public class MainControllerTest {
    public static void main(String[] args) throws Exception {
        final NamesrvConfig namesrvConfig = new NamesrvConfig();
        final NettyServerConfig nettyServerConfig = new NettyServerConfig();
        nettyServerConfig.setListenPort(9876);
        NamesrvController namesrvController = new NamesrvController(namesrvConfig, nettyServerConfig);
        namesrvController.initialize();
        namesrvController.start();
        Thread.sleep(DateUtils.MILLIS_PER_DAY);
    }
}
