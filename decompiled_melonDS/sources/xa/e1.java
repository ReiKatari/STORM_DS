package xa;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class e1 extends ua.u {
    @Override // ua.u
    public final Object b(cb.a aVar) {
        try {
            return new AtomicInteger(aVar.K());
        } catch (NumberFormatException e6) {
            throw new RuntimeException(e6);
        }
    }

    @Override // ua.u
    public final void c(cb.c cVar, Object obj) {
        cVar.L(((AtomicInteger) obj).get());
    }
}
