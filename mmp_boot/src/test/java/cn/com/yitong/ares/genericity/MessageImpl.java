package cn.com.yitong.ares.genericity;

/**
 * 重写泛型接口
 * @author xueyan
 * @date 2020115
 */
public class MessageImpl implements Messe<String>{
    @Override
    public void print(String str) {
        System.out.println(str);
    }


    public static void main(String[] args) {
        MessageImpl mg = new MessageImpl();
        mg.print("pppppppppppppp");
    }
}
