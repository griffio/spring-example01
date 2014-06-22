package griffio.beans.processor;

import griffio.beans.unique.GuidSupplier;
import griffio.beans.unique.SequenceSupplier;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class UniqueProcessorTest {

    public void isGuidUnique() {
        UniqueProcessor uniqueProcessor = new UniqueProcessor(new GuidSupplier());
        Assert.assertNotEquals(uniqueProcessor.execute(), uniqueProcessor.execute());
    }

    public void isSequenceUnique() {
        UniqueProcessor uniqueProcessor = new UniqueProcessor(new SequenceSupplier());
        Assert.assertNotEquals(uniqueProcessor.execute(), uniqueProcessor.execute());
    }

}
