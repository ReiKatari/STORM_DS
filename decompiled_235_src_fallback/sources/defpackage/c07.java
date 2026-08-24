package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c07  reason: default package */
/* loaded from: classes.dex */
public final class c07 extends defpackage.z64 implements defpackage.jm3, defpackage.mo1, defpackage.va6 {
    public defpackage.fp k0;
    public defpackage.s47 l0;
    public defpackage.ki2 m0;
    public defpackage.qn2 n0;
    public int o0;
    public boolean p0;
    public int q0;
    public int r0;
    public java.util.List s0;
    public defpackage.qn2 t0;
    public defpackage.lt0 u0;
    public defpackage.qn2 v0;
    public java.util.Map w0;
    public defpackage.y84 x0;
    public defpackage.a07 y0;
    public defpackage.b07 z0;

    @Override // defpackage.va6
    public final void A0(defpackage.gb6 r7) {
            r6 = this;
            a07 r0 = r6.y0
            if (r0 != 0) goto Lc
            a07 r0 = new a07
            r1 = 0
            r0.<init>(r6, r1)
            r6.y0 = r0
        Lc:
            fp r1 = r6.k0
            fg3[] r2 = defpackage.eb6.a
            fb6 r2 = defpackage.bb6.C
            java.util.List r1 = defpackage.hf.b0(r1)
            r7.a(r2, r1)
            b07 r1 = r6.z0
            if (r1 == 0) goto L39
            fp r2 = r1.b
            fb6 r3 = defpackage.bb6.D
            fg3[] r4 = defpackage.eb6.a
            r5 = 16
            r5 = r4[r5]
            r7.a(r3, r2)
            boolean r1 = r1.c
            fb6 r2 = defpackage.bb6.E
            r3 = 17
            r3 = r4[r3]
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r7.a(r2, r1)
        L39:
            a07 r1 = new a07
            r2 = 1
            r1.<init>(r6, r2)
            fb6 r2 = defpackage.sa6.l
            y1 r3 = new y1
            r4 = 0
            r3.<init>(r4, r1)
            r7.a(r2, r3)
            a07 r1 = new a07
            r2 = 2
            r1.<init>(r6, r2)
            fb6 r2 = defpackage.sa6.m
            y1 r3 = new y1
            r3.<init>(r4, r1)
            r7.a(r2, r3)
            t46 r1 = new t46
            r2 = 12
            r1.<init>(r6, r2)
            fb6 r6 = defpackage.sa6.n
            y1 r2 = new y1
            r2.<init>(r4, r1)
            r7.a(r6, r2)
            defpackage.eb6.a(r7, r0)
            return
    }

    @Override // defpackage.z64
    public final boolean G0() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final defpackage.y84 R0() {
            r10 = this;
            y84 r0 = r10.x0
            if (r0 != 0) goto L1b
            y84 r1 = new y84
            fp r2 = r10.k0
            s47 r3 = r10.l0
            ki2 r4 = r10.m0
            int r5 = r10.o0
            boolean r6 = r10.p0
            int r7 = r10.q0
            int r8 = r10.r0
            java.util.List r9 = r10.s0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.x0 = r1
        L1b:
            y84 r10 = r10.x0
            r10.getClass()
            return r10
    }

    public final defpackage.y84 S0(defpackage.qh1 r3) {
            r2 = this;
            b07 r0 = r2.z0
            if (r0 == 0) goto L10
            boolean r1 = r0.c
            if (r1 == 0) goto L10
            y84 r0 = r0.d
            if (r0 == 0) goto L10
            r0.d(r3)
            return r0
        L10:
            y84 r2 = r2.R0()
            r2.d(r3)
            return r2
    }

    @Override // defpackage.jm3
    public final int Z(defpackage.kz3 r1, defpackage.x24 r2, int r3) {
            r0 = this;
            y84 r0 = r0.S0(r1)
            kk3 r1 = r1.getLayoutDirection()
            int r0 = r0.a(r3, r1)
            return r0
    }

