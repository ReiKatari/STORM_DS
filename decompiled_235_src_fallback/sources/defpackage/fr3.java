package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fr3  reason: default package */
/* loaded from: classes.dex */
public final class fr3 implements defpackage.cq3 {
    public final defpackage.pr3 a;
    public final defpackage.er3 b;
    public final defpackage.lp3 c;
    public final defpackage.ei d;

    public fr3(defpackage.pr3 r1, defpackage.er3 r2, defpackage.lp3 r3, defpackage.ei r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    @Override // defpackage.cq3
    public final int a() {
            r0 = this;
            er3 r0 = r0.b
            ei r0 = r0.J()
            int r0 = r0.B
            return r0
    }

    @Override // defpackage.cq3
    public final void b(int r9, java.lang.Object r10, defpackage.px0 r11, int r12) {
            r8 = this;
            r6 = r11
            xq2 r6 = (defpackage.xq2) r6
            r0 = -462424778(0xffffffffe46ff536, float:-1.7705765E22)
            r6.d0(r0)
            boolean r0 = r6.d(r9)
            r3 = 2
            if (r0 == 0) goto L12
            r0 = 4
            goto L13
        L12:
            r0 = r3
        L13:
            r0 = r0 | r12
            boolean r5 = r6.h(r10)
            if (r5 == 0) goto L1d
            r5 = 32
            goto L1f
        L1d:
            r5 = 16
        L1f:
            r0 = r0 | r5
            boolean r5 = r6.f(r8)
            if (r5 == 0) goto L29
            r5 = 256(0x100, float:3.59E-43)
            goto L2b
        L29:
            r5 = 128(0x80, float:1.8E-43)
        L2b:
            r0 = r0 | r5
            r5 = r0 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            if (r5 == r7) goto L34
            r5 = 1
            goto L35
        L34:
            r5 = 0
        L35:
            r7 = r0 & 1
            boolean r5 = r6.S(r7, r5)
            if (r5 == 0) goto L60
            pr3 r5 = r8.a
            mq3 r5 = r5.s
            a11 r7 = new a11
            r7.<init>(r8, r9, r3)
            r3 = -824725566(0xffffffffced7afc2, float:-1.80931E9)
            zv0 r3 = defpackage.n16.I(r3, r7, r6)
            int r7 = r0 >> 3
            r7 = r7 & 14
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            int r0 = r0 << 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r7 = r7 | r0
            r2 = r10
            r4 = r5
            r5 = r3
            r3 = r9
            defpackage.qo2.f(r2, r3, r4, r5, r6, r7)
            goto L63
        L60:
            r6.V()
        L63:
            cf5 r6 = r6.t()
            if (r6 == 0) goto L76
            hp r0 = new hp
            r5 = 8
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r6.d = r0
        L76:
            return
    }

    @Override // defpackage.cq3
    public final java.lang.Object c(int r2) {
            r1 = this;
            ei r0 = r1.d
            java.lang.Object r0 = r0.f(r2)
            if (r0 != 0) goto Lf
            er3 r1 = r1.b
            java.lang.Object r1 = r1.K(r2)
            return r1
        Lf:
            return r0
    }

    @Override // defpackage.cq3
    public final java.lang.Object d(int r1) {
            r0 = this;
            er3 r0 = r0.b
            java.lang.Object r0 = r0.H(r1)
            return r0
    }

    @Override // defpackage.cq3
    public final int e(java.lang.Object r1) {
            r0 = this;
            ei r0 = r0.d
            int r0 = r0.e(r1)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof defpackage.fr3
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            fr3 r2 = (defpackage.fr3) r2
            er3 r2 = r2.b
            er3 r1 = r1.b
            boolean r1 = defpackage.nb3.k(r1, r2)
            return r1
    }

    public final int hashCode() {
            r0 = this;
            er3 r0 = r0.b
            int r0 = r0.hashCode()
            return r0
    }
}
