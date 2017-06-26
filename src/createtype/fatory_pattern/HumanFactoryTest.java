package createtype.fatory_pattern;

/**
 * Created by yorick on 2017/6/26.
 */
public class HumanFactoryTest {

    public static void main(String[] args) {
        HumanFactory hf = new HumanFactory();
        //测试普通工厂模式
        Human boyPT = hf.createHuman("Boy");
        boyPT.talk();
        boyPT.walk();

        //测试多工厂方法模式
        Human boyMoreMethod = hf.createBoy();
        boyMoreMethod.talk();
        boyMoreMethod.walk();

        //测试静态工厂方法模式
        Human girl = HumanFactory.createHumanS("Girl");
        girl.talk();
        girl.walk();

    }

}
