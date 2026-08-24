package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m54  reason: default package */
/* loaded from: classes.dex */
public final class m54 {
    public final defpackage.ap3 a;
    public final defpackage.bt b;
    public final java.util.HashMap c;

    public m54(android.content.Context r2, defpackage.bt r3) {
            r1 = this;
            ap3 r0 = new ap3
            r0.<init>(r2)
            r1.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.c = r2
            r1.a = r0
            r1.b = r3
            return
    }

    public final synchronized defpackage.pb7 a(java.lang.String r6) {
            r5 = this;
            monitor-enter(r5)
            java.util.HashMap r0 = r5.c     // Catch: java.lang.Throwable -> L13
            boolean r0 = r0.containsKey(r6)     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            java.util.HashMap r0 = r5.c     // Catch: java.lang.Throwable -> L13
            java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.Throwable -> L13
            pb7 r6 = (defpackage.pb7) r6     // Catch: java.lang.Throwable -> L13
            monitor-exit(r5)
            return r6
        L13:
            r6 = move-exception
            goto L3e
        L15:
            ap3 r0 = r5.a     // Catch: java.lang.Throwable -> L13
            com.google.android.datatransport.cct.CctBackendFactory r0 = r0.s(r6)     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L20
            monitor-exit(r5)
            r5 = 0
            return r5
        L20:
            bt r1 = r5.b     // Catch: java.lang.Throwable -> L13
            java.lang.Object r2 = r1.R     // Catch: java.lang.Throwable -> L13
            android.content.Context r2 = (android.content.Context) r2     // Catch: java.lang.Throwable -> L13
            java.lang.Object r3 = r1.B     // Catch: java.lang.Throwable -> L13
            wr0 r3 = (defpackage.wr0) r3     // Catch: java.lang.Throwable -> L13
            java.lang.Object r1 = r1.L     // Catch: java.lang.Throwable -> L13
            wr0 r1 = (defpackage.wr0) r1     // Catch: java.lang.Throwable -> L13
            yx r4 = new yx     // Catch: java.lang.Throwable -> L13
            r4.<init>(r2, r3, r1, r6)     // Catch: java.lang.Throwable -> L13
            pb7 r0 = r0.create(r4)     // Catch: java.lang.Throwable -> L13
            java.util.HashMap r1 = r5.c     // Catch: java.lang.Throwable -> L13
            r1.put(r6, r0)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r5)
            return r0
        L3e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L13
            throw r6
    }
}