    @Override // defpackage.jm3
    public final defpackage.f34 c(defpackage.g34 r5, defpackage.x24 r6, long r7) {
            r4 = this;
            java.lang.String r0 = "TextAnnotatedStringNode:measure"
            android.os.Trace.beginSection(r0)
            y84 r0 = r4.S0(r5)     // Catch: java.lang.Throwable -> L9d
            kk3 r1 = r5.getLayoutDirection()     // Catch: java.lang.Throwable -> L9d
            boolean r7 = r0.c(r7, r1)     // Catch: java.lang.Throwable -> L9d
            a47 r8 = r0.n     // Catch: java.lang.Throwable -> L9d
            if (r8 == 0) goto L89
            long r0 = r8.c     // Catch: java.lang.Throwable -> L9d
            v84 r2 = r8.b     // Catch: java.lang.Throwable -> L9d
            s9 r2 = r2.a     // Catch: java.lang.Throwable -> L9d
            r2.a()     // Catch: java.lang.Throwable -> L9d
            if (r7 == 0) goto L58
            r7 = 2
            eg4 r2 = defpackage.nc1.d0(r4, r7)     // Catch: java.lang.Throwable -> L9d
            r2.f1()     // Catch: java.lang.Throwable -> L9d
            qn2 r2 = r4.n0     // Catch: java.lang.Throwable -> L9d
            if (r2 == 0) goto L2f
            r2.g(r8)     // Catch: java.lang.Throwable -> L9d
        L2f:
            java.util.Map r2 = r4.w0     // Catch: java.lang.Throwable -> L9d
            if (r2 != 0) goto L38
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L9d
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L9d
        L38:
            ey2 r7 = defpackage.lc.a     // Catch: java.lang.Throwable -> L9d
            float r3 = r8.d     // Catch: java.lang.Throwable -> L9d
            int r3 = java.lang.Math.round(r3)     // Catch: java.lang.Throwable -> L9d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L9d
            r2.put(r7, r3)     // Catch: java.lang.Throwable -> L9d
            ey2 r7 = defpackage.lc.b     // Catch: java.lang.Throwable -> L9d
            float r3 = r8.e     // Catch: java.lang.Throwable -> L9d
            int r3 = java.lang.Math.round(r3)     // Catch: java.lang.Throwable -> L9d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L9d
            r2.put(r7, r3)     // Catch: java.lang.Throwable -> L9d
            r4.w0 = r2     // Catch: java.lang.Throwable -> L9d
        L58:
            qn2 r7 = r4.t0     // Catch: java.lang.Throwable -> L9d
            if (r7 == 0) goto L61
            java.util.ArrayList r8 = r8.f     // Catch: java.lang.Throwable -> L9d
            r7.g(r8)     // Catch: java.lang.Throwable -> L9d
        L61:
            r7 = 32
            long r7 = r0 >> r7
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L9d
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r8 = (int) r0     // Catch: java.lang.Throwable -> L9d
            long r0 = defpackage.nb3.t(r7, r7, r8, r8)     // Catch: java.lang.Throwable -> L9d
            dx4 r6 = r6.y(r0)     // Catch: java.lang.Throwable -> L9d
            java.util.Map r4 = r4.w0     // Catch: java.lang.Throwable -> L9d
            r4.getClass()     // Catch: java.lang.Throwable -> L9d
            jv r0 = new jv     // Catch: java.lang.Throwable -> L9d
            r1 = 8
            r0.<init>(r6, r1)     // Catch: java.lang.Throwable -> L9d
            f34 r4 = r5.K(r7, r8, r4, r0)     // Catch: java.lang.Throwable -> L9d
            android.os.Trace.endSection()
            return r4
        L89:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L9d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d
            java.lang.String r6 = "Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: "
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L9d
            r5.append(r0)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L9d
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L9d
            throw r4     // Catch: java.lang.Throwable -> L9d
        L9d:
            r4 = move-exception
            android.os.Trace.endSection()
            throw r4
    }

    @Override // defpackage.jm3
    public final int f(defpackage.kz3 r1, defpackage.x24 r2, int r3) {
            r0 = this;
            y84 r0 = r0.S0(r1)
            kk3 r1 = r1.getLayoutDirection()
            s9 r0 = r0.e(r1)
            float r0 = r0.c()
            int r0 = defpackage.ii2.q(r0)
            return r0
    }

    @Override // defpackage.jm3
    public final int h0(defpackage.kz3 r1, defpackage.x24 r2, int r3) {
            r0 = this;
            y84 r0 = r0.S0(r1)
            kk3 r1 = r1.getLayoutDirection()
            int r0 = r0.a(r3, r1)
            return r0
    }

