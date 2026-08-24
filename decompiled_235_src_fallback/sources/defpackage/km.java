package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: km  reason: default package */
/* loaded from: classes.dex */
public final class km extends android.text.TextPaint {
    public defpackage.aj a;
    public defpackage.b17 b;
    public int c;
    public defpackage.ge6 d;
    public defpackage.kt0 e;
    public defpackage.f80 f;
    public defpackage.ii1 g;
    public defpackage.xi6 h;
    public defpackage.oo1 i;

    public final defpackage.aj a() {
            r1 = this;
            aj r0 = r1.a
            if (r0 == 0) goto L5
            return r0
        L5:
            aj r0 = new aj
            r0.<init>(r1)
            r1.a = r0
            return r0
    }

    public final void b(int r2) {
            r1 = this;
            int r0 = r1.c
            if (r2 != r0) goto L5
            return
        L5:
            aj r0 = r1.a()
            r0.k(r2)
            r1.c = r2
            return
    }

    public final void c(defpackage.f80 r6, long r7, float r9) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto Ld
            r5.g = r0
            r5.f = r0
            r5.h = r0
            r5.setShader(r0)
            return
        Ld:
            boolean r1 = r6 instanceof defpackage.cn6
            if (r1 == 0) goto L1d
            cn6 r6 = (defpackage.cn6) r6
            long r6 = r6.a
            long r6 = defpackage.oi2.N(r9, r6)
            r5.d(r6)
            return
        L1d:
            boolean r1 = r6 instanceof defpackage.xd6
            if (r1 == 0) goto L6e
            f80 r1 = r5.f
            boolean r1 = defpackage.nb3.k(r1, r6)
            r2 = 0
            if (r1 == 0) goto L38
            xi6 r1 = r5.h
            if (r1 != 0) goto L30
            r1 = r2
            goto L36
        L30:
            long r3 = r1.a
            boolean r1 = defpackage.xi6.b(r3, r7)
        L36:
            if (r1 != 0) goto L55
        L38:
            r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L55
            r5.f = r6
            xi6 r1 = new xi6
            r1.<init>(r7)
            r5.h = r1
            jm r1 = new jm
            r1.<init>(r6, r7, r2)
            ii1 r6 = defpackage.np2.I(r1)
            r5.g = r6
        L55:
            aj r6 = r5.a()
            ii1 r7 = r5.g
            if (r7 == 0) goto L64
            java.lang.Object r7 = r7.getValue()
            android.graphics.Shader r7 = (android.graphics.Shader) r7
            goto L65
        L64:
            r7 = r0
        L65:
            r6.p(r7)
            r5.e = r0
            defpackage.g04.Q(r5, r9)
            return
        L6e:
            defpackage.i.d()
            return
    }

    public final void d(long r3) {
            r2 = this;
            kt0 r0 = r2.e
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            long r0 = r0.a
            boolean r0 = defpackage.kt0.d(r0, r3)
        Lc:
            if (r0 != 0) goto L2c
            r0 = 16
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L2c
            kt0 r0 = new kt0
            r0.<init>(r3)
            r2.e = r0
            int r3 = defpackage.hv.b0(r3)
            r2.setColor(r3)
            r3 = 0
            r2.g = r3
            r2.f = r3
            r2.h = r3
            r2.setShader(r3)
        L2c:
            return
    }

    public final void e(defpackage.oo1 r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L5d
        L3:
            oo1 r0 = r2.i
            boolean r0 = defpackage.nb3.k(r0, r3)
            if (r0 != 0) goto L5d
            r2.i = r3
            kc2 r0 = defpackage.kc2.a
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L1b
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r2.setStyle(r3)
            return
        L1b:
            boolean r0 = r3 instanceof defpackage.ys6
            if (r0 == 0) goto L5a
            aj r0 = r2.a()
            r1 = 1
            r0.t(r1)
            aj r0 = r2.a()
            ys6 r3 = (defpackage.ys6) r3
            float r1 = r3.a
            r0.s(r1)
            aj r0 = r2.a()
            float r1 = r3.b
            java.lang.Object r0 = r0.L
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r0.setStrokeMiter(r1)
            aj r0 = r2.a()
            int r1 = r3.d
            r0.r(r1)
            aj r0 = r2.a()
            int r3 = r3.c
            r0.q(r3)
            aj r2 = r2.a()
            r3 = 0
            r2.o(r3)
            return
        L5a:
            defpackage.i.d()
        L5d:
            return
    }

    public final void f(defpackage.ge6 r6) {
            r5 = this;
            if (r6 != 0) goto L3
            goto L47
        L3:
            ge6 r0 = r5.d
            boolean r0 = defpackage.nb3.k(r0, r6)
            if (r0 != 0) goto L47
            r5.d = r6
            ge6 r0 = defpackage.ge6.d
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L19
            r5.clearShadowLayer()
            return
        L19:
            ge6 r6 = r5.d
            float r0 = r6.c
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L23
            r0 = 1
        L23:
            long r1 = r6.b
            r6 = 32
            long r1 = r1 >> r6
            int r6 = (int) r1
            float r6 = java.lang.Float.intBitsToFloat(r6)
            ge6 r1 = r5.d
            long r1 = r1.b
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            ge6 r2 = r5.d
            long r2 = r2.a
            int r2 = defpackage.hv.b0(r2)
            r5.setShadowLayer(r0, r6, r1, r2)
        L47:
            return
    }

    public final void g(defpackage.b17 r4) {
            r3 = this;
            if (r4 != 0) goto L3
            goto L27
        L3:
            b17 r0 = r3.b
            boolean r0 = defpackage.nb3.k(r0, r4)
            if (r0 != 0) goto L27
            r3.b = r4
            int r4 = r4.a
            r0 = r4 | 1
            r1 = 0
            r2 = 1
            if (r0 != r4) goto L17
            r4 = r2
            goto L18
        L17:
            r4 = r1
        L18:
            r3.setUnderlineText(r4)
            b17 r4 = r3.b
            int r4 = r4.a
            r0 = r4 | 2
            if (r0 != r4) goto L24
            r1 = r2
        L24:
            r3.setStrikeThruText(r1)
        L27:
            return
    }
}
