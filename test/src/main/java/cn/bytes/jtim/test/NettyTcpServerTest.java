package cn.bytes.jtim.test;

import cn.bytes.jtim.core.config.Configuration;
import cn.bytes.jtim.core.connection.DefaultDefineConnectionManager;
import cn.bytes.jtim.core.handler.DefaultDefineHandlerManager;
import cn.bytes.jtim.core.module.DefaultModuleManager;
import cn.bytes.jtim.core.module.Module;
import cn.bytes.jtim.core.server.NettyTcpServer;

/**
 * @author maliang@sioniov.com
 * @version 1.0
 * @date 2020/2/13 22:16
 */
public class NettyTcpServerTest {

    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setHost("127.0.0.1");
        configuration.setPort(1999);


        NettyTcpServer nettyTcpServer = new NettyTcpServer(configuration, DefaultModuleManager.builder()
                .build()
                .module(new DefaultDefineHandlerManager(), new DefaultDefineConnectionManager())
        );

        nettyTcpServer.open();
    }
}