    @Override // defpackage.mo1
    public final void m0(defpackage.um3 r14) {
            r13 = this;
            boolean r0 = r13.j0
            if (r0 != 0) goto L6
            goto Ld3
        L6:
            zj0 r0 = r14.A
            bt r0 = r0.B
            xj0 r2 = r0.G()
            y84 r0 = r13.S0(r14)
            a47 r1 = r0.n
            if (r1 == 0) goto Lde
            r3 = r1
            v84 r1 = r3.b
            boolean r0 = r3.d()
            r8 = 1
            r9 = 0
            if (r0 == 0) goto L29
            int r0 = r13.o0
            r4 = 3
            if (r0 != r4) goto L27
            goto L29
        L27:
            r10 = r8
            goto L2a
        L29:
            r10 = r9
        L2a:
            if (r10 == 0) goto L57
            long r3 = r3.c
            r0 = 32
            long r5 = r3 >> r0
            int r5 = (int) r5
            float r5 = (float) r5
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r6
            int r3 = (int) r3
            float r3 = (float) r3
            int r4 = java.lang.Float.floatToRawIntBits(r5)
            long r4 = (long) r4
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r11 = (long) r3
            long r3 = r4 << r0
            long r5 = r11 & r6
            long r3 = r3 | r5
            r5 = 0
            of5 r0 = defpackage.kj2.b(r5, r3)
            r2.h()
            defpackage.xj0.q(r2, r0)
        L57:
            s47 r0 = r13.l0     // Catch: java.lang.Throwable -> L63
            nn6 r0 = r0.a     // Catch: java.lang.Throwable -> L63
            b17 r3 = r0.m     // Catch: java.lang.Throwable -> L63
            if (r3 != 0) goto L61
            b17 r3 = defpackage.b17.b     // Catch: java.lang.Throwable -> L63
        L61:
            r6 = r3
            goto L67
        L63:
            r0 = move-exception
            r13 = r0
            goto Ld8
        L67:
            ge6 r3 = r0.n     // Catch: java.lang.Throwable -> L63
            if (r3 != 0) goto L6d
            ge6 r3 = defpackage.ge6.d     // Catch: java.lang.Throwable -> L63
        L6d:
            r5 = r3
            oo1 r3 = r0.p     // Catch: java.lang.Throwable -> L63
            if (r3 != 0) goto L74
            kc2 r3 = defpackage.kc2.a     // Catch: java.lang.Throwable -> L63
        L74:
            r7 = r3
            e37 r0 = r0.a     // Catch: java.lang.Throwable -> L63
            f80 r3 = r0.c()     // Catch: java.lang.Throwable -> L63
            if (r3 == 0) goto L8b
            s47 r0 = r13.l0     // Catch: java.lang.Throwable -> L63
            nn6 r0 = r0.a     // Catch: java.lang.Throwable -> L63
            e37 r0 = r0.a     // Catch: java.lang.Throwable -> L63
            float r4 = r0.a()     // Catch: java.lang.Throwable -> L63
            r1.j(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L63
            goto Lb3
        L8b:
            lt0 r0 = r13.u0     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L94
            long r3 = r0.a()     // Catch: java.lang.Throwable -> L63
            goto L96
        L94:
            long r3 = defpackage.kt0.h     // Catch: java.lang.Throwable -> L63
        L96:
            r11 = 16
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r0 == 0) goto L9d
            goto Lb0
        L9d:
            s47 r0 = r13.l0     // Catch: java.lang.Throwable -> L63
            long r3 = r0.b()     // Catch: java.lang.Throwable -> L63
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r0 == 0) goto Lae
            s47 r0 = r13.l0     // Catch: java.lang.Throwable -> L63
            long r3 = r0.b()     // Catch: java.lang.Throwable -> L63
            goto Lb0
        Lae:
            long r3 = defpackage.kt0.b     // Catch: java.lang.Throwable -> L63
        Lb0:
            r1.i(r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L63
        Lb3:
            if (r10 == 0) goto Lb8
            r2.p()
        Lb8:
            b07 r0 = r13.z0
            if (r0 == 0) goto Lc1
            boolean r0 = r0.c
            if (r0 != r8) goto Lc1
            goto Lc7
        Lc1:
            fp r0 = r13.k0
            boolean r9 = defpackage.yh2.w(r0)
        Lc7:
            if (r9 != 0) goto Ld4
            java.util.List r13 = r13.s0
            if (r13 == 0) goto Ld3
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto Ld4
        Ld3:
            return
        Ld4:
            r14.b()
            return
        Ld8:
            if (r10 == 0) goto Ldd
            r2.p()
        Ldd:
            throw r13
        Lde:
            java.lang.String r13 = "Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: "
            defpackage.e41.y(r0, r13)
            return
    }

    @Override // defpackage.jm3
    public final int s0(defpackage.kz3 r1, defpackage.x24 r2, int r3) {
            r0 = this;
            y84 r0 = r0.S0(r1)
            kk3 r1 = r1.getLayoutDirection()
            s9 r0 = r0.e(r1)
            float r0 = r0.b()
            int r0 = defpackage.ii2.q(r0)
            return r0
    }
}
