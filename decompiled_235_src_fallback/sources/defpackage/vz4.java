package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vz4  reason: default package */
/* loaded from: classes.dex */
public final class vz4 extends defpackage.aj3 implements defpackage.go2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ java.lang.Object L;

    public vz4(android.view.ViewStructure r2) {
            r1 = this;
            r0 = 0
            r1.B = r0
            r1.L = r2
            r2 = 4
            r1.<init>(r2)
            return
    }

    public vz4(defpackage.zv0 r2) {
            r1 = this;
            r0 = 1
            r1.B = r0
            r1.L = r2
            r2 = 4
            r1.<init>(r2)
            return
    }

    @Override // defpackage.go2
    public final java.lang.Object l(java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13) {
            r9 = this;
            int r0 = r9.B
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r9 = r9.L
            switch(r0) {
                case 0: goto La9;
                default: goto L9;
            }
        L9:
            sg6 r10 = (defpackage.sg6) r10
            a74 r11 = (defpackage.a74) r11
            px0 r12 = (defpackage.px0) r12
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            r0 = r13 & 6
            if (r0 != 0) goto L27
            r0 = r12
            xq2 r0 = (defpackage.xq2) r0
            boolean r0 = r0.f(r10)
            if (r0 == 0) goto L24
            r0 = 4
            goto L25
        L24:
            r0 = 2
        L25:
            r0 = r0 | r13
            goto L28
        L27:
            r0 = r13
        L28:
            r13 = r13 & 48
            if (r13 != 0) goto L3b
            r13 = r12
            xq2 r13 = (defpackage.xq2) r13
            boolean r13 = r13.f(r11)
            if (r13 == 0) goto L38
            r13 = 32
            goto L3a
        L38:
            r13 = 16
        L3a:
            r0 = r0 | r13
        L3b:
            r13 = r0 & 147(0x93, float:2.06E-43)
            r2 = 146(0x92, float:2.05E-43)
            r3 = 0
            r4 = 1
            if (r13 == r2) goto L45
            r13 = r4
            goto L46
        L45:
            r13 = r3
        L46:
            r2 = r0 & 1
            xq2 r12 = (defpackage.xq2) r12
            boolean r13 = r12.S(r2, r13)
            if (r13 == 0) goto La5
            zv0 r9 = (defpackage.zv0) r9
            e40 r13 = defpackage.d90.L
            e34 r13 = defpackage.h70.d(r13, r3)
            long r2 = r12.T
            int r2 = java.lang.Long.hashCode(r2)
            xv4 r3 = r12.l()
            a74 r11 = defpackage.l.E(r12, r11)
            ix0 r5 = defpackage.jx0.i
            r5.getClass()
            iy0 r5 = defpackage.ix0.b
            r12.f0()
            boolean r6 = r12.S
            if (r6 == 0) goto L78
            r12.k(r5)
            goto L7b
        L78:
            r12.o0()
        L7b:
            pn r5 = defpackage.ix0.f
            defpackage.yh2.K(r12, r5, r13)
            pn r13 = defpackage.ix0.e
            defpackage.yh2.K(r12, r13, r3)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)
            pn r2 = defpackage.ix0.g
            defpackage.yh2.x(r12, r13, r2)
            ne r13 = defpackage.ix0.h
            defpackage.yh2.F(r12, r13)
            pn r13 = defpackage.ix0.d
            defpackage.yh2.K(r12, r13, r11)
            r11 = r0 & 14
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r9.e(r10, r12, r11)
            r12.p(r4)
            goto La8
        La5:
            r12.V()
        La8:
            return r1
        La9:
            java.lang.Number r10 = (java.lang.Number) r10
            int r3 = r10.intValue()
            java.lang.Number r11 = (java.lang.Number) r11
            int r4 = r11.intValue()
            java.lang.Number r12 = (java.lang.Number) r12
            int r10 = r12.intValue()
            java.lang.Number r13 = (java.lang.Number) r13
            int r11 = r13.intValue()
            r2 = r9
            android.view.ViewStructure r2 = (android.view.ViewStructure) r2
            int r7 = r10 - r3
            int r8 = r11 - r4
            r5 = 0
            r6 = 0
            r2.setDimens(r3, r4, r5, r6, r7, r8)
            return r1
    }
}
