package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r47  reason: default package */
/* loaded from: classes.dex */
public final class r47 extends defpackage.z64 implements defpackage.jm3, defpackage.mo1, defpackage.va6 {
    public java.lang.String k0;
    public defpackage.s47 l0;
    public defpackage.ki2 m0;
    public int n0;
    public boolean o0;
    public int p0;
    public int q0;
    public defpackage.lt0 r0;
    public java.util.HashMap s0;
    public defpackage.bs4 t0;
    public defpackage.s47 u0;
    public defpackage.p47 v0;
    public defpackage.q47 w0;

    @Override // defpackage.va6
    public final void A0(defpackage.gb6 r8) {
            r7 = this;
            p47 r0 = r7.v0
            if (r0 != 0) goto Lc
            p47 r0 = new p47
            r1 = 0
            r0.<init>(r7, r1)
            r7.v0 = r0
        Lc:
            fp r1 = new fp
            java.lang.String r2 = r7.k0
            r1.<init>(r2)
            fg3[] r2 = defpackage.eb6.a
            fb6 r2 = defpackage.bb6.C
            java.util.List r1 = defpackage.hf.b0(r1)
            r8.a(r2, r1)
            q47 r1 = r7.w0
            r2 = 16
            if (r1 == 0) goto L43
            boolean r3 = r1.c
            fb6 r4 = defpackage.bb6.E
            fg3[] r5 = defpackage.eb6.a
            r6 = 17
            r6 = r5[r6]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r8.a(r4, r3)
            fp r3 = new fp
            java.lang.String r1 = r1.b
            r3.<init>(r1)
            fb6 r1 = defpackage.bb6.D
            r4 = r5[r2]
            r8.a(r1, r3)
        L43:
            p47 r1 = new p47
            r3 = 1
            r1.<init>(r7, r3)
            fb6 r3 = defpackage.sa6.l
            y1 r4 = new y1
            r5 = 0
            r4.<init>(r5, r1)
            r8.a(r3, r4)
            p47 r1 = new p47
            r3 = 2
            r1.<init>(r7, r3)
            fb6 r3 = defpackage.sa6.m
            y1 r4 = new y1
            r4.<init>(r5, r1)
            r8.a(r3, r4)
            t46 r1 = new t46
            r1.<init>(r7, r2)
            fb6 r7 = defpackage.sa6.n
            y1 r2 = new y1
            r2.<init>(r5, r1)
            r8.a(r7, r2)
            defpackage.eb6.a(r8, r0)
            return
    }

    @Override // defpackage.z64
    public final boolean G0() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final defpackage.bs4 R0() {
            r9 = this;
            s47 r0 = r9.u0
            if (r0 != 0) goto L6
            s47 r0 = r9.l0
        L6:
            r3 = r0
            bs4 r0 = r9.t0
            if (r0 != 0) goto L1e
            bs4 r1 = new bs4
            java.lang.String r2 = r9.k0
            ki2 r4 = r9.m0
            int r5 = r9.n0
            boolean r6 = r9.o0
            int r7 = r9.p0
            int r8 = r9.q0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r9.t0 = r1
        L1e:
            bs4 r9 = r9.t0
            r9.getClass()
            return r9
    }

    public final defpackage.bs4 S0(defpackage.g34 r10) {
            r9 = this;
            r0 = 1
            boolean r0 = r9.T0(r0)
            if (r0 == 0) goto L21
            s47 r0 = r9.u0
            if (r0 != 0) goto Ld
            s47 r0 = r9.l0
        Ld:
            r3 = r0
            bs4 r1 = r9.R0()
            java.lang.String r2 = r9.k0
            ki2 r4 = r9.m0
            int r5 = r9.n0
            boolean r6 = r9.o0
            int r7 = r9.p0
            int r8 = r9.q0
            r1.f(r2, r3, r4, r5, r6, r7, r8)
        L21:
            q47 r0 = r9.w0
            if (r0 == 0) goto L31
            boolean r1 = r0.c
            if (r1 == 0) goto L2a
            goto L2b
        L2a:
            r0 = 0
        L2b:
            if (r0 == 0) goto L31
            bs4 r0 = r0.d
            if (r0 != 0) goto L35
        L31:
            bs4 r0 = r9.R0()
        L35:
            r0.d(r10)
            return r0
    }

    public final boolean T0(int r4) {
            r3 = this;
            s47 r4 = r3.u0
            s47 r0 = r3.l0
            h37 r1 = new h37
            r2 = 4
            r1.<init>(r2)
            java.lang.String r2 = "StyleOuterNode"
            defpackage.ii2.V(r3, r2, r1)
            r3.u0 = r0
            if (r4 != 0) goto L15
            r3 = 0
            return r3
        L15:
            boolean r3 = r4.equals(r0)
            r3 = r3 ^ 1
            return r3
    }

