package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q41  reason: default package */
/* loaded from: classes.dex */
public abstract class q41 {
    public static final java.lang.Object a = null;
    public static final java.util.HashMap b = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.q41.a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            defpackage.q41.b = r0
            return
    }

    public static android.content.Context a(android.content.Context r9) {
            android.content.Context r0 = r9.getApplicationContext()
            android.content.Context r1 = r9.getApplicationContext()
            int r1 = r1.hashCode()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 34
            if (r2 < r3) goto L17
            int r4 = defpackage.c2.f(r9)
            goto L18
        L17:
            r4 = 0
        L18:
            r5 = 0
            r6 = 30
            if (r2 < r6) goto L22
            java.lang.String r7 = defpackage.q2.c(r9)
            goto L23
        L22:
            r7 = r5
        L23:
            java.lang.String r8 = "%d-%d-%s"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r4, r7}
            java.lang.String r1 = java.lang.String.format(r8, r1)
            java.lang.Object r4 = defpackage.q41.a
            monitor-enter(r4)
            java.util.HashMap r7 = defpackage.q41.b     // Catch: java.lang.Throwable -> L53
            java.lang.Object r8 = r7.get(r1)     // Catch: java.lang.Throwable -> L53
            java.lang.ref.WeakReference r8 = (java.lang.ref.WeakReference) r8     // Catch: java.lang.Throwable -> L53
            if (r8 == 0) goto L4f
            java.lang.Object r8 = r8.get()     // Catch: java.lang.Throwable -> L53
            android.content.Context r8 = (android.content.Context) r8     // Catch: java.lang.Throwable -> L53
            if (r8 == 0) goto L4c
            r5 = r8
            goto L4f
        L4c:
            r7.remove(r1)     // Catch: java.lang.Throwable -> L53
        L4f:
            if (r5 == 0) goto L55
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L53
            return r5
        L53:
            r9 = move-exception
            goto L7d
        L55:
            if (r2 < r3) goto L5f
            int r3 = defpackage.c2.f(r9)     // Catch: java.lang.Throwable -> L53
            android.content.Context r0 = defpackage.c2.a(r0, r3)     // Catch: java.lang.Throwable -> L53
        L5f:
            if (r2 < r6) goto L73
            java.lang.String r9 = defpackage.q2.c(r9)     // Catch: java.lang.Throwable -> L53
            java.lang.String r2 = defpackage.q2.c(r0)     // Catch: java.lang.Throwable -> L53
            boolean r2 = java.util.Objects.equals(r9, r2)     // Catch: java.lang.Throwable -> L53
            if (r2 != 0) goto L73
            android.content.Context r0 = defpackage.q2.a(r0, r9)     // Catch: java.lang.Throwable -> L53
        L73:
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L53
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L53
            r7.put(r1, r9)     // Catch: java.lang.Throwable -> L53
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L53
            return r0
        L7d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L53
            throw r9
    }
}
