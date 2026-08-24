package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: in  reason: default package */
/* loaded from: classes.dex */
public abstract class in {
    public static final defpackage.io6 a = null;

    static {
            r0 = 0
            r1 = 7
            r2 = 0
            io6 r0 = defpackage.ge7.U(r2, r2, r0, r1)
            defpackage.in.a = r0
            of5 r0 = defpackage.vq7.a
            om1 r0 = new om1
            r1 = 1053609165(0x3ecccccd, float:0.4)
            r0.<init>(r1)
            r1 = 3
            defpackage.ge7.U(r2, r2, r0, r1)
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float.floatToRawIntBits(r0)
            java.lang.Float.floatToRawIntBits(r0)
            java.lang.Float.floatToRawIntBits(r0)
            java.lang.Float.floatToRawIntBits(r0)
            return
    }

    public static final defpackage.pp6 a(float r8, defpackage.sc7 r9, defpackage.px0 r10, int r11, int r12) {
            r12 = r12 & 4
            if (r12 == 0) goto L8
            java.lang.String r12 = "DpAnimation"
        L6:
            r4 = r12
            goto Lb
        L8:
            java.lang.String r12 = "switch_knob"
            goto L6
        Lb:
            om1 r0 = new om1
            r0.<init>(r8)
            wc7 r1 = defpackage.nw7.g0
            int r8 = r11 << 3
            r8 = r8 & 896(0x380, float:1.256E-42)
            int r11 = r11 << 6
            r12 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r12
            r6 = r8 | r11
            r7 = 8
            r3 = 0
            r2 = r9
            r5 = r10
            pp6 r8 = c(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static final defpackage.pp6 b(float r10, defpackage.to r11, java.lang.String r12, defpackage.px0 r13, int r14, int r15) {
            r0 = r15 & 2
            io6 r1 = defpackage.in.a
            if (r0 == 0) goto L7
            r11 = r1
        L7:
            r15 = r15 & 8
            if (r15 == 0) goto Ld
            java.lang.String r12 = "FloatAnimation"
        Ld:
            r6 = r12
            r12 = 3
            r15 = 0
            if (r11 != r1) goto L40
            r11 = r13
            xq2 r11 = (defpackage.xq2) r11
            r0 = 1144115775(0x4431d23f, float:711.2851)
            r11.b0(r0)
            r0 = 1008981770(0x3c23d70a, float:0.01)
            boolean r1 = r11.c(r0)
            java.lang.Object r2 = r11.P()
            if (r1 != 0) goto L2c
            vs0 r1 = defpackage.ox0.a
            if (r2 != r1) goto L38
        L2c:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1 = 0
            io6 r2 = defpackage.ge7.U(r1, r1, r0, r12)
            r11.l0(r2)
        L38:
            r0 = r2
            io6 r0 = (defpackage.io6) r0
            r11.p(r15)
            r4 = r0
            goto L4d
        L40:
            r0 = r13
            xq2 r0 = (defpackage.xq2) r0
            r1 = 1144225701(0x44337fa5, float:717.99445)
            r0.b0(r1)
            r0.p(r15)
            r4 = r11
        L4d:
            java.lang.Float r2 = java.lang.Float.valueOf(r10)
            wc7 r3 = defpackage.nw7.e0
            r10 = 57344(0xe000, float:8.0356E-41)
            int r11 = r14 << 3
            r8 = r11 & r10
            r9 = 0
            r5 = 0
            r7 = r13
            pp6 r10 = c(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public static final defpackage.pp6 c(java.lang.Object r8, defpackage.wc7 r9, defpackage.to r10, java.lang.Float r11, java.lang.String r12, defpackage.px0 r13, int r14, int r15) {
            r12 = r15 & 8
            r14 = 0
            if (r12 == 0) goto L6
            r11 = r14
        L6:
            xq2 r13 = (defpackage.xq2) r13
            java.lang.Object r12 = r13.P()
            vs0 r15 = defpackage.ox0.a
            if (r12 != r15) goto L17
            vs4 r12 = defpackage.np2.Y(r14)
            r13.l0(r12)
        L17:
            qa4 r12 = (defpackage.qa4) r12
            java.lang.Object r0 = r13.P()
            if (r0 != r15) goto L27
            gn r0 = new gn
            r0.<init>(r8, r9, r11)
            r13.l0(r0)
        L27:
            r3 = r0
            gn r3 = (defpackage.gn) r3
            qa4 r5 = defpackage.np2.b0(r14, r13)
            if (r11 == 0) goto L49
            boolean r9 = r10 instanceof defpackage.io6
            if (r9 == 0) goto L49
            r9 = r10
            io6 r9 = (defpackage.io6) r9
            java.lang.Object r0 = r9.c
            boolean r0 = defpackage.nb3.k(r0, r11)
            if (r0 != 0) goto L49
            float r10 = r9.a
            float r9 = r9.b
            io6 r0 = new io6
            r0.<init>(r10, r9, r11)
            r10 = r0
        L49:
            qa4 r4 = defpackage.np2.b0(r10, r13)
            java.lang.Object r9 = r13.P()
            if (r9 != r15) goto L5c
            r9 = -1
            r10 = 6
            v80 r9 = defpackage.nb3.c(r9, r14, r14, r10)
            r13.l0(r9)
        L5c:
            r2 = r9
            ul0 r2 = (defpackage.ul0) r2
            boolean r9 = r13.h(r2)
            boolean r10 = r13.h(r8)
            r9 = r9 | r10
            java.lang.Object r10 = r13.P()
            if (r9 != 0) goto L70
            if (r10 != r15) goto L79
        L70:
            q6 r10 = new q6
            r9 = 7
            r10.<init>(r9, r2, r8)
            r13.l0(r10)
        L79:
            on2 r10 = (defpackage.on2) r10
            defpackage.mb3.n(r10, r13)
            boolean r8 = r13.h(r2)
            boolean r9 = r13.h(r3)
            r8 = r8 | r9
            boolean r9 = r13.f(r4)
            r8 = r8 | r9
            boolean r9 = r13.f(r5)
            r8 = r8 | r9
            java.lang.Object r9 = r13.P()
            if (r8 != 0) goto L99
            if (r9 != r15) goto La4
        L99:
            hn r1 = new hn
            r6 = 0
            r7 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r13.l0(r1)
            r9 = r1
        La4:
            eo2 r9 = (defpackage.eo2) r9
            defpackage.mb3.i(r13, r9, r2)
            java.lang.Object r8 = r12.getValue()
            pp6 r8 = (defpackage.pp6) r8
            if (r8 != 0) goto Lb3
            uo r8 = r3.c
        Lb3:
            return r8
    }
}