    @Override // defpackage.jm3
    public final int Z(defpackage.kz3 r1, defpackage.x24 r2, int r3) {
            r0 = this;
            bs4 r0 = r0.S0(r1)
            kk3 r1 = r1.getLayoutDirection()
            int r0 = r0.a(r3, r1)
            return r0
    }

    @Override // defpackage.jm3
    public final defpackage.f34 c(defpackage.g34 r5, defpackage.x24 r6, long r7) {
            r4 = this;
            java.lang.String r0 = "TextStringSimpleNode::measure"
            android.os.Trace.beginSection(r0)
            bs4 r0 = r4.S0(r5)     // Catch: java.lang.Throwable -> L85
            kk3 r1 = r5.getLayoutDirection()     // Catch: java.lang.Throwable -> L85
            boolean r7 = r0.b(r7, r1)     // Catch: java.lang.Throwable -> L85
            as4 r8 = r0.n     // Catch: java.lang.Throwable -> L85
            if (r8 == 0) goto L18
            r8.a()     // Catch: java.lang.Throwable -> L85
        L18:
            cj r8 = r0.j     // Catch: java.lang.Throwable -> L85
            r8.getClass()     // Catch: java.lang.Throwable -> L85
            y37 r8 = r8.d     // Catch: java.lang.Throwable -> L85
            long r0 = r0.l     // Catch: java.lang.Throwable -> L85
            if (r7 == 0) goto L5d
            r7 = 2
            eg4 r2 = defpackage.nc1.d0(r4, r7)     // Catch: java.lang.Throwable -> L85
            r2.f1()     // Catch: java.lang.Throwable -> L85
            java.util.HashMap r2 = r4.s0     // Catch: java.lang.Throwable -> L85
            if (r2 != 0) goto L36
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L85
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L85
            r4.s0 = r2     // Catch: java.lang.Throwable -> L85
        L36:
            ey2 r7 = defpackage.lc.a     // Catch: java.lang.Throwable -> L85
            r3 = 0
            float r3 = r8.d(r3)     // Catch: java.lang.Throwable -> L85
            int r3 = java.lang.Math.round(r3)     // Catch: java.lang.Throwable -> L85
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L85
            r2.put(r7, r3)     // Catch: java.lang.Throwable -> L85
            ey2 r7 = defpackage.lc.b     // Catch: java.lang.Throwable -> L85
            int r3 = r8.g     // Catch: java.lang.Throwable -> L85
            int r3 = r3 + (-1)
            float r8 = r8.d(r3)     // Catch: java.lang.Throwable -> L85
            int r8 = java.lang.Math.round(r8)     // Catch: java.lang.Throwable -> L85
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L85
            r2.put(r7, r8)     // Catch: java.lang.Throwable -> L85
        L5d:
            r7 = 32
            long r7 = r0 >> r7
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L85
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r8 = (int) r0     // Catch: java.lang.Throwable -> L85
            long r0 = defpackage.nb3.t(r7, r7, r8, r8)     // Catch: java.lang.Throwable -> L85
            dx4 r6 = r6.y(r0)     // Catch: java.lang.Throwable -> L85
            java.util.HashMap r4 = r4.s0     // Catch: java.lang.Throwable -> L85
            r4.getClass()     // Catch: java.lang.Throwable -> L85
            jv r0 = new jv     // Catch: java.lang.Throwable -> L85
            r1 = 10
            r0.<init>(r6, r1)     // Catch: java.lang.Throwable -> L85
            f34 r4 = r5.K(r7, r8, r4, r0)     // Catch: java.lang.Throwable -> L85
            android.os.Trace.endSection()
            return r4
        L85:
            r4 = move-exception
            android.os.Trace.endSection()
            throw r4
    }

    @Override // defpackage.jm3
    public final int f(defpackage.kz3 r1, defpackage.x24 r2, int r3) {
            r0 = this;
            bs4 r0 = r0.S0(r1)
            kk3 r1 = r1.getLayoutDirection()
            as4 r0 = r0.e(r1)
            float r0 = r0.c()
            int r0 = defpackage.ii2.q(r0)
            return r0
    }

    @Override // defpackage.jm3
    public final int h0(defpackage.kz3 r1, defpackage.x24 r2, int r3) {
            r0 = this;
            bs4 r0 = r0.S0(r1)
            kk3 r1 = r1.getLayoutDirection()
            int r0 = r0.a(r3, r1)
            return r0
    }

