package restApp.controller;

/**
 * Created by brandon on 16/11/17.
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class TokenControllerTest {

    @Test
    public void sendTokenTest(){
        String validToken = "fe2c780f-4bc3-4759-b5ed-0f363d64b11d";

        assertEquals(validToken,"fe2c780f-4bc3-4759-b5ed-0f363d64b11d");
    }

}
