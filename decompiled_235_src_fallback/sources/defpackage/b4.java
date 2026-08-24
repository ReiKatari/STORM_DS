package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class b4 implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.nx1 B;
    public final /* synthetic */ defpackage.on2 L;
    public final /* synthetic */ defpackage.qn2 R;

    public /* synthetic */ b4(defpackage.nx1 r2, defpackage.on2 r3, defpackage.qn2 r4) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.L = r3
            r1.R = r4
            return
    }

    public /* synthetic */ b4(defpackage.nx1 r1, defpackage.on2 r2, defpackage.qn2 r3, int r4) {
            r0 = this;
            r4 = 1
            r0.A = r4
            r0.<init>()
            r0.B = r1
            r0.L = r2
            r0.R = r3
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r12, java.lang.Object r13) {
            r11 = this;
            int r0 = r11.A
            jg7 r1 = defpackage.jg7.a
            px0 r12 = (defpackage.px0) r12
            java.lang.Integer r13 = (java.lang.Integer) r13
            switch(r0) {
                case 0: goto L1e;
                default: goto Lb;
            }
        Lb:
            r13.getClass()
            r13 = 9
            int r13 = defpackage.ii2.a0(r13)
            nx1 r0 = r11.B
            on2 r2 = r11.L
            qn2 r11 = r11.R
            defpackage.g04.a(r0, r2, r11, r12, r13)
            return r1
        L1e:
            int r13 = r13.intValue()
            r0 = r13 & 3
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 == r2) goto L2b
            r0 = r3
            goto L2c
        L2b:
            r0 = r4
        L2c:
            r13 = r13 & r3
            xq2 r12 = (defpackage.xq2) r12
            boolean r13 = r12.S(r13, r0)
            if (r13 == 0) goto L9e
            nq6 r13 = defpackage.kf.f
            java.lang.Object r13 = r12.j(r13)
            android.view.View r13 = (android.view.View) r13
            android.view.ViewParent r13 = r13.getParent()
            r13.getClass()
            gj1 r13 = (defpackage.gj1) r13
            android.view.Window r13 = r13.i0
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            r13.setDimAmount(r0)
            nx1 r7 = r11.B
            ex6 r13 = r7.e
            java.lang.Object r13 = r13.getValue()
            rp6 r13 = (defpackage.rp6) r13
            qa4 r9 = defpackage.np2.C(r13, r12)
            java.lang.Object r13 = r12.P()
            r0 = 0
            vs0 r2 = defpackage.ox0.a
            if (r13 != r2) goto L6c
            vs4 r13 = defpackage.np2.Y(r0)
            r12.l0(r13)
        L6c:
            r10 = r13
            qa4 r10 = (defpackage.qa4) r10
            boolean r13 = r12.h(r7)
            java.lang.Object r5 = r12.P()
            if (r13 != 0) goto L7b
            if (r5 != r2) goto L83
        L7b:
            y3 r5 = new y3
            r5.<init>(r7, r0, r3)
            r12.l0(r5)
        L83:
            eo2 r5 = (defpackage.eo2) r5
            defpackage.mb3.i(r12, r5, r1)
            ne4 r5 = new ne4
            on2 r6 = r11.L
            qn2 r8 = r11.R
            r5.<init>(r6, r7, r8, r9, r10)
            r11 = 814039041(0x30854001, float:9.695215E-10)
            zv0 r11 = defpackage.n16.I(r11, r5, r12)
            r13 = 54
            defpackage.bl2.e(r3, r11, r12, r13, r4)
            goto La1
        L9e:
            r12.V()
        La1:
            return r1
    }
}
