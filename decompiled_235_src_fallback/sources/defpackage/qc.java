package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qc  reason: default package */
/* loaded from: classes.dex */
public final class qc extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ float Z;
    public final /* synthetic */ java.lang.Object d0;

    public qc(defpackage.dx0 r2, defpackage.r41 r3) {
            r1 = this;
            r0 = 1
            r1.X = r0
            r1.d0 = r2
            r2 = 2
            r1.<init>(r2, r3)
            return
    }

    public /* synthetic */ qc(java.lang.Object r1, float r2, defpackage.r41 r3, int r4) {
            r0 = this;
            r0.X = r4
            r0.d0 = r1
            r0.Z = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            switch(r0) {
                case 0: goto L2d;
                case 1: goto L16;
                default: goto L7;
            }
        L7:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            qc r2 = (defpackage.qc) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            r41 r4 = (defpackage.r41) r4
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r41 r2 = r2.q(r4, r3)
            qc r2 = (defpackage.qc) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L2d:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            qc r2 = (defpackage.qc) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            java.lang.Object r1 = r2.d0
            switch(r0) {
                case 0: goto L22;
                case 1: goto L12;
                default: goto L7;
            }
        L7:
            qc r4 = new qc
            n65 r1 = (defpackage.n65) r1
            float r2 = r2.Z
            r0 = 2
            r4.<init>(r1, r2, r3, r0)
            return r4
        L12:
            qc r2 = new qc
            dx0 r1 = (defpackage.dx0) r1
            r2.<init>(r1, r3)
            java.lang.Number r4 = (java.lang.Number) r4
            float r3 = r4.floatValue()
            r2.Z = r3
            return r2
        L22:
            qc r4 = new qc
            dd r1 = (defpackage.dd) r1
            float r2 = r2.Z
            r0 = 0
            r4.<init>(r1, r2, r3, r0)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.X
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r2 = r10.d0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            r5 = 0
            switch(r0) {
                case 0: goto La8;
                case 1: goto L36;
                default: goto Ld;
            }
        Ld:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r10.Y
            if (r6 == 0) goto L1e
            if (r6 != r4) goto L19
            defpackage.oi2.Y(r11)
            goto L35
        L19:
            defpackage.i.m(r3)
            r1 = r5
            goto L35
        L1e:
            defpackage.oi2.Y(r11)
            n65 r2 = (defpackage.n65) r2
            db4 r11 = r2.i
            m65 r3 = new m65
            float r6 = r10.Z
            r3.<init>(r2, r6, r5)
            r10.Y = r4
            java.lang.Object r10 = defpackage.db4.b(r11, r3, r10)
            if (r10 != r0) goto L35
            r1 = r0
        L35:
            return r1
        L36:
            dx0 r2 = (defpackage.dx0) r2
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r10.Y
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r1 == 0) goto L4d
            if (r1 != r4) goto L49
            defpackage.oi2.Y(r11)
            goto L91
        L49:
            defpackage.i.m(r3)
            goto La0
        L4d:
            defpackage.oi2.Y(r11)
            float r11 = r10.Z
            xa6 r1 = r2.a
            ta6 r1 = r1.d
            fb6 r3 = defpackage.sa6.e
            ja4 r1 = r1.A
            java.lang.Object r1 = r1.g(r3)
            if (r1 != 0) goto L61
            goto L62
        L61:
            r5 = r1
        L62:
            eo2 r5 = (defpackage.eo2) r5
            if (r5 == 0) goto La1
            xa6 r1 = r2.a
            ta6 r1 = r1.d
            fb6 r2 = defpackage.bb6.w
            java.lang.Object r1 = r1.c(r2)
            e76 r1 = (defpackage.e76) r1
            r1 = 0
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r1 = (long) r1
            int r11 = java.lang.Float.floatToRawIntBits(r11)
            long r8 = (long) r11
            r11 = 32
            long r1 = r1 << r11
            long r8 = r8 & r6
            long r1 = r1 | r8
            jk4 r11 = new jk4
            r11.<init>(r1)
            r10.Y = r4
            java.lang.Object r11 = r5.o(r11, r10)
            if (r11 != r0) goto L91
            r5 = r0
            goto La0
        L91:
            jk4 r11 = (defpackage.jk4) r11
            long r10 = r11.a
            long r10 = r10 & r6
            int r10 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r10)
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r10)
        La0:
            return r5
        La1:
            java.lang.String r10 = "Required value was null."
            ug r10 = defpackage.i61.e(r10)
            throw r10
        La8:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r10.Y
            if (r6 == 0) goto Lb9
            if (r6 != r4) goto Lb4
            defpackage.oi2.Y(r11)
            goto Lf0
        Lb4:
            defpackage.i.m(r3)
            r1 = r5
            goto Lf0
        Lb9:
            defpackage.oi2.Y(r11)
            dd r2 = (defpackage.dd) r2
            float r11 = r10.Z
            r10.Y = r4
            vs4 r3 = r2.g
            java.lang.Object r3 = r3.getValue()
            float r4 = r2.e()
            java.lang.Object r4 = r2.c(r4, r11, r3)
            qn2 r5 = r2.d
            java.lang.Object r5 = r5.g(r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto Le7
            java.lang.Object r10 = defpackage.mb3.r(r2, r4, r11, r10)
            if (r10 != r0) goto Le5
            goto Led
        Le5:
            r10 = r1
            goto Led
        Le7:
            java.lang.Object r10 = defpackage.mb3.r(r2, r3, r11, r10)
            if (r10 != r0) goto Le5
        Led:
            if (r10 != r0) goto Lf0
            r1 = r0
        Lf0:
            return r1
    }
}
