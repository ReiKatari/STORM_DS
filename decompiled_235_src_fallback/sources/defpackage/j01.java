package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j01  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class j01 implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ int R;
    public final /* synthetic */ int X;
    public final /* synthetic */ java.lang.Object Y;
    public final /* synthetic */ java.lang.Object Z;

    public /* synthetic */ j01(java.lang.String r2, boolean r3, boolean r4, defpackage.on2 r5, int r6, int r7) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.Y = r2
            r1.B = r3
            r1.L = r4
            r1.Z = r5
            r1.R = r6
            r1.X = r7
            return
    }

    public /* synthetic */ j01(boolean r2, defpackage.qn2 r3, defpackage.a74 r4, boolean r5, int r6, int r7) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.Y = r3
            r1.Z = r4
            r1.L = r5
            r1.R = r6
            r1.X = r7
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r21, java.lang.Object r22) {
            r20 = this;
            r0 = r20
            int r1 = r0.A
            jg7 r2 = defpackage.jg7.a
            int r3 = r0.R
            java.lang.Object r4 = r0.Z
            java.lang.Object r5 = r0.Y
            switch(r1) {
                case 0: goto L30;
                default: goto Lf;
            }
        Lf:
            r7 = r5
            qn2 r7 = (defpackage.qn2) r7
            r8 = r4
            a74 r8 = (defpackage.a74) r8
            r10 = r21
            px0 r10 = (defpackage.px0) r10
            r1 = r22
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            r1 = r3 | 1
            int r11 = defpackage.ii2.a0(r1)
            boolean r6 = r0.B
            boolean r9 = r0.L
            int r12 = r0.X
            defpackage.is7.f(r6, r7, r8, r9, r10, r11, r12)
            return r2
        L30:
            r13 = r5
            java.lang.String r13 = (java.lang.String) r13
            r16 = r4
            on2 r16 = (defpackage.on2) r16
            r17 = r21
            px0 r17 = (defpackage.px0) r17
            r1 = r22
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            r1 = r3 | 1
            int r18 = defpackage.ii2.a0(r1)
            boolean r14 = r0.B
            boolean r15 = r0.L
            int r0 = r0.X
            r19 = r0
            defpackage.mb3.c(r13, r14, r15, r16, r17, r18, r19)
            return r2
    }
}
