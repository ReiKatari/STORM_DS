package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mt6  reason: default package */
/* loaded from: classes.dex */
public abstract class mt6 {
    public static final defpackage.jd1 a = null;
    public static final java.lang.Object b = null;

    static {
            jd1 r0 = new jd1
            r1 = 25
            r0.<init>(r1)
            defpackage.mt6.a = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.mt6.b = r0
            return
    }

    public static final void a(defpackage.a74 r4, defpackage.eo2 r5, defpackage.px0 r6, int r7, int r8) {
            xq2 r6 = (defpackage.xq2) r6
            r0 = -1298353104(0xffffffffb29cb430, float:-1.824273E-8)
            r6.d0(r0)
            r0 = r8 & 1
            if (r0 == 0) goto Lf
            r1 = r7 | 6
            goto L1f
        Lf:
            r1 = r7 & 6
            if (r1 != 0) goto L1e
            boolean r1 = r6.f(r4)
            if (r1 == 0) goto L1b
            r1 = 4
            goto L1c
        L1b:
            r1 = 2
        L1c:
            r1 = r1 | r7
            goto L1f
        L1e:
            r1 = r7
        L1f:
            r2 = r7 & 48
            if (r2 != 0) goto L2f
            boolean r2 = r6.h(r5)
            if (r2 == 0) goto L2c
            r2 = 32
            goto L2e
        L2c:
            r2 = 16
        L2e:
            r1 = r1 | r2
        L2f:
            r2 = r1 & 19
            r3 = 18
            if (r2 == r3) goto L37
            r2 = 1
            goto L38
        L37:
            r2 = 0
        L38:
            r3 = r1 & 1
            boolean r2 = r6.S(r3, r2)
            if (r2 == 0) goto L60
            if (r0 == 0) goto L44
            x64 r4 = defpackage.x64.a
        L44:
            java.lang.Object r0 = r6.P()
            vs0 r2 = defpackage.ox0.a
            if (r0 != r2) goto L56
            pt6 r0 = new pt6
            cs1 r2 = defpackage.cs1.h0
            r0.<init>(r2)
            r6.l0(r0)
        L56:
            pt6 r0 = (defpackage.pt6) r0
            int r1 = r1 << 3
            r1 = r1 & 1008(0x3f0, float:1.413E-42)
            b(r0, r4, r5, r6, r1)
            goto L63
        L60:
            r6.V()
        L63:
            cf5 r6 = r6.t()
            if (r6 == 0) goto L70
            kt6 r0 = new kt6
            r0.<init>(r4, r5, r7, r8)
            r6.d = r0
        L70:
            return
    }

    public static final void b(defpackage.pt6 r8, defpackage.a74 r9, defpackage.eo2 r10, defpackage.px0 r11, int r12) {
            xq2 r11 = (defpackage.xq2) r11
            r0 = -511989831(0xffffffffe17ba7b9, float:-2.9013865E20)
            r11.d0(r0)
            r0 = r12 & 6
            if (r0 != 0) goto L17
            boolean r0 = r11.h(r8)
            if (r0 == 0) goto L14
            r0 = 4
            goto L15
        L14:
            r0 = 2
        L15:
            r0 = r0 | r12
            goto L18
        L17:
            r0 = r12
        L18:
            r1 = r12 & 48
            if (r1 != 0) goto L28
            boolean r1 = r11.f(r9)
            if (r1 == 0) goto L25
            r1 = 32
            goto L27
        L25:
            r1 = 16
        L27:
            r0 = r0 | r1
        L28:
            r1 = r12 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L38
            boolean r1 = r11.h(r10)
            if (r1 == 0) goto L35
            r1 = 256(0x100, float:3.59E-43)
            goto L37
        L35:
            r1 = 128(0x80, float:1.8E-43)
        L37:
            r0 = r0 | r1
        L38:
            r1 = r0 & 147(0x93, float:2.06E-43)
            r2 = 146(0x92, float:2.05E-43)
            r3 = 1
            r4 = 0
            if (r1 == r2) goto L42
            r1 = r3
            goto L43
        L42:
            r1 = r4
        L43:
            r0 = r0 & r3
            boolean r0 = r11.S(r0, r1)
            if (r0 == 0) goto Ld2
            long r0 = r11.T
            int r0 = java.lang.Long.hashCode(r0)
            vq2 r1 = defpackage.ge7.T(r11)
            a74 r2 = defpackage.l.E(r11, r9)
            xv4 r5 = r11.l()
            iy0 r6 = defpackage.iy0.i0
            r11.f0()
            boolean r7 = r11.S
            if (r7 == 0) goto L69
            r11.k(r6)
            goto L6c
        L69:
            r11.o0()
        L6c:
            ot6 r6 = r8.c
            defpackage.yh2.K(r11, r6, r8)
            ot6 r6 = r8.d
            defpackage.yh2.K(r11, r6, r1)
            ot6 r1 = r8.e
            defpackage.yh2.K(r11, r1, r10)
            ix0 r1 = defpackage.jx0.i
            r1.getClass()
            pn r1 = defpackage.ix0.e
            defpackage.yh2.K(r11, r1, r5)
            ne r1 = defpackage.ix0.h
            defpackage.yh2.F(r11, r1)
            pn r1 = defpackage.ix0.d
            defpackage.yh2.K(r11, r1, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            pn r1 = defpackage.ix0.g
            defpackage.yh2.K(r11, r1, r0)
            r11.p(r3)
            boolean r0 = r11.E()
            if (r0 != 0) goto Lc8
            r0 = -1259245908(0xffffffffb4f16eac, float:-4.4970272E-7)
            r11.b0(r0)
            boolean r0 = r11.h(r8)
            java.lang.Object r1 = r11.P()
            if (r0 != 0) goto Lb5
            vs0 r0 = defpackage.ox0.a
            if (r1 != r0) goto Lbf
        Lb5:
            pj r1 = new pj
            r0 = 18
            r1.<init>(r8, r0)
            r11.l0(r1)
        Lbf:
            on2 r1 = (defpackage.on2) r1
            defpackage.mb3.n(r1, r11)
            r11.p(r4)
            goto Ld5
        Lc8:
            r0 = -1259187287(0xffffffffb4f253a9, float:-4.5136883E-7)
            r11.b0(r0)
            r11.p(r4)
            goto Ld5
        Ld2:
            r11.V()
        Ld5:
            cf5 r11 = r11.t()
            if (r11 == 0) goto Le2
            lt6 r0 = new lt6
            r0.<init>(r8, r9, r10, r12)
            r11.d = r0
        Le2:
            return
    }
}
