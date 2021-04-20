package br.platform.resource;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class BitcoinResourceTest {

    @Test
    public void testIfStatusCodeOfRequestIs200() {
        RestAssured.given().get("")
    }
}
