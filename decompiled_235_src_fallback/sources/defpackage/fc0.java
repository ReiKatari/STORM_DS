package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fc0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fc0 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.kc0 B;

    public /* synthetic */ fc0(defpackage.kc0 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.A
            kc0 r3 = r3.B
            switch(r0) {
                case 0: goto L1a;
                default: goto L7;
            }
        L7:
            jg7 r4 = (defpackage.jg7) r4
            r4.getClass()
            java.lang.Object r4 = r3.q
            monitor-enter(r4)
            boolean r3 = r3.r     // Catch: java.lang.Throwable -> L17
            monitor-exit(r4)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        L17:
            r3 = move-exception
            monitor-exit(r4)
            throw r3
        L1a:
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            java.lang.Object r4 = r3.q
            monitor-enter(r4)
            xe0 r0 = defpackage.xe0.u     // Catch: java.lang.Throwable -> L6c
            r3.s = r0     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r1.<init>()     // Catch: java.lang.Throwable -> L6c
            r1.append(r3)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r2 = " is closed"
            r1.append(r2)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L6c
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r4)
            xb0 r4 = r3.o
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = " finalized"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
            java.lang.Object r0 = r4.f
            monitor-enter(r0)
            java.util.LinkedHashSet r4 = r4.g     // Catch: java.lang.Throwable -> L69
            r4.remove(r3)     // Catch: java.lang.Throwable -> L69
            monitor-exit(r0)
            tu0 r4 = r3.x
            jg7 r0 = defpackage.jg7.a
            r4.b0(r0)
            w61 r3 = r3.a
            r4 = 0
            defpackage.g04.x(r3, r4)
            return r0
        L69:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L6c:
            r3 = move-exception
            monitor-exit(r4)
            throw r3
    }
}
