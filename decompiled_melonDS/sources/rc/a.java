package rc;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends qc.a {
    @Override // qc.a
    public final Random e() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        current.getClass();
        return current;
    }
}
