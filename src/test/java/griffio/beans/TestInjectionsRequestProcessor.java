package griffio.beans;

import griffio.beans.inject.SystemComponent;
import griffio.beans.processor.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.annotation.Resource;

@Test
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class TestInjectionsRequestProcessor extends AbstractTestNGSpringContextTests {

    @Autowired
    Processor<String> uniqueIdProcessor;

    @Resource(name = "dayOfWeek")
    Processor<Boolean> dayOfWeekProcessor;

    @Autowired()
    @SystemComponent(value = "anotherUniqueId")
    Processor<String> uniqueIdProcessor2;

    public void unique() {
        Assert.assertNotEquals(uniqueIdProcessor.execute(), uniqueIdProcessor.execute());
    }

    public void day() {
        Assert.assertTrue(dayOfWeekProcessor.execute());
    }

    public void unique2() {
        Assert.assertNotEquals(uniqueIdProcessor2.execute(), uniqueIdProcessor2.execute());
    }
}
