package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ql6  reason: default package */
/* loaded from: classes.dex */
public final class ql6 implements defpackage.sd2 {
    public final defpackage.ap3 a;
    public final defpackage.oc1 b;
    public final defpackage.io6 c;
    public final defpackage.ak1 d;

    public ql6(defpackage.ap3 r1, defpackage.oc1 r2, defpackage.io6 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            ak1 r1 = defpackage.y76.c
            r0.d = r1
            return
    }

    public static final java.lang.Object b(defpackage.ql6 r6, defpackage.p76 r7, float r8, float r9, defpackage.nl6 r10, defpackage.s41 r11) {
            boolean r0 = r11 instanceof defpackage.pl6
            if (r0 == 0) goto L14
            r0 = r11
            pl6 r0 = (defpackage.pl6) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.Y = r1
        L12:
            r11 = r0
            goto L1a
        L14:
            pl6 r0 = new pl6
            r0.<init>(r6, r11)
            goto L12
        L1a:
            java.lang.Object r0 = r11.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r11.Y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L2a
            defpackage.oi2.Y(r0)
            goto L9b
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            r6 = 0
            return r6
        L31:
            defpackage.oi2.Y(r0)
            float r0 = java.lang.Math.abs(r8)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L3e
            goto L46
        L3e:
            float r0 = java.lang.Math.abs(r9)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L4d
        L46:
            r6 = 28
            uo r6 = defpackage.ak7.f(r8, r9, r6)
            return r6
        L4d:
            r11.Y = r3
            oc1 r0 = r6.b
            eb r3 = new eb
            s35 r4 = r0.a
            r5 = 26
            r3.<init>(r4, r5)
            wo r4 = new wo
            r4.<init>(r2)
            wo r2 = new wo
            r2.<init>(r9)
            ap r2 = r3.E(r4, r2)
            wo r2 = (defpackage.wo) r2
            float r2 = r2.a
            float r2 = java.lang.Math.abs(r2)
            float r3 = java.lang.Math.abs(r8)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L80
            d51 r6 = new d51
            r2 = 3
            r6.<init>(r0, r2)
        L7e:
            r0 = r8
            goto L89
        L80:
            s35 r0 = new s35
            io6 r6 = r6.c
            r0.<init>(r6)
            r6 = r0
            goto L7e
        L89:
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r0)
            r0 = r9
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r0)
            java.lang.Object r0 = r6.n(r7, r8, r9, r10, r11)
            if (r0 != r1) goto L9b
            return r1
        L9b:
            qo r0 = (defpackage.qo) r0
            uo r6 = r0.b
            return r6
    }

    @Override // defpackage.sd2
    public java.lang.Object a(defpackage.i86 r2, float r3, defpackage.r41 r4) {
            r1 = this;
            r76 r0 = defpackage.hv.j
            s41 r4 = (defpackage.s41) r4
            java.lang.Object r1 = r1.d(r2, r3, r0, r4)
            return r1
    }

    public final java.lang.Object c(defpackage.p76 r11, float r12, defpackage.qn2 r13, defpackage.s41 r14) {
            r10 = this;
            boolean r0 = r14 instanceof defpackage.ml6
            if (r0 == 0) goto L13
            r0 = r14
            ml6 r0 = (defpackage.ml6) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            ml6 r0 = new ml6
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            qn2 r13 = r0.R
            defpackage.oi2.Y(r14)
            goto L4b
        L29:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r10)
            r10 = 0
            return r10
        L30:
            defpackage.oi2.Y(r14)
            vd1 r4 = new vd1
            r9 = 0
            r5 = r10
            r8 = r11
            r6 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.R = r7
            r0.Z = r3
            ak1 r10 = r5.d
            java.lang.Object r14 = defpackage.hv.d0(r10, r4, r0)
            if (r14 != r1) goto L4a
            return r1
        L4a:
            r13 = r7
        L4b:
            qo r14 = (defpackage.qo) r14
            java.lang.Float r10 = new java.lang.Float
            r11 = 0
            r10.<init>(r11)
            r13.g(r10)
            return r14
    }

    public final java.lang.Object d(defpackage.p76 r5, float r6, defpackage.qn2 r7, defpackage.s41 r8) {
            r4 = this;
            boolean r0 = r8 instanceof defpackage.ol6
            if (r0 == 0) goto L13
            r0 = r8
            ol6 r0 = (defpackage.ol6) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            ol6 r0 = new ol6
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.oi2.Y(r8)
            goto L3a
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.oi2.Y(r8)
            r0.Y = r3
            java.lang.Object r8 = r4.c(r5, r6, r7, r0)
            if (r8 != r1) goto L3a
            return r1
        L3a:
            qo r8 = (defpackage.qo) r8
            java.lang.Float r4 = r8.a
            float r4 = r4.floatValue()
            uo r5 = r8.b
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L4a
            goto L54
        L4a:
            java.lang.Object r4 = r5.a()
            java.lang.Number r4 = (java.lang.Number) r4
            float r6 = r4.floatValue()
        L54:
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r6)
            return r4
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof defpackage.ql6
            r1 = 0
            if (r0 == 0) goto L24
            ql6 r4 = (defpackage.ql6) r4
            io6 r0 = r4.c
            io6 r2 = r3.c
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L24
            oc1 r0 = r4.b
            oc1 r2 = r3.b
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 == 0) goto L24
            ap3 r4 = r4.a
            ap3 r3 = r3.a
            if (r4 == r3) goto L22
            return r1
        L22:
            r3 = 1
            return r3
        L24:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            io6 r0 = r2.c
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            oc1 r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            ap3 r2 = r2.a
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }
}
