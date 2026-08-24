package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ar4  reason: default package */
/* loaded from: classes.dex */
public final class ar4 implements defpackage.cq3 {
    public final defpackage.ue1 a;
    public final defpackage.uj2 b;
    public final defpackage.ei c;

    public ar4(defpackage.ue1 r1, defpackage.zq4 r2, defpackage.ei r3) {
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
            uj2 r0 = r0.b
            ei r0 = r0.J()
            int r0 = r0.B
            return r0
    }

    @Override // defpackage.cq3
    public final void b(int r10, java.lang.Object r11, defpackage.px0 r12, int r13) {
            r9 = this;
            r6 = r12
            xq2 r6 = (defpackage.xq2) r6
            r0 = -1201380429(0xffffffffb86463b3, float:-5.4452288E-5)
            r6.d0(r0)
            boolean r0 = r6.d(r10)
            if (r0 == 0) goto L11
            r0 = 4
            goto L12
        L11:
            r0 = 2
        L12:
            r0 = r0 | r13
            boolean r4 = r6.h(r11)
            if (r4 == 0) goto L1c
            r4 = 32
            goto L1e
        L1c:
            r4 = 16
        L1e:
            r0 = r0 | r4
            boolean r4 = r6.f(r9)
            if (r4 == 0) goto L28
            r4 = 256(0x100, float:3.59E-43)
            goto L2a
        L28:
            r4 = 128(0x80, float:1.8E-43)
        L2a:
            r0 = r0 | r4
            r4 = r0 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            if (r4 == r5) goto L33
            r4 = 1
            goto L34
        L33:
            r4 = 0
        L34:
            r5 = r0 & 1
            boolean r4 = r6.S(r5, r4)
            if (r4 == 0) goto L5e
            ue1 r4 = r9.a
            mq3 r4 = r4.y
            a11 r5 = new a11
            r7 = 3
            r5.<init>(r9, r10, r7)
            r8 = 1142237095(0x441527a7, float:596.61957)
            zv0 r5 = defpackage.n16.I(r8, r5, r6)
            int r8 = r0 >> 3
            r8 = r8 & 14
            r8 = r8 | 3072(0xc00, float:4.305E-42)
            int r0 = r0 << r7
            r0 = r0 & 112(0x70, float:1.57E-43)
            r7 = r8 | r0
            r3 = r10
            r2 = r11
            defpackage.qo2.f(r2, r3, r4, r5, r6, r7)
            goto L61
        L5e:
            r6.V()
        L61:
            cf5 r6 = r6.t()
            if (r6 == 0) goto L74
            hp r0 = new hp
            r5 = 9
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r6.d = r0
        L74:
            return
    }

    @Override // defpackage.cq3
    public final java.lang.Object c(int r2) {
            r1 = this;
            ei r0 = r1.c
            java.lang.Object r0 = r0.f(r2)
            if (r0 != 0) goto Lf
            uj2 r1 = r1.b
            java.lang.Object r1 = r1.K(r2)
            return r1
        Lf:
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
            boolean r0 = r2 instanceof defpackage.ar4
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            ar4 r2 = (defpackage.ar4) r2
            uj2 r2 = r2.b
            uj2 r1 = r1.b
            boolean r1 = defpackage.nb3.k(r1, r2)
            return r1
    }

    public final int hashCode() {
            r0 = this;
            uj2 r0 = r0.b
            int r0 = r0.hashCode()
            return r0
    }
}
