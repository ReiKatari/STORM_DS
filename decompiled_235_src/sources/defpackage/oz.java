package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oz  reason: default package */
/* loaded from: classes.dex */
public final class oz extends uc3 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater g0 = AtomicReferenceFieldUpdater.newUpdater(oz.class, Object.class, "_disposer$volatile");
    public static final /* synthetic */ long h0 = v36.a.objectFieldOffset(oz.class.getDeclaredField("_disposer$volatile"));
    private volatile /* synthetic */ Object _disposer$volatile;
    public final rj0 d0;
    public il1 e0;
    public final /* synthetic */ qz f0;

    public oz(qz qzVar, rj0 rj0Var) {
        this.f0 = qzVar;
        this.d0 = rj0Var;
    }

    @Override // defpackage.uc3
    public final boolean q() {
        return false;
    }

    @Override // defpackage.uc3
    public final void r(Throwable th) {
        rj0 rj0Var = this.d0;
        if (th != null) {
            gr1 K = rj0Var.K(new av0(th, false), null);
            if (K != null) {
                rj0Var.y(K);
                pz s = s();
                if (s != null) {
                    s.a();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = qz.b;
        qz qzVar = this.f0;
        if (atomicIntegerFieldUpdater.decrementAndGet(qzVar) == 0) {
            jg1[] jg1VarArr = qzVar.a;
            ArrayList arrayList = new ArrayList(jg1VarArr.length);
            for (jg1 jg1Var : jg1VarArr) {
                arrayList.add(jg1Var.k());
            }
            rj0Var.i(arrayList);
        }
    }

    public final pz s() {
        g0.getClass();
        return (pz) v36.a.getObjectVolatile(this, h0);
    }

    public final void t(pz pzVar) {
        g0.getClass();
        v36.a.putObjectVolatile(this, h0, pzVar);
    }
}
