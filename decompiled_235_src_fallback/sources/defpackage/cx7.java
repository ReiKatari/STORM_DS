package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cx7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cx7 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.String B;

    public /* synthetic */ cx7(java.lang.String r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.A
            r1 = 0
            r2 = 1
            java.lang.String r5 = r5.B
            e36 r6 = (defpackage.e36) r6
            switch(r0) {
                case 0: goto L34;
                default: goto Lb;
            }
        Lb:
            r6.getClass()
            java.lang.String r0 = "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?"
            j36 r6 = r6.i0(r0)
            r6.w(r2, r5)     // Catch: java.lang.Throwable -> L2a
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2a
            r5.<init>()     // Catch: java.lang.Throwable -> L2a
        L1c:
            boolean r0 = r6.f0()     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L2c
            java.lang.String r0 = r6.R(r1)     // Catch: java.lang.Throwable -> L2a
            r5.add(r0)     // Catch: java.lang.Throwable -> L2a
            goto L1c
        L2a:
            r5 = move-exception
            goto L30
        L2c:
            r6.close()
            return r5
        L30:
            r6.close()
            throw r5
        L34:
            r6.getClass()
            java.lang.String r0 = "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)"
            j36 r6 = r6.i0(r0)
            r6.w(r2, r5)     // Catch: java.lang.Throwable -> L6b
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L6b
            r5.<init>()     // Catch: java.lang.Throwable -> L6b
        L45:
            boolean r0 = r6.f0()     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L6d
            java.lang.String r0 = r6.R(r1)     // Catch: java.lang.Throwable -> L6b
            long r3 = r6.getLong(r2)     // Catch: java.lang.Throwable -> L6b
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L6b
            iw7 r3 = defpackage.ds7.f(r3)     // Catch: java.lang.Throwable -> L6b
            ww7 r4 = new ww7     // Catch: java.lang.Throwable -> L6b
            r0.getClass()     // Catch: java.lang.Throwable -> L6b
            r3.getClass()     // Catch: java.lang.Throwable -> L6b
            r4.<init>()     // Catch: java.lang.Throwable -> L6b
            r4.a = r0     // Catch: java.lang.Throwable -> L6b
            r4.b = r3     // Catch: java.lang.Throwable -> L6b
            r5.add(r4)     // Catch: java.lang.Throwable -> L6b
            goto L45
        L6b:
            r5 = move-exception
            goto L71
        L6d:
            r6.close()
            return r5
        L71:
            r6.close()
            throw r5
    }
}
