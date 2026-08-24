package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f11  reason: default package */
/* loaded from: classes.dex */
public final class f11 implements qb6 {
    public final AtomicReference a;

    public f11(qb6 qb6Var) {
        this.a = new AtomicReference(qb6Var);
    }

    @Override // defpackage.qb6
    public final Iterator iterator() {
        qb6 qb6Var = (qb6) this.a.getAndSet(null);
        if (qb6Var != null) {
            return qb6Var.iterator();
        }
        i.m("This sequence can be consumed only once.");
        return null;
    }
}
