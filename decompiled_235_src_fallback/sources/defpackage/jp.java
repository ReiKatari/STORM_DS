package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jp  reason: default package */
/* loaded from: classes.dex */
public abstract class jp {
    public static final defpackage.vr4 a = null;

    static {
            vr4 r0 = new vr4
            yt1 r1 = defpackage.yt1.A
            r0.<init>(r1, r1)
            defpackage.jp.a = r0
            return
    }

    public static final void a(defpackage.fp r16, java.util.List r17, defpackage.px0 r18, int r19) {
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = r18
            xq2 r3 = (defpackage.xq2) r3
            r4 = -1794596951(0xffffffff95089fa9, float:-2.759093E-26)
            r3.d0(r4)
            r4 = r2 & 6
            if (r4 != 0) goto L1f
            boolean r4 = r3.f(r0)
            if (r4 == 0) goto L1c
            r4 = 4
            goto L1d
        L1c:
            r4 = 2
        L1d:
            r4 = r4 | r2
            goto L20
        L1f:
            r4 = r2
        L20:
            r5 = r2 & 48
            if (r5 != 0) goto L30
            boolean r5 = r3.h(r1)
            if (r5 == 0) goto L2d
            r5 = 32
            goto L2f
        L2d:
            r5 = 16
        L2f:
            r4 = r4 | r5
        L30:
            r5 = r4 & 19
            r6 = 18
            r8 = 1
            if (r5 == r6) goto L39
            r5 = r8
            goto L3a
        L39:
            r5 = 0
        L3a:
            r4 = r4 & r8
            boolean r4 = r3.S(r4, r5)
            if (r4 == 0) goto Lbf
            int r4 = r1.size()
            r5 = 0
        L46:
            if (r5 >= r4) goto Lbc
            java.lang.Object r6 = r1.get(r5)
            ep r6 = (defpackage.ep) r6
            java.lang.Object r9 = r6.a
            fo2 r9 = (defpackage.fo2) r9
            int r10 = r6.b
            int r6 = r6.c
            java.lang.Object r11 = r3.P()
            vs0 r12 = defpackage.ox0.a
            if (r11 != r12) goto L63
            fc r11 = defpackage.fc.e
            r3.l0(r11)
        L63:
            e34 r11 = (defpackage.e34) r11
            long r12 = r3.T
            int r12 = java.lang.Long.hashCode(r12)
            xv4 r13 = r3.l()
            x64 r14 = defpackage.x64.a
            a74 r14 = defpackage.l.E(r3, r14)
            ix0 r15 = defpackage.jx0.i
            r15.getClass()
            iy0 r15 = defpackage.ix0.b
            r3.f0()
            r18 = 0
            boolean r7 = r3.S
            if (r7 == 0) goto L89
            r3.k(r15)
            goto L8c
        L89:
            r3.o0()
        L8c:
            pn r7 = defpackage.ix0.f
            defpackage.yh2.K(r3, r7, r11)
            pn r7 = defpackage.ix0.e
            defpackage.yh2.K(r3, r7, r13)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            pn r11 = defpackage.ix0.g
            defpackage.yh2.K(r3, r11, r7)
            ne r7 = defpackage.ix0.h
            defpackage.yh2.F(r3, r7)
            pn r7 = defpackage.ix0.d
            defpackage.yh2.K(r3, r7, r14)
            fp r6 = r0.c(r10, r6)
            java.lang.String r6 = r6.B
            java.lang.Integer r7 = java.lang.Integer.valueOf(r18)
            r9.e(r6, r3, r7)
            r3.p(r8)
            int r5 = r5 + 1
            goto L46
        Lbc:
            r18 = 0
            goto Lc4
        Lbf:
            r18 = 0
            r3.V()
        Lc4:
            cf5 r3 = r3.t()
            if (r3 == 0) goto Ld3
            hp r4 = new hp
            r5 = r18
            r4.<init>(r0, r2, r5, r1)
            r3.d = r4
        Ld3:
            return
    }
}
