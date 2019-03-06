import com.marthinussen.CustomerOrders;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertSame;

/**
 * Created by ChadMarthinussen2 on 2019/03/06.
 */
public class CustomerOrdersTest {

    private CustomerOrders order = new CustomerOrders("chad", "marthinussen", 12345, 3838);


    @Test
    public void getName() throws Exception {
    }


    @Test   //Testing the same
    public void getSurname() throws Exception {
        assertSame("marthinussen",order.getSurname());
    }

    @Test  //Testing Equals
    public void getOrderNumber() throws Exception {
        assertEquals( 12345, order.getOrderNumber());
    }

    @Test
    public void getItems() throws Exception {
    }

}