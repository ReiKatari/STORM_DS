package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ay0  reason: default package */
/* loaded from: classes.dex */
public final class ay0 implements b06 {
    public final AtomicReference a;

    public ay0(b06 b06Var) {
        this.a = new AtomicReference(b06Var);
    }

    @Override // defpackage.b06
    public final Iterator iterator() {
        b06 b06Var = (b06) this.a.getAndSet(null);
        if (b06Var != null) {
            return b06Var.iterator();
        }
        i.n("This sequence can be consumed only once.");
        return null;
    }
}
