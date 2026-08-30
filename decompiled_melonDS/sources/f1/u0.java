package f1;

import a4.h2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u0 extends b3.o implements h2 {

    /* renamed from: i0  reason: collision with root package name */
    public j1.i f4654i0;

    /* renamed from: j0  reason: collision with root package name */
    public j1.f f4655j0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Type inference failed for: r5v3, types: [j1.h, java.lang.Object, j1.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O0(f1.u0 r4, ec.c r5) {
        /*
            boolean r0 = r5 instanceof f1.r0
            if (r0 == 0) goto L13
            r0 = r5
            f1.r0 r0 = (f1.r0) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            f1.r0 r0 = new f1.r0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.X
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            j1.f r0 = r0.R
            p7.j.I(r5)
            goto L4a
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r4)
            r4 = 0
            return r4
        L30:
            p7.j.I(r5)
            j1.f r5 = r4.f4655j0
            if (r5 != 0) goto L4c
            j1.f r5 = new j1.f
            r5.<init>()
            j1.i r2 = r4.f4654i0
            r0.R = r5
            r0.Z = r3
            java.lang.Object r0 = r2.a(r5, r0)
            if (r0 != r1) goto L49
            return r1
        L49:
            r0 = r5
        L4a:
            r4.f4655j0 = r0
        L4c:
            yb.y r4 = yb.y.f14813a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.u0.O0(f1.u0, ec.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P0(f1.u0 r4, ec.c r5) {
        /*
            boolean r0 = r5 instanceof f1.s0
            if (r0 == 0) goto L13
            r0 = r5
            f1.s0 r0 = (f1.s0) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            f1.s0 r0 = new f1.s0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            p7.j.I(r5)
            goto L45
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r4)
            r4 = 0
            return r4
        L2e:
            p7.j.I(r5)
            j1.f r5 = r4.f4655j0
            if (r5 == 0) goto L48
            j1.g r2 = new j1.g
            r2.<init>(r5)
            j1.i r5 = r4.f4654i0
            r0.Y = r3
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r5 = 0
            r4.f4655j0 = r5
        L48:
            yb.y r4 = yb.y.f14813a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.u0.P0(f1.u0, ec.c):java.lang.Object");
    }

    @Override // b3.o
    public final void H0() {
        Q0();
    }

    public final void Q0() {
        j1.f fVar = this.f4655j0;
        if (fVar != null) {
            this.f4654i0.b(new j1.g(fVar));
            this.f4655j0 = null;
        }
    }

    @Override // a4.h2
    public final void g0() {
        Q0();
    }

    @Override // a4.h2
    public final void s0(v3.k kVar, v3.l lVar, long j2) {
        if (lVar == v3.l.Main) {
            int i2 = kVar.f13683f;
            if (i2 == 4) {
                zc.x.v(C0(), null, null, new t0(this, null, 0), 3);
            } else if (i2 == 5) {
                zc.x.v(C0(), null, null, new t0(this, null, 1), 3);
            }
        }
    }
}
