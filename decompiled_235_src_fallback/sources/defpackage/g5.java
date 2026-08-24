package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class g5 implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.String B;

    public /* synthetic */ g5(java.lang.String r2) {
            r1 = this;
            r0 = 3
            r1.A = r0
            r1.<init>()
            r1.B = r2
            return
    }

    public /* synthetic */ g5(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r30, java.lang.Object r31) {
            r29 = this;
            r0 = r29
            int r1 = r0.A
            r2 = 1
            java.lang.String r3 = r0.B
            jg7 r4 = defpackage.jg7.a
            switch(r1) {
                case 0: goto L91;
                case 1: goto L7e;
                case 2: goto L6b;
                case 3: goto L20;
                default: goto Lc;
            }
        Lc:
            r0 = r30
            px0 r0 = (defpackage.px0) r0
            r1 = r31
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            r1 = 7
            int r1 = defpackage.ii2.a0(r1)
            defpackage.hi2.m(r3, r0, r1)
            return r4
        L20:
            r1 = r30
            px0 r1 = (defpackage.px0) r1
            r3 = r31
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r5 = r3 & 3
            r6 = 2
            if (r5 == r6) goto L33
            r5 = r2
            goto L34
        L33:
            r5 = 0
        L34:
            r2 = r2 & r3
            xq2 r1 = (defpackage.xq2) r1
            boolean r2 = r1.S(r2, r5)
            if (r2 == 0) goto L65
            r27 = 0
            r28 = 131070(0x1fffe, float:1.83668E-40)
            java.lang.String r6 = r0.B
            r7 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r25 = r1
            defpackage.x37.b(r6, r7, r8, r10, r12, r13, r14, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            goto L6a
        L65:
            r25 = r1
            r25.V()
        L6a:
            return r4
        L6b:
            r0 = r30
            px0 r0 = (defpackage.px0) r0
            r1 = r31
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r1 = defpackage.ii2.a0(r2)
            defpackage.x73.d(r3, r0, r1)
            return r4
        L7e:
            r0 = r30
            px0 r0 = (defpackage.px0) r0
            r1 = r31
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r1 = defpackage.ii2.a0(r2)
            defpackage.x01.d(r3, r0, r1)
            return r4
        L91:
            r0 = r30
            px0 r0 = (defpackage.px0) r0
            r1 = r31
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r1 = defpackage.ii2.a0(r2)
            defpackage.nc1.c(r3, r0, r1)
            return r4
    }
}
