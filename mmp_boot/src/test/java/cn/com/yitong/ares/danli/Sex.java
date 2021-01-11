package cn.com.yitong.ares.danli;

/**
 * 多例
 */
public class Sex {

    private String title;
    private static final int Sex_M = 1;
    private static final int Sex_F = 2;

    private static final  Sex SEX_M = new Sex("男");
    private static final  Sex SEX_F = new Sex("女");

    private Sex(String str){
        this.title = str;
    }

    public String toString(){
        return this.title;
    }

    public static Sex getInstance(int str){
        if(str == Sex_M){
            return SEX_M;
        }else if(str == Sex_F){
            return SEX_F;
        }
        return null;
    }

}

class DerTest{
    public static void main(String[] args) {
        Sex sex = Sex.getInstance(1);
    }
}