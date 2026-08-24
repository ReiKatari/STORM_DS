package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: db4  reason: default package */
/* loaded from: classes.dex */
public final class db4 {
    public final AtomicReference a = new AtomicReference(null);
    public final hb4 b = new hb4();

    public static final void a(db4 db4Var, ab4 ab4Var) {
        AtomicReference atomicReference = db4Var.a;
        while (true) {
            ab4 ab4Var2 = (ab4) atomicReference.get();
            if (ab4Var2 != null && ab4Var.a.compareTo(ab4Var2.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(ab4Var2, ab4Var)) {
                if (atomicReference.get() != ab4Var2) {
                    break;
                }
            }
            if (ab4Var2 != null) {
                ab4Var2.b.h(new tx4("Mutation interrupted", 0));
                return;
            }
            return;
        }
    }

    public static Object b(db4 db4Var, qn2 qn2Var, hw6 hw6Var) {
        xa4 xa4Var = xa4.Default;
        db4Var.getClass();
        return g04.C(new ja1(xa4Var, db4Var, qn2Var, (r41) null, 7), hw6Var);
    }
}
