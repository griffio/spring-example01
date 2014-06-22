package griffio.beans.unique;

import com.google.common.base.Supplier;
import griffio.beans.inject.SystemUniqueId;

import java.math.BigInteger;
import java.security.SecureRandom;

@SystemUniqueId(value = UniqueType.RANDOM)
public class RandomSupplier implements Supplier<String> {

    private final SecureRandom secureRandom = new SecureRandom();

    @Override
    public String get() {
        return new BigInteger(64, secureRandom).toString(32);
    }
}
