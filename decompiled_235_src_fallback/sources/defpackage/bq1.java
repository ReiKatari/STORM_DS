package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bq1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bq1 implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ float B;

    public /* synthetic */ bq1(float r2) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.B = r2
            return
    }

    public /* synthetic */ bq1(int r1, float r2) {
            r0 = this;
            r1 = 1
            r0.A = r1
            r0.<init>()
            r0.B = r2
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r6, java.lang.Object r7) {
            r5 = this;
            int r0 = r5.A
            jg7 r1 = defpackage.jg7.a
            r2 = 1
            float r5 = r5.B
            px0 r6 = (defpackage.px0) r6
            java.lang.Integer r7 = (java.lang.Integer) r7
            switch(r0) {
                case 0: goto L19;
                default: goto Le;
            }
        Le:
            r7.getClass()
            int r7 = defpackage.ii2.a0(r2)
            defpackage.nc1.j(r5, r6, r7)
            return r1
        L19:
            int r7 = r7.intValue()
            r0 = r7 & 3
            r3 = 2
            r4 = 0
            if (r0 == r3) goto L25
            r0 = r2
            goto L26
        L25:
            r0 = r4
        L26:
            r7 = r7 & r2
            xq2 r6 = (defpackage.xq2) r6
            boolean r7 = r6.S(r7, r0)
            if (r7 == 0) goto L33
            defpackage.nc1.j(r5, r6, r4)
            goto L36
        L33:
            r6.V()
        L36:
            return r1
    }
}
