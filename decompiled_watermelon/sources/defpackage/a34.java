package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a34  reason: default package */
/* loaded from: classes.dex */
public final class a34 implements hh0, fd7 {
    public final ih0 A;
    public final /* synthetic */ b34 B;

    public a34(b34 b34Var, ih0 ih0Var) {
        this.B = b34Var;
        this.A = ih0Var;
    }

    @Override // defpackage.j11
    public final e31 a() {
        return this.A.X;
    }

    @Override // defpackage.fd7
    public final void b(dy5 dy5Var, int i) {
        this.A.b(dy5Var, i);
    }

    @Override // defpackage.j11
    public final void k(Object obj) {
        this.A.k(obj);
    }

    @Override // defpackage.hh0
    public final void l(Object obj, bj2 bj2Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b34.e0;
        b34 b34Var = this.B;
        atomicReferenceFieldUpdater.set(b34Var, null);
        kb2 kb2Var = new kb2(13, b34Var, this);
        ih0 ih0Var = this.A;
        ih0Var.G(o27.a, ih0Var.L, new km4(4, kb2Var));
    }

    @Override // defpackage.hh0
    public final an1 m(Object obj, bj2 bj2Var) {
        b34 b34Var = this.B;
        km4 km4Var = new km4(b34Var, this);
        an1 J = this.A.J((o27) obj, km4Var);
        if (J != null) {
            b34.e0.set(b34Var, null);
        }
        return J;
    }

    @Override // defpackage.hh0
    public final boolean r(Throwable th) {
        return this.A.r(th);
    }

    @Override // defpackage.hh0
    public final void s(Object obj) {
        this.A.s(obj);
    }
}
