package f1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f4600a = new AtomicReference(null);

    /* renamed from: b  reason: collision with root package name */
    public final id.c f4601b = new id.c();

    public static final void a(j1 j1Var, h1 h1Var) {
        AtomicReference atomicReference = j1Var.f4600a;
        while (true) {
            h1 h1Var2 = (h1) atomicReference.get();
            if (h1Var2 != null && h1Var.f4566a.compareTo(h1Var2.f4566a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(h1Var2, h1Var)) {
                if (atomicReference.get() != h1Var2) {
                    break;
                }
            }
            if (h1Var2 != null) {
                h1Var2.f4567b.i(new k1.c("Mutation interrupted", 0));
                return;
            }
            return;
        }
    }
}
