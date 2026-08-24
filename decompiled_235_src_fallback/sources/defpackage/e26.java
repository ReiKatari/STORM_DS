package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e26  reason: default package */
/* loaded from: classes.dex */
public final class e26 extends defpackage.nw7 {
    public final defpackage.ap3 t0;
    public int u0;
    public java.lang.String v0;
    public final defpackage.jd1 w0;

    public e26(android.os.Bundle r3, java.util.LinkedHashMap r4) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.u0 = r0
            java.lang.String r0 = ""
            r2.v0 = r0
            jd1 r0 = defpackage.ic6.a
            r2.w0 = r0
            ap3 r0 = new ap3
            r1 = 27
            r0.<init>(r1, r3, r4)
            r2.t0 = r0
            return
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final defpackage.sc1 F(defpackage.wb6 r2) {
            r1 = this;
            r2.getClass()
            boolean r0 = defpackage.np2.X(r2)
            if (r0 == 0) goto L12
            r0 = 0
            java.lang.String r2 = r2.g(r0)
            r1.v0 = r2
            r1.u0 = r0
        L12:
            return r1
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final boolean M() {
            r2 = this;
            java.lang.String r0 = r2.v0
            ap3 r2 = r2.t0
            r2.getClass()
            r0.getClass()
            java.lang.Object r1 = r2.L
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r1 = r1.get(r0)
            fd4 r1 = (defpackage.fd4) r1
            if (r1 == 0) goto L1f
            java.lang.Object r2 = r2.B
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.Object r2 = r1.a(r2, r0)
            goto L20
        L1f:
            r2 = 0
        L20:
            if (r2 == 0) goto L24
            r2 = 1
            return r2
        L24:
            r2 = 0
            return r2
    }

    @Override // defpackage.nw7
    public final java.lang.Object V() {
            r0 = this;
            java.lang.Object r0 = r0.y0()
            return r0
    }

    @Override // defpackage.ux0
    public final defpackage.jd1 b() {
            r0 = this;
            jd1 r0 = r0.w0
            return r0
    }

    @Override // defpackage.sc1
    public final java.lang.Object k(defpackage.gg3 r1) {
            r0 = this;
            r1.getClass()
            java.lang.Object r0 = r0.y0()
            return r0
    }

    @Override // defpackage.ux0
    public final int q(defpackage.wb6 r4) {
            r3 = this;
            r4.getClass()
            int r0 = r3.u0
        L5:
            int r0 = r0 + 1
            int r1 = r4.f()
            if (r0 < r1) goto Lf
            r3 = -1
            return r3
        Lf:
            java.lang.String r1 = r4.g(r0)
            ap3 r2 = r3.t0
            r2.getClass()
            r1.getClass()
            java.lang.Object r2 = r2.B
            android.os.Bundle r2 = (android.os.Bundle) r2
            boolean r2 = r2.containsKey(r1)
            if (r2 == 0) goto L5
            r3.u0 = r0
            r3.v0 = r1
            return r0
    }

    public final java.lang.Object y0() {
            r4 = this;
            java.lang.String r0 = r4.v0
            ap3 r1 = r4.t0
            r1.getClass()
            r0.getClass()
            java.lang.Object r2 = r1.L
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
            java.lang.Object r2 = r2.get(r0)
            fd4 r2 = (defpackage.fd4) r2
            r3 = 0
            if (r2 == 0) goto L20
            java.lang.Object r1 = r1.B
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.Object r0 = r2.a(r1, r0)
            goto L21
        L20:
            r0 = r3
        L21:
            if (r0 == 0) goto L24
            return r0
        L24:
            java.lang.String r0 = "Unexpected null value for non-nullable argument "
            java.lang.String r4 = r4.v0
            defpackage.u34.i(r4, r0)
            return r3
    }
}
