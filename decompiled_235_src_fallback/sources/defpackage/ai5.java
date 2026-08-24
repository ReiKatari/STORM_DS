package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ai5  reason: default package */
/* loaded from: classes.dex */
public abstract class ai5 {
    public static final java.util.logging.Logger a = null;
    public static final java.util.concurrent.ConcurrentHashMap b = null;
    public static final java.util.concurrent.ConcurrentHashMap c = null;
    public static final java.util.concurrent.ConcurrentHashMap d = null;
    public static final java.util.concurrent.ConcurrentHashMap e = null;

    static {
            java.lang.Class<ai5> r0 = defpackage.ai5.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            defpackage.ai5.a = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            defpackage.ai5.b = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            defpackage.ai5.c = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            defpackage.ai5.d = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            defpackage.ai5.e = r0
            return
    }

    public static synchronized void a(java.lang.Class r6, java.lang.String r7) {
            java.lang.String r0 = "New keys are already disallowed for key type "
            java.lang.String r1 = "typeUrl ("
            java.lang.String r2 = "Attempted overwrite of a registered key manager for key type "
            java.lang.Class<ai5> r3 = defpackage.ai5.class
            monitor-enter(r3)
            java.util.concurrent.ConcurrentHashMap r4 = defpackage.ai5.b     // Catch: java.lang.Throwable -> L47
            boolean r5 = r4.containsKey(r7)     // Catch: java.lang.Throwable -> L47
            if (r5 != 0) goto L13
            monitor-exit(r3)
            return
        L13:
            java.lang.Object r4 = r4.get(r7)     // Catch: java.lang.Throwable -> L47
            zh5 r4 = (defpackage.zh5) r4     // Catch: java.lang.Throwable -> L47
            bb r5 = r4.a     // Catch: java.lang.Throwable -> L47
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L47
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L47
            if (r5 == 0) goto L49
            java.util.concurrent.ConcurrentHashMap r6 = defpackage.ai5.d     // Catch: java.lang.Throwable -> L47
            java.lang.Object r6 = r6.get(r7)     // Catch: java.lang.Throwable -> L47
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L47
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L47
            if (r6 == 0) goto L35
            monitor-exit(r3)
            return
        L35:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L47
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L47
            r1.append(r7)     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> L47
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L47
            throw r6     // Catch: java.lang.Throwable -> L47
        L47:
            r6 = move-exception
            goto L8a
        L49:
            java.util.logging.Logger r0 = defpackage.ai5.a     // Catch: java.lang.Throwable -> L47
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L47
            r5.append(r7)     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L47
            r0.warning(r2)     // Catch: java.lang.Throwable -> L47
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L47
            bb r2 = r4.a     // Catch: java.lang.Throwable -> L47
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L47
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L47
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L47
            r4.append(r7)     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = ") is already registered with "
            r4.append(r7)     // Catch: java.lang.Throwable -> L47
            r4.append(r2)     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = ", cannot be re-registered with "
            r4.append(r7)     // Catch: java.lang.Throwable -> L47
            r4.append(r6)     // Catch: java.lang.Throwable -> L47
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L47
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L47
            throw r0     // Catch: java.lang.Throwable -> L47
        L8a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L47
            throw r6
    }

    public static synchronized defpackage.zh5 b(java.lang.String r4) {
            java.lang.String r0 = "No key manager found for key type "
            java.lang.Class<ai5> r1 = defpackage.ai5.class
            monitor-enter(r1)
            java.util.concurrent.ConcurrentHashMap r2 = defpackage.ai5.b     // Catch: java.lang.Throwable -> L15
            boolean r3 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L15
            if (r3 == 0) goto L17
            java.lang.Object r4 = r2.get(r4)     // Catch: java.lang.Throwable -> L15
            zh5 r4 = (defpackage.zh5) r4     // Catch: java.lang.Throwable -> L15
            monitor-exit(r1)
            return r4
        L15:
            r4 = move-exception
            goto L29
        L17:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L15
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L15
            r3.append(r4)     // Catch: java.lang.Throwable -> L15
            java.lang.String r4 = r3.toString()     // Catch: java.lang.Throwable -> L15
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L15
            throw r2     // Catch: java.lang.Throwable -> L15
        L29:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            throw r4
    }

    public static synchronized defpackage.vg3 c(defpackage.mh3 r5) {
            java.lang.String r0 = "newKey-operation not permitted for key type "
            java.lang.Class<ai5> r1 = defpackage.ai5.class
            monitor-enter(r1)
            java.lang.String r2 = r5.q()     // Catch: java.lang.Throwable -> L32
            zh5 r2 = b(r2)     // Catch: java.lang.Throwable -> L32
            s63 r3 = new s63     // Catch: java.lang.Throwable -> L32
            bb r2 = r2.a     // Catch: java.lang.Throwable -> L32
            java.lang.Class r4 = r2.c     // Catch: java.lang.Throwable -> L32
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.ConcurrentHashMap r2 = defpackage.ai5.d     // Catch: java.lang.Throwable -> L32
            java.lang.String r4 = r5.q()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.Throwable -> L32
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L32
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L34
            ea0 r5 = r5.r()     // Catch: java.lang.Throwable -> L32
            vg3 r5 = r3.t(r5)     // Catch: java.lang.Throwable -> L32
            monitor-exit(r1)
            return r5
        L32:
            r5 = move-exception
            goto L4a
        L34:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L32
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = r5.q()     // Catch: java.lang.Throwable -> L32
            r3.append(r5)     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L32
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L4a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            throw r5
    }

    public static synchronized void d(defpackage.bb r4) {
            java.lang.Class<ai5> r0 = defpackage.ai5.class
            monitor-enter(r0)
            java.lang.String r1 = r4.a()     // Catch: java.lang.Throwable -> L2b
            java.lang.Class r2 = r4.getClass()     // Catch: java.lang.Throwable -> L2b
            a(r2, r1)     // Catch: java.lang.Throwable -> L2b
            java.util.concurrent.ConcurrentHashMap r2 = defpackage.ai5.b     // Catch: java.lang.Throwable -> L2b
            boolean r3 = r2.containsKey(r1)     // Catch: java.lang.Throwable -> L2b
            if (r3 != 0) goto L2d
            zh5 r3 = new zh5     // Catch: java.lang.Throwable -> L2b
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2b
            r2.put(r1, r3)     // Catch: java.lang.Throwable -> L2b
            java.util.concurrent.ConcurrentHashMap r4 = defpackage.ai5.c     // Catch: java.lang.Throwable -> L2b
            x31 r2 = new x31     // Catch: java.lang.Throwable -> L2b
            r3 = 22
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2b
            r4.put(r1, r2)     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r4 = move-exception
            goto L36
        L2d:
            java.util.concurrent.ConcurrentHashMap r4 = defpackage.ai5.d     // Catch: java.lang.Throwable -> L2b
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2b
            r4.put(r1, r2)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r0)
            return
        L36:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r4
    }
}
