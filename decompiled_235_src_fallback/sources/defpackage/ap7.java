package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ap7  reason: default package */
/* loaded from: classes.dex */
public final class ap7 {
    public final java.util.LinkedHashMap a;

    public ap7() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.a = r0
            return
    }

    public final void a() {
            r2 = this;
            java.util.LinkedHashMap r2 = r2.a
            java.util.Collection r0 = r2.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            qo7 r1 = (defpackage.qo7) r1
            r1.b()
            goto La
        L1a:
            r2.clear()
            return
    }
}
