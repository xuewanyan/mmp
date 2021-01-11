package cn.com.yitong.ares.abstracts;

/**
 * 行为类
 * @author xy
 * @date 20201211
 */
public abstract class Action {

    public static final int EAD = 1;

    public static final int WORK = 2;

    public static final int SLEEP = 5;

    public abstract void work();

    public abstract void eat();

    public abstract void sleep();

    public void command(int flag){
        if(EAD == flag){
            this.eat();
        }else if(WORK == flag){
            this.work();
        }else if(SLEEP == flag){
            this.sleep();
        }
    }
}
