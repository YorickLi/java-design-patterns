package createtype.fatory_pattern;

/**
 * Created by yorick on 2017/6/26.
 */
public class Boy implements Human {

    @Override
    public void talk() {
        System.out.println("Boy is talking.");
    }

    @Override
    public void walk() {
        System.out.println("Boy is walking.");
    }
}
