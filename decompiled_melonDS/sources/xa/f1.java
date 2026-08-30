package xa;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class f1 extends ua.u {
    @Override // ua.u
    public final Object b(cb.a aVar) {
        return new AtomicBoolean(aVar.I());
    }

    @Override // ua.u
    public final void c(cb.c cVar, Object obj) {
        cVar.Z(((AtomicBoolean) obj).get());
    }
}
