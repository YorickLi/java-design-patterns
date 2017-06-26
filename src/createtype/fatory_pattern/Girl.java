package createtype.fatory_pattern;

/**
 * Created by yorick on 2017/6/26.
 */
public class Girl implements Human {
    @Override
    public void talk() {
        System.out.println("Girl is talking.");
    }

    @Override
    public void walk() {
        System.out.println("Girl is walking.");
    }
}
