package cn.com.yitong.ares.java8After;

/**
 * P表示参数类型，R表示返回类型
 *
 * @param <P>
 * @param <R>
 */
interface Message<P, R> {
    public R zhuanhuan(P P);
}

interface Message2<R> {
    public R zhuanhuan();
}

interface Message3<P, R> {
    public R zhuanhuan(P P1, P P2);
}

interface Message4<R, F, S> {
    public R create(F F, S S);
}

class Persopn {
    private String name;
    private int age;

    public Persopn(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persopn{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}

class Demo777 {
    public static void main(String[] args) {
        Message<Double, String> message = String::valueOf;
        System.out.println(message.zhuanhuan(100.1));

        Message2<String> message2 = "hello"::toUpperCase;
        System.out.println(message2.zhuanhuan());

        Message3<String, Integer> message3 = String::compareTo;
        System.out.println(message3.zhuanhuan("1", "2"));

        Message4<Persopn, String, Integer> message4 = Persopn::new;
        System.out.println(message4.create("11", 22));
    }
}
