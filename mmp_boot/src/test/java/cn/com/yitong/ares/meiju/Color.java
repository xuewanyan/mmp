package cn.com.yitong.ares.meiju;

/**
 * 多例设计模式
 */
public class Color {

    private static Color RED = new Color("红色");
    private static Color GREEN = new Color("绿色");
    private static Color BLUE = new Color("蓝色");
    private String title;
    private Color(String title){
        this.title = title;
    }
    public String toString(){
        return title;
    }

    public static Color getInstance(int t){
        if(0 == t){
            return RED;
        }else if(1 == t){
            return GREEN;
        }else if(2 == t){
            return BLUE;
        }
        return null;
    }
}

class Demo1{
    public static void main(String[] args) {
        System.out.println(Color.getInstance(1));
    }
}