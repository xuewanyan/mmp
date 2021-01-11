package cn.com.yitong.ares.meiju;

/** 枚举应用 */
public enum Colors implements IMessage {
    RED("红"),
    GERRN("绿"),
    BLUE("蓝");

    private String title;

    private Colors(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getCalor() {
        return this.title;
    }
}

class Demo2 {
    public static void main(String[] args) {
        Colors color = Colors.BLUE;
        System.out.println(color);
        for (Colors colors : Colors.values()) { // values返回对象数组
            System.out.println(
                    colors.name() + "---" + colors.ordinal() + "---" + colors.getTitle());
        }
    }
}

interface IMessage {
    public String getCalor();
}
