import com.MyLimit;
import com.MyMain;
import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class MyMainTest {

    @Test
    public void testUpcase() {
        MyLimit myLimit = new MyLimit() {
            @Override
            public int getLimit() {
                return 10;
            }
        };

        MyMain mm = new MyMain(myLimit);
        assertEquals("SS", mm.upCase("ss"));
        assertEquals("SSSSSSSSS", mm.upCase("ssssssssssss"));
    }

    @Test
    public void testMockUpCase() {
        MyLimit mockLimit = mock(MyLimit.class);
        when(mockLimit.getLimit()).thenReturn(10);

        MyMain mm = new MyMain(mockLimit);
        assertEquals("SS", mm.upCase("ss"));
        assertEquals("SSSSSSSSS", mm.upCase("ssssssssssss"));
    }
}
