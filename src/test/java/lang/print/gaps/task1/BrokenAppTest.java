package lang.print.gaps.task1;

import base.BaseIOTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BrokenAppTest extends BaseIOTest {
    @Test
    void main(){
        new BrokenApp().main(null);

        assertEquals("fixMe\n", updateLineSpliterators(outContent.toString()));
    }
}