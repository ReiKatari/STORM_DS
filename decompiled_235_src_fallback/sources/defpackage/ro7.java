package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ro7  reason: default package */
/* loaded from: classes.dex */
public final class ro7 {
    public final defpackage.x31 a;
    public final java.util.LinkedHashMap b;
    public final java.util.LinkedHashSet c;
    public volatile boolean d;

    public ro7() {
            r2 = this;
            r2.<init>()
            x31 r0 = new x31
            r1 = 26
            r0.<init>(r1)
            r2.a = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r2.b = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r2.c = r0
            return
    }

    public static void a(java.lang.AutoCloseable r1) {
            if (r1 == 0) goto Ld
            defpackage.xg6.z(r1)     // Catch: java.lang.Exception -> L6
            return
        L6:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        Ld:
            return
    }
}
