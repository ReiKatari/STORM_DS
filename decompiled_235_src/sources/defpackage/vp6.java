package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vp6  reason: default package */
/* loaded from: classes.dex */
public final class vp6 extends u1 {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.u1
    public final boolean a(t1 t1Var) {
        tp6 tp6Var = (tp6) t1Var;
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(up6.a);
        return true;
    }

    @Override // defpackage.u1
    public final r41[] b(t1 t1Var) {
        tp6 tp6Var = (tp6) t1Var;
        this.a.set(null);
        return q60.a;
    }
}
