package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ox6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ox6 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.String B;
    public final /* synthetic */ int L;

    public /* synthetic */ ox6(int r2, java.lang.String r3) {
            r1 = this;
            r0 = 2
            r1.A = r0
            r1.<init>()
            r1.L = r2
            r1.B = r3
            return
    }

    public /* synthetic */ ox6(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.A
            jg7 r1 = defpackage.jg7.a
            r2 = 2
            r3 = 1
            java.lang.String r4 = r7.B
            int r7 = r7.L
            e36 r8 = (defpackage.e36) r8
            switch(r0) {
                case 0: goto L47;
                case 1: goto L2b;
                default: goto Lf;
            }
        Lf:
            r8.getClass()
            java.lang.String r0 = "UPDATE workspec SET stop_reason=? WHERE id=?"
            j36 r8 = r8.i0(r0)
            long r5 = (long) r7
            r8.c(r3, r5)     // Catch: java.lang.Throwable -> L26
            r8.w(r2, r4)     // Catch: java.lang.Throwable -> L26
            r8.f0()     // Catch: java.lang.Throwable -> L26
            r8.close()
            return r1
        L26:
            r7 = move-exception
            r8.close()
            throw r7
        L2b:
            r8.getClass()
            java.lang.String r0 = "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)"
            j36 r8 = r8.i0(r0)
            r8.w(r3, r4)     // Catch: java.lang.Throwable -> L42
            long r3 = (long) r7     // Catch: java.lang.Throwable -> L42
            r8.c(r2, r3)     // Catch: java.lang.Throwable -> L42
            r8.f0()     // Catch: java.lang.Throwable -> L42
            r8.close()
            return r1
        L42:
            r7 = move-exception
            r8.close()
            throw r7
        L47:
            r8.getClass()
            java.lang.String r0 = "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?"
            j36 r8 = r8.i0(r0)
            r8.w(r3, r4)     // Catch: java.lang.Throwable -> L83
            long r0 = (long) r7     // Catch: java.lang.Throwable -> L83
            r8.c(r2, r0)     // Catch: java.lang.Throwable -> L83
            java.lang.String r7 = "work_spec_id"
            int r7 = defpackage.ej2.B(r8, r7)     // Catch: java.lang.Throwable -> L83
            java.lang.String r0 = "generation"
            int r0 = defpackage.ej2.B(r8, r0)     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = "system_id"
            int r1 = defpackage.ej2.B(r8, r1)     // Catch: java.lang.Throwable -> L83
            boolean r2 = r8.f0()     // Catch: java.lang.Throwable -> L83
            if (r2 == 0) goto L85
            java.lang.String r7 = r8.R(r7)     // Catch: java.lang.Throwable -> L83
            long r2 = r8.getLong(r0)     // Catch: java.lang.Throwable -> L83
            int r0 = (int) r2     // Catch: java.lang.Throwable -> L83
            long r1 = r8.getLong(r1)     // Catch: java.lang.Throwable -> L83
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L83
            nx6 r2 = new nx6     // Catch: java.lang.Throwable -> L83
            r2.<init>(r7, r0, r1)     // Catch: java.lang.Throwable -> L83
            goto L86
        L83:
            r7 = move-exception
            goto L8a
        L85:
            r2 = 0
        L86:
            r8.close()
            return r2
        L8a:
            r8.close()
            throw r7
    }
}
