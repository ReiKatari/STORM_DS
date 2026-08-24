package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class n4 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ float B;
    public final /* synthetic */ java.lang.Object L;

    public /* synthetic */ n4(float r1, java.lang.Object r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    public /* synthetic */ n4(defpackage.ga7 r2, float r3) {
            r1 = this;
            r0 = 2
            r1.A = r0
            r1.<init>()
            r1.L = r2
            r1.B = r3
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r17) {
            r16 = this;
            r0 = r16
            int r1 = r0.A
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r4 = 32
            r5 = 0
            jg7 r6 = defpackage.jg7.a
            float r7 = r0.B
            java.lang.Object r0 = r0.L
            switch(r1) {
                case 0: goto Lb1;
                case 1: goto L5c;
                default: goto L15;
            }
        L15:
            ga7 r0 = (defpackage.ga7) r0
            r1 = r17
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            boolean r3 = r0.g()
            ts4 r4 = r0.g
            if (r3 != 0) goto L5b
            long r8 = r4.h()
            r10 = -9223372036854775808
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 != 0) goto L3f
            r4.i(r1)
            gx0 r3 = r0.a
            java.lang.Object r3 = r3.a
            vs4 r3 = (defpackage.vs4) r3
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r3.setValue(r8)
        L3f:
            long r3 = r4.h()
            long r1 = r1 - r3
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 != 0) goto L49
            goto L50
        L49:
            double r1 = (double) r1
            double r4 = (double) r7
            double r1 = r1 / r4
            long r1 = defpackage.u24.F(r1)
        L50:
            r0.n(r1)
            if (r3 != 0) goto L57
            r3 = 1
            goto L58
        L57:
            r3 = 0
        L58:
            r0.h(r1, r3)
        L5b:
            return r6
        L5c:
            qa4 r0 = (defpackage.qa4) r0
            r1 = r17
            xi6 r1 = (defpackage.xi6) r1
            long r8 = r1.a
            long r8 = r8 >> r4
            int r5 = (int) r8
            float r5 = java.lang.Float.intBitsToFloat(r5)
            float r5 = r5 * r7
            long r8 = r1.a
            long r8 = r8 & r2
            int r1 = (int) r8
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r1 = r1 * r7
            java.lang.Object r7 = r0.getValue()
            xi6 r7 = (defpackage.xi6) r7
            long r7 = r7.a
            long r7 = r7 >> r4
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 != 0) goto L99
            java.lang.Object r7 = r0.getValue()
            xi6 r7 = (defpackage.xi6) r7
            long r7 = r7.a
            long r7 = r7 & r2
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 != 0) goto L99
            goto Lb0
        L99:
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            long r7 = (long) r5
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r9 = (long) r1
            long r4 = r7 << r4
            long r1 = r9 & r2
            long r1 = r1 | r4
            xi6 r3 = new xi6
            r3.<init>(r1)
            r0.setValue(r3)
        Lb0:
            return r6
        Lb1:
            r8 = r0
            bv3 r8 = (defpackage.bv3) r8
            r0 = r17
            um3 r0 = (defpackage.um3) r0
            r0.getClass()
            r0.b()
            zj0 r1 = r0.A
            long r9 = r1.e()
            long r9 = r9 & r2
            int r9 = (int) r9
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r9 = r9 - r7
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            long r10 = (long) r5
            int r5 = java.lang.Float.floatToRawIntBits(r9)
            long r12 = (long) r5
            long r9 = r10 << r4
            long r11 = r12 & r2
            long r9 = r9 | r11
            long r11 = r1.e()
            long r11 = r11 >> r4
            int r1 = (int) r11
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r11 = (long) r1
            int r1 = java.lang.Float.floatToRawIntBits(r7)
            long r13 = (long) r1
            long r4 = r11 << r4
            long r1 = r13 & r2
            long r11 = r4 | r1
            r14 = 0
            r15 = 56
            r13 = 0
            r7 = r0
            defpackage.no1.D0(r7, r8, r9, r11, r13, r14, r15)
            return r6
    }
}
