package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ge6  reason: default package */
/* loaded from: classes.dex */
public final class ge6 extends t1 {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.t1
    public final boolean a(s1 s1Var) {
        ee6 ee6Var = (ee6) s1Var;
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(fe6.a);
        return true;
    }

    @Override // defpackage.t1
    public final j11[] b(s1 s1Var) {
        ee6 ee6Var = (ee6) s1Var;
        this.a.set(null);
        return pu.a;
    }
}
