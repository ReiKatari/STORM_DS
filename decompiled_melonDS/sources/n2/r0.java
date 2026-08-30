package n2;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r0 implements x1, zc.s {
    public final cc.g A;
    public final mc.p B;
    public final ah.h0 L;
    public zc.l1 R;

    public r0(cc.g gVar, mc.p pVar) {
        this.A = gVar;
        this.B = pVar;
        this.L = zc.x.a(gVar.H(this));
    }

    @Override // cc.g
    public final cc.g H(cc.g gVar) {
        return pc.a.G(this, gVar);
    }

    @Override // cc.g
    public final Object L(Object obj, mc.p pVar) {
        return pVar.j(obj, this);
    }

    @Override // n2.x1
    public final void a() {
        zc.l1 l1Var = this.R;
        if (l1Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            l1Var.i(cancellationException);
        }
        this.R = zc.x.v(this.L, null, null, this.B, 3);
    }

    @Override // n2.x1
    public final void b() {
        zc.l1 l1Var = this.R;
        if (l1Var != null) {
            l1Var.x(new j0(1));
        }
        this.R = null;
    }

    @Override // n2.x1
    public final void c() {
        zc.l1 l1Var = this.R;
        if (l1Var != null) {
            l1Var.x(new j0(1));
        }
        this.R = null;
    }

    @Override // cc.e
    public final cc.f getKey() {
        return zc.r.A;
    }

    @Override // cc.g
    public final cc.g m(cc.f fVar) {
        return pc.a.F(this, fVar);
    }

    @Override // cc.g
    public final cc.e t(cc.f fVar) {
        return pc.a.w(this, fVar);
    }

    @Override // zc.s
    public final void z(cc.g gVar, Throwable th2) {
        a3.f fVar = (a3.f) gVar.t(a3.f.B);
        if (fVar != null) {
            d0.d.k0(th2, new a3.e(0, fVar, this));
        }
        zc.s sVar = (zc.s) this.A.t(zc.r.A);
        if (sVar != null) {
            sVar.z(gVar, th2);
            return;
        }
        throw th2;
    }
}
