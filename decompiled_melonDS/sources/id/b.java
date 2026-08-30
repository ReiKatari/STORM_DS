package id;

import ai.q0;
import ed.r;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import mc.q;
import yb.y;
import zc.v1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements zc.g, v1 {
    public final zc.h A;
    public final /* synthetic */ c B;

    public b(c cVar, zc.h hVar) {
        this.B = cVar;
        this.A = hVar;
    }

    @Override // zc.v1
    public final void b(r rVar, int i2) {
        this.A.b(rVar, i2);
    }

    @Override // zc.g
    public final void e(Object obj, q qVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f7032b0;
        c cVar = this.B;
        atomicReferenceFieldUpdater.set(cVar, null);
        a2.c cVar2 = new a2.c(23, cVar, this);
        zc.h hVar = this.A;
        hVar.E(y.f14813a, hVar.L, new q0(16, cVar2));
    }

    @Override // cc.c
    public final cc.g g() {
        return this.A.X;
    }

    @Override // cc.c
    public final void h(Object obj) {
        this.A.h(obj);
    }

    @Override // zc.g
    public final boolean n(Throwable th2) {
        return this.A.n(th2);
    }

    @Override // zc.g
    public final a0.c o(Object obj, q qVar) {
        c cVar = this.B;
        q0 q0Var = new q0(cVar, this);
        a0.c o5 = this.A.o((y) obj, q0Var);
        if (o5 != null) {
            c.f7032b0.set(cVar, null);
        }
        return o5;
    }

    @Override // zc.g
    public final void s(Object obj) {
        this.A.s(obj);
    }
}
