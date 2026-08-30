package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x24  reason: default package */
/* loaded from: classes.dex */
public final class x24 {
    public final AtomicReference a = new AtomicReference(null);
    public final b34 b = new b34();

    public static final void a(x24 x24Var, u24 u24Var) {
        AtomicReference atomicReference = x24Var.a;
        while (true) {
            u24 u24Var2 = (u24) atomicReference.get();
            if (u24Var2 != null && u24Var.a.compareTo(u24Var2.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(u24Var2, u24Var)) {
                if (atomicReference.get() != u24Var2) {
                    break;
                }
            }
            if (u24Var2 != null) {
                u24Var2.b.i(new po4("Mutation interrupted", 0));
                return;
            }
            return;
        }
    }

    public static Object b(x24 x24Var, mi2 mi2Var, nk6 nk6Var) {
        r24 r24Var = r24.Default;
        x24Var.getClass();
        return iq2.k(new my1(r24Var, x24Var, mi2Var, null, 4), nk6Var);
    }
}
