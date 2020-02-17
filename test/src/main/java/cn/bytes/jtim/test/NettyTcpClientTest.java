package cn.bytes.jtim.test;

import cn.bytes.jtim.core.config.Configuration;
import cn.bytes.jtim.core.module.client.NettyTcpClient;
import cn.bytes.jtim.core.module.connection.SimpleConnectionModule;
import cn.bytes.jtim.core.module.handler.SimpleChannelHandlerProtoBufModule;
import cn.bytes.jtim.core.module.retry.SimpleRetryModule;

/**
 * @author maliang@sioniov.com
 * @version 1.0
 * @date 2020/2/13 22:16
 */
public class NettyTcpClientTest {

    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setHost("127.0.0.1");
        configuration.setPort(1999);

        NettyTcpClient nettyTcpClient = new NettyTcpClient(configuration);

        nettyTcpClient.boarder(
                new SimpleChannelHandlerProtoBufModule().addLast(new ProtobufClientHandler()),
                new SimpleConnectionModule(),
                SimpleRetryModule.builder().build()
        );
        nettyTcpClient.open();
    }


}
