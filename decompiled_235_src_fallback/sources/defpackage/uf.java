package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uf  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class uf implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ float B;
    public final /* synthetic */ java.lang.Object L;
    public final /* synthetic */ java.lang.Object R;

    public /* synthetic */ uf(float r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.A = r4
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.<init>()
            return
    }

    public /* synthetic */ uf(defpackage.nh7 r2, float r3, defpackage.qn2 r4) {
            r1 = this;
            r0 = 2
            r1.A = r0
            r1.<init>()
            r1.L = r2
            r1.B = r3
            r1.R = r4
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r14) {
            r13 = this;
            int r0 = r13.A
            jg7 r1 = defpackage.jg7.a
            r2 = 0
            java.lang.Object r3 = r13.R
            float r4 = r13.B
            java.lang.Object r13 = r13.L
            switch(r0) {
                case 0: goto Lca;
                case 1: goto L71;
                default: goto Le;
            }
        Le:
            nh7 r13 = (defpackage.nh7) r13
            qn2 r3 = (defpackage.qn2) r3
            java.lang.Long r14 = (java.lang.Long) r14
            long r5 = r14.longValue()
            long r7 = r13.b
            r9 = -9223372036854775808
            int r14 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r14 != 0) goto L22
            r13.b = r5
        L22:
            wo r10 = new wo
            float r14 = r13.e
            r10.<init>(r14)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            wo r11 = defpackage.nh7.f
            if (r0 != 0) goto L3e
            il7 r0 = r13.a
            wo r2 = new wo
            r2.<init>(r14)
            wo r14 = r13.c
            long r7 = r0.b(r2, r11, r14)
        L3c:
            r8 = r7
            goto L4a
        L3e:
            long r7 = r13.b
            long r7 = r5 - r7
            float r14 = (float) r7
            float r14 = r14 / r4
            double r7 = (double) r14
            long r7 = defpackage.u24.F(r7)
            goto L3c
        L4a:
            il7 r7 = r13.a
            wo r12 = r13.c
            ap r14 = r7.q(r8, r10, r11, r12)
            wo r14 = (defpackage.wo) r14
            float r14 = r14.a
            il7 r7 = r13.a
            wo r12 = r13.c
            ap r0 = r7.h(r8, r10, r11, r12)
            wo r0 = (defpackage.wo) r0
            r13.c = r0
            r13.b = r5
            float r0 = r13.e
            float r0 = r0 - r14
            r13.e = r14
            java.lang.Float r13 = java.lang.Float.valueOf(r0)
            r3.g(r13)
            return r1
        L71:
            ah5 r13 = (defpackage.ah5) r13
            lr3 r3 = (defpackage.lr3) r3
            so r14 = (defpackage.so) r14
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L8f
            vs4 r0 = r14.e
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L8d
        L8b:
            r2 = r4
            goto La4
        L8d:
            r2 = r0
            goto La4
        L8f:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto La4
            vs4 r0 = r14.e
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 >= 0) goto L8d
            goto L8b
        La4:
            float r0 = r13.A
            float r0 = r2 - r0
            float r3 = r3.a(r0)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto Lc1
            vs4 r3 = r14.e
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto Lc1
            goto Lc4
        Lc1:
            r14.a()
        Lc4:
            float r14 = r13.A
            float r14 = r14 + r0
            r13.A = r14
            return r1
        Lca:
            zh r13 = (defpackage.zh) r13
            z40 r3 = (defpackage.z40) r3
            um3 r14 = (defpackage.um3) r14
            r14.b()
            zj0 r14 = r14.A
            bt r5 = r14.B
            long r6 = r5.L()
            xj0 r0 = r5.G()
            r0.h()
            java.lang.Object r0 = r5.B     // Catch: java.lang.Throwable -> Lf7
            os0 r0 = (defpackage.os0) r0     // Catch: java.lang.Throwable -> Lf7
            r0.g0(r4, r2)     // Catch: java.lang.Throwable -> Lf7
            r2 = 1110704128(0x42340000, float:45.0)
            r8 = 0
            r0.e0(r2, r8)     // Catch: java.lang.Throwable -> Lf7
            r14.f(r13, r3)     // Catch: java.lang.Throwable -> Lf7
            defpackage.xg6.v(r5, r6)
            return r1
        Lf7:
            r0 = move-exception
            r13 = r0
            defpackage.xg6.v(r5, r6)
            throw r13
    }
}
