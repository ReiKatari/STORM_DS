package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ax7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ax7 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ long B;
    public final /* synthetic */ java.lang.String L;

    public /* synthetic */ ax7(java.lang.String r1, int r2, long r3) {
            r0 = this;
            r0.A = r2
            r0.B = r3
            r0.L = r1
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.A
            r1 = 2
            r2 = 1
            java.lang.String r3 = r6.L
            long r4 = r6.B
            e36 r7 = (defpackage.e36) r7
            switch(r0) {
                case 0: goto L2a;
                default: goto Ld;
            }
        Ld:
            r7.getClass()
            java.lang.String r6 = "UPDATE workspec SET last_enqueue_time=? WHERE id=?"
            j36 r6 = r7.i0(r6)
            r6.c(r2, r4)     // Catch: java.lang.Throwable -> L25
            r6.w(r1, r3)     // Catch: java.lang.Throwable -> L25
            r6.f0()     // Catch: java.lang.Throwable -> L25
            r6.close()
            jg7 r6 = defpackage.jg7.a
            return r6
        L25:
            r7 = move-exception
            r6.close()
            throw r7
        L2a:
            r7.getClass()
            java.lang.String r6 = "UPDATE workspec SET schedule_requested_at=? WHERE id=?"
            j36 r6 = r7.i0(r6)
            r6.c(r2, r4)     // Catch: java.lang.Throwable -> L48
            r6.w(r1, r3)     // Catch: java.lang.Throwable -> L48
            r6.f0()     // Catch: java.lang.Throwable -> L48
            int r7 = defpackage.oi2.D(r7)     // Catch: java.lang.Throwable -> L48
            r6.close()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            return r6
        L48:
            r7 = move-exception
            r6.close()
            throw r7
    }
}
