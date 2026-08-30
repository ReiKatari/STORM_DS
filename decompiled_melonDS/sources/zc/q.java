package zc;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class q extends cc.a implements cc.e {
    public static final p B = new p(cc.d.A, new u1.h1(28));

    public q() {
        super(cc.d.A);
    }

    public abstract void X(cc.g gVar, Runnable runnable);

    public void Y(cc.g gVar, Runnable runnable) {
        ed.b.i(this, gVar, runnable);
    }

    public boolean Z(cc.g gVar) {
        return !(this instanceof s1);
    }

    public q a0(int i2) {
        ed.b.a(i2);
        return new ed.g(this, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (((cc.e) r3.A.k(r2)) != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0020, code lost:
        if (cc.d.A == r3) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0024, code lost:
        return cc.h.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0025, code lost:
        return r2;
     */
    @Override // cc.a, cc.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cc.g m(cc.f r3) {
        /*
            r2 = this;
            r3.getClass()
            boolean r0 = r3 instanceof zc.p
            if (r0 == 0) goto L1e
            zc.p r3 = (zc.p) r3
            cc.f r0 = r2.A
            if (r0 == r3) goto L13
            cc.f r1 = r3.B
            if (r1 != r0) goto L12
            goto L13
        L12:
            return r2
        L13:
            mc.l r3 = r3.A
            java.lang.Object r3 = r3.k(r2)
            cc.e r3 = (cc.e) r3
            if (r3 == 0) goto L25
            goto L22
        L1e:
            cc.d r0 = cc.d.A
            if (r0 != r3) goto L25
        L22:
            cc.h r3 = cc.h.A
            return r3
        L25:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.q.m(cc.f):cc.g");
    }

    @Override // cc.a, cc.g
    public final cc.e t(cc.f fVar) {
        cc.e eVar;
        fVar.getClass();
        if (fVar instanceof p) {
            p pVar = (p) fVar;
            cc.f fVar2 = this.A;
            if ((fVar2 == pVar || pVar.B == fVar2) && (eVar = (cc.e) pVar.A.k(this)) != null) {
                return eVar;
            }
        } else if (cc.d.A == fVar) {
            return this;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + x.n(this);
    }
}
