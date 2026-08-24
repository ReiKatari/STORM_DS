package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: id0  reason: default package */
/* loaded from: classes.dex */
public final class id0 {
    public final java.lang.Object a;
    public final java.util.LinkedHashMap b;

    public id0() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.a = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.b = r0
            return
    }

    public final void a(java.lang.String r3, int r4, boolean r5) {
            r2 = this;
            r3.getClass()
            java.lang.Object r0 = r2.a
            monitor-enter(r0)
            java.util.LinkedHashMap r2 = r2.b     // Catch: java.lang.Throwable -> L22
            xf0 r1 = new xf0     // Catch: java.lang.Throwable -> L22
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L22
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L22
            pq7 r2 = (defpackage.pq7) r2     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)
            if (r2 != 0) goto L17
            return
        L17:
            gt2 r2 = r2.b
            kt2 r3 = new kt2
            r3.<init>(r4, r5)
            r2.a(r3)
            return
        L22:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }
}
