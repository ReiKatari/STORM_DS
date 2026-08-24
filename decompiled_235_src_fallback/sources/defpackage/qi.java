package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qi  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class qi implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.ta4 B;
    public final /* synthetic */ defpackage.qa4 L;
    public final /* synthetic */ defpackage.s76 R;
    public final /* synthetic */ defpackage.a74 X;
    public final /* synthetic */ defpackage.zv0 Y;

    public /* synthetic */ qi(defpackage.ta4 r2, defpackage.qa4 r3, defpackage.s76 r4, defpackage.a74 r5, defpackage.zv0 r6) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.L = r3
            r1.R = r4
            r1.X = r5
            r1.Y = r6
            return
    }

    public /* synthetic */ qi(defpackage.ta4 r1, defpackage.qa4 r2, defpackage.s76 r3, defpackage.a74 r4, defpackage.zv0 r5, int r6) {
            r0 = this;
            r6 = 1
            r0.A = r6
            r0.<init>()
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.X = r4
            r0.Y = r5
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r10, java.lang.Object r11) {
            r9 = this;
            int r0 = r9.A
            jg7 r1 = defpackage.jg7.a
            switch(r0) {
                case 0: goto L23;
                default: goto L7;
            }
        L7:
            r7 = r10
            px0 r7 = (defpackage.px0) r7
            java.lang.Integer r11 = (java.lang.Integer) r11
            r11.getClass()
            r10 = 49
            int r8 = defpackage.ii2.a0(r10)
            ta4 r2 = r9.B
            qa4 r3 = r9.L
            s76 r4 = r9.R
            a74 r5 = r9.X
            zv0 r6 = r9.Y
            defpackage.ln2.a(r2, r3, r4, r5, r6, r7, r8)
            return r1
        L23:
            px0 r10 = (defpackage.px0) r10
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r0 = r11 & 3
            r2 = 2
            r3 = 1
            if (r0 == r2) goto L33
            r0 = r3
            goto L34
        L33:
            r0 = 0
        L34:
            r11 = r11 & r3
            r7 = r10
            xq2 r7 = (defpackage.xq2) r7
            boolean r10 = r7.S(r11, r0)
            if (r10 == 0) goto L4e
            r8 = 48
            ta4 r2 = r9.B
            qa4 r3 = r9.L
            s76 r4 = r9.R
            a74 r5 = r9.X
            zv0 r6 = r9.Y
            defpackage.ln2.a(r2, r3, r4, r5, r6, r7, r8)
            goto L51
        L4e:
            r7.V()
        L51:
            return r1
    }
}
