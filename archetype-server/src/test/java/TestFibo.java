import com.arcesium.archetypewar.service.Fibo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFibo {

    @Test
    public void testfibo(){
        int l= Fibo.fib(2);
        assertEquals(1,l);
    }


}
