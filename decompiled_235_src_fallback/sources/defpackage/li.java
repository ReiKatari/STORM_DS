package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: li  reason: default package */
/* loaded from: classes.dex */
public abstract class li {
    public static final java.util.concurrent.CopyOnWriteArraySet a = null;
    public static final java.util.Map b = null;

    static {
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            defpackage.li.a = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.Class<xk4> r1 = defpackage.xk4.class
            java.lang.Package r2 = r1.getPackage()
            if (r2 == 0) goto L19
            java.lang.String r2 = r2.getName()
            goto L1a
        L19:
            r2 = 0
        L1a:
            if (r2 == 0) goto L21
            java.lang.String r3 = "OkHttp"
            r0.put(r2, r3)
        L21:
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "okhttp.OkHttpClient"
            r0.put(r1, r2)
            java.lang.Class<iz2> r1 = defpackage.iz2.class
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "okhttp.Http2"
            r0.put(r1, r2)
            java.lang.Class<qz6> r1 = defpackage.qz6.class
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "okhttp.TaskRunner"
            r0.put(r1, r2)
            java.lang.String r1 = "okhttp3.mockwebserver.MockWebServer"
            java.lang.String r2 = "okhttp.MockWebServer"
            r0.put(r1, r2)
            java.util.Map r0 = defpackage.c14.s0(r0)
            defpackage.li.b = r0
            return
    }

    public static void a(java.lang.String r4, int r5, java.lang.String r6, java.lang.Throwable r7) {
            java.util.Map r0 = defpackage.li.b
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L10
            r0 = 23
            java.lang.String r0 = defpackage.qs6.S0(r0, r4)
        L10:
            boolean r4 = android.util.Log.isLoggable(r0, r5)
            if (r4 == 0) goto L55
            r4 = 10
            if (r7 == 0) goto L30
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r1.append(r4)
            java.lang.String r6 = android.util.Log.getStackTraceString(r7)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
        L30:
            int r7 = r6.length()
            r1 = 0
        L35:
            if (r1 >= r7) goto L55
            r2 = 4
            int r2 = defpackage.qs6.s0(r4, r1, r2, r6)
            r3 = -1
            if (r2 == r3) goto L40
            goto L41
        L40:
            r2 = r7
        L41:
            int r3 = r1 + 4000
            int r3 = java.lang.Math.min(r2, r3)
            java.lang.String r1 = r6.substring(r1, r3)
            android.util.Log.println(r5, r0, r1)
            if (r3 < r2) goto L53
            int r1 = r3 + 1
            goto L35
        L53:
            r1 = r3
            goto L41
        L55:
            return
    }

    public static void b(java.lang.String r1, java.lang.String r2) {
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.li.a
            boolean r0 = r0.add(r1)
            if (r0 == 0) goto L2e
            r0 = 0
            r1.setUseParentHandlers(r0)
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r2, r0)
            if (r0 == 0) goto L1a
            java.util.logging.Level r2 = java.util.logging.Level.FINE
            goto L26
        L1a:
            r0 = 4
            boolean r2 = android.util.Log.isLoggable(r2, r0)
            if (r2 == 0) goto L24
            java.util.logging.Level r2 = java.util.logging.Level.INFO
            goto L26
        L24:
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
        L26:
            r1.setLevel(r2)
            mi r2 = defpackage.mi.a
            r1.addHandler(r2)
        L2e:
            return
    }
}
