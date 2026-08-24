package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gb4  reason: default package */
/* loaded from: classes.dex */
public final class gb4 implements qj0, zr7 {
    public final rj0 A;
    public final /* synthetic */ hb4 B;

    public gb4(hb4 hb4Var, rj0 rj0Var) {
        this.B = hb4Var;
        this.A = rj0Var;
    }

    @Override // defpackage.zr7
    public final void a(p96 p96Var, int i) {
        this.A.a(p96Var, i);
    }

    @Override // defpackage.r41
    public final l61 b() {
        return this.A.X;
    }

    @Override // defpackage.r41
    public final void i(Object obj) {
        this.A.i(obj);
    }

    @Override // defpackage.qj0
    public final gr1 j(Object obj, fo2 fo2Var) {
        hb4 hb4Var = this.B;
        ov4 ov4Var = new ov4(hb4Var, this);
        gr1 K = this.A.K((jg7) obj, ov4Var);
        if (K != null) {
            hb4.f0.set(hb4Var, null);
        }
        return K;
    }

    @Override // defpackage.qj0
    public final void t(Object obj, fo2 fo2Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = hb4.f0;
        hb4 hb4Var = this.B;
        atomicReferenceFieldUpdater.set(hb4Var, null);
        this.A.G(jg7.a, new bg2(13, hb4Var, this));
    }

    @Override // defpackage.qj0
    public final boolean w(Throwable th) {
        return this.A.w(th);
    }

    @Override // defpackage.qj0
    public final void y(Object obj) {
        this.A.y(obj);
    }
}