    @Override // defpackage.mo1
    public final void m0(defpackage.um3 r11) {
            r10 = this;
            boolean r0 = r10.j0
            if (r0 != 0) goto L6
            goto La5
        L6:
            q47 r0 = r10.w0
            if (r0 == 0) goto L16
            boolean r1 = r0.c
            if (r1 == 0) goto Lf
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L16
            bs4 r0 = r0.d
            if (r0 != 0) goto L1a
        L16:
            bs4 r0 = r10.R0()
        L1a:
            cj r1 = r0.j
            if (r1 == 0) goto Lac
            zj0 r11 = r11.A
            bt r11 = r11.B
            xj0 r2 = r11.G()
            boolean r11 = r0.k
            if (r11 == 0) goto L43
            long r3 = r0.l
            r0 = 32
            long r5 = r3 >> r0
            int r0 = (int) r5
            float r5 = (float) r0
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r6
            int r0 = (int) r3
            float r6 = (float) r0
            r2.h()
            r4 = 0
            r7 = 1
            r3 = 0
            r2.n(r3, r4, r5, r6, r7)
        L43:
            r0 = 2
            r10.T0(r0)     // Catch: java.lang.Throwable -> L4e
            s47 r0 = r10.u0     // Catch: java.lang.Throwable -> L4e
            if (r0 != 0) goto L51
            s47 r0 = r10.l0     // Catch: java.lang.Throwable -> L4e
            goto L51
        L4e:
            r0 = move-exception
            r10 = r0
            goto La6
        L51:
            nn6 r3 = r0.a     // Catch: java.lang.Throwable -> L4e
            b17 r4 = r3.m     // Catch: java.lang.Throwable -> L4e
            if (r4 != 0) goto L59
            b17 r4 = defpackage.b17.b     // Catch: java.lang.Throwable -> L4e
        L59:
            r6 = r4
            ge6 r4 = r3.n     // Catch: java.lang.Throwable -> L4e
            if (r4 != 0) goto L60
            ge6 r4 = defpackage.ge6.d     // Catch: java.lang.Throwable -> L4e
        L60:
            r5 = r4
            oo1 r4 = r3.p     // Catch: java.lang.Throwable -> L4e
            if (r4 != 0) goto L67
            kc2 r4 = defpackage.kc2.a     // Catch: java.lang.Throwable -> L4e
        L67:
            r7 = r4
            e37 r3 = r3.a     // Catch: java.lang.Throwable -> L4e
            f80 r3 = r3.c()     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L7c
            nn6 r10 = r0.a     // Catch: java.lang.Throwable -> L4e
            e37 r10 = r10.a     // Catch: java.lang.Throwable -> L4e
            float r4 = r10.a()     // Catch: java.lang.Throwable -> L4e
            r1.g(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L4e
            goto La0
        L7c:
            lt0 r10 = r10.r0     // Catch: java.lang.Throwable -> L4e
            if (r10 == 0) goto L85
            long r3 = r10.a()     // Catch: java.lang.Throwable -> L4e
            goto L87
        L85:
            long r3 = defpackage.kt0.h     // Catch: java.lang.Throwable -> L4e
        L87:
            r8 = 16
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 == 0) goto L8e
            goto L9d
        L8e:
            long r3 = r0.b()     // Catch: java.lang.Throwable -> L4e
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 == 0) goto L9b
            long r3 = r0.b()     // Catch: java.lang.Throwable -> L4e
            goto L9d
        L9b:
            long r3 = defpackage.kt0.b     // Catch: java.lang.Throwable -> L4e
        L9d:
            r1.f(r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L4e
        La0:
            if (r11 == 0) goto La5
            r2.p()
        La5:
            return
        La6:
            if (r11 == 0) goto Lab
            r2.p()
        Lab:
            throw r10
        Lac:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache="
            r11.<init>(r0)
            bs4 r0 = r10.t0
            r11.append(r0)
            java.lang.String r0 = ", textSubstitution="
            r11.append(r0)
            q47 r10 = r10.w0
            r11.append(r10)
            r10 = 41
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            defpackage.s53.b(r10)
            defpackage.e41.c()
            return
    }

    @Override // defpackage.jm3
    public final int s0(defpackage.kz3 r1, defpackage.x24 r2, int r3) {
            r0 = this;
            bs4 r0 = r0.S0(r1)
            kk3 r1 = r1.getLayoutDirection()
            as4 r0 = r0.e(r1)
            float r0 = r0.b()
            int r0 = defpackage.ii2.q(r0)
            return r0
    }
}
