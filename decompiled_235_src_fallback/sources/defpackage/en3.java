package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: en3  reason: default package */
/* loaded from: classes.dex */
public final class en3 implements defpackage.nt6 {
    public final defpackage.q94 a;
    public final /* synthetic */ defpackage.gn3 b;
    public final /* synthetic */ java.lang.Object c;

    public en3(defpackage.gn3 r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.c = r2
            int[] r1 = defpackage.p93.a
            q94 r1 = new q94
            r1.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.nt6
    public final int a() {
            r1 = this;
            gn3 r0 = r1.b
            ja4 r0 = r0.f0
            java.lang.Object r1 = r1.c
            java.lang.Object r1 = r0.g(r1)
            sm3 r1 = (defpackage.sm3) r1
            if (r1 == 0) goto L1b
            java.util.List r1 = r1.n()
            aa4 r1 = (defpackage.aa4) r1
            java.lang.Object r1 = r1.B
            ua4 r1 = (defpackage.ua4) r1
            int r1 = r1.L
            return r1
        L1b:
            r1 = 0
            return r1
    }

    @Override // defpackage.nt6
    public final void b(defpackage.pc4 r2) {
            r1 = this;
            gn3 r0 = r1.b
            ja4 r0 = r0.f0
            java.lang.Object r1 = r1.c
            java.lang.Object r1 = r0.g(r1)
            sm3 r1 = (defpackage.sm3) r1
            if (r1 == 0) goto L17
            if0 r1 = r1.B0
            if (r1 == 0) goto L17
            java.lang.Object r1 = r1.g
            z64 r1 = (defpackage.z64) r1
            goto L18
        L17:
            r1 = 0
        L18:
            if (r1 == 0) goto L23
            boolean r0 = r1.j0
            if (r0 == 0) goto L23
            java.lang.String r0 = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode"
            defpackage.ii2.X(r1, r0, r2)
        L23:
            return
    }

    @Override // defpackage.nt6
    public final long c(int r5) {
            r4 = this;
            gn3 r0 = r4.b
            ja4 r0 = r0.f0
            java.lang.Object r1 = r4.c
            java.lang.Object r0 = r0.g(r1)
            sm3 r0 = (defpackage.sm3) r0
            if (r0 == 0) goto L7b
            boolean r1 = r0.H()
            if (r1 == 0) goto L7b
            java.util.List r1 = r0.n()
            aa4 r1 = (defpackage.aa4) r1
            java.lang.Object r1 = r1.B
            ua4 r1 = (defpackage.ua4) r1
            int r1 = r1.L
            if (r5 < 0) goto L24
            if (r5 < r1) goto L42
        L24:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Index ("
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r3 = ") is out of bound of [0, "
            r2.append(r3)
            r2.append(r1)
            r1 = 41
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            defpackage.p53.e(r1)
        L42:
            q94 r4 = r4.a
            boolean r4 = r4.c(r5)
            if (r4 == 0) goto L7b
            java.util.List r4 = r0.n()
            aa4 r4 = (defpackage.aa4) r4
            java.lang.Object r4 = r4.get(r5)
            sm3 r4 = (defpackage.sm3) r4
            wm3 r4 = r4.C0
            d34 r4 = r4.p
            int r4 = r4.A
            java.util.List r0 = r0.n()
            aa4 r0 = (defpackage.aa4) r0
            java.lang.Object r5 = r0.get(r5)
            sm3 r5 = (defpackage.sm3) r5
            wm3 r5 = r5.C0
            d34 r5 = r5.p
            int r5 = r5.B
            long r0 = (long) r4
            r4 = 32
            long r0 = r0 << r4
            long r4 = (long) r5
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r2
            long r4 = r4 | r0
            return r4
        L7b:
            r4 = 0
            return r4
    }

    @Override // defpackage.nt6
    public final void d(int r6, long r7) {
            r5 = this;
            gn3 r0 = r5.b
            ja4 r1 = r0.f0
            java.lang.Object r2 = r5.c
            java.lang.Object r1 = r1.g(r2)
            sm3 r1 = (defpackage.sm3) r1
            if (r1 == 0) goto L6f
            boolean r2 = r1.H()
            if (r2 == 0) goto L6f
            java.util.List r2 = r1.n()
            aa4 r2 = (defpackage.aa4) r2
            java.lang.Object r2 = r2.B
            ua4 r2 = (defpackage.ua4) r2
            int r2 = r2.L
            if (r6 < 0) goto L24
            if (r6 < r2) goto L42
        L24:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Index ("
            r3.<init>(r4)
            r3.append(r6)
            java.lang.String r4 = ") is out of bound of [0, "
            r3.append(r4)
            r3.append(r2)
            r2 = 41
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            defpackage.p53.e(r2)
        L42:
            boolean r2 = r1.I()
            if (r2 == 0) goto L4d
            java.lang.String r2 = "Pre-measure called on node that is not placed"
            defpackage.p53.a(r2)
        L4d:
            sm3 r0 = r0.A
            r2 = 1
            r0.m0 = r2
            zp4 r2 = defpackage.vm3.a(r1)
            java.util.List r1 = r1.n()
            aa4 r1 = (defpackage.aa4) r1
            java.lang.Object r1 = r1.get(r6)
            sm3 r1 = (defpackage.sm3) r1
            te r2 = (defpackage.te) r2
            r2.t(r1, r7)
            r7 = 0
            r0.m0 = r7
            q94 r5 = r5.a
            r5.a(r6)
        L6f:
            return
    }

    @Override // defpackage.nt6
    public final void dispose() {
            r1 = this;
            gn3 r0 = r1.b
            java.lang.Object r1 = r1.c
            defpackage.gn3.c(r0, r1)
            return
    }
}
