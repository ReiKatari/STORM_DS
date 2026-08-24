package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a92  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class a92 implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.c92 B;

    public /* synthetic */ a92(defpackage.c92 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r6, java.lang.Object r7) {
            r5 = this;
            int r0 = r5.A
            jg7 r1 = defpackage.jg7.a
            r2 = 2
            r3 = 0
            c92 r5 = r5.B
            r4 = 1
            px0 r6 = (defpackage.px0) r6
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            switch(r0) {
                case 0: goto L4a;
                default: goto L14;
            }
        L14:
            r0 = r7 & 3
            if (r0 == r2) goto L1a
            r0 = r4
            goto L1b
        L1a:
            r0 = r3
        L1b:
            r7 = r7 & r4
            xq2 r6 = (defpackage.xq2) r6
            boolean r7 = r6.S(r7, r0)
            if (r7 == 0) goto L46
            vs4 r5 = r5.X
            java.lang.Object r5 = r5.getValue()
            eo2 r5 = (defpackage.eo2) r5
            if (r5 != 0) goto L38
            r5 = -2130102771(0xffffffff8109360d, float:-2.5201705E-38)
            r6.b0(r5)
        L34:
            r6.p(r3)
            goto L49
        L38:
            r7 = 624023668(0x2531d874, float:1.542564E-16)
            r6.b0(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r5.o(r6, r7)
            goto L34
        L46:
            r6.V()
        L49:
            return r1
        L4a:
            r0 = r7 & 3
            if (r0 == r2) goto L50
            r0 = r4
            goto L51
        L50:
            r0 = r3
        L51:
            r7 = r7 & r4
            xq2 r6 = (defpackage.xq2) r6
            boolean r7 = r6.S(r7, r0)
            if (r7 == 0) goto L6c
            a92 r7 = new a92
            r7.<init>(r5, r4)
            r5 = 1730256364(0x67219dec, float:7.6321415E23)
            zv0 r5 = defpackage.n16.I(r5, r7, r6)
            r7 = 54
            defpackage.bl2.e(r4, r5, r6, r7, r3)
            goto L6f
        L6c:
            r6.V()
        L6f:
            return r1
    }
}
