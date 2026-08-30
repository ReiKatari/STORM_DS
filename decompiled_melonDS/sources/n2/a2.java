package n2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a2 implements zc.u, x1 {
    public static final g R = new Object();
    public final cc.g A;
    public final a2 B = this;
    public volatile cc.g L;

    public a2(cc.g gVar) {
        this.A = gVar;
    }

    @Override // n2.x1
    public final void b() {
        d();
    }

    @Override // n2.x1
    public final void c() {
        d();
    }

    public final void d() {
        synchronized (this.B) {
            try {
                cc.g gVar = this.L;
                if (gVar == null) {
                    this.L = R;
                } else {
                    zc.x.e(gVar, new j0(0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // zc.u
    public final cc.g v() {
        cc.g gVar;
        cc.g gVar2;
        cc.g gVar3 = this.L;
        if (gVar3 == null || gVar3 == R) {
            a3.f fVar = (a3.f) this.A.t(a3.f.B);
            if (fVar != null) {
                gVar = new z1(fVar, this);
            } else {
                gVar = cc.h.A;
            }
            synchronized (this.B) {
                try {
                    cc.g gVar4 = this.L;
                    if (gVar4 == null) {
                        cc.g gVar5 = this.A;
                        gVar2 = gVar5.H(new zc.a1((zc.y0) gVar5.t(zc.r.B))).H(cc.h.A).H(gVar);
                    } else if (gVar4 == R) {
                        cc.g gVar6 = this.A;
                        zc.a1 a1Var = new zc.a1((zc.y0) gVar6.t(zc.r.B));
                        a1Var.u(new j0(0));
                        gVar2 = gVar6.H(a1Var).H(cc.h.A).H(gVar);
                    } else {
                        gVar2 = gVar4;
                    }
                    this.L = gVar2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            gVar3 = gVar2;
        }
        gVar3.getClass();
        return gVar3;
    }

    @Override // n2.x1
    public final void a() {
    }
}
