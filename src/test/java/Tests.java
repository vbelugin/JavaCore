import org.globallogic.devices.Monitor;
import org.globallogic.tasks.Calcualtor;
import org.globallogic.tasks.Pyramid;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Tests {

    @Test
    public void testPi() {
        assertThat(Calcualtor.calcPi(1000), is(3.14059));
    }

    @Test
    public void testPyramid() {
        Pyramid.printPyramid(7);
        System.out.println(new Pyramid().toString());
    }

    @Test
    public void testDevice() {
        Monitor mon = new Monitor("Samsung", 123, "AF2342342", 1920, 1024);

        System.out.println(mon);

    }
}
