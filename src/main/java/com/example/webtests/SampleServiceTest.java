package com.example.webtests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleServiceTest {

    SampleService service = new SampleService();

    @Test
    public void testAdd() {
        int result = service.add(2, 3);
        Assert.assertEquals(result, 5);
    }

    @Test
    public void testSubtract() {
        int result = service.subtract(5, 3);
        Assert.assertEquals(result, 2);
    }

    @Test
    public void testGreetWithName() {
        String result = service.greet("John");
        Assert.assertEquals(result, "Hello, John!");
    }

    // Intentionally omitting the test for greet() when name is null or empty to see the coverage difference
}
