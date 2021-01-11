package cn.com.yitong.ares.Annotation4;

import java.lang.reflect.Method;
import java.nio.channels.Channel;

/**
 * 消息发送
 */

@Action("cn.com.yitong.ares.Annotation4.IphoneChannel")
public class Message {

    private IChannel channel;//要发消息，肯定需要有通道

    @Instance("cn.com.yitong.ares.Annotation4.Factory")
    public Message(){
        try {
            Action action = super.getClass().getAnnotation(Action.class);
            Instance instance = super.getClass().getDeclaredConstructor().getAnnotation(Instance.class);
            String calssName = instance.value();
            Class clazz = Class.forName(calssName);
            this.channel = (IChannel) clazz.getMethod("getInstance",String.class).invoke(null,action.value());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 返回各种应用方法,可自定义处理
     * @param msg
     * @return
     * @throws Exception
     */
    public String echo(String msg) throws Exception {
        String echoMessage = "消息发送失败";
        if(this.channel.build()){
            echoMessage = "ECHO" + msg;//创建回应信息
            this.channel.close();
        }
        return echoMessage;
    }
}
