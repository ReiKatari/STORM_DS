package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fm1  reason: default package */
/* loaded from: classes.dex */
public final class fm1 implements defpackage.n55 {
    public static final java.lang.Object c = null;
    public volatile defpackage.f92 a;
    public volatile java.lang.Object b;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.fm1.c = r0
            return
    }

    public static defpackage.n55 a(defpackage.f92 r2) {
            boolean r0 = r2 instanceof defpackage.fm1
            if (r0 == 0) goto L5
            return r2
        L5:
            fm1 r0 = new fm1
            r0.<init>()
            java.lang.Object r1 = defpackage.fm1.c
            r0.b = r1
            r0.a = r2
            return r0
    }

    @Override // defpackage.n55
    public final java.lang.Object get() {
            r5 = this;
            java.lang.Object r0 = r5.b
            java.lang.Object r1 = defpackage.fm1.c
            if (r0 != r1) goto L45
            monitor-enter(r5)
            java.lang.Object r0 = r5.b     // Catch: java.lang.Throwable -> L3f
            if (r0 != r1) goto L41
            f92 r0 = r5.a     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r2 = r5.b     // Catch: java.lang.Throwable -> L3f
            if (r2 == r1) goto L39
            if (r2 != r0) goto L18
            goto L39
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = "Scoped provider was invoked recursively returning different results: "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L3f
            r3.append(r2)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = " & "
            r3.append(r2)     // Catch: java.lang.Throwable -> L3f
            r3.append(r0)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r0 = ". This is likely due to a circular dependency."
            r3.append(r0)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L3f
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L3f
            throw r1     // Catch: java.lang.Throwable -> L3f
        L39:
            r5.b = r0     // Catch: java.lang.Throwable -> L3f
            r1 = 0
            r5.a = r1     // Catch: java.lang.Throwable -> L3f
            goto L41
        L3f:
            r0 = move-exception
            goto L43
        L41:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3f
            return r0
        L43:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3f
            throw r0
        L45:
            return r0
    }
}
