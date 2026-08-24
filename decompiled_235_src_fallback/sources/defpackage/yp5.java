package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yp5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yp5 implements defpackage.gm1 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.cq5 B;

    public /* synthetic */ yp5(defpackage.cq5 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.gm1
    public final double c(double r9) {
            r8 = this;
            int r0 = r8.A
            cq5 r8 = r8.B
            switch(r0) {
                case 0: goto L19;
                default: goto L7;
            }
        L7:
            gm1 r0 = r8.n
            float r1 = r8.e
            double r4 = (double) r1
            float r8 = r8.f
            double r6 = (double) r8
            r2 = r9
            double r8 = defpackage.gi2.o(r2, r4, r6)
            double r8 = r0.c(r8)
            return r8
        L19:
            r2 = r9
            gm1 r9 = r8.k
            double r0 = r9.c(r2)
            float r9 = r8.e
            double r2 = (double) r9
            float r8 = r8.f
            double r4 = (double) r8
            double r8 = defpackage.gi2.o(r0, r2, r4)
            return r8
    }
}
