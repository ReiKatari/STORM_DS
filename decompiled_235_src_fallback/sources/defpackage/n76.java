package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n76  reason: default package */
/* loaded from: classes.dex */
public final class n76 extends defpackage.z64 implements defpackage.jm3, defpackage.va6 {
    public defpackage.s76 k0;
    public boolean l0;

    @Override // defpackage.va6
    public final void A0(defpackage.gb6 r6) {
            r5 = this;
            fg3[] r0 = defpackage.eb6.a
            fb6 r0 = defpackage.bb6.n
            fg3[] r1 = defpackage.eb6.a
            r2 = 6
            r2 = r1[r2]
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r6.a(r0, r2)
            e76 r0 = new e76
            m76 r2 = new m76
            r3 = 0
            r2.<init>(r5, r3)
            m76 r3 = new m76
            r4 = 1
            r3.<init>(r5, r4)
            r0.<init>(r2, r3)
            boolean r5 = r5.l0
            if (r5 == 0) goto L2d
            fb6 r5 = defpackage.bb6.w
            r2 = 13
            r1 = r1[r2]
            r6.a(r5, r0)
            return
        L2d:
            fb6 r5 = defpackage.bb6.v
            r2 = 12
            r1 = r1[r2]
            r6.a(r5, r0)
            return
    }

    @Override // defpackage.jm3
    public final int Z(defpackage.kz3 r1, defpackage.x24 r2, int r3) {
            r0 = this;
            boolean r0 = r0.l0
            if (r0 == 0) goto L5
            goto L8
        L5:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L8:
            int r0 = r2.c(r3)
            return r0
    }

    @Override // defpackage.jm3
    public final defpackage.f34 c(defpackage.g34 r10, defpackage.x24 r11, long r12) {
            r9 = this;
            boolean r0 = r9.l0
            if (r0 == 0) goto L7
            lo4 r0 = defpackage.lo4.Vertical
            goto L9
        L7:
            lo4 r0 = defpackage.lo4.Horizontal
        L9:
            defpackage.mb3.s(r12, r0)
            boolean r0 = r9.l0
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == 0) goto L15
            r7 = r1
            goto L1a
        L15:
            int r0 = defpackage.q21.g(r12)
            r7 = r0
        L1a:
            boolean r0 = r9.l0
            if (r0 == 0) goto L22
            int r1 = defpackage.q21.h(r12)
        L22:
            r5 = r1
            r6 = 0
            r8 = 5
            r4 = 0
            r2 = r12
            long r12 = defpackage.q21.a(r2, r4, r5, r6, r7, r8)
            dx4 r11 = r11.y(r12)
            int r12 = r11.A
            int r13 = defpackage.q21.h(r2)
            if (r12 <= r13) goto L38
            r12 = r13
        L38:
            int r13 = r11.B
            int r0 = defpackage.q21.g(r2)
            if (r13 <= r0) goto L41
            r13 = r0
        L41:
            int r0 = r11.B
            int r0 = r0 - r13
            int r1 = r11.A
            int r1 = r1 - r12
            boolean r2 = r9.l0
            if (r2 == 0) goto L4c
            goto L4d
        L4c:
            r0 = r1
        L4d:
            s76 r1 = r9.k0
            ss4 r2 = r1.e
            ss4 r1 = r1.a
            r2.i(r0)
            vl6 r2 = defpackage.ln2.t()
            if (r2 == 0) goto L61
            qn2 r3 = r2.e()
            goto L62
        L61:
            r3 = 0
        L62:
            vl6 r4 = defpackage.ln2.N(r2)
            int r5 = r1.h()     // Catch: java.lang.Throwable -> L70
            if (r5 <= r0) goto L73
            r1.i(r0)     // Catch: java.lang.Throwable -> L70
            goto L73
        L70:
            r0 = move-exception
            r9 = r0
            goto La1
        L73:
            defpackage.ln2.V(r2, r4, r3)
            s76 r1 = r9.k0
            boolean r2 = r9.l0
            if (r2 == 0) goto L7e
            r2 = r13
            goto L7f
        L7e:
            r2 = r12
        L7f:
            ss4 r1 = r1.b
            r1.i(r2)
            s76 r1 = r9.k0
            boolean r2 = r9.l0
            if (r2 == 0) goto L8d
            int r2 = r11.B
            goto L8f
        L8d:
            int r2 = r11.A
        L8f:
            ss4 r1 = r1.c
            r1.i(r2)
            zu1 r1 = new zu1
            r2 = 3
            r1.<init>(r9, r0, r2, r11)
            zt1 r9 = defpackage.zt1.A
            f34 r9 = r10.K(r12, r13, r9, r1)
            return r9
        La1:
            defpackage.ln2.V(r2, r4, r3)
            throw r9
    }

    @Override // defpackage.jm3
    public final int f(defpackage.kz3 r1, defpackage.x24 r2, int r3) {
            r0 = this;
            boolean r0 = r0.l0
            if (r0 == 0) goto L7
            r3 = 2147483647(0x7fffffff, float:NaN)
        L7:
            int r0 = r2.u(r3)
            return r0
    }

    @Override // defpackage.jm3
    public final int h0(defpackage.kz3 r1, defpackage.x24 r2, int r3) {
            r0 = this;
            boolean r0 = r0.l0
            if (r0 == 0) goto L5
            goto L8
        L5:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L8:
            int r0 = r2.V(r3)
            return r0
    }

    @Override // defpackage.jm3
    public final int s0(defpackage.kz3 r1, defpackage.x24 r2, int r3) {
            r0 = this;
            boolean r0 = r0.l0
            if (r0 == 0) goto L7
            r3 = 2147483647(0x7fffffff, float:NaN)
        L7:
            int r0 = r2.n(r3)
            return r0
    }
}
