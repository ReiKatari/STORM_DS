package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hl6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hl6 implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.eo2 B;
    public final /* synthetic */ defpackage.zv0 L;

    public /* synthetic */ hl6(defpackage.eo2 r1, defpackage.zv0 r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    public /* synthetic */ hl6(defpackage.zv0 r1, defpackage.eo2 r2, int r3) {
            r0 = this;
            r3 = 2
            r0.A = r3
            r0.<init>()
            r0.L = r1
            r0.B = r2
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r9, java.lang.Object r10) {
            r8 = this;
            int r0 = r8.A
            r1 = 2
            jg7 r2 = defpackage.jg7.a
            r3 = 0
            zv0 r4 = r8.L
            eo2 r8 = r8.B
            r5 = 1
            px0 r9 = (defpackage.px0) r9
            java.lang.Integer r10 = (java.lang.Integer) r10
            switch(r0) {
                case 0: goto Lb6;
                case 1: goto L82;
                case 2: goto L77;
                default: goto L12;
            }
        L12:
            int r10 = r10.intValue()
            r0 = r10 & 3
            if (r0 == r1) goto L1b
            r3 = r5
        L1b:
            r10 = r10 & r5
            xq2 r9 = (defpackage.xq2) r9
            boolean r10 = r9.S(r10, r3)
            if (r10 == 0) goto L73
            py0 r10 = defpackage.g31.a
            py0 r0 = defpackage.j31.a
            java.lang.Object r0 = r9.j(r0)
            kt0 r0 = (defpackage.kt0) r0
            long r0 = r0.a
            nq6 r3 = defpackage.vt0.a
            java.lang.Object r3 = r9.j(r3)
            ut0 r3 = (defpackage.ut0) r3
            boolean r3 = r3.k()
            r6 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            if (r3 == 0) goto L4a
            float r0 = defpackage.hv.N(r0)
            double r0 = (double) r0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 <= 0) goto L56
            goto L53
        L4a:
            float r0 = defpackage.hv.N(r0)
            double r0 = (double) r0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 >= 0) goto L56
        L53:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L59
        L56:
            r0 = 1063172178(0x3f5eb852, float:0.87)
        L59:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            pq r10 = r10.a(r0)
            hl6 r0 = new hl6
            r0.<init>(r8, r4, r5)
            r8 = 1236486620(0x49b349dc, float:1468731.5)
            zv0 r8 = defpackage.n16.I(r8, r0, r9)
            r0 = 56
            defpackage.hv.d(r10, r8, r9, r0)
            goto L76
        L73:
            r9.V()
        L76:
            return r2
        L77:
            r10.getClass()
            int r10 = defpackage.ii2.a0(r5)
            defpackage.bl2.g(r4, r8, r9, r10)
            return r2
        L82:
            int r10 = r10.intValue()
            r0 = r10 & 3
            if (r0 == r1) goto L8c
            r0 = r5
            goto L8d
        L8c:
            r0 = r3
        L8d:
            r10 = r10 & r5
            xq2 r9 = (defpackage.xq2) r9
            boolean r10 = r9.S(r10, r0)
            if (r10 == 0) goto Lb2
            nq6 r10 = defpackage.ye7.b
            java.lang.Object r10 = r9.j(r10)
            xe7 r10 = (defpackage.xe7) r10
            s47 r10 = r10.j
            hl6 r0 = new hl6
            r0.<init>(r8, r4, r3)
            r8 = 1789628237(0x6aab8f4d, float:1.0370152E26)
            zv0 r8 = defpackage.n16.I(r8, r0, r9)
            r0 = 48
            defpackage.x37.a(r10, r8, r9, r0)
            goto Lb5
        Lb2:
            r9.V()
        Lb5:
            return r2
        Lb6:
            int r10 = r10.intValue()
            r0 = r10 & 3
            if (r0 == r1) goto Lc0
            r0 = r5
            goto Lc1
        Lc0:
            r0 = r3
        Lc1:
            r10 = r10 & r5
            xq2 r9 = (defpackage.xq2) r9
            boolean r10 = r9.S(r10, r0)
            if (r10 == 0) goto Le6
            if (r8 != 0) goto Ld9
            r8 = 1845819398(0x6e04f806, float:1.0287966E28)
            r9.b0(r8)
            defpackage.bl2.l(r4, r9, r3)
            r9.p(r3)
            goto Le9
        Ld9:
            r10 = 1845823628(0x6e05088c, float:1.029296E28)
            r9.b0(r10)
            defpackage.bl2.g(r4, r8, r9, r3)
            r9.p(r3)
            goto Le9
        Le6:
            r9.V()
        Le9:
            return r2
    }
}
