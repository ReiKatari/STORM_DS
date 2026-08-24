package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gl7  reason: default package */
/* loaded from: classes.dex */
public final class gl7 extends defpackage.sr4 {
    public final defpackage.vs4 X;
    public final defpackage.vs4 Y;
    public final defpackage.qk7 Z;
    public final defpackage.vs4 d0;
    public float e0;
    public defpackage.z40 f0;

    public gl7(defpackage.mu2 r4) {
            r3 = this;
            r3.<init>()
            xi6 r0 = new xi6
            r1 = 0
            r0.<init>(r1)
            vs4 r0 = defpackage.np2.Y(r0)
            r3.X = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            vs4 r0 = defpackage.np2.Y(r0)
            r3.Y = r0
            qk7 r0 = new qk7
            r0.<init>(r4)
            pj r4 = new pj
            r1 = 20
            r4.<init>(r3, r1)
            r0.f = r4
            r3.Z = r0
            vs0 r4 = defpackage.vs0.j0
            vs4 r0 = new vs4
            jg7 r1 = defpackage.jg7.a
            r0.<init>(r1, r4)
            r3.d0 = r0
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.e0 = r4
            return
    }

    @Override // defpackage.sr4
    public final void d(float r1) {
            r0 = this;
            r0.e0 = r1
            return
    }

    @Override // defpackage.sr4
    public final void e(defpackage.z40 r1) {
            r0 = this;
            r0.f0 = r1
            return
    }

    @Override // defpackage.sr4
    public final long h() {
            r2 = this;
            vs4 r2 = r2.X
            java.lang.Object r2 = r2.getValue()
            xi6 r2 = (defpackage.xi6) r2
            long r0 = r2.a
            return r0
    }

    @Override // defpackage.sr4
    public final void i(defpackage.um3 r11) {
            r10 = this;
            zj0 r0 = r11.A
            z40 r1 = r10.f0
            qk7 r2 = r10.Z
            if (r1 != 0) goto L10
            vs4 r1 = r2.g
            java.lang.Object r1 = r1.getValue()
            z40 r1 = (defpackage.z40) r1
        L10:
            vs4 r3 = r10.Y
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L50
            kk3 r3 = r11.getLayoutDirection()
            kk3 r4 = defpackage.kk3.Rtl
            if (r3 != r4) goto L50
            long r3 = r0.t0()
            bt r0 = r0.B
            long r5 = r0.L()
            xj0 r7 = r0.G()
            r7.h()
            java.lang.Object r7 = r0.B     // Catch: java.lang.Throwable -> L4b
            os0 r7 = (defpackage.os0) r7     // Catch: java.lang.Throwable -> L4b
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            r9 = 1065353216(0x3f800000, float:1.0)
            r7.f0(r8, r9, r3)     // Catch: java.lang.Throwable -> L4b
            float r3 = r10.e0     // Catch: java.lang.Throwable -> L4b
            r2.e(r11, r3, r1)     // Catch: java.lang.Throwable -> L4b
            defpackage.xg6.v(r0, r5)
            goto L55
        L4b:
            r10 = move-exception
            defpackage.xg6.v(r0, r5)
            throw r10
        L50:
            float r0 = r10.e0
            r2.e(r11, r0, r1)
        L55:
            vs4 r10 = r10.d0
            r10.getValue()
            return
    }
}
