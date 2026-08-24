package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p46  reason: default package */
/* loaded from: classes.dex */
public final class p46 implements defpackage.o46 {
    public static final defpackage.ap3 X = null;
    public final java.util.Map A;
    public final defpackage.ja4 B;
    public defpackage.q46 L;
    public final defpackage.ro5 R;

    static {
            ep3 r0 = new ep3
            r1 = 14
            r2 = 0
            r0.<init>(r1, r2)
            gn5 r1 = new gn5
            r2 = 22
            r1.<init>(r2)
            ap3 r2 = new ap3
            r3 = 28
            r2.<init>(r3, r0, r1)
            defpackage.p46.X = r2
            return
    }

    public p46(java.util.Map r2) {
            r1 = this;
            r1.<init>()
            r1.A = r2
            long[] r2 = defpackage.b66.a
            ja4 r2 = new ja4
            r2.<init>()
            r1.B = r2
            ro5 r2 = new ro5
            r0 = 6
            r2.<init>(r1, r0)
            r1.R = r2
            return
    }

    @Override // defpackage.o46
    public final void b(java.lang.Object r8, defpackage.zv0 r9, defpackage.px0 r10, int r11) {
            r7 = this;
            xq2 r10 = (defpackage.xq2) r10
            r0 = 533563200(0x1fcd8740, float:8.704463E-20)
            r10.d0(r0)
            r0 = r11 & 6
            if (r0 != 0) goto L17
            boolean r0 = r10.h(r8)
            if (r0 == 0) goto L14
            r0 = 4
            goto L15
        L14:
            r0 = 2
        L15:
            r0 = r0 | r11
            goto L18
        L17:
            r0 = r11
        L18:
            r1 = r11 & 48
            if (r1 != 0) goto L28
            boolean r1 = r10.h(r9)
            if (r1 == 0) goto L25
            r1 = 32
            goto L27
        L25:
            r1 = 16
        L27:
            r0 = r0 | r1
        L28:
            r1 = r11 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L38
            boolean r1 = r10.h(r7)
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
            r3 = 0
            if (r1 == r2) goto L41
            r1 = 1
            goto L42
        L41:
            r1 = r3
        L42:
            r2 = r0 & 1
            boolean r1 = r10.S(r2, r1)
            if (r1 == 0) goto Lda
            r10.e0(r8)
            java.lang.Object r1 = r10.P()
            vs0 r2 = defpackage.ox0.a
            if (r1 != r2) goto L84
            ro5 r1 = r7.R
            java.lang.Object r4 = r1.g(r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L7c
            u46 r4 = new u46
            java.util.Map r5 = r7.A
            java.lang.Object r5 = r5.get(r8)
            java.util.Map r5 = (java.util.Map) r5
            nq6 r6 = defpackage.s46.a
            r46 r6 = new r46
            r6.<init>(r5, r1)
            r4.<init>(r6)
            r10.l0(r4)
            r1 = r4
            goto L84
        L7c:
            java.lang.String r7 = "Type of the key "
            java.lang.String r9 = " is not supported. On Android you can only use types which can be stored inside the Bundle."
            defpackage.u34.A(r8, r9, r7)
            return
        L84:
            u46 r1 = (defpackage.u46) r1
            nq6 r4 = defpackage.s46.a
            pq r4 = r4.a(r1)
            l55 r5 = defpackage.dy3.a
            pq r5 = r5.a(r1)
            pq[] r4 = new defpackage.pq[]{r4, r5}
            r0 = r0 & 112(0x70, float:1.57E-43)
            r5 = 8
            r0 = r0 | r5
            defpackage.hv.e(r4, r9, r10, r0)
            boolean r0 = r10.h(r7)
            boolean r4 = r10.h(r8)
            r0 = r0 | r4
            boolean r4 = r10.h(r1)
            r0 = r0 | r4
            java.lang.Object r4 = r10.P()
            if (r0 != 0) goto Lb4
            if (r4 != r2) goto Lbe
        Lb4:
            t00 r4 = new t00
            r0 = 23
            r4.<init>(r7, r8, r1, r0)
            r10.l0(r4)
        Lbe:
            qn2 r4 = (defpackage.qn2) r4
            jg7 r0 = defpackage.jg7.a
            defpackage.mb3.d(r0, r4, r10)
            boolean r0 = r10.y
            if (r0 == 0) goto Ld6
            lk6 r0 = r10.G
            int r0 = r0.i
            int r1 = r10.z
            if (r0 != r1) goto Ld6
            r0 = -1
            r10.z = r0
            r10.y = r3
        Ld6:
            r10.p(r3)
            goto Ldd
        Lda:
            r10.V()
        Ldd:
            cf5 r10 = r10.t()
            if (r10 == 0) goto Lf0
            rl r0 = new rl
            r5 = 25
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r10.d = r0
        Lf0:
            return
    }

    @Override // defpackage.o46
    public final void f(java.lang.Object r2) {
            r1 = this;
            ja4 r0 = r1.B
            java.lang.Object r0 = r0.k(r2)
            if (r0 != 0) goto Ld
            java.util.Map r1 = r1.A
            r1.remove(r2)
        Ld:
            return
    }
}
