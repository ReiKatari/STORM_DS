package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s51  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class s51 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.p27 B;

    public /* synthetic */ s51(defpackage.p27 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r19) {
            r18 = this;
            r0 = r18
            int r1 = r0.A
            p27 r0 = r0.B
            switch(r1) {
                case 0: goto L15a;
                case 1: goto L150;
                default: goto L9;
            }
        L9:
            r1 = r19
            jk3 r1 = (defpackage.jk3) r1
            jt3 r2 = r0.d
            of5 r3 = defpackage.of5.e
            if (r2 == 0) goto L120
            boolean r5 = r2.p
            if (r5 != 0) goto L18
            goto L19
        L18:
            r2 = 0
        L19:
            if (r2 == 0) goto L120
            mk4 r5 = r0.b
            c37 r6 = r0.n()
            long r6 = r6.b
            int r8 = defpackage.k47.c
            r8 = 32
            long r6 = r6 >> r8
            int r6 = (int) r6
            int r5 = r5.s(r6)
            mk4 r6 = r0.b
            c37 r7 = r0.n()
            long r9 = r7.b
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r11
            int r7 = (int) r9
            int r6 = r6.s(r7)
            jt3 r7 = r0.d
            r9 = 0
            if (r7 == 0) goto L56
            jk3 r7 = r7.c()
            if (r7 == 0) goto L56
            r13 = 1
            long r13 = r0.l(r13)
            long r13 = r7.P(r13)
            goto L57
        L56:
            r13 = r9
        L57:
            jt3 r7 = r0.d
            if (r7 == 0) goto L6a
            jk3 r7 = r7.c()
            if (r7 == 0) goto L6a
            r9 = 0
            long r9 = r0.l(r9)
            long r9 = r7.P(r9)
        L6a:
            jt3 r7 = r0.d
            r15 = 0
            if (r7 == 0) goto La2
            jk3 r7 = r7.c()
            if (r7 == 0) goto La2
            b47 r4 = r2.d()
            if (r4 == 0) goto L84
            a47 r4 = r4.a
            of5 r4 = r4.c(r5)
            float r4 = r4.b
            goto L85
        L84:
            r4 = r15
        L85:
            int r5 = java.lang.Float.floatToRawIntBits(r15)
            r19 = r8
            r16 = r9
            long r8 = (long) r5
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r4 = (long) r4
            long r8 = r8 << r19
            long r4 = r4 & r11
            long r4 = r4 | r8
            long r4 = r7.P(r4)
            long r4 = r4 & r11
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            goto La7
        La2:
            r19 = r8
            r16 = r9
            r4 = r15
        La7:
            jt3 r5 = r0.d
            if (r5 == 0) goto Lda
            jk3 r5 = r5.c()
            if (r5 == 0) goto Lda
            b47 r7 = r2.d()
            if (r7 == 0) goto Lc0
            a47 r7 = r7.a
            of5 r6 = r7.c(r6)
            float r6 = r6.b
            goto Lc1
        Lc0:
            r6 = r15
        Lc1:
            int r7 = java.lang.Float.floatToRawIntBits(r15)
            long r7 = (long) r7
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r9 = (long) r6
            long r6 = r7 << r19
            long r8 = r9 & r11
            long r6 = r6 | r8
            long r5 = r5.P(r6)
            long r5 = r5 & r11
            int r5 = (int) r5
            float r15 = java.lang.Float.intBitsToFloat(r5)
        Lda:
            long r5 = r13 >> r19
            int r5 = (int) r5
            float r6 = java.lang.Float.intBitsToFloat(r5)
            long r7 = r16 >> r19
            int r7 = (int) r7
            float r8 = java.lang.Float.intBitsToFloat(r7)
            float r6 = java.lang.Math.min(r6, r8)
            float r5 = java.lang.Float.intBitsToFloat(r5)
            float r7 = java.lang.Float.intBitsToFloat(r7)
            float r5 = java.lang.Math.max(r5, r7)
            float r4 = java.lang.Math.min(r4, r15)
            long r7 = r13 & r11
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            long r8 = r16 & r11
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            float r7 = java.lang.Math.max(r7, r8)
            d17 r2 = r2.a
            qh1 r2 = r2.g
            float r2 = r2.a()
            r8 = 1103626240(0x41c80000, float:25.0)
            float r2 = r2 * r8
            float r2 = r2 + r7
            of5 r7 = new of5
            r7.<init>(r6, r4, r5, r2)
            goto L121
        L120:
            r7 = r3
        L121:
            jt3 r0 = r0.d
            if (r0 == 0) goto L14e
            jk3 r0 = r0.c()
            if (r0 != 0) goto L12c
            goto L14e
        L12c:
            boolean r2 = r0.t()
            if (r2 == 0) goto L14f
            boolean r2 = r1.t()
            if (r2 != 0) goto L139
            goto L14f
        L139:
            long r2 = r7.d()
            jk3 r0 = defpackage.ej2.w(r0)
            long r0 = r1.J(r0, r2)
            long r2 = r7.c()
            of5 r3 = defpackage.kj2.b(r0, r2)
            goto L14f
        L14e:
            r3 = 0
        L14f:
            return r3
        L150:
            r1 = r19
            jk4 r1 = (defpackage.jk4) r1
            r0.r()
            jg7 r0 = defpackage.jg7.a
            return r0
        L15a:
            r1 = r19
            gl1 r1 = (defpackage.gl1) r1
            z3 r1 = new z3
            r2 = 8
            r1.<init>(r0, r2)
            return r1
    }
}
