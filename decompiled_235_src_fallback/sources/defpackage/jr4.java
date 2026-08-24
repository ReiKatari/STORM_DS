package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jr4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jr4 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.nr4 B;

    public /* synthetic */ jr4(defpackage.nr4 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r4 = this;
            int r0 = r4.A
            nr4 r4 = r4.B
            switch(r0) {
                case 0: goto L75;
                case 1: goto L10;
                default: goto L7;
            }
        L7:
            int r4 = r4.n()
        Lb:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            return r4
        L10:
            bf1 r0 = r4.k
            boolean r0 = r0.a()
            ss4 r1 = r4.q
            if (r0 != 0) goto L1f
            int r0 = r4.k()
            goto L70
        L1f:
            int r0 = r1.h()
            r2 = -1
            if (r0 == r2) goto L2b
            int r0 = r1.h()
            goto L70
        L2b:
            float r0 = r4.l()
            float r0 = java.lang.Math.abs(r0)
            qh1 r1 = r4.n
            or4 r2 = defpackage.pr4.a
            r2 = 1113587712(0x42600000, float:56.0)
            float r1 = r1.e0(r2)
            int r2 = r4.o()
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r1 = java.lang.Math.min(r1, r2)
            int r2 = r4.o()
            float r2 = (float) r2
            float r1 = r1 / r2
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L6c
            vs4 r0 = r4.D
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            int r1 = r4.e
            if (r0 == 0) goto L6a
            int r0 = r1 + 1
            goto L70
        L6a:
            r0 = r1
            goto L70
        L6c:
            int r0 = r4.k()
        L70:
            int r4 = r4.j(r0)
            goto Lb
        L75:
            bf1 r0 = r4.k
            boolean r0 = r0.a()
            if (r0 == 0) goto L84
            ss4 r4 = r4.r
            int r4 = r4.h()
            goto L88
        L84:
            int r4 = r4.k()
        L88:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            return r4
    }
}
