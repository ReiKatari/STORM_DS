package gk;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends b {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // gk.b
    public final List a(Executor executor) {
        return Arrays.asList(new Object(), new p(executor));
    }

    @Override // gk.b
    public final List b() {
        return Collections.singletonList(new c(1));
    }
}
