package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gr0  reason: default package */
/* loaded from: classes.dex */
public final class gr0 extends defpackage.k16 {
    public final /* synthetic */ int a;
    public final java.lang.Object b;

    public gr0(defpackage.q61 r2) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r2.getClass()
            r1.<init>()
            r1.b = r2
            return
    }

    public gr0(defpackage.ro5 r2) {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.<init>()
            r1.b = r2
            return
    }

    @Override // defpackage.k16
    public final void b(defpackage.vm2 r6) {
            r5 = this;
            int r0 = r5.a
            java.lang.Object r5 = r5.b
            r6.getClass()
            switch(r0) {
                case 0: goto L10;
                default: goto La;
            }
        La:
            ro5 r5 = (defpackage.ro5) r5
            r5.g(r6)
            return
        L10:
            r6.e()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < "
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3d
            q61 r5 = (defpackage.q61) r5     // Catch: java.lang.Throwable -> L3d
            r5.getClass()     // Catch: java.lang.Throwable -> L3d
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3d
            r3 = 86400000(0x5265c00, double:4.2687272E-316)
            long r1 = r1 - r3
            r0.append(r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r5 = " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))"
            r0.append(r5)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> L3d
            r6.r(r5)     // Catch: java.lang.Throwable -> L3d
            r6.D()     // Catch: java.lang.Throwable -> L3d
            r6.n()
            return
        L3d:
            r5 = move-exception
            r6.n()
            throw r5
    }
}
