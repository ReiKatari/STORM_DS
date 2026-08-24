package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rd0  reason: default package */
/* loaded from: classes.dex */
public final class rd0 {
    public final java.util.Map a;
    public final java.lang.Object b;
    public final java.util.LinkedHashMap c;
    public final defpackage.xb0 d;

    public rd0(java.lang.String r2, java.util.Map r3, android.content.Context r4, defpackage.t57 r5, defpackage.zg0 r6) {
            r1 = this;
            r1.<init>()
            r1.a = r3
            java.lang.Object r4 = new java.lang.Object
            r4.<init>()
            r1.b = r4
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            r1.c = r4
            wg0 r4 = defpackage.wg0.CAMERA
            n0 r5 = new n0
            r0 = 8
            r5.<init>(r1, r0)
            r6.a(r4, r5)
            xb0 r4 = r1.a(r2)
            if (r4 == 0) goto L28
            r1.d = r4
            return
        L28:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to load the default backend for "
            r1.<init>(r4)
            java.lang.String r2 = defpackage.qd0.a(r2)
            r1.append(r2)
            java.lang.String r2 = "! Available backends are "
            java.util.Set r3 = r3.keySet()
            defpackage.i.k(r1, r2, r3)
            r1 = 0
            throw r1
    }

    public final defpackage.xb0 a(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "Unexpected backend id! Expected "
            r5.getClass()
            java.lang.Object r1 = r4.b
            monitor-enter(r1)
            java.util.LinkedHashMap r2 = r4.c     // Catch: java.lang.Throwable -> L2b
            qd0 r3 = new qd0     // Catch: java.lang.Throwable -> L2b
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L2b
            xb0 r2 = (defpackage.xb0) r2     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L19
            monitor-exit(r1)
            return r2
        L19:
            java.util.Map r2 = r4.a     // Catch: java.lang.Throwable -> L2b
            qd0 r3 = new qd0     // Catch: java.lang.Throwable -> L2b
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L2b
            ah0 r2 = (defpackage.ah0) r2     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L2d
            xb0 r2 = r2.a     // Catch: java.lang.Throwable -> L2b
            goto L2e
        L2b:
            r4 = move-exception
            goto L6d
        L2d:
            r2 = 0
        L2e:
            if (r2 == 0) goto L6b
            java.lang.String r3 = "CXCP-Camera2"
            boolean r3 = r5.equals(r3)     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L43
            java.util.LinkedHashMap r4 = r4.c     // Catch: java.lang.Throwable -> L2b
            qd0 r0 = new qd0     // Catch: java.lang.Throwable -> L2b
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L2b
            r4.put(r0, r2)     // Catch: java.lang.Throwable -> L2b
            goto L6b
        L43:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r5 = defpackage.qd0.a(r5)     // Catch: java.lang.Throwable -> L2b
            r4.append(r5)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r5 = " but it was actually "
            r4.append(r5)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r5 = "CXCP-Camera2"
            java.lang.String r5 = defpackage.qd0.a(r5)     // Catch: java.lang.Throwable -> L2b
            r4.append(r5)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L2b
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L2b
            throw r5     // Catch: java.lang.Throwable -> L2b
        L6b:
            monitor-exit(r1)
            return r2
        L6d:
            monitor-exit(r1)
            throw r4
    }
}
