package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oi0  reason: default package */
/* loaded from: classes.dex */
public final class oi0 {
    public static final defpackage.uw d = null;
    public final java.lang.Object a;
    public final java.util.LinkedHashMap b;
    public final java.util.LinkedHashSet c;

    static {
            r0 = 0
            uw r0 = defpackage.g04.t(r0)
            defpackage.oi0.d = r0
            return
    }

    public oi0() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.a = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.b = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.c = r0
            return
    }

    public final defpackage.ni0 a(android.view.Surface r7) {
            r6 = this;
            r7.getClass()
            boolean r0 = r7.isValid()
            if (r0 != 0) goto L21
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "registerSurface: Surface "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r2 = " isn't valid!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r0, r1)
        L21:
            java.lang.Object r0 = r6.a
            monitor-enter(r0)
            ni0 r1 = new ni0     // Catch: java.lang.Throwable -> L38
            r1.<init>(r6, r7)     // Catch: java.lang.Throwable -> L38
            java.util.LinkedHashMap r2 = r6.b     // Catch: java.lang.Throwable -> L38
            java.lang.Object r2 = r2.get(r7)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L3a
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L38
            goto L3b
        L38:
            r6 = move-exception
            goto L68
        L3a:
            r2 = 0
        L3b:
            r3 = 1
            int r2 = r2 + r3
            java.util.LinkedHashMap r4 = r6.b     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L38
            r4.put(r7, r5)     // Catch: java.lang.Throwable -> L38
            if (r2 != r3) goto L4f
            java.util.LinkedHashSet r6 = r6.c     // Catch: java.lang.Throwable -> L38
            java.util.List r6 = defpackage.gt0.k1(r6)     // Catch: java.lang.Throwable -> L38
            goto L50
        L4f:
            r6 = 0
        L50:
            monitor-exit(r0)
            if (r6 == 0) goto L67
            java.util.Iterator r6 = r6.iterator()
        L57:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r0 = r6.next()
            jj7 r0 = (defpackage.jj7) r0
            r0.d(r7)
            goto L57
        L67:
            return r1
        L68:
            monitor-exit(r0)
            throw r6
    }
}
