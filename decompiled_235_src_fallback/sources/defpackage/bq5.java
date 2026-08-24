package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bq5  reason: default package */
/* loaded from: classes.dex */
public final class bq5 extends defpackage.aj3 implements defpackage.qn2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ defpackage.cq5 L;

    public /* synthetic */ bq5(defpackage.cq5 r1, int r2) {
            r0 = this;
            r0.B = r2
            r0.L = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.B
            cq5 r8 = r8.L
            switch(r0) {
                case 0: goto L22;
                default: goto L7;
            }
        L7:
            java.lang.Number r9 = (java.lang.Number) r9
            double r0 = r9.doubleValue()
            gm1 r9 = r8.k
            double r2 = r9.c(r0)
            float r9 = r8.e
            double r4 = (double) r9
            float r8 = r8.f
            double r6 = (double) r8
            double r8 = defpackage.gi2.o(r2, r4, r6)
            java.lang.Double r8 = java.lang.Double.valueOf(r8)
            return r8
        L22:
            java.lang.Number r9 = (java.lang.Number) r9
            double r0 = r9.doubleValue()
            gm1 r9 = r8.n
            float r2 = r8.e
            double r2 = (double) r2
            float r8 = r8.f
            double r4 = (double) r8
            double r0 = defpackage.gi2.o(r0, r2, r4)
            double r8 = r9.c(r0)
            java.lang.Double r8 = java.lang.Double.valueOf(r8)
            return r8
    }
}
