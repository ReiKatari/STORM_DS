package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rf6  reason: default package */
/* loaded from: classes.dex */
public final class rf6 extends android.net.ConnectivityManager.NetworkCallback {
    public static final defpackage.rf6 a = null;
    public static final java.lang.Object b = null;
    public static final java.util.LinkedHashMap c = null;
    public static android.net.NetworkCapabilities d;
    public static boolean e;
    public static java.lang.Boolean f;

    static {
            rf6 r0 = new rf6
            r0.<init>()
            defpackage.rf6.a = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.rf6.b = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            defpackage.rf6.c = r0
            return
    }

    public static void a() {
            java.lang.String r0 = "Not dispatching constraint state yet: isBlocked="
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.Object r2 = defpackage.rf6.b
            monitor-enter(r2)
            boolean r3 = defpackage.rf6.e     // Catch: java.lang.Throwable -> L57
            if (r3 == 0) goto L84
            java.lang.Boolean r3 = defpackage.rf6.f     // Catch: java.lang.Throwable -> L57
            if (r3 != 0) goto L14
            goto L84
        L14:
            java.util.LinkedHashMap r0 = defpackage.rf6.c     // Catch: java.lang.Throwable -> L57
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L57
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L57
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L57
        L20:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L57
            r4 = 0
            if (r3 == 0) goto L68
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L57
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L57
            java.lang.Object r5 = r3.getKey()     // Catch: java.lang.Throwable -> L57
            qn2 r5 = (defpackage.qn2) r5     // Catch: java.lang.Throwable -> L57
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L57
            android.net.NetworkRequest r3 = (android.net.NetworkRequest) r3     // Catch: java.lang.Throwable -> L57
            rf6 r6 = defpackage.rf6.a     // Catch: java.lang.Throwable -> L57
            android.net.NetworkCapabilities r7 = defpackage.rf6.d     // Catch: java.lang.Throwable -> L57
            r6.getClass()     // Catch: java.lang.Throwable -> L57
            java.lang.Boolean r6 = defpackage.rf6.f     // Catch: java.lang.Throwable -> L57
            r6.getClass()     // Catch: java.lang.Throwable -> L57
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L57
            if (r6 != 0) goto L52
            boolean r3 = defpackage.m2.z(r3, r7)     // Catch: java.lang.Throwable -> L57
            if (r3 == 0) goto L52
            r4 = 1
        L52:
            if (r4 == 0) goto L59
            v21 r3 = defpackage.v21.a     // Catch: java.lang.Throwable -> L57
            goto L5f
        L57:
            r0 = move-exception
            goto La7
        L59:
            w21 r3 = new w21     // Catch: java.lang.Throwable -> L57
            r4 = 7
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L57
        L5f:
            vr4 r4 = new vr4     // Catch: java.lang.Throwable -> L57
            r4.<init>(r5, r3)     // Catch: java.lang.Throwable -> L57
            r1.add(r4)     // Catch: java.lang.Throwable -> L57
            goto L20
        L68:
            monitor-exit(r2)
            int r0 = r1.size()
        L6d:
            if (r4 >= r0) goto L83
            java.lang.Object r2 = r1.get(r4)
            int r4 = r4 + 1
            vr4 r2 = (defpackage.vr4) r2
            java.lang.Object r3 = r2.A
            qn2 r3 = (defpackage.qn2) r3
            java.lang.Object r2 = r2.B
            x21 r2 = (defpackage.x21) r2
            r3.g(r2)
            goto L6d
        L83:
            return
        L84:
            ga0 r1 = defpackage.ga0.f()     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = defpackage.zv7.a     // Catch: java.lang.Throwable -> L57
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L57
            java.lang.Boolean r0 = defpackage.rf6.f     // Catch: java.lang.Throwable -> L57
            r4.append(r0)     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = ", capabilitiesInitialized="
            r4.append(r0)     // Catch: java.lang.Throwable -> L57
            boolean r0 = defpackage.rf6.e     // Catch: java.lang.Throwable -> L57
            r4.append(r0)     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L57
            r1.b(r3, r0)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r2)
            return
        La7:
            monitor-exit(r2)
            throw r0
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(android.net.Network r3, boolean r4) {
            r2 = this;
            r3.getClass()
            ga0 r2 = defpackage.ga0.f()
            java.lang.String r3 = defpackage.zv7.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "NetworkRequestConstraintController onBlockedStatusChanged callback "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r2.b(r3, r0)
            java.lang.Object r2 = defpackage.rf6.b
            monitor-enter(r2)
            java.lang.Boolean r3 = defpackage.rf6.f     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L36
            boolean r3 = defpackage.nb3.k(r3, r0)     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L2b
            monitor-exit(r2)
            return
        L2b:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L36
            defpackage.rf6.f = r3     // Catch: java.lang.Throwable -> L36
            monitor-exit(r2)
            a()
            return
        L36:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(android.net.Network r2, android.net.NetworkCapabilities r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            ga0 r1 = defpackage.ga0.f()
            java.lang.String r2 = defpackage.zv7.a
            java.lang.String r0 = "NetworkRequestConstraintController onCapabilitiesChanged callback"
            r1.b(r2, r0)
            java.lang.Object r1 = defpackage.rf6.b
            monitor-enter(r1)
            defpackage.rf6.d = r3     // Catch: java.lang.Throwable -> L1e
            r2 = 1
            defpackage.rf6.e = r2     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r1)
            a()
            return
        L1e:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(android.net.Network r4) {
            r3 = this;
            r4.getClass()
            ga0 r3 = defpackage.ga0.f()
            java.lang.String r4 = defpackage.zv7.a
            java.lang.String r0 = "NetworkRequestConstraintController onLost callback"
            r3.b(r4, r0)
            java.lang.Object r3 = defpackage.rf6.b
            monitor-enter(r3)
            r4 = 0
            defpackage.rf6.d = r4     // Catch: java.lang.Throwable -> L36
            java.util.LinkedHashMap r4 = defpackage.rf6.c     // Catch: java.lang.Throwable -> L36
            java.util.Set r4 = r4.keySet()     // Catch: java.lang.Throwable -> L36
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.lang.Throwable -> L36
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L36
        L20:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Throwable -> L36
            qn2 r0 = (defpackage.qn2) r0     // Catch: java.lang.Throwable -> L36
            w21 r1 = new w21     // Catch: java.lang.Throwable -> L36
            r2 = 7
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L36
            r0.g(r1)     // Catch: java.lang.Throwable -> L36
            goto L20
        L36:
            r4 = move-exception
            goto L3a
        L38:
            monitor-exit(r3)
            return
        L3a:
            monitor-exit(r3)
            throw r4
    }
}
