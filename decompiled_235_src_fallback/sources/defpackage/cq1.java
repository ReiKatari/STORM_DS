package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cq1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cq1 implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.String B;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ float R;
    public final /* synthetic */ java.lang.Object X;

    public /* synthetic */ cq1(java.lang.String r2, boolean r3, float r4, defpackage.qa4 r5) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.L = r3
            r1.R = r4
            r1.X = r5
            return
    }

    public /* synthetic */ cq1(java.lang.String r1, boolean r2, defpackage.qn2 r3, float r4, int r5) {
            r0 = this;
            r5 = 1
            r0.A = r5
            r0.<init>()
            r0.B = r1
            r0.L = r2
            r0.X = r3
            r0.R = r4
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r11, java.lang.Object r12) {
            r10 = this;
            int r0 = r10.A
            jg7 r1 = defpackage.jg7.a
            r2 = 1
            java.lang.Object r3 = r10.X
            switch(r0) {
                case 0: goto L23;
                default: goto La;
            }
        La:
            r6 = r3
            qn2 r6 = (defpackage.qn2) r6
            r8 = r11
            px0 r8 = (defpackage.px0) r8
            java.lang.Integer r12 = (java.lang.Integer) r12
            r12.getClass()
            int r9 = defpackage.ii2.a0(r2)
            java.lang.String r4 = r10.B
            boolean r5 = r10.L
            float r7 = r10.R
            defpackage.uj2.g(r4, r5, r6, r7, r8, r9)
            return r1
        L23:
            qa4 r3 = (defpackage.qa4) r3
            px0 r11 = (defpackage.px0) r11
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r0 = r12 & 3
            r4 = 2
            r5 = 0
            if (r0 == r4) goto L35
            r0 = r2
            goto L36
        L35:
            r0 = r5
        L36:
            r12 = r12 & r2
            xq2 r11 = (defpackage.xq2) r11
            boolean r12 = r11.S(r12, r0)
            if (r12 == 0) goto L59
            java.lang.Object r12 = r3.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L50
            boolean r12 = r10.L
            if (r12 != 0) goto L50
            goto L51
        L50:
            r2 = r5
        L51:
            java.lang.String r12 = r10.B
            float r10 = r10.R
            defpackage.nc1.h(r12, r2, r10, r11, r5)
            goto L5c
        L59:
            r11.V()
        L5c:
            return r1
    }
}
