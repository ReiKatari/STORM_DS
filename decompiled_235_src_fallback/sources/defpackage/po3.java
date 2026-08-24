package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: po3  reason: default package */
/* loaded from: classes.dex */
public final class po3 implements defpackage.cq3 {
    public final defpackage.ip3 a;
    public final defpackage.oo3 b;
    public final defpackage.ei c;

    public po3(defpackage.ip3 r1, defpackage.oo3 r2, defpackage.ei r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    @Override // defpackage.cq3
    public final int a() {
            r0 = this;
            oo3 r0 = r0.b
            ei r0 = r0.J()
            int r0 = r0.B
            return r0
    }

    @Override // defpackage.cq3
    public final void b(int r9, java.lang.Object r10, defpackage.px0 r11, int r12) {
            r8 = this;
            r6 = r11
            xq2 r6 = (defpackage.xq2) r6
            r0 = 1493551140(0x5905c824, float:2.3535143E15)
            r6.d0(r0)
            boolean r0 = r6.d(r9)
            if (r0 == 0) goto L11
            r0 = 4
            goto L12
        L11:
            r0 = 2
        L12:
            r0 = r0 | r12
            boolean r4 = r6.h(r10)
            if (r4 == 0) goto L1c
            r4 = 32
            goto L1e
        L1c:
            r4 = 16
        L1e:
            r0 = r0 | r4
            boolean r4 = r6.f(r8)
            if (r4 == 0) goto L28
            r4 = 256(0x100, float:3.59E-43)
            goto L2a
        L28:
            r4 = 128(0x80, float:1.8E-43)
        L2a:
            r0 = r0 | r4
            r4 = r0 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            r7 = 1
            if (r4 == r5) goto L34
            r4 = r7
            goto L35
        L34:
            r4 = 0
        L35:
            r5 = r0 & 1
            boolean r4 = r6.S(r5, r4)
            if (r4 == 0) goto L5e
            ip3 r4 = r8.a
            mq3 r4 = r4.q
            a11 r5 = new a11
            r5.<init>(r8, r9, r7)
            r7 = 726189336(0x2b48c518, float:7.1327796E-13)
            zv0 r5 = defpackage.n16.I(r7, r5, r6)
            int r7 = r0 >> 3
            r7 = r7 & 14
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            int r0 = r0 << 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r7 = r7 | r0
            r3 = r9
            r2 = r10
            defpackage.qo2.f(r2, r3, r4, r5, r6, r7)
            goto L61
        L5e:
            r6.V()
        L61:
            cf5 r6 = r6.t()
            if (r6 == 0) goto L73
            hp r0 = new hp
            r5 = 6
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r6.d = r0
        L73:
            return
    }

    @Override // defpackage.cq3
    public final java.lang.Object c(int r2) {
            r1 = this;
            ei r0 = r1.c
            java.lang.Object r0 = r0.f(r2)
            if (r0 != 0) goto Lf
            oo3 r1 = r1.b
            java.lang.Object r1 = r1.K(r2)
            return r1
        Lf:
            return r0
    }

    @Override // defpackage.cq3
    public final java.lang.Object d(int r1) {
            r0 = this;
            oo3 r0 = r0.b
            java.lang.Object r0 = r0.H(r1)
            return r0
    }

    @Override // defpackage.cq3
    public final int e(java.lang.Object r1) {
            r0 = this;
            ei r0 = r0.c
            int r0 = r0.e(r1)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof defpackage.po3
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            po3 r2 = (defpackage.po3) r2
            oo3 r2 = r2.b
            oo3 r1 = r1.b
            boolean r1 = defpackage.nb3.k(r1, r2)
            return r1
    }

    public final int hashCode() {
            r0 = this;
            oo3 r0 = r0.b
            int r0 = r0.hashCode()
            return r0
    }
}
