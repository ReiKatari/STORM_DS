package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sp3  reason: default package */
/* loaded from: classes.dex */
public final class sp3 extends defpackage.z64 implements defpackage.jm3 {
    public static final defpackage.pp3 n0 = null;
    public defpackage.tp3 k0;
    public defpackage.p70 l0;
    public defpackage.lo4 m0;

    static {
            pp3 r0 = new pp3
            r0.<init>()
            defpackage.sp3.n0 = r0
            return
    }

    public final boolean R0(defpackage.np3 r4, int r5) {
            r3 = this;
            r0 = 5
            r1 = 1
            if (r5 != r0) goto L5
            goto L8
        L5:
            r0 = 6
            if (r5 != r0) goto Lf
        L8:
            lo4 r0 = r3.m0
            lo4 r2 = defpackage.lo4.Horizontal
            if (r0 != r2) goto L23
            goto L3a
        Lf:
            r0 = 3
            if (r5 != r0) goto L13
            goto L16
        L13:
            r0 = 4
            if (r5 != r0) goto L1d
        L16:
            lo4 r0 = r3.m0
            lo4 r2 = defpackage.lo4.Vertical
            if (r0 != r2) goto L23
            goto L3a
        L1d:
            if (r5 != r1) goto L20
            goto L23
        L20:
            r0 = 2
            if (r5 != r0) goto L3c
        L23:
            boolean r5 = r3.S0(r5)
            if (r5 == 0) goto L35
            int r4 = r4.b
            tp3 r3 = r3.k0
            int r3 = r3.a()
            int r3 = r3 - r1
            if (r4 >= r3) goto L3a
            goto L39
        L35:
            int r3 = r4.a
            if (r3 <= 0) goto L3a
        L39:
            return r1
        L3a:
            r3 = 0
            return r3
        L3c:
            java.lang.String r3 = "Lazy list does not support beyond bounds layout for the specified direction"
            defpackage.i.m(r3)
            r3 = 0
            return r3
    }

    public final boolean S0(int r5) {
            r4 = this;
            r0 = 0
            r1 = 1
            if (r5 != r1) goto L5
            return r0
        L5:
            r2 = 2
            if (r5 != r2) goto L9
            return r1
        L9:
            r3 = 5
            if (r5 != r3) goto Ld
            return r0
        Ld:
            r3 = 6
            if (r5 != r3) goto L11
            return r1
        L11:
            r3 = 3
            if (r5 != r3) goto L2d
            sm3 r4 = defpackage.nc1.f0(r4)
            kk3 r4 = r4.v0
            int[] r5 = defpackage.qp3.a
            int r4 = r4.ordinal()
            r4 = r5[r4]
            if (r4 == r1) goto L2c
            if (r4 != r2) goto L27
            return r1
        L27:
            defpackage.i.d()
        L2a:
            r4 = 0
            return r4
        L2c:
            return r0
        L2d:
            r3 = 4
            if (r5 != r3) goto L48
            sm3 r4 = defpackage.nc1.f0(r4)
            kk3 r4 = r4.v0
            int[] r5 = defpackage.qp3.a
            int r4 = r4.ordinal()
            r4 = r5[r4]
            if (r4 == r1) goto L47
            if (r4 != r2) goto L43
            return r0
        L43:
            defpackage.i.d()
            goto L2a
        L47:
            return r1
        L48:
            java.lang.String r4 = "Lazy list does not support beyond bounds layout for the specified direction"
            defpackage.i.m(r4)
            goto L2a
    }

    @Override // defpackage.jm3
    public final defpackage.f34 c(defpackage.g34 r2, defpackage.x24 r3, long r4) {
            r1 = this;
            dx4 r1 = r3.y(r4)
            int r3 = r1.A
            int r4 = r1.B
            jv r5 = new jv
            r0 = 6
            r5.<init>(r1, r0)
            zt1 r1 = defpackage.zt1.A
            f34 r1 = r2.K(r3, r4, r1, r5)
            return r1
    }
}
