package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e20  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class e20 implements defpackage.fo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.String B;

    public /* synthetic */ e20(java.lang.String r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.fo2
    public final java.lang.Object e(java.lang.Object r31, java.lang.Object r32, java.lang.Object r33) {
            r30 = this;
            r0 = r30
            int r1 = r0.A
            jg7 r2 = defpackage.jg7.a
            r3 = 0
            r4 = 16
            r5 = 1
            switch(r1) {
                case 0: goto L59;
                default: goto Ld;
            }
        Ld:
            r1 = r31
            m26 r1 = (defpackage.m26) r1
            r1 = r32
            px0 r1 = (defpackage.px0) r1
            r6 = r33
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r7 = r6 & 17
            if (r7 == r4) goto L22
            r3 = r5
        L22:
            r4 = r6 & 1
            xq2 r1 = (defpackage.xq2) r1
            boolean r3 = r1.S(r4, r3)
            if (r3 == 0) goto L53
            r26 = 0
            r27 = 131070(0x1fffe, float:1.83668E-40)
            java.lang.String r5 = r0.B
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
            goto L58
        L53:
            r24 = r1
            r24.V()
        L58:
            return r2
        L59:
            r1 = r31
            m26 r1 = (defpackage.m26) r1
            r6 = r32
            px0 r6 = (defpackage.px0) r6
            r7 = r33
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r1.getClass()
            r1 = r7 & 17
            if (r1 == r4) goto L71
            r3 = r5
        L71:
            r1 = r7 & 1
            xq2 r6 = (defpackage.xq2) r6
            boolean r1 = r6.S(r1, r3)
            if (r1 == 0) goto Lac
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.B
            java.lang.String r7 = r0.toUpperCase(r1)
            r7.getClass()
            r28 = 0
            r29 = 131070(0x1fffe, float:1.83668E-40)
            r8 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r26 = r6
            defpackage.x37.b(r7, r8, r9, r11, r13, r14, r15, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto Lb1
        Lac:
            r26 = r6
            r26.V()
        Lb1:
            return r2
    }
}
