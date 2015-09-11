package za.ac.cput.Chapter3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Chapter3.Config.AppConfig;

/**
 * Created by student on 2015/02/20.
 */
public class TestCalculator {

    public TestCalculator()
    {

    }

    private ApplicationContext ctx;
    private SmallCalInterface cal;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        cal = (SmallCalInterface) ctx.getBean("calcu");
    }

    @Test

    public void addNumbers() throws Exception {
        Assert.assertEquals(10, cal.adding(5, 5));
        System.out.println("Passed = 10");
    }

    @Test
    public void mutiplyNumbers() throws Exception {
        Assert.assertEquals(100, cal.multiply(10, 10));
        System.out.println("Passed = 100");

    }

    @After
    public void tearDown() throws Exception
    {

    }

}
