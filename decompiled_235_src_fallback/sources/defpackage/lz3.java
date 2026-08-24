package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lz3  reason: default package */
/* loaded from: classes.dex */
public final class lz3 extends defpackage.cx4 {
    public final /* synthetic */ int B;
    public final java.lang.Object L;

    public /* synthetic */ lz3(java.lang.Object r1, int r2) {
            r0 = this;
            r0.B = r2
            r0.L = r1
            r0.<init>()
            return
    }

    @Override // defpackage.qh1
    public final float Y() {
            r1 = this;
            int r0 = r1.B
            java.lang.Object r1 = r1.L
            switch(r0) {
                case 0: goto L12;
                default: goto L7;
            }
        L7:
            te r1 = (defpackage.te) r1
            qh1 r1 = r1.getDensity()
            float r1 = r1.Y()
            return r1
        L12:
            kz3 r1 = (defpackage.kz3) r1
            float r1 = r1.Y()
            return r1
    }

    @Override // defpackage.qh1
    public final float a() {
            r1 = this;
            int r0 = r1.B
            java.lang.Object r1 = r1.L
            switch(r0) {
                case 0: goto L12;
                default: goto L7;
            }
        L7:
            te r1 = (defpackage.te) r1
            qh1 r1 = r1.getDensity()
            float r1 = r1.a()
            return r1
        L12:
            kz3 r1 = (defpackage.kz3) r1
            float r1 = r1.a()
            return r1
    }

    @Override // defpackage.cx4
    public float c(defpackage.hy2 r9) {
            r8 = this;
            int r0 = r8.B
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            float r8 = super.c(r9)
            return r8
        La:
            eo2 r0 = r9.a
            r1 = 2143289344(0x7fc00000, float:NaN)
            if (r0 == 0) goto L20
            java.lang.Float r9 = java.lang.Float.valueOf(r1)
            java.lang.Object r8 = r0.o(r8, r9)
            java.lang.Number r8 = (java.lang.Number) r8
            float r1 = r8.floatValue()
            goto Lb4
        L20:
            java.lang.Object r8 = r8.L
            kz3 r8 = (defpackage.kz3) r8
            boolean r0 = r8.g0
            if (r0 == 0) goto L2a
            goto Lb4
        L2a:
            r0 = r8
        L2b:
            z9 r2 = r0.i0
            if (r2 == 0) goto L41
            java.lang.Object r3 = r2.b
            hy2[] r3 = (defpackage.hy2[]) r3
            int r3 = defpackage.fv.K0(r3, r9)
            if (r3 >= 0) goto L3a
            goto L41
        L3a:
            java.lang.Object r2 = r2.c
            float[] r2 = (float[]) r2
            r2 = r2[r3]
            goto L42
        L41:
            r2 = r1
        L42:
            boolean r3 = java.lang.Float.isNaN(r2)
            if (r3 != 0) goto La7
            sm3 r1 = r8.F0()
            r0.s0(r1, r9)
            jk3 r0 = r0.A0()
            jk3 r8 = r8.A0()
            int r9 = r9.b
            r1 = 32
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            switch(r9) {
                case 0: goto L86;
                default: goto L65;
            }
        L65:
            long r6 = r0.m()
            long r6 = r6 & r4
            int r9 = (int) r6
            float r9 = (float) r9
            float r9 = r9 / r3
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            long r2 = (long) r2
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r6 = (long) r9
            long r2 = r2 << r1
            long r4 = r4 & r6
            long r2 = r2 | r4
            long r8 = r8.J(r0, r2)
            long r8 = r8 >> r1
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
        L84:
            r1 = r8
            goto Lb4
        L86:
            long r6 = r0.m()
            long r6 = r6 >> r1
            int r9 = (int) r6
            float r9 = (float) r9
            float r9 = r9 / r3
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r6 = (long) r9
            int r9 = java.lang.Float.floatToRawIntBits(r2)
            long r2 = (long) r9
            long r6 = r6 << r1
            long r1 = r2 & r4
            long r1 = r1 | r6
            long r8 = r8.J(r0, r1)
            long r8 = r8 & r4
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            goto L84
        La7:
            kz3 r2 = r0.H0()
            if (r2 != 0) goto Lb5
            sm3 r8 = r8.F0()
            r0.s0(r8, r9)
        Lb4:
            return r1
        Lb5:
            r0 = r2
            goto L2b
    }

    @Override // defpackage.cx4
    public final defpackage.jk3 d() {
            r1 = this;
            int r0 = r1.B
            java.lang.Object r1 = r1.L
            switch(r0) {
                case 0: goto L14;
                default: goto L7;
            }
        L7:
            te r1 = (defpackage.te) r1
            sm3 r1 = r1.getRoot()
            if0 r1 = r1.B0
            java.lang.Object r1 = r1.e
            eg4 r1 = (defpackage.eg4) r1
            return r1
        L14:
            kz3 r1 = (defpackage.kz3) r1
            boolean r0 = r1.g0
            if (r0 == 0) goto L1c
            r0 = 0
            goto L20
        L1c:
            jk3 r0 = r1.A0()
        L20:
            if (r0 != 0) goto L2b
            sm3 r1 = r1.F0()
            wm3 r1 = r1.C0
            r1.b()
        L2b:
            return r0
    }

    @Override // defpackage.cx4
    public final defpackage.kk3 f() {
            r1 = this;
            int r0 = r1.B
            java.lang.Object r1 = r1.L
            switch(r0) {
                case 0: goto Le;
                default: goto L7;
            }
        L7:
            te r1 = (defpackage.te) r1
            kk3 r1 = r1.getLayoutDirection()
            return r1
        Le:
            kz3 r1 = (defpackage.kz3) r1
            kk3 r1 = r1.getLayoutDirection()
            return r1
    }

    @Override // defpackage.cx4
    public final int i() {
            r1 = this;
            int r0 = r1.B
            java.lang.Object r1 = r1.L
            switch(r0) {
                case 0: goto L14;
                default: goto L7;
            }
        L7:
            te r1 = (defpackage.te) r1
            sm3 r1 = r1.getRoot()
            wm3 r1 = r1.C0
            d34 r1 = r1.p
            int r1 = r1.A
            return r1
        L14:
            kz3 r1 = (defpackage.kz3) r1
            int r1 = r1.d0()
            return r1
    }
}
