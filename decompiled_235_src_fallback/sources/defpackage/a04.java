package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a04  reason: default package */
/* loaded from: classes.dex */
public final class a04 extends defpackage.e74 {
    public final defpackage.mn0 a;
    public final defpackage.t27 b;
    public final defpackage.px4 c;

    public a04(defpackage.mn0 r1, defpackage.t27 r2, defpackage.px4 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r3 = this;
            c04 r0 = new c04
            mn0 r1 = r3.a
            t27 r2 = r3.b
            px4 r3 = r3.c
            r0.<init>(r1, r2, r3)
            return r0
    }

    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            if (r0 != r1) goto L4
            r0 = 1
            return r0
        L4:
            r0 = 0
            return r0
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r8) {
            r7 = this;
            c04 r8 = (defpackage.c04) r8
            r8.getClass()
            px4 r0 = r8.m0
            android.view.View r1 = r8.n0
            qh1 r2 = r8.o0
            mn0 r3 = r7.a
            r8.k0 = r3
            t27 r3 = r7.b
            r8.l0 = r3
            px4 r7 = r7.c
            r8.m0 = r7
            android.view.View r3 = defpackage.jw2.z(r8)
            sm3 r4 = defpackage.nc1.f0(r8)
            qh1 r4 = r4.u0
            ox4 r5 = r8.p0
            if (r5 == 0) goto L5d
            fb6 r5 = defpackage.d04.a
            r5 = 2143289344(0x7fc00000, float:NaN)
            boolean r6 = java.lang.Float.isNaN(r5)
            if (r6 == 0) goto L36
            boolean r6 = java.lang.Float.isNaN(r5)
            if (r6 == 0) goto L36
            goto L3c
        L36:
            boolean r6 = r7.a()
            if (r6 == 0) goto L5a
        L3c:
            boolean r6 = defpackage.om1.b(r5, r5)
            if (r6 == 0) goto L5a
            boolean r5 = defpackage.om1.b(r5, r5)
            if (r5 == 0) goto L5a
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L5a
            boolean r7 = r3.equals(r1)
            if (r7 == 0) goto L5a
            boolean r7 = defpackage.nb3.k(r4, r2)
            if (r7 != 0) goto L5d
        L5a:
            r8.S0()
        L5d:
            r8.T0()
            return
    }

    public final int hashCode() {
            r6 = this;
            mn0 r0 = r6.a
            int r0 = r0.hashCode()
            int r0 = r0 * 961
            r1 = 2143289344(0x7fc00000, float:NaN)
            r2 = 31
            int r0 = defpackage.xg6.a(r1, r0, r2)
            r3 = 1
            int r0 = defpackage.xg6.e(r0, r3, r2)
            r4 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = defpackage.i61.c(r4, r0, r2)
            int r0 = defpackage.xg6.a(r1, r0, r2)
            int r0 = defpackage.xg6.a(r1, r0, r2)
            int r0 = defpackage.xg6.e(r0, r3, r2)
            t27 r1 = r6.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * r2
            px4 r6 = r6.c
            int r6 = r6.hashCode()
            int r6 = r6 + r1
            return r6
    }
}
