package createtype.fatory_pattern;

/**
 * Created by yorick on 2017/6/26.
 */
public class HumanFactory {

    /**
     * 普通工厂模式
     */
    public Human createHuman(String name) {
        Human human = null;
        if("Boy".equals(name))
            human = new Boy();
        else if("Girl".equals(name))
            human = new Girl();
        return human;
    }

    /**
     * 多个工厂方法模式
     */
    public Human createBoy() {
        return new Boy();
    }

    public Human createGirl() {
        return new Girl();
    }

    /**
     * 静态工厂方法模式
     */
    public static Human createHumanS(String name) {
        Human human = null;
        if("Boy".equals(name))
            human = new Boy();
        else if("Girl".equals(name))
            human = new Girl();
        return human;
    }

}
