package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pk7  reason: default package */
/* loaded from: classes.dex */
public final class pk7 extends defpackage.aj3 implements defpackage.qn2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ defpackage.qk7 L;

    public /* synthetic */ pk7(defpackage.qk7 r1, int r2) {
            r0 = this;
            r0.B = r2
            r0.L = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.B
            jg7 r1 = defpackage.jg7.a
            qk7 r9 = r9.L
            switch(r0) {
                case 0: goto L35;
                default: goto L9;
            }
        L9:
            no1 r10 = (defpackage.no1) r10
            mu2 r0 = r9.b
            float r2 = r9.k
            float r9 = r9.l
            bt r3 = r10.i0()
            long r4 = r3.L()
            xj0 r6 = r3.G()
            r6.h()
            java.lang.Object r6 = r3.B     // Catch: java.lang.Throwable -> L30
            os0 r6 = (defpackage.os0) r6     // Catch: java.lang.Throwable -> L30
            r7 = 0
            r6.f0(r2, r9, r7)     // Catch: java.lang.Throwable -> L30
            r0.a(r10)     // Catch: java.lang.Throwable -> L30
            defpackage.xg6.v(r3, r4)
            return r1
        L30:
            r9 = move-exception
            defpackage.xg6.v(r3, r4)
            throw r9
        L35:
            gk7 r10 = (defpackage.gk7) r10
            r10 = 1
            r9.d = r10
            on2 r9 = r9.f
            r9.c()
            return r1
    }
}
