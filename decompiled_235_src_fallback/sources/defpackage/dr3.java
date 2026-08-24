package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dr3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dr3 implements defpackage.go2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.fo2 B;

    public /* synthetic */ dr3(defpackage.fo2 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.go2
    public final java.lang.Object l(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            r2 = this;
            int r0 = r2.A
            jg7 r1 = defpackage.jg7.a
            fo2 r2 = r2.B
            switch(r0) {
                case 0: goto L1b;
                default: goto L9;
            }
        L9:
            jk4 r3 = (defpackage.jk4) r3
            java.lang.Float r4 = (java.lang.Float) r4
            r4.floatValue()
            jk4 r5 = (defpackage.jk4) r5
            java.lang.Float r6 = (java.lang.Float) r6
            r6.floatValue()
            r2.e(r4, r5, r6)
            return r1
        L1b:
            lp3 r3 = (defpackage.lp3) r3
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.intValue()
            px0 r5 = (defpackage.px0) r5
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r4 = r6.intValue()
            r6 = r4 & 6
            if (r6 != 0) goto L3b
            r6 = r5
            xq2 r6 = (defpackage.xq2) r6
            boolean r6 = r6.f(r3)
            if (r6 == 0) goto L39
            r6 = 4
            goto L3a
        L39:
            r6 = 2
        L3a:
            r4 = r4 | r6
        L3b:
            r6 = r4 & 131(0x83, float:1.84E-43)
            r0 = 130(0x82, float:1.82E-43)
            if (r6 == r0) goto L43
            r6 = 1
            goto L44
        L43:
            r6 = 0
        L44:
            r0 = r4 & 1
            xq2 r5 = (defpackage.xq2) r5
            boolean r6 = r5.S(r0, r6)
            if (r6 == 0) goto L58
            r4 = r4 & 14
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.e(r3, r5, r4)
            goto L5b
        L58:
            r5.V()
        L5b:
            return r1
    }
}
