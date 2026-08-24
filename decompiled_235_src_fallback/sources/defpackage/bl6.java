package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bl6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bl6 implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.el6 B;

    public /* synthetic */ bl6(defpackage.el6 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r29, java.lang.Object r30) {
            r28 = this;
            r0 = r28
            int r1 = r0.A
            jg7 r2 = defpackage.jg7.a
            r3 = 0
            r4 = 2
            r5 = 1
            el6 r0 = r0.B
            switch(r1) {
                case 0: goto L56;
                default: goto Le;
            }
        Le:
            r1 = r29
            px0 r1 = (defpackage.px0) r1
            r6 = r30
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r7 = r6 & 3
            if (r7 == r4) goto L1f
            r3 = r5
        L1f:
            r4 = r6 & 1
            xq2 r1 = (defpackage.xq2) r1
            boolean r3 = r1.S(r4, r3)
            if (r3 == 0) goto L50
            java.lang.String r5 = r0.a
            r26 = 0
            r27 = 131070(0x1fffe, float:1.83668E-40)
            r6 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r24 = r1
            defpackage.x37.b(r5, r6, r7, r9, r11, r12, r13, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L55
        L50:
            r24 = r1
            r24.V()
        L55:
            return r2
        L56:
            zv0 r1 = defpackage.q60.g
            r6 = r29
            px0 r6 = (defpackage.px0) r6
            r7 = r30
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r8 = r7 & 3
            if (r8 == r4) goto L6a
            r4 = r5
            goto L6b
        L6a:
            r4 = r3
        L6b:
            r5 = r5 & r7
            xq2 r6 = (defpackage.xq2) r6
            boolean r4 = r6.S(r5, r4)
            if (r4 == 0) goto L7f
            r0.getClass()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.e(r0, r6, r3)
            goto L82
        L7f:
            r6.V()
        L82:
            return r2
    }
}
