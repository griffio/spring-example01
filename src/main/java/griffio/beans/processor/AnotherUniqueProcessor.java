package griffio.beans.processor;

import com.google.common.base.Supplier;
import griffio.beans.inject.SystemComponent;
import griffio.beans.inject.SystemUniqueId;
import griffio.beans.unique.UniqueType;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Another Processor that returns the next unique id
 */
@SystemComponent(value = "anotherUniqueId")
public class AnotherUniqueProcessor implements Processor<String> {

    private final Supplier<String> uniqueId;

    @Autowired
    public AnotherUniqueProcessor(@SystemUniqueId(UniqueType.RANDOM) Supplier<String> uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String execute() {
        return uniqueId.get();
    }

}
