package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ns2  reason: default package */
/* loaded from: classes.dex */
public final class ns2 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.qn2 B;

    public /* synthetic */ ns2(int r1, defpackage.qn2 r2) {
            r0 = this;
            r0.A = r1
            r0.B = r2
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.A
            switch(r0) {
                case 0: goto L1a;
                default: goto L5;
            }
        L5:
            java.lang.Number r6 = (java.lang.Number) r6
            long r0 = r6.longValue()
            qn2 r5 = r5.B
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r2
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            java.lang.Object r5 = r5.g(r6)
            return r5
        L1a:
            zl6 r6 = (defpackage.zl6) r6
            java.lang.Object r0 = defpackage.bm6.c
            monitor-enter(r0)
            long r1 = defpackage.bm6.e     // Catch: java.lang.Throwable -> L2f
            r3 = 1
            long r3 = r3 + r1
            defpackage.bm6.e = r3     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)
            qn2 r5 = r5.B
            ce5 r0 = new ce5
            r0.<init>(r1, r6, r5)
            return r0
        L2f:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
    }
}
