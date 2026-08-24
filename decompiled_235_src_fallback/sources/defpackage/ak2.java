package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ak2  reason: default package */
/* loaded from: classes.dex */
public final class ak2 extends defpackage.mk5 {
    public static final defpackage.n34 d = null;
    public final java.util.List b;
    public final java.util.List c;

    static {
            xh5 r0 = defpackage.n34.d
            java.lang.String r0 = "application/x-www-form-urlencoded"
            n34 r0 = defpackage.xk2.k(r0)
            defpackage.ak2.d = r0
            return
    }

    public ak2(java.util.ArrayList r1, java.util.ArrayList r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            java.util.List r1 = defpackage.az7.j(r1)
            r0.b = r1
            java.util.List r1 = defpackage.az7.j(r2)
            r0.c = r1
            return
    }

    @Override // defpackage.mk5
    public final long a() {
            r2 = this;
            r0 = 0
            r1 = 1
            long r0 = r2.e(r0, r1)
            return r0
    }

    @Override // defpackage.mk5
    public final defpackage.n34 b() {
            r0 = this;
            n34 r0 = defpackage.ak2.d
            return r0
    }

    @Override // defpackage.mk5
    public final void d(defpackage.y80 r2) {
            r1 = this;
            r0 = 0
            r1.e(r2, r0)
            return
    }

    public final long e(defpackage.y80 r5, boolean r6) {
            r4 = this;
            if (r6 == 0) goto L8
            k80 r5 = new k80
            r5.<init>()
            goto Lf
        L8:
            r5.getClass()
            k80 r5 = r5.a()
        Lf:
            java.util.List r0 = r4.b
            int r1 = r0.size()
            r2 = 0
        L16:
            if (r2 >= r1) goto L3b
            if (r2 <= 0) goto L1f
            r3 = 38
            r5.n0(r3)
        L1f:
            java.lang.Object r3 = r0.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            r5.t0(r3)
            r3 = 61
            r5.n0(r3)
            java.util.List r3 = r4.c
            java.lang.Object r3 = r3.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            r5.t0(r3)
            int r2 = r2 + 1
            goto L16
        L3b:
            if (r6 == 0) goto L43
            long r0 = r5.B
            r5.e()
            return r0
        L43:
            r4 = 0
            return r4
    }
}
